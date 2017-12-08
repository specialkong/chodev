package info.chodev.algorithm.seohae.seventh;

import java.util.Arrays; //테스트로 출력해 보기 위한 코드입니다.

public class BestSet {

    public int bestSet(int n, int s){
        int[] answer = new int[n];
        int[] result = new int[n];
        int sCheck = 0;
        int sum = 0;
        
        int max= 0;
        
        int a = 2;
        int o = 0;
        
        answer[0] = a;
        
        while(sCheck != s){
        	int i = 0;
        	answer[i] = a+i;
        	sCheck += answer[i];
        	System.out.println(sCheck);
        	
        	if(sCheck == s){
        		for(int j = 0; j<n; j++){
        			sum = sum * answer[j];
        			System.out.println(sum);
        		}
        	}
        	result[o] = sum;
        	o++;
        	
        	a++;
            i++;
        }
        
        System.out.println(Arrays.toString(result));
        
        for(int i=0; i<n; i++){
        	if(result[i] > max){
        		max = result[i];
        	}
        }
        
        return max;
    }
    public static void main(String[] args) {
        BestSet c = new BestSet();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(c.bestSet(3,13));
    }

}
