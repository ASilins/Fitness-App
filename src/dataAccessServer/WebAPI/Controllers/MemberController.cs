using Microsoft.AspNetCore.Mvc;
using Database.Interfaces;
using Shared.DTOs;

namespace WebAPI.Controllers;

[ApiController]
[Route("/[controller]")]
public class MemberController : ControllerBase
{
    private readonly IMemberDAO dao;

    public MemberController(IMemberDAO dao)
    {
        this.dao = dao;
    }

    [HttpPost]
    [Route("/[controller]/create")]
    public async Task<ActionResult<MemberDTO>> CreateMember([FromBody] LoginCreateDTO member)
    {
        try
        {
            MemberDTO created = await dao.CreateMember(member);
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
    public async Task<ActionResult<MemberDTO>> GetByUsername([FromBody] LoginCreateDTO member)
    {
        try
        {
            MemberDTO? loggedIn = await dao.GetByUsername(member);

            if (loggedIn == null)
            {
                return StatusCode(404);
            }

            return Ok(loggedIn);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
}