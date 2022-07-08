package oops.Array.Array_Demo.dao;

import oops.Array.Array_Demo.dto.StudentDTO;

public class StudentDAOImpl implements StudentDAO{

	StudentDTO[]  students=new StudentDTO[10];
	int index=0;
	
	@Override
	public void addStudent(StudentDTO dto) {
		this.students[this.index]=dto;
		
	}
@Override
public StudentDTO getStudent(long phoneNo) {
for(int i=0;i<students.length;i++) {
	if(students[i]!=null&&students[i].getphoneNo()==phoneNo) {
		System.out.println(studendts[i]);
		return students[i];
	}
}
return null;

}
}
