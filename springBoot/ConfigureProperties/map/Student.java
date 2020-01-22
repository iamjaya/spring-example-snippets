
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="app")
public class Student {
	
	public Map<String,String> subject;

	public Map<String, String> getSubject() {
		return subject;
	}

	public void setSubject(Map<String, String> subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Student [subject=" + subject + "]";
	}
	
	
}
