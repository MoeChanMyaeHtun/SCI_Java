package sci.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		Collections.addAll(strList, "hello","java","generic","collection","hello",null);
		System.out.println(strList.get(0));
		System.out.println(strList);
		for(String str: strList) {
			System.out.println(str);
		}
		strList.add(1,"array List");
		System.out.println(strList);
		int[] index = {1,2,3,4,5,6,7,8,9};
		
	}

}
