package info.chodev.algorithm.pureu.fifth;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * https://www.acmicpc.net/problem/1138
 * 
 * 한줄로 서기
 * 
 * input  : 2 1 1 0
 * output : 4 2 1 3
 * 
 * 0      : 1 2 3 4
 * 
 * 1      : 2 3 4 1 / isChanged : true
 * 2      : 3 4 1 2 / isChanged : true
 * 3      : 4 1 2 3 / isChanged : false
 * 4      : 4 1 2 3 / isChanged : false
 *                  
 * 1      : 4 2 3 1 / isChanged : true
 * 2      : 4 2 3 1 / isChanged : false
 * 3      : 4 2 3 1 / isChanged : false
 * 4      : 4 2 3 1 / isChanged : false
 *                  
 * 1      : 4 2 1 3 / isChanged : true
 * 2      : 4 2 1 3 / isChanged : false
 * 3      : 4 2 1 3 / isChanged : false
 * 4      : 4 2 1 3 / isChanged : false
 *                  
 * 1      : 4 2 1 3 / isChanged : false
 * 2      : 4 2 1 3 / isChanged : false
 * 3      : 4 2 1 3 / isChanged : false
 * 4      : 4 2 1 3 / isChanged : false
 * 
 * @author pureu
 * @since 2017.11.19
 *
 */
public class Line {
	
	private static final Logger logger = LoggerFactory.getLogger(Line.class);

	public int[] setLine(int[] n) {
		int[] line = new int[n.length];
		
		for(int i=0;i<n.length;i++) {
			line[i] = i+1;
		}
	
//		int repeater = getFactorial(n.length);
		int repeater = n.length * n.length;
		int counter = 0;
		
		while(counter < repeater) {
			int checkCount = 0;
			int changedIndex = 0;
			for(int i=0;i<line.length;i++) {
				int checked = checkLeftCount(line, i+1, n[i]);
				int index = binarySearch(line, i+1);
				if(checked < 0) {
					line = goBack(index, line);
					logger.debug(Arrays.toString(line));
					checkCount++;
				} else if(checked > 0) {
					if(changedIndex == index) {
						index--;
					}
					line = goFront(index, line);
					logger.debug(Arrays.toString(line));
					checkCount++;
					changedIndex = index;
				} else {
					logger.debug(Arrays.toString(line));
				}
			}
			if(checkCount == 0) {
				break;
			}
			counter++;
			logger.debug("");
		}
		
		return line;
	}
	
	public int binarySearch(int[] line, int n) {
		for(int i=0;i<line.length;i++) {
			if(line[i] == n) {
				return i;
			}
		}
		return -1;
	}
	
	public int[] goBack(int index, int[] line) {
		int[] back = new int[line.length];
		int j=0;
		for(int i=0;i<back.length;i++) {
			if(i == index) {
				continue;
			}
			back[j++] = line[i];
		}
		back[back.length-1] = line[index];
		return back;
	}
	
	public int[] goFront(int index, int[] line) {
		int[] front = line.clone();
		int temp = 0;
		for(int i=0;i<front.length;i++) {
			if(i == index) {
				temp = front[i];
				front[i] = front[i-1];
				front[i-1] = temp;
				break;
			}
		}
		return front;
	}
	
	/**
	 * check Left Count
	 * 
	 * @param line
	 * @param n
	 * @param count
	 * @return
	 */
	public int checkLeftCount(int[] line, int n, int count) {
		int idx = binarySearch(line, n);
		int actual = 0;
		for(int i=0;i<idx;i++) {
			if(line[i] > n) {
				actual++;
			}
		}
		
		if(actual < count) {
			return -1;
		} else if(actual > count) {
			return 1;
		} else {
			return 0;
		}
	}
	
	/**
	 * get factorial number
	 * 
	 * @param n
	 * @return
	 */
	public int getFactorial(int n) {
		int factorial = 1;
		if(n == 1) {
			return 1;
		} else {
			return factorial *= n * getFactorial(n-1);
		}
	}
}
