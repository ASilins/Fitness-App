using GrpcClient.Interfaces;
using Microsoft.AspNetCore.Mvc;
using Model.DTOs;

namespace WebApi.Controllers;

[ApiController]
[Route("/[controller]")]
public class MemberController : ControllerBase
{
    private readonly IMemberClient _client;

    public MemberController(IMemberClient client)
    {
        _client = client;
    }

    [HttpPost]
    [Route("/[controller]/create")]
    public async Task<ActionResult<MemberDTO>> CreateMember([FromBody] LoginCreateDTO member)
    {
        try
        {
            MemberDTO created = await _client.CreateMember(member);
            return Created("Member created", created);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [HttpPost]
    [Route("/[controller]/login")]
    public async Task<ActionResult<MemberDTO>> LoginMember([FromBody] LoginCreateDTO member)
    {
        try
        {
            MemberDTO loggedIn = await _client.LoginMember(member);
            return Ok(loggedIn);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [HttpPut]
    public async Task<ActionResult<MemberDTO>> EditPrivilege([FromBody] MemberDTO member)
    {
        try
        {
            await _client.EditPrivilege(member);
            return Ok();
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [HttpGet, Route("/[controller]s")]
    public async Task<ActionResult<IEnumerable<MemberDTO>>> GetMembers()
    {
        try
        {
            return Ok(await _client.GetMembers());
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
}