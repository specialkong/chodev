package info.chodev.algorithm.pureu.third;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

/**
 * https://programmers.co.kr/learn/challenge_codes/154
 * 
 * 땅따먹기 게임
 * 
 * @author pureu
 * @since 2017.11.09
 *
 */
public class Land {

	public int hopscotch(int[][] board, int size) {
        int index = -1;
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<board.length;i++) {
        	int max = getMax(board[i]);
        	int maxIndex = Arrays.binarySearch(board[i], max);
        	if(index == maxIndex) {
        		max = getMax(board[i], maxIndex);
        	}
        	list.add(max);
        	index = maxIndex;
        }

        int sum = 0;
        for(Integer z:list) {
        	sum += z;
        }
        return sum;
    }
	
	/**
	 * max 를 구한다.
	 * 
	 * @param n
	 * @return
	 */
	public int getMax(int[] n) {
		int[] m = n.clone();
		Arrays.sort(m);
		return m[m.length-1];
	}
	
	/**
	 * idx 를 제외한 max를 구한다.
	 * 
	 * @param n
	 * @param idx
	 * @return
	 */
	public int getMax(int[] n, int idx) {
		int[] m = ArrayUtils.remove(n, idx);
		Arrays.sort(m);
		return m[m.length-1];
	}

    public static void main(String[] args) {
    	Land land = new Land();
        int[][] test = { { 1, 2, 3, 5 }, { 5, 6, 7, 8 }, { 4, 3, 2, 1 } };
        System.out.println(land.hopscotch(test, 3));
    }

}
