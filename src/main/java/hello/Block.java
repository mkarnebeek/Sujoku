package hello;

import java.util.Set;
import java.util.TreeSet;

public class Block {
	Range xrange;
	Range yrange;
	public Block(Range xrange, Range yrange) {
		this.xrange = xrange;
		this.yrange = yrange;
	}
	
	public Set<Slot> getSlots(Grid grid) {
		Set<Slot> slots = new TreeSet<Slot>();
		for (int x = this.xrange.start; x<=this.xrange.end; x=x+1) {
			for (int y = this.yrange.start; y<=this.yrange.end; y=y+1) {
				slots.add(grid.getSlot(new Location(x, y)));
			}
		}
		return slots;
	}
}
