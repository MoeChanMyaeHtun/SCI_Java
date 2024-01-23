
public class MethodDemo {

	public static void main(String[] args) {
		MethodDemo.print();
		String data = MethodDemo.printData("Hello");
		System.out.println(data);
		int sum = MethodDemo.plus();
		System.out.println(sum);
		MethodDemo.sum(10,20);
	}

	public static void print(){
		System.out.println("Printing a message ... ");
	}

	public static String printData(String data){
		return data;
	}

	public static int plus(){
		int x = 10;
		int y = 20;
		int sum = x + y;
		return sum;

	}

	public static void sum(int x , int y){
		System.out.println(x+y);
		// return;
	}

}
