
public class RecursionPracticeMain {

	public static void main(String[] args) {
		System.out.println(fibonacci(25));

	}

	public static void printx(int x, int maxCount) {

		if (maxCount != 0) {
			System.out.println( x);

			printx(x, maxCount-1);
		}
	}
	public static int add(int x) {
		if (x==0)
			return 0;


		return x + add(x-1);

	}

	//f(n) = f(n-1) + f(n-2)
	//f(0)) = 0
	//f(1) = 1
	public static int fibonacci(int n) {
		if(n==0)
			return 0;

		else if (n==1)
			return 1;
		else
			return fibonacci(n-1) + fibonacci(n-2);
		
	}
}


