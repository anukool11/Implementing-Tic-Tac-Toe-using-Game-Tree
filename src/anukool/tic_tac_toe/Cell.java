package anukool.tic_tac_toe;

public class Cell {
	private int x;
	private int y;
	private int minimaxValue; //1, 0 or -1(win, loose or draw)
	
	public Cell(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "(" +this.x +"," +this.y +")";
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getMinimaxValue() {
		return minimaxValue;
	}

	public void setMinimaxValue(int minimaxValue) {
		this.minimaxValue = minimaxValue;
	}
	
}
