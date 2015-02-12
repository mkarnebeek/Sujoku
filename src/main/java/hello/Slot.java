package hello;

public class Slot extends Location {

	public Integer value;
	
	public Slot(Integer x, Integer y) {
		super(x, y);
	}
	
	public Slot(Integer x, Integer y, Integer value) {
		super(x, y);
		this.value = value;
	}
}
