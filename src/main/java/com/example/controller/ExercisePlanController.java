package com.example.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.model.ExercisePlan;
import com.example.service.ExercisePlanService;

@RestController
@RequestMapping("/exercise-plan")
public class ExercisePlanController {

    private final ExercisePlanService exercisePlanService;

    @Autowired
    public ExercisePlanController(ExercisePlanService exercisePlanService) {
        this.exercisePlanService = exercisePlanService;
    }

    @PostMapping
    public ResponseEntity<ExercisePlan> createExercisePlan(@RequestBody ExercisePlan exercisePlan) {
        ExercisePlan createdExercisePlan = exercisePlanService.createExercisePlan(exercisePlan);
        return new ResponseEntity<>(createdExercisePlan, HttpStatus.CREATED);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<ExercisePlan>> getExercisePlansByUserId(@PathVariable String userId) {
        List<ExercisePlan> exercisePlans = exercisePlanService.getExercisePlansByUserId(userId);
        return new ResponseEntity<>(exercisePlans, HttpStatus.OK);
    }

    @GetMapping("/day/{dayOfWeek}")
    public ResponseEntity<List<ExercisePlan>> getExercisePlansByDayOfWeek(@PathVariable String dayOfWeek) {
        List<ExercisePlan> exercisePlans = exercisePlanService.getExercisePlansByDayOfWeek(dayOfWeek);
        return new ResponseEntity<>(exercisePlans, HttpStatus.OK);
    }

    @GetMapping("/user/{userId}/day/{dayOfWeek}")
    public ResponseEntity<List<ExercisePlan>> getExercisePlansByUserIdAndDayOfWeek(
            @PathVariable String userId, @PathVariable String dayOfWeek) {
        List<ExercisePlan> exercisePlans = exercisePlanService.getExercisePlansByUserIdAndDayOfWeek(userId, dayOfWeek);
        return new ResponseEntity<>(exercisePlans, HttpStatus.OK);
    }
}
