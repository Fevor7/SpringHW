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
}
