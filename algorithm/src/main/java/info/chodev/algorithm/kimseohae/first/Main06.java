package info.chodev.algorithm.kimseohae.first;

import java.util.Scanner;

public class Main06 {
    public static void gcdlcm(int a, int b, int max) {
       
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("첫번째 행렬 -> (1,1) 입력: ");
    	int a = sc.nextInt();
    	System.out.println("첫번째 행렬 -> (1,2) 입력: ");
    	int b = sc.nextInt();
    	System.out.println("첫번째 행렬 -> (2,1) 입력: ");
    	int c = sc.nextInt();
    	System.out.println("첫번째 행렬 -> (2,2) 입력: ");
    	int d = sc.nextInt();
        
    	System.out.println("두번째 행렬 -> (1,1) 입력: ");
    	int A = sc.nextInt();
    	System.out.println("두번째 행렬 -> (1,2) 입력: ");
    	int B = sc.nextInt();
    	System.out.println("두번째 행렬 -> (2,1) 입력: ");
    	int C = sc.nextInt();
    	System.out.println("두번째 행렬 -> (2,2) 입력: ");
    	int D = sc.nextInt();
        
        int[][] hangOne = new int[2][2];
        int[][] hangTwo = new int[2][2];
        
        for(int i = 1; i<hangOne.length; i++){
        	for(int j = 1; j<hangOne.length; j++){
        		hangOne[i][j] = a;
        		hangTwo[i][j] = A;
        	}
        }
    }
}