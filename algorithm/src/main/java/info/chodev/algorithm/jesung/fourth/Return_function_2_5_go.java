package info.chodev.algorithm.jesung.fourth;

import java.util.ArrayList;
import java.util.List;

public class Return_function_2_5_go {

	public List<Integer> event(int initnum , int cnt) {
		int clone =0;
		clone= initnum;
		List<Integer> list = new ArrayList<Integer>();
		list.add(initnum); //1th
	for(int i=0; i< cnt-1; i++) {
		clone += initnum;
		list.add(clone); // after 1th
	}
	return list;
	}
	
 public static void main(String[] args) {
	 Return_function_2_5_go re = new Return_function_2_5_go();
	 System.out.println(re.event(2, 5));
	 System.out.println(re.event(4, 3));
}
}