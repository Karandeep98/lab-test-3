package com.trainee_management.service;

import java.util.List;

import com.trainee_management.trainee.Trainee;
import com.trainee_management.trainee.TraineeDao;
import com.trainee_management.trainee.TraineeDaoImpl;

public class TraineeServiceImpl implements TraineeService{
	private TraineeDao traineeDao;
	
	
	public TraineeServiceImpl() {
		this.traineeDao=new TraineeDaoImpl();
	}

	@Override
	public List<Trainee> allTrainees() {
		
		return traineeDao.allTrainees();
	}

	@Override
	public Trainee addTrainee(Trainee trainee) {
		return traineeDao.addTrainee(trainee);
	}

	@Override
	public Trainee getTraineeById(int id) {
		return traineeDao.getTraineeById(id);
	}

}
