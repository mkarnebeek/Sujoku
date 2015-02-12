package hello;

import java.util.Set;
import java.util.TreeSet;

public class GridSlot extends Slot {

	public Grid grid;

	public GridSlot(Grid grid, Location location) {
		super(location);
		this.grid = grid;
	}
	
	public GridSlot(Grid grid, Location location, Integer value) {
		super(location);
		this.grid = grid;
		this.value = value;
	}
	
	public Set<Integer> getPossibleValues() throws OutOfRangeException {
		Set<Integer> values = new TreeSet<Integer>();
		for (int i = 1; i <= this.grid.size; i=i+1) {
			values.add(i);
		}
		
		for (int impossibleValue : this.getImpossibleValues()) {
			values.remove(impossibleValue);
		}
		return values;
	}
	
	
	public Set<Integer> getImpossibleValues() throws OutOfRangeException {
		Set<Integer> impossibleValues = new TreeSet<Integer>();
		impossibleValues.addAll(this.getValues(this.grid.getSlotsOnXAxis(this)));
		impossibleValues.addAll(this.getValues(this.grid.getSlotsOnYAxis(this)));
		impossibleValues.addAll(this.getValues(this.getBlock().getSlots(this.grid)));
		return impossibleValues;
	}
}
