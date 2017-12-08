package info.chodev.algorithm.seohae.seventh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * palindrome
 * @author seohae
 * @since 2017.12.03
 */
public class Palindrome {
	
	/**
	 * 팰린드롬
	 * @param b
	 * @return
	 */
    public int palindrome(String b)
    {
    	int answer = 0;
    	int a = 0;
    	int c = 0;
    	
    	List<String> Blist = new ArrayList<String>(); //리스트
    	List<String> BReverselist = new ArrayList<String>(); //revert를 위한 리스트
    	
    	for(int i=0; i<b.length(); i++){
    		String C= b.substring(i, i+1); 
    		Blist.add(C); //리스트에 담음
    		BReverselist.add(C); //리스트에 담음
    	}
    	Collections.reverse(BReverselist); //거꾸로 담음

    	for(int i=0;i<Blist.size();i++) { 
    		//리스트의 첫글자와 뒤집은 리스트에서 같은 글자를 찾음 (처음 찾았을때의 위치 i를 c에 저장)
			if(Blist.get(a).equals(BReverselist.get(i))){ //a=0이다. 
	    		c = i;
			}
			//위에서 같은 위치값을 찾았고 다시 리스트 a번째랑 뒤집은 리스트의 c의 글자를 찾는다.
			if(Blist.get(a).equals(BReverselist.get(c))){ 
				answer++;
			} else if(Blist.get(a+(i+1)).equals(BReverselist.get(c))){ 
				answer++;
			}
		}
    	
        return answer;
    }
    public static void main(String[] args) 
    {
    	Palindrome test = new Palindrome();
        String b = "토마토맛토마토";
        String c = "토마토맛있어";
        String d = "racecar";
        String e = "zzbaabcd"; //4
        
        //zzbaabcd
        //dcbaabzz

        System.out.println(test.palindrome(b));
        System.out.println(test.palindrome(c));
        System.out.println(test.palindrome(d));
        System.out.println(test.palindrome(e)); //4
    }
}
