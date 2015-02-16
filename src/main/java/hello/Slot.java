package hello;

import java.util.Set;
import java.util.TreeSet;

public class Slot extends Location {

	public Integer value;
	
	public Slot(Location location) {
		super(location.x, location.y);
	}
	
	public Slot(Location location, Integer value) {
		super(location.x, location.y);
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "Slot [" + (value != null ? "value=" + value + ", " : "")
				+ (x != null ? "x=" + x + ", " : "")
				+ (y != null ? "y=" + y : "") + "]";
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
