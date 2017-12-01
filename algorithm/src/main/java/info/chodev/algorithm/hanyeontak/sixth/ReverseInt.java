package info.chodev.algorithm.hanyeontak.sixth;
import java.util.Arrays;

public class ReverseInt {
	public int[] reverseInt(int[] n){
		int temp=0;
    for(int i=0; i<n.length;i++){
      for(int j=i+1;j<n.length;j++){
        if(n[i] < n[j]){
          temp=n[i];
          n[i]=n[j];
          n[j]=temp;
        }}}
   	return n;
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseInt ri = new ReverseInt();
		System.out.println(Arrays.toString(ri.reverseInt(new int[]{1,1,8,3,7,2})));
	}
}

	
  
	