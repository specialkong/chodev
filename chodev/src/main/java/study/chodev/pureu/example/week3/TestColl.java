package study.chodev.pureu.example.week3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestColl {

	public static void main(String[] args) {
		List<Object> aa = new ArrayList<Object>();
		
		Map<String, String> map = new HashMap<String, String>();
		
				
		Map<String, Object> map2 = new HashMap<String, Object>();
		int a = 3;
		Object obj;
		
		obj = (Integer)a;
		
		int[] aaa = new int[4];
		String[] ccc = new String[3];
		obj = aaa;
		int[] bb = (int[])obj;
		obj = ccc;
		
		try {
			try {
				
			} catch (Exception e) {
				System.err.println("err");
				throw new ChodevException("err");
			}
		}catch(ChodevException ne){
			
		}
		
		
	}
	
}
