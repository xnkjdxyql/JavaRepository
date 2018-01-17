package listsample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArraylistSample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr1=new ArrayList<String>();
		arr1.add("test1");
		arr1.add("test2");
		Collection<String> c=new ArrayList<String>();
		for(int i=1;i<12;i++){
			c.add(i+"col");
		}
		//第二种构造方法
		ArrayList<String> arr2=new ArrayList<String>(c);
		//第三种构造方法
		ArrayList<Integer> arr3=new ArrayList<Integer>(20);
		arr3.add(100); arr3.add(200);
		List<Float> arr4=new ArrayList<Float>(5);
		arr4.add(66.6f);
		arr4.add(77.7f);
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr3);
		for(Float element:arr4){
			System.out.print(element+"\t");
		}
		
	}

}
