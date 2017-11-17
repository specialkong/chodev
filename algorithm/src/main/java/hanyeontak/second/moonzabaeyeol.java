package hanyeontak.second;

class SumMatrix{
	int[][] sumMatrix(int[][] A, int[][] B) {
		int[][] answer= {{0,0}, {0,0}};
		
		return answer;
	}
	
	public static void main(String[] args) {
		SumMatrix c= new SumMatrix();
		int[][] A = {{1,2}, {2,3}};
		int[][] B = {{3,4}, {5,6}};
		int[][] answer= c.sumMatrix(A,B);
		if(answer[0][0] == 4 && answer[0][1] == 6&&
				answer[1][0] == 7&& answer[1][1] ==9) {
			System.out.println("correct");
		} else {
			System.out.println("wrong");
		}
	}
}
