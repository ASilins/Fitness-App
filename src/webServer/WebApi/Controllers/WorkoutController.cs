using GrpcClient.Interfaces;
using Microsoft.AspNetCore.Mvc;
using Model.DTOs;
using Shared.DTOs;

namespace WebApi.Controllers;

[ApiController, Route("/[controller]")]
public class WorkoutController : ControllerBase
{
    private readonly IWorkoutClient _client;

    public WorkoutController(IWorkoutClient client)
    {
        _client = client;
    }

    [HttpGet]
    public async Task<ActionResult<WorkoutDTO>> GetWorkout([FromQuery] int id)
    {
        try
        {
            return Ok(await _client.GetWorkout(id));
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [HttpGet, Route("/[controller]s")]
    public async Task<ActionResult<IEnumerable<WorkoutDTO>>> GetWorkouts()
    {
        try
        {
            return Ok(await _client.GetWorkouts());
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [HttpPost, Route("/[controller]/assign")]
    public async Task<ActionResult<FollowWorkoutDTO>> AssignWorkout([FromBody] FollowWorkoutDTO dto)
    {
        try
        {
            return Ok(await _client.AssignWorkout(dto));
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [HttpPut]
    public async Task<ActionResult<WorkoutDTO>> EditWorkout([FromBody] WorkoutDTO workout)
    {
        try
        {
            await _client.EditWorkout(workout);
            return Ok();
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }

    [HttpDelete]
    public async Task<ActionResult<WorkoutDTO>> DeleteWorkout([FromQuery] int id)
    {
        try
        {
            await _client.DeleteWorkout(id);
            return NoContent();
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
}