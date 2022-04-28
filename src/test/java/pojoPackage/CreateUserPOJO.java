package pojoPackage;

public class CreateUserPOJO {
	private String name;
	private String job;
	
	public CreateUserPOJO(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String getName() {
		return name;
	}
	public String getJob() {
		return job;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "CreateUserPOJO [name=" + name + ", job=" + job + "]";
	}

	
	
	

}
