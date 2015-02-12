package hello;

public class SudokuSolver {
	
	private Grid grid;

	public SudokuSolver() {
		// TODO Auto-generated constructor stub
	}

	public void setGrid(Grid grid) {
		// TODO Auto-generated method stub
		this.grid = grid;
	}

	public String findSolution() throws OutOfRangeException {
		return grid.toString();
	}
	
}
