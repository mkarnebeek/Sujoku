package hello;

public class Location implements Comparable<Location> {

	public Integer x;
	public Integer y;
	
	public Location(Integer x, Integer y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Location [" + (x != null ? "x=" + x + ", " : "")
				+ (y != null ? "y=" + y : "") + "]";
	}

	public Block getBlock() throws OutOfRangeException {
		Integer xstart;
		Integer xend;
		Integer ystart;
		Integer yend;
		if (this.x >= 0 && this.x <= 2) {
			xstart = 0;
			xend = 2;
		} else if (this.x >= 3 && this.x <= 5) {
			xstart = 3;
			xend = 5;
		} else if (this.x >= 6 && this.x <= 8) {
			xstart = 6;
			xend = 8;
		} else {
			throw new OutOfRangeException();
		}
		if (this.y >= 0 && this.y <= 2) {
			ystart = 0;
			yend = 2;
		} else if (this.y >= 3 && this.y <= 5) {
			ystart = 3;
			yend = 5;
		} else if (this.y >= 6 && this.y <= 8) {
			ystart = 6;
			yend = 8;
		} else {
			throw new OutOfRangeException();
		}
		return new Block(new Range(xstart, xend), new Range(ystart, yend));
	}
	
	@Override
	public int compareTo(Location other) {
		if (this.x < other.x) {
			return -1;
		}
		else if (this.x > other.x) {
			return 1;
		}
		else {
			if (this.y < other.y) {
				return -1;
			}
			else if (this.y > other.y) {
				return 1;
			}
			else {
				return 0;
			}
		}
	}

}
