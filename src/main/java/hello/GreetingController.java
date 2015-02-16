package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    
    @RequestMapping("/sudoku")
    public String sudoku() {
		SudokuSolver suko = new SudokuSolver();
		Grid grid = new Grid();
		grid.getSlot(new Location(1, 1)).value = 5;
		grid.getSlot(new Location(2, 1)).value = 6;
		grid.getSlot(new Location(3, 1)).value = 7;
		suko.setGrid(grid);
		String output = "";
		try {
			output += suko.findSolution();
		} catch (OutOfRangeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return output;
    }
}
