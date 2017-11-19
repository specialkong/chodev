package info.chodev.algorithm.pureu.second;

import org.apache.commons.lang3.ArrayUtils;

/**
 * https://www.acmicpc.net/problem/1021
 * 
 * 회전하는 큐
 * 
 * @author pureu
 * @since 2017.11.03
 *
 */
public class Queue {
	
	public int getOperatorCount(int n, int[] m) {
		int[] queue = new int[n];
		for(int i=0;i<n;i++) {
			queue[i] = i + 1;
		}
		
		boolean isLeft = false;
		int moveCount = 0;
		for(int i=0;i<m.length;i++) {
			while(true) {
				int key = search(queue, m[i]);
				
				if(key == 0) {
					queue = ArrayUtils.remove(queue, 0);
					break;
				}
				
				if(key < 0) {
					return -1;
				} else if(key <= queue.length / 2 - 1) {
					isLeft = true;
				}
				
				if(isLeft) {
					queue = doLeft(queue);
					moveCount++;
				} else {
					queue = doRight(queue);
					moveCount++;
				}
			}
		}
		return moveCount;
	}
	
	public int[] doLeft(int[] m) {
		int[] tmp = new int[m.length];
		System.arraycopy(m, 1, tmp, 0, m.length-1);
		tmp[tmp.length-1] = m[0];
		return tmp;
	}
	
	public int[] doRight(int[] m) {
		int[] tmp = new int[m.length];
		System.arraycopy(m, 0, tmp, 1, m.length-1);
		tmp[0] = m[m.length-1];
		return tmp;
	}
	
	public int search(int[] m, int n) {
		int index = 0;
		for(int i=0;i<m.length;i++) {
			if(m[i] == n) {
				index = i;
				break;
			}
			index = -1;
		}
		return index;
	}

	public static void main(String[] args) {
		Queue queue = new Queue();
		System.out.println(queue.getOperatorCount(10, new int[]{5, 7}));
	}

}
