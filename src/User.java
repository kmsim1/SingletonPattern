
public class User extends Thread {
	Thread userThread = new Thread(this);
	private int idx;
	
	public User(int i) {
		this.idx = i;
	}
	
	public void printstart() {
		userThread.start();
	}
	
	@Override
	public void run() {
		Printer printer = Printer.getInstance();
		printer.print("Hello");
		
	}
}
