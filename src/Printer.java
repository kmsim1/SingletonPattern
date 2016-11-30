
public class Printer {
	private int page = 0;
	
	//클래스에서 가지고 있어야할 변수라고 해석
	private static Printer printer = null; 
	
	private Printer() {};
	
	//static 메소드 = 클래스가 수행하는 메소드
	//synchronized 동기화를 통해서 한 스레드가
	//접근 할 때는 다른 스레드가 접근 하지 못한다.
	public static synchronized Printer getInstance() {
		
		if(printer == null) {
			printer = new Printer();
		}
		
		return printer;
	}

	// print 메소드도 동기화 해주어야함.
	public synchronized void print(String msg) {
		System.out.println("********************");
		System.out.println("********************");

		System.out.println(msg);
		page++;

		System.out.println("*******" + page + "*************");
		System.out.println("********************");
	}
}
