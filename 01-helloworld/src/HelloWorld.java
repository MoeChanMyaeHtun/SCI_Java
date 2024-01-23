import java.util.Arrays;

public class HelloWorld {

	public static void main(String[] args) {  
        int [][][] numArray = new int [3][3][4];
//        System.out.println(numArray);
        numArray [0][1][1]= 10;
        numArray [1][0][1] = 40;
        numArray [2][1][3] = 40;
        System.out.println(Arrays.deepToString(numArray));
	}

}
