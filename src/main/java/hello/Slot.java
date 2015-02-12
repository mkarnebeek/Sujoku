package hello;

import java.util.Set;
import java.util.TreeSet;

public class Slot extends Location {

	public Integer value;
	public Set<Integer> possibleValues;
	
	public Slot(Location location) {
		super(location.x, location.y);
	}
	
	public Slot(Location location, Integer value) {
		super(location.x, location.y);
		this.value = value;
	}
	
	protected Set<Integer> getValues(Set<Slot> slots) {
		Set<Integer> values = new TreeSet<Integer>();
		for (Slot slot: slots) {
			if (slot.value != null) {
				values.add(slot.value);
			}
		}
		return values;
	}

}
