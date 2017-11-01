package info.chodev.algorithm.baeyeongcheol.second;
public class NoOvertime {
   public int noOvertime(int no, int[] works) {
      int result =  0;
      // 야근 지수를 최소화 하였을 때의 야근 지수는 몇일까요?
      while(no != 0) {
         works[findSmallNum(works)] --;
         no--;
      }
      result = sumArr(works);
      return result;
   }
   
   public int findSmallNum(int[] works) {      // 가장 작은수를 찾아주는 메소드
      int point = 0;
      for(int i=0; i<works.length-1; i++) {
         if(works[i] < works[i+1]) {
            point++;
         }
      }
      return point;
   }
   
   public int sumArr(int[] works) {         // 배열의 지수를 더해주는 메소드
      int result = 0;
      for(int i=0; i<works.length; i++) {
         result += works[i]*works[i];
      }
      return result;
   }
   
   
   public static void main(String[] args) {
      NoOvertime c = new NoOvertime();
      int []test = {7,4,4};
      System.out.println(c.noOvertime(4,test));
   }
}