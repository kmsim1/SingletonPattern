
public class Client {
	public static void main(String args[]) {
		User[] users = new User[5];
		
		for(int i=0; i<users.length; i++) {
			users[i] = new User(i);
			users[i].printstart();
		}
	}

}
