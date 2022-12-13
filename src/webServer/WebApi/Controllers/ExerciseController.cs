using GrpcClient.Interfaces;
using Microsoft.AspNetCore.Authorization;
using Microsoft.AspNetCore.Mvc;
using Model.DTOs;
using Model.Tools;

namespace WebApi.Controllers;

[ApiController]
[Route("/[controller]")]
public class ExerciseController : ControllerBase
{
    private readonly IExerciseClient _client;

    public ExerciseController(IExerciseClient client)
    {
        _client = client;
    }

    [HttpPost("/[controller]/create"), Authorize(Roles = "Trainer")]
    public async Task<ActionResult<ExerciseDTO>> CreateExercise([FromBody] ExerciseDTO exercise)
    {
        try
        {
            Logger.WriteLog("<Received CreateExercise request>", "info");

            ExerciseDTO created = await _client.CreateExercise(exercise);

            return Created("Exercise created", created);
        }
        catch (Exception e)
        {
            Logger.WriteLog("Exception " + e.ToString(), "error");
            return StatusCode(500, e.Message);
        }
    }

    [HttpGet("/[controller]s"), Authorize(Roles = "Trainer")]
    public async Task<ActionResult<IEnumerable<ExerciseDTO>>> GetExercises()
    {
        try
        {
            Logger.WriteLog("<Received GetExercises request>", "info");

            return Ok(await _client.GetExercises());
        }
        catch (Exception e)
        {
            Logger.WriteLog("Exception " + e.ToString(), "error");
            Console.WriteLine("ERROR");
            return StatusCode(500, e.Message);
        }
    }
}