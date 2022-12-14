using System.Net.Http.Json;
using System.Text.Json;
using Model.DTOs;

namespace Blazor.Services;

public class ExerciseService
{
    private readonly HttpClient client;

    public ExerciseService(HttpClient client)
    {
        this.client = client;
    }

    public async Task CreateExercise(ExerciseDTO member)
    {
        HttpResponseMessage response = await client.PostAsJsonAsync("/exercise/create", member);
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
    }

    public Task<ExerciseDTO> GetExercise(int id)
    {
        // Needs real implementation

        return Task.FromResult(new ExerciseDTO()
        {
            Id = id,
            Name = "Exercise",
            Description = "sgsrgee",
            Duration = 10
        });
    }

    public Task<List<ExerciseDTO>> GetExercises()
    {
        // This is for testing the UI without having any exercises
        var exercises = new List<ExerciseDTO>()
        {
            new ExerciseDTO() { Id = 1, Name = "Exercise", Description = "Jump or something" , Duration = 1},
            new ExerciseDTO() { Id = 2, Name = "Exercise2", Description = "Swim or something" , Duration = 2}
        };
        return Task.FromResult(exercises);

        // HttpResponseMessage response = await client.GetAsync("/exercises");
        // string result = await response.Content.ReadAsStringAsync();
        // if (!response.IsSuccessStatusCode)
        // {
        //     throw new Exception(result);
        // }

        // return JsonSerializer.Deserialize<List<ExerciseDTO>>(
        //     result, new JsonSerializerOptions
        //     {
        //         PropertyNameCaseInsensitive = true
        //     })!;
    }

    public async Task EditExercise(ExerciseDTO dto)
    {
        HttpResponseMessage response = await client.PutAsJsonAsync("/exercise", dto);
        string result = await response.Content.ReadAsStringAsync();

        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }
    }

    public async Task DeleteExercise(int id)
    {
        await client.DeleteAsync("/exercise?e=" + id);
    }
}