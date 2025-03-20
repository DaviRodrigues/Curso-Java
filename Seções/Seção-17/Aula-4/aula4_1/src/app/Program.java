package app;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		//List<Integer> intList = new ArrayList<Integer>();
		//intList.add(null);
		//intList.add(null);
		
		//List<? extends Number> list = intList;
		
		//Number x = list.get(0);
		
		//list.add(20);
		
		List<Object> myObjs = new ArrayList<Object>();
		myObjs.add("Maria");
		myObjs.add("Alex");
		
		List<? super Number> myNums = myObjs;
		
		myNums.add(10);
		myNums.add(3.14);
		
		Number x = myNums.get(0);
		
	}

}
