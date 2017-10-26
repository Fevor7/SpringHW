package by.it.bean3;

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
	
	public void performJob(String name) {
		System.out.println("Job name: " + name);
	}
}
