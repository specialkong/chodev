package info.chodev.algorithm.pureu.second;

/**
 * https://programmers.co.kr/learn/challenge_codes/187
 * 
 * 가장 큰 정사각형 찾기
 * 
 * @author pureu
 * @since 2017.11.03
 *
 */
public class Square {

	public int findLargestSquare(char[][] board)
    {
        int max = 0;
        for(int i=0;i<board.length;i++) {
			for(int j=0;j<board.length;j++) {
				int result = getSquare(board, i, j);
//				System.out.print(result);
				if(result > max) {
					max = result;
				}
			}
//			System.out.println();
        }

        return max * max;
    }
	
	public int getSquare(char[][] board, int x, int y) {
		int index = 0;
		boolean isSquare = true;
		while(isSquare) {
			for(int i=x;i<=x+index;i++) {
				for(int j=y;j<=y+index;j++) {
					if(i == board.length || j == board.length) {
						isSquare = false;
						break;
					}
					if(board[i][j] != 'O') {
						isSquare = false;
						break;
					}
				}
				if(!isSquare) {
					break;
				}
			}
			if(isSquare) {
				index++;
			}
		}
		return index;
	}
	
    public static void main(String[] args)
    {
    	Square test = new Square();
				char [][]board ={
				{'X','O','O','O','X'},
				{'X','O','O','O','O'},
				{'X','X','O','O','O'},
				{'X','X','O','O','O'},
				{'X','X','X','X','X'}};

        System.out.println(test.findLargestSquare(board));
    }
}
