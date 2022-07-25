package oops.Collection.TrainAssignmentDto.Service;


	import oops.Collection.TrainAssignmentDto.DAO.*;
	import oops.Collection.TrainAssignmentDto.Service.*;
	import oops.Collection.TrainAssignmentDto.TrainDTO.*;
	import 	oops.Collection.TrainAssignmentDto.TrainDemo;

	
	public interface TrainService {
		void addTrain(TrainDTO dto);
		TrainDTO getTrain(int number);
		void updateTrain(TrainDTO dto);
		void deleteTrain(TrainDTO dto);
	}
		