package info.chodev.algorithm.baeyeongcheol.second;

import java.util.ArrayList;

public class DeleteSmallNum {

	public ArrayList<Integer> rm_small(ArrayList<Integer> list) {
		int small = 0;
		int count = 0;
		if(list.size() == 1) {
			list.remove(0);
		} else {
			small = list.get(0);
			for(int i=0; i<list.size()-1; i++) {
				if(small > list.get(i+1)) {
					small = list.get(i+1);
					count++; 
				}
			}
			list.remove(count);
		}
		return list;
	}
	
	public static void main(String[] args) {
		DeleteSmallNum deleteSmallNum = new DeleteSmallNum();
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(20);
		list.add(10);
		list.add(5);
		list.add(50);
		list.add(12);
		System.out.println(deleteSmallNum.rm_small(list));
	}
	
}
