package info.chodev.algorithm.jesung.third;

	import java.util.Arrays;
	public class New_1_17 {
		public String check(String[] word){
			String word1="";
			String word2="";
			String word3="";
			int s=0;
			int cnt=0;
			for(int i=0;i<word.length;i++){	
				word1=word[i];
				if(word1.indexOf("a")!=-1){
					s=word1.indexOf("a");
					word2=word1.substring(s-1, s+2);
				}		
			}
			cnt++;
			word3=word2;
			if(cnt!=0){
				switch(cnt){
				case 1 :
				for(int i=0;i<word.length;i++){	
					word1=word[i];
					if(word1.indexOf("e")!=-1){
						s=word1.indexOf("e");
						word2=word1.substring(s-1, s+2);
					}		
				}
				cnt++;
				word3+=" "+word2;
				case 2 :
					for(int i=0;i<word.length;i++){	
						word1=word[i];
						if(word1.indexOf("u")!=-1){
							s=word1.indexOf("u");
							word2=word1.substring(s-1, s+2);
						}		
					}
					word3+=" "+word2;
			       }
			    }
				return word3;
			}		

		public static void main(String[] args){
			New_1_17 t = new New_1_17();
			String[] word = new String[] {"sun","bed","car"};
			System.out.println("1:"+Arrays.toString(word));
			System.out.println("2:"+t.check(word));
		}
	}


