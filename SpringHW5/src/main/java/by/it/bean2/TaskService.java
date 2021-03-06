package by.it.bean2;

import org.springframework.stereotype.Service;

@Service("taskService")
public class TaskService {

	public void performJob() {
		System.out.println("Perform Job");
	}

	public void performExceptionJob() throws Exception {
		System.out.println("Throw exception in Job");
		throw new Exception("ExceptionJob");
	}

	public String performJobAround() {
		System.out.println("Perform around Job");
		return "SUCCESS";
	}
	
	public String jobAround(String name) {
		System.out.println("jobAround method: " + name);
		return "SUCCESS";
	}
	
	public void performJob(String name, String name2) {
		System.out.println("Job name: " + name  + " h: " + name2);
	}
}
