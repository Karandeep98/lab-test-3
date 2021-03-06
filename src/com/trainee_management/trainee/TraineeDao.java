package com.trainee_management.trainee;

import java.util.*;

public interface TraineeDao {
	public List<Trainee> allTrainees();

	public Trainee addTrainee(Trainee trainee);

	public Trainee getTraineeById(int id);
}
