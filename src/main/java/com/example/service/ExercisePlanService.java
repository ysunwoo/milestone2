package com.example.service;

import java.util.List;
import com.example.model.ExercisePlan;

public interface ExercisePlanService {
    ExercisePlan createExercisePlan(ExercisePlan exercisePlan);
    List<ExercisePlan> getExercisePlansByUserId(String userId);
    List<ExercisePlan> getExercisePlansByDayOfWeek(String dayOfWeek);
    List<ExercisePlan> getExercisePlansByUserIdAndDayOfWeek(String userId, String dayOfWeek);
}
