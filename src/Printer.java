
public class Printer {
	private int page = 0;
	
	//Ŭ�������� ������ �־���� ������� �ؼ�
	private static Printer printer = null; 
	
	private Printer() {};
	
	//static �޼ҵ� = Ŭ������ �����ϴ� �޼ҵ�
	//synchronized ����ȭ�� ���ؼ� �� �����尡
	//���� �� ���� �ٸ� �����尡 ���� ���� ���Ѵ�.
	public static synchronized Printer getInstance() {
		
		if(printer == null) {
			printer = new Printer();
		}
		
		return printer;
	}

	// print �޼ҵ嵵 ����ȭ ���־����.
	public synchronized void print(String msg) {
		System.out.println("********************");
		System.out.println("********************");

		System.out.println(msg);
		page++;

		System.out.println("*******" + page + "*************");
		System.out.println("********************");
	}
}
