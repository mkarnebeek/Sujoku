package hello;

import java.util.Set;
import java.util.TreeSet;

public class Grid {

	int size = 9;
	int x = this.size;
	int y = this.size;

	GridSlot[][] field = new GridSlot [x][y];
	
	public Grid() {
		for (Location location: this.getLocations()) {
			this.field[location.x][location.y] = new GridSlot(this, location);
		}
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return "Not implemented yet";
	}

	public GridSlot getSlot(Location location) {
		return this.field[location.x][location.y];
	}
	
	private Set<Location> getLocations() {
		Set<Location> locations = new TreeSet<Location>();
		for (int x = 0; x<this.x; x=x+1) {
			for (int y = 0; y<this.y; y=y+1) {
				locations.add(new Location(x,y));
			}
		}
		return locations;
	}
	
	public Set<Slot> getEmptySlots() {
		Set<Slot> emptySlots = new TreeSet<Slot>();
		for (Location location : this.getLocations()) {
			Slot slot = this.getSlot(location);
			if (slot.value == null) {
				emptySlots.add(slot);
			}
		}
		return emptySlots;
	}
	
	public Set<Slot> getSlotsOnYAxis(Location location) {
		Set<Slot> slots = new TreeSet<Slot>();
		for (int x = 0; x < this.x; x=x+1) {
			slots.add(this.getSlot(new Location(x, location.y)));
		}
		return slots;
	}
	
	public Set<Slot> getSlotsOnXAxis(Location location) {
		Set<Slot> slots = new TreeSet<Slot>();
		for (int y = 0; y < this.y; y=y+1) {
			slots.add(this.getSlot(new Location(location.x, y)));
		}
		return slots;
	}
		
}

