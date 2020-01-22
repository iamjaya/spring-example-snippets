
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="app")
public class Student {
public College college;

public College getCollege() {
	return college;
}

public void setCollege(College college) {
	this.college = college;
}

}
