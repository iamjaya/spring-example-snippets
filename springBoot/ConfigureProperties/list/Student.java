import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="app")
public class Student {
public List<Faculty> faculty;



public List<Faculty> getFaculty() {
	return faculty;
}

public void setFaculty(List<Faculty> faculty) {
	this.faculty = faculty;
}

}
