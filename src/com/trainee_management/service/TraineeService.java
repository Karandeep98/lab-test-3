package com.trainee_management.service;

import java.util.List;

import com.trainee_management.trainee.Trainee;

public interface TraineeService {
	public List<Trainee> allTrainees();

	public Trainee addTrainee(Trainee trainee);

	public Trainee getTraineeById(int id);
}
