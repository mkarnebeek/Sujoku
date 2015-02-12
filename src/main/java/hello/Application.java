package hello;

//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.SpringApplication;
//import org.springframework.context.annotation.ComponentScan;




public class Application {
	
	public static void main(String[] args) throws OutOfRangeException {
        //SpringApplication.run(Application.class, args);
    	System.out.println("Started");
		SudokuSolver suko = new SudokuSolver();
		Grid grid = new Grid();
		grid.setSlot(new Slot(1, 1, 5));
		grid.setSlot(new Slot(2, 1, 6));
		grid.setSlot(new Slot(3, 1, 7));
		suko.setGrid(grid);
		System.out.println(suko.findSolution());
    }
	
}

