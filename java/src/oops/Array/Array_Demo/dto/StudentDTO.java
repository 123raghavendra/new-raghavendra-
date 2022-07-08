package oops.Array.Array_Demo.dto;

public class StudentDTO {
	private String id;
	private String name;
	private String batchname;
	private long phoneNo;
	private String percentage;
	
	
	StudentDTO(String id,String name,String batchname,long phoneNo,String percentage){
		this.id=id;
		this.name=name;
		this.batchname=batchname;
		this.phoneNo=phoneNo;
		this.percentage=percentage;
		
		
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBatchname() {
		return batchname;
	}


	public void setBatchname(String batchname) {
		this.batchname = batchname;
	}


	public long getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}


	public String getPercentage() {
		return percentage;
	}


	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}


	@Override
	public String toString() {
		return "StudentDTO [id=" + id + ", name=" + name + ", batchname=" + batchname + ", phoneNo=" + phoneNo
				+ ", percentage=" + percentage + "]";
	}
	
	

}
