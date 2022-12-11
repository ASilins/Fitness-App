﻿using System.ComponentModel.DataAnnotations;

namespace Shared.Model;

public class Workout
{
    [Key]
    public int Id { get; set; }
    //[Required]
    public string Name { get; set; }
    //[Required]
    public string Description { get; set; }
    public int DurationInMin { get; set; }
    public int NumberOfExercises { get; set; }
    public int FollowedBy { get; set; }
    //[Required]
    public bool IsPublic { get; set; }
    public ICollection<ExercisesInWorkouts> Exercises { get; set; }

    public Member User { get; set; }
}