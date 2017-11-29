package info.chodev.algorithm.jesung.sixth;

public class photo_question {

		static int x;
		public photo_question() {
			this(2);
		}
		public photo_question(int x) {
			this.x=x;
		}
		public void numberinsert(int z, int h, int w , int[][] ab) {
			//가로 z
			//세로 h
			//넣을 값 w
			//배열 ab
			int cnt=0;//1번 수행되도록 제어하는 역할 
			for(int i=z;z<z+1 ;z++) {
				if(cnt<1) {
				for(int p=h;p<ab.length;p++) {
						ab[p][z]=w;
						cnt++;
			}
				break;
			}
			}
		}

		public static void main(String[] args) {
			photo_question j = new photo_question();
			int[][] numbers = new int[5][5];
			int i=0;
			int up=0;
			if(i < 5 && j.x < numbers.length-1) {
			for(i=0; i<numbers.length;i++) {
					numbers[up][i]=j.x; //1th :[0,0] = 2
					j.numberinsert(up, i, j.x, numbers);
					j.x++;//x값은 2,3,4,5,6 찍는데 도와주는 변수 +1씩함
					up++;//up은 세로 열을 증가시킴  
//					for(int k=0 ;k<numbers.length ; k++) { // 아래 행에 윗 행 숫자 복사함 [5][5]배열
//						int check = up;
//						check+=k;
//						if(check < numbers.length) {
//					numbers[check][i]=j.x;
					}
					}
					
					//2
					// 3
					//  4 
					//    5
					//     6
					//2
					//23
					//  4
					//    5
					//     6
				System.out.println("i,j:"+numbers[up][i]+"su:"+j.x);

				}
//}
//		} 
}

