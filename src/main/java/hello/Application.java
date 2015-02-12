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
		grid.getSlot(new Location(1, 1)).value = 5;
		grid.getSlot(new Location(2, 1)).value = 6;
		grid.getSlot(new Location(3, 1)).value = 7;
		suko.setGrid(grid);
		System.out.println(suko.findSolution());
    }
	
}

