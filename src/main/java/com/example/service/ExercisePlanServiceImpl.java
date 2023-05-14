package com.example.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.model.ExercisePlan;
import com.example.repositories.ExercisePlanRepository;

@Service
public class ExercisePlanServiceImpl implements ExercisePlanService {

    private final ExercisePlanRepository exercisePlanRepository;

    @Autowired
    public ExercisePlanServiceImpl(ExercisePlanRepository exercisePlanRepository) {
        this.exercisePlanRepository = exercisePlanRepository;
    }

    @Override
    public ExercisePlan createExercisePlan(ExercisePlan exercisePlan) {
        return exercisePlanRepository.save(exercisePlan);
    }

    @Override
    public List<ExercisePlan> getExercisePlansByUserId(String userId) {
        return exercisePlanRepository.findByUserId(userId);
    }

    @Override
    public List<ExercisePlan> getExercisePlansByDayOfWeek(String dayOfWeek) {
        return exercisePlanRepository.findByDayOfWeek(dayOfWeek);
    }

    @Override
    public List<ExercisePlan> getExercisePlansByUserIdAndDayOfWeek(String userId, String dayOfWeek) {
        return exercisePlanRepository.findByUserIdAndDayOfWeek(userId, dayOfWeek);
    }
}
