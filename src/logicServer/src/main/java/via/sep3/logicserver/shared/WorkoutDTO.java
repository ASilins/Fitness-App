package via.sep3.logicserver.shared;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class WorkoutDTO {
    private int id;
    private String Name;
    private String Description;
    private int DurationInMin;
    private int CreatedBy;
    private boolean isPublic;
    private List<ExerciseDTO> Exercises;
    private List<FollowWorkoutDTO> followers;

    public int numberOfExercises() {
        return Exercises.size();
    }
}
