package oops.Array.Array_Demo.Service;


import oops.Array.Array_Demo.dto.StudentDTO;

public interface StudentService {
	void addStudent(StudentDTO dto);
 StudentDTO getStudent(long phoneNo);
 // void updateStudent (StudentDTO dto);
 
 
  void updateStudent(long no,String batch);
}
