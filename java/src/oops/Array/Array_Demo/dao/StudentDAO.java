package oops.Array.Array_Demo.dao;

import oops.Array.Array_Demo.dto.StudentDTO;
public class StudentDAO {
	void addStudent(StudentDTO dto);
	StudentDTO getStudent(long phoneNo);
	// void updateStudent(StudentDTO dto);
	 void updateStudent(long phoneNo,String batch);

}
