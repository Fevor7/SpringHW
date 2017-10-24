package by.it.beancollect;

public class NullValueBean {

	private String work;

	private NullValueBean() {
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	@Override
	public String toString() {
		return "NullValueBean [work=" + work + "]";
	}

}
