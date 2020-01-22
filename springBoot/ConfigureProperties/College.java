
import org.springframework.stereotype.Component;

@Component

public class College {
	
	public String name;
	public String location;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "College [name=" + name + ", location=" + location + "]";
	}
	

}
