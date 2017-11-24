package info.chodev.algorithm.yongyonghw.fifth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingQueue;

/*문제
N명의 사람들은 매일 아침 한 줄로 선다. 이 사람들은 자리를 자리를 마음대로 서지 못하고 오민식의 지시대로 선다.
어느날 사람들은 오민식이 사람들이 줄 서는 위치를 기록해 놓는다는 것을 알았다. 그리고 아침에 자기가 기록해 놓은 것과 사람들이 줄을 선 위치가 맞는지 확인한다.
사람들은 자기보다 큰 사람이 왼쪽에 몇 명 있었는지만을 기억한다. N명의 사람이 있고, 사람들의 키는 1부터 N까지 모두 다르다.
각 사람들이 기억하는 정보가 주어질 때, 줄을 어떻게 서야 하는지 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 사람의 수 N이 주어진다. N은 10보다 작거나 같은 자연수이다. 둘째 줄에는 키가 1인 사람부터 차례대로 자기보다 키가 큰 사람이 왼쪽에 몇 명이 있었는지 주어진다. i번째 수는 0보다 크거나 같고, N-i-1보다 작거나 같다.

출력
첫째 줄에 줄을 선 순서대로 키를 출력한다.

예제 입력  복사
4
2 1 1 0
예제 출력  복사
4 2 1 3
*/

class StandOneRow {

	static ArrayList<ArrayList<Integer>> sampleDataList = new ArrayList<ArrayList<Integer>>();
	
	public static void main(String[] args) {
		int count;
		String rowInfo;
		Scanner scan = new Scanner(System.in);
		System.out.println("메세지를 입력하세요.");
		count = scan.nextInt();
		//엔터처리
		scan.nextLine();
		rowInfo = scan.nextLine();
		String[] rowInfoArr = rowInfo.split(" ");
		scan.close();
		
		
		ArrayList<Integer> orderInfo = new ArrayList<Integer> ();
		for(String s : rowInfoArr) {
			orderInfo.add(Integer.valueOf(s));
		}
		
		// 1,2,3,4 List 생성됨
		ArrayList<Integer> popRow = new ArrayList<Integer> ();
		for(int i = 1; i <= count; i ++) {
			popRow.add(i);
		}
		ArrayList<Integer> pushRow = new ArrayList<Integer> ();
		showResult(pushRow, popRow, count);
		
		for(int i = 0; i < sampleDataList.size(); i ++) {
			ArrayList<Integer> tempOrderInfo = (ArrayList<Integer>) orderInfo.clone();
			for(int j = 0; j < sampleDataList.get(i).size(); j ++) {
				//자기보다 j가 낮은 수중 값이 큰게 몇개가 있는지 체크한다.
				int v = 0;
				for(int k = 0; k < j; k ++) {
					if(sampleDataList.get(i).get(j) < sampleDataList.get(i).get(k))
						v ++;
				}
				tempOrderInfo.remove((Integer) v);
			}
			if(tempOrderInfo.size() == 0) {
				System.out.println("결과:" + sampleDataList.get(i).toString());
			}
		}
		
	}

	//복사, 복사 -> 뺀다 넣는다 -> 뺀것과 넣은것을 반복한다.
	
	public static void showResult(ArrayList<Integer> pushRow, ArrayList<Integer> popRow, int count) {
		ArrayList<Integer> tempPopRow = (ArrayList<Integer>) popRow.clone();
		if(pushRow.size() == count) {
			System.out.println(pushRow.toString());
			sampleDataList.add(pushRow);
		}
		for(Integer num : popRow) {
			ArrayList<Integer> tempPopRow2 = (ArrayList<Integer>) tempPopRow.clone();
			ArrayList<Integer> pushRow2 = (ArrayList<Integer>) pushRow.clone();
			tempPopRow2.remove(num);
			pushRow2.add(num);
			showResult(pushRow2, tempPopRow2, count);
		}
		
	}
	
}















