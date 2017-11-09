package info.chodev.algorithm.jesung.third;

public class Java_1_17 {
	public String check(String[] n, int x) { 
		String word = null; 
		String word1 = null; 
		String word2 = null; 
		for(int i=0;i<n.length;i++) { 
		if(n[i]=="car") { 
		word=n[i]; 
		}else if(n[i]=="sun") { 
		word1=" "+n[i]; 
		}else if(n[i]=="bed") { 
		word2=" "+n[i]; 
		} 
		 } 
		word += word2; 
		word += word1; 
		return word; 
		} 
		public static void main(String[] args) { 

		Java_1_17 ja = new Java_1_17(); 
		String[] arr= {"sun", "bed", "car"}; 
		System.out.println(ja.check(arr,1)); 
		}
}
