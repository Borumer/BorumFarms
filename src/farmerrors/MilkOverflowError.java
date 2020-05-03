package farmerrors;

public class MilkOverflowError extends Exception {
	private static final long serialVersionUID = -5623841819364990365L;
	
	public MilkOverflowError() {
		super("Too much milk!");
	}
	
	public MilkOverflowError(String message) {
	    super(message);
	  }
}
