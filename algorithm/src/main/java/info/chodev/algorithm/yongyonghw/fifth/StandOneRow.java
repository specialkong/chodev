package info.chodev.algorithm.yongyonghw.fifth;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class StandOneRow {

	
	public static void main(String[] args) {
		int num;
		String rowInfo;
		Scanner scan = new Scanner(System.in);
		System.out.println("메세지를 입력하세요.");
		num = scan.nextInt();
		//엔터처리
		scan.nextLine();
		rowInfo = scan.nextLine();
		String[] rowInfoArr = rowInfo.split(" ");
		scan.close();
	}

	public static void showResult(ArrayList<String> list, int index) {
	}
	
}















