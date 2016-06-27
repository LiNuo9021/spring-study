package book.chapter3.di;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Boss {
	private List cars = new LinkedList<Car>();
	private Map<String, String> child = new HashMap<String, String>();
	
	
	public Map<String, String> getChild() {
		return child;
	}

	public void setChild(Map<String, String> child) {
		this.child = child;
	}

	public List getCars() {
		return cars;
	}

	public void setCars(List cars) {
		this.cars = cars;
	}
}


