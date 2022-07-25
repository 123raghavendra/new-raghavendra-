package oops.Collection.TrainAssignmentDto.DAO;
import 	oops.Collection.TrainAssignmentDto.Service.*;
import 	oops.Collection.TrainAssignmentDto.TrainDemo;
import 	oops.Collection.TrainAssignmentDto.TrainDTO.*;
public interface TrainDAO {
		void addTrain(TrainDTO dto);
		TrainDTO getTrain(int number);
		void updateTrain(TrainDTO dto);
		void deleteTrain(TrainDTO dto);

}
