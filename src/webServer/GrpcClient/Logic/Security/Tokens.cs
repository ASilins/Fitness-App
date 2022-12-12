using System.IdentityModel.Tokens.Jwt;
using System.Security.Claims;
using Microsoft.IdentityModel.Tokens;
using Model.DTOs;

namespace GrpcClient.Logic.Security;

public class Tokens
{
    private readonly IConfiguration _config;

    public Tokens(IConfiguration config)
    {
        _config = config;
    }
    public string CreateToken(MemberDTO dto)
    {
        List<Claim> claims = new()
        {
            new Claim(ClaimTypes.Name, dto.Username),
            new Claim(ClaimTypes.Role, dto.Position)
        };

        var key = new SymmetricSecurityKey(System.Text.Encoding.UTF8.GetBytes(
            _config.GetSection("AppSettings:Token").Value
        ));

        var creds = new SigningCredentials(key, SecurityAlgorithms.HmacSha512Signature);

        var token = new JwtSecurityToken(
            claims: claims,
            expires: DateTime.Now.AddHours(1),
            signingCredentials: creds
        );

        return new JwtSecurityTokenHandler().WriteToken(token);
    }

    // Only for development
    public string CreateToken()
    {
        List<Claim> claims = new()
        {
            new Claim(ClaimTypes.Name, "Poopoo"),
            new Claim(ClaimTypes.Role, "Admin")
        };

        var key = new SymmetricSecurityKey(System.Text.Encoding.UTF8.GetBytes(
            _config.GetSection("AppSettings:Token").Value
        ));

        var creds = new SigningCredentials(key, SecurityAlgorithms.HmacSha512Signature);

        var token = new JwtSecurityToken(
            claims: claims,
            expires: DateTime.Now.AddHours(1),
            signingCredentials: creds
        );

        return new JwtSecurityTokenHandler().WriteToken(token);
    }
}