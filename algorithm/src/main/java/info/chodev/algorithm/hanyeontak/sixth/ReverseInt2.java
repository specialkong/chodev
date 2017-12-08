package info.chodev.algorithm.hanyeontak.sixth;

import java.util.Arrays;
public class ReverseInt2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ReverseInt2 ri = new ReverseInt2();
        System.out.println(ri.reverseInt(118372));
    }   
    
    public int reverseInt(int n){
        String str = Integer.toString(n);
        Integer[] array = new Integer[str.length()];
        for(int i=0; i<array.length; i++){
            array[i] = Character.getNumericValue(str.charAt(i));
        }
        Arrays.sort(array);
        String result = "";
        for(int i = array.length-1; i >=0; i--){
            result += Integer.toString(array[i]);
        }
        return  Integer.parseInt(result);
    }
}

