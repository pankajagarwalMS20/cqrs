package eventsourcing;
import java.util.HashMap;

public class Repository {

	private HashMap<String, Object> map = new HashMap<String, Object>();

	public HashMap<String, Object> getMap() {
		return map;
	}

	public void setMap(HashMap<String, Object> map) {
		this.map = map;
	}
	
}
