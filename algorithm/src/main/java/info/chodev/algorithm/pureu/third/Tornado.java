package info.chodev.algorithm.pureu.third;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 소용돌이 예쁘게 출력하기
 * 
 * @author pureu
 * @since 2017.11.09
 *
 */
public class Tornado {

	private int index = 1;
	private Direction direction = Direction.RIGHT; 
	
	/**
	 * 소용돌이를 출력한다.
	 * 
	 * @param r1
	 * @param c1
	 * @param r2
	 * @param c2
	 * @return
	 */
	public int[][] getTornado(int r1, int c1, int r2, int c2) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(Math.abs(r1));
		list.add(Math.abs(c1));
		list.add(Math.abs(r2));
		list.add(Math.abs(c2));
		int size = Collections.max(list) * 2 + 1;
		
		int[][] n = new int[size][size];
		int center = size / 2 ;
		
		int repeat = 1;
		Coord coord = new Coord();
		coord.setX(center);
		coord.setY(center);
		n[center][center] = repeat++;
		while(repeat <= Math.pow(size, 2)) {
			switch (direction) {
			case RIGHT:
				if(coord.getY() == n[0].length-1) {
					direction = Direction.TOP;
				} else {
					coord = doRight(coord);
					if((Math.abs(coord.getY() - center)) == index) {
						direction = Direction.TOP;
					}
				}
				break;
			case TOP:
				if(coord.getX() == 0) {
					direction = Direction.LEFT;
				} else {
					coord = doTop(coord);
					if((Math.abs(coord.getX() - center)) == index) {
						direction = Direction.LEFT;
					}
				}
				break;
			case LEFT:
				if(coord.getY() == 0) {
					direction = Direction.BOTTOM;
				} else {
					coord = doLeft(coord);
					if((Math.abs(coord.getY() - center)) == index) {
						direction = Direction.BOTTOM;
					}
				}
				break;
			case BOTTOM:
				if(coord.getY() == n.length-1) {
					direction = Direction.RIGHT;
				} else {
					coord = doBottom(coord);
					if((Math.abs(coord.getX() - center)) == index) {
						direction = Direction.RIGHT;
						index++;
					}
				}
				break;
			}
			n[coord.getX()][coord.getY()] = repeat;
			repeat++;
		}
		
		int a = Math.abs(r1) + r2 + 1;
		int b = Math.abs(c1) + c2 + 1;
		int[][] result = new int[a][b];
		
		for(int x=0;x<a;x++) {
			for(int y=0;y<b;y++) {
				result[x][y] = n[x][y];
			}
		}
		
		return result;
	}
	
	/**
	 * 오른쪽으로 이동한다.
	 * 
	 * @param coord
	 * @return
	 */
	public Coord doRight(Coord coord) {
		coord.setY(coord.getY()+1);
		return coord;
	}
	
	/**
	 * 위쪽으로 이동한다.
	 * 
	 * @param coord
	 * @return
	 */
	public Coord doTop(Coord coord) {
		coord.setX(coord.getX()-1);
		return coord;
	}
	
	/**
	 * 왼쪽으로 이동한다.
	 * 
	 * @param coord
	 * @return
	 */
	public Coord doLeft(Coord coord) {
		coord.setY(coord.getY()-1);
		return coord;
	}
	
	/**
	 * 아래쪽으로 이동한다.
	 * 
	 * @param coord
	 * @return
	 */
	public Coord doBottom(Coord coord) {
		coord.setX(coord.getX()+1);
		return coord;
	}
	
	public static void main(String[] args) {
		Tornado tornado = new Tornado();
		int[][] matrix = tornado.getTornado(-3, -3, 2, 0);
		for(int i=0;i<matrix.length;i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
	}

}

class Coord {
	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}

enum Direction {
	RIGHT, TOP, LEFT, BOTTOM
}