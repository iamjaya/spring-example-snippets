public class Faculty {

	public String name;
	public String subject;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Faculty [name=" + name + ", subject=" + subject + "]";
	}
	
}
