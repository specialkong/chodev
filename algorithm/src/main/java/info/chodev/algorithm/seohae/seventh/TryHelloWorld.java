package info.chodev.algorithm.seohae.seventh;

import java.util.Arrays;

/**
 * 최소값 만들기
 * @author seohae
 * @since 2017.12.03
 */
class TryHelloWorld
{	
	/**
	 * 곱하기
	 * @param A
	 * @param B
	 * @return
	 */
    public int getMinSum(int [] A, int [] B)
    {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
        
        for(int i=0;i<A.length;i++){
    		answer += (A[i] * B[B.length - (i+1)]);
        }
        
        return answer;
    }
    public static void main(String[] args)
    {
        TryHelloWorld test = new TryHelloWorld();
        int [] A = {1,2};
        int [] B = {3,4};
        System.out.println(test.getMinSum(A,B));
    }
}
