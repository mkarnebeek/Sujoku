package hello;

import java.util.Set;
import java.util.TreeSet;

public class Grid {

	int size = 9;
	int x = this.size;
	int y = this.size;

	Integer[][] field = new Integer [x][y];
	
	public String toString() {
		// TODO Auto-generated method stub
		return "Not implemented yet";
	}

	public Slot getSlot(Location location) {
		x = location.x;
		y = location.y;
		Integer value = this.field[x][y];
		return new Slot(x, y, value);
	}
	
	public Integer getSlotValue(Location location) {
		return this.getSlot(location).value;
	}
	
	public void setSlot(Slot slot) {
		this.field[slot.x][slot.y] = slot.value;
	}
	
	public Set<Integer> getImpossibleValues(Location location) throws OutOfRangeException {
		Set<Integer> impossibleValues = new TreeSet<Integer>();
		impossibleValues.addAll(this.getValuesX(location));
		impossibleValues.addAll(this.getValuesY(location));
		impossibleValues.addAll(this.getValuesBlock(location));
		return impossibleValues;
	}
		
	public Set<Integer> getPossibleValues(Location location) throws OutOfRangeException {
		Set<Integer> values = new TreeSet<Integer>();
		for (int i = 1; i <= this.size; i=i+1) {
			values.add(i);
		}
		
		
		for (int impossibleValue : this.getImpossibleValues(location)) {
			values.remove(impossibleValue);
		}
		return values;
	}
	
	public Set<Integer> getValuesY(Location location) {
		Set<Integer> values = new TreeSet<Integer>();
		for (int x = 0; x < this.x; x=x+1) {
			if (x == location.x) {
				continue;
			}
			Slot slot = this.getSlot(new Location(x, location.y));
			if (slot.value == null) {
				//continue;
			}
			values.add(slot.value);
		}
		return values;
	}
	
	public Set<Integer> getValuesX(Location location) {
		Set<Integer> values = new TreeSet<Integer>();
		for (int y = 0; y < this.y; y=y+1) {
			if (y == location.y) {
				continue;
			}
			Slot slot = this.getSlot(new Location(location.x, y));
			if (slot.value == null) {
				//continue;
			}
			values.add(slot.value);
		}
		return values;
	}
	
	public Set<Integer> getValuesBlock(Location location) throws OutOfRangeException {
		Set<Integer> values = new TreeSet<Integer>();
		Block block = location.getBlock();
		Set<Slot> slots = block.getSlots(this);
		for (Slot slot: slots) {
			if (slot.value == null || (slot.x == location.x && slot.y == location.y)) {
				continue;
			}
			values.add(slot.value);
		}
		return values;
	}
	
}

