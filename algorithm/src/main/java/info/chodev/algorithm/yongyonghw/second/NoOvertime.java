package info.chodev.algorithm.yongyonghw.second;

import java.util.ArrayList;
import java.util.List;


/*야근 지수
회사원인 수민이는 많은 일이 쌓여 있습니다. 
수민이는 야근을 최소화하기 위해 남은 일의 작업량을 숫자로 메기고, 
일에 대한 야근 지수를 줄이기로 결정했습니다. 
야근 지수는 남은 일의 작업량을 제곱하여 더한 값을 의미합니다. 
수민이는 1시간 동안 남은 일 중 하나를 골라 작업량 1만큼 처리할 수 있습니다. 
수민이의 퇴근까지 남은 N 시간과 각 일에 대한 작업량이 있을 때, 
noOvertime 함수를 제작하여 수민이의 야근 지수를 최소화 한 결과를 출력해 주세요. 
예를 들어, N=4 일 때, 남은 일의 작업량이 [4, 3, 3] 이라면 야근 지수를 최소화하기 위해 
일을 한 결과는 [2, 2, 2]가 되고 야근 지수는 22 + 22 + 22 = 12가 되어 12를 반환해 줍니다.*/
class NoOvertime {
	public int noOvertime(int no, int[] works) {
		ArrayList<Integer> worksList = new ArrayList<Integer>();
		for (int a : works) {
			worksList.add(a);
		}
		// no 반복 횟수
		WorkInfo workInfo = new WorkInfo(worksList);

		while (no != 0) {
			workInfo.doWorks();
			no--;
		}
		// 야근 지수를 최소화 하였을 때의 야근 지수는 몇일까요?
		return workInfo.getSum();
	}

	public static void main(String[] args) {
		NoOvertime c = new NoOvertime();
		int[] test = { 4, 3, 3 };
		System.out.println(c.noOvertime(4, test));
	}

	private class WorkInfo {
		int max;
		int maxIndex;
		List<Integer> worksList;

		WorkInfo(List<Integer> worksList) {
			this.worksList = worksList;
		}

		private List<Integer> doWorks() {
			this.max = 0;
			this.maxIndex = 0;
			List<Integer> arr = null;
			arr = (List<Integer>) worksList;
			int i = 0;
			for (Integer work : arr) {
				if (this.max < (Integer) work) {
					this.max = (Integer) work;
					this.maxIndex = i;
				}
				i++;
			}
			// max의 값을 꺼내와서
			arr.set(this.maxIndex, arr.get(this.maxIndex) - 1);
			return arr;
		}

		/**
		 * 합계 출력
		 * @return
		 */
		private int getSum() {
			int sum = 0;
			for (int i = 0; i < this.worksList.size(); i++) {
				sum += worksList.get(i) * worksList.get(i);
			}
			return sum;
		}
	}
}
