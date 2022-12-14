using Model.DTOs;

namespace GrpcClient.Interfaces;

public interface IExerciseClient
{
    Task<ExerciseDTO> CreateExercise(ExerciseDTO exercise);
    Task<IEnumerable<ExerciseDTO>> GetExercises();
    Task EditExercise(ExerciseDTO dto);
    Task DeleteExercise(int id);
}