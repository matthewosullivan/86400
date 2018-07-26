package interview86400;

public class TrickyLoop {

	// print 1 to 100
	// given starting point of for (int i = 0; ; i--)
	public static void main(String[] args) {
		
		for (int i = 0; i > -100; i--) {
			System.out.println(1-i);
		}

	}

}
