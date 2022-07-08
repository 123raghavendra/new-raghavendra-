package oops.Array.Array_Demo.Service;

import   oops.Array.Array_Demo.dao.StudentDAO;
import oops.Array.Array_Demo.dao.StudentDAOImpl; 
import oops.Array.Array_Demo.dto.StudentDTO;


public class StudentServiceimpl implements StudentService {
	
StudentDAO studentDAO =new StudentDAOImpl();

@Override public void addStudent(StudentDTO dto) {
	long number =dto.getPhoneNo();
	int count=0;
	while(number>0) {
		number=number/10;
		count++;
		
	}
if(count==10) {
	studentDAO.addStudent(dto);	
}
else {
	System.out.println("invalid number");
}

}
@Override
public StudentDTO getStudent(long phoneNo) {
	return studentDAO.getStudent(phoneNo);
}

	
	

}
