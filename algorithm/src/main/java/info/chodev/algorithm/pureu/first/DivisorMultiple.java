package info.chodev.algorithm.pureu.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 * 최대 공약수, 최소 공배수를 구한다.
 * 
 * @author pureu
 * @since 2017.10.21
 *
 */
public class DivisorMultiple {

	/**
	 * 두 수의 최대 공약수, 최소 공배수를 구한다.
	 * 
	 * @param int a
	 * @param int b
	 * @return int[]
	 */
	public int[] gcdlcm(int a, int b) {
		int[] answer = new int[2];
		
		// 최대 공약수를 구한다. 1. 약수를 이용한다.
//		answer[0] = Collections.max(getRetainDivisor(getDivisor(a), getDivisor(b)));
		// 최대 공약수를 구한다. 2. 소인수 분해를 이용한다.
//		answer[0] = getCommonDivisor(getPrimeFactorization(a), getPrimeFactorization(b));
		// 최대 공약수를 구한다. 3. 유클리드 호제법을 이용한다.
		answer[0] = getCommonDivisor(a, b);
		// 최소 공배수를 구한다. 1. 최대공약수를 이용한다.
//		answer[1] = getCommonMultiple(a, b, answer[0]);
		// 최소 공약수를 구한다. 2. 소인수 분해를 이용한다.
		answer[1] = getCommonMultiple(getPrimeFactorization(a), getPrimeFactorization(b));
		
		return answer;
	}
	
	/**
	 * 수의 약수를 구한다.
	 * 
	 * @param int num
	 * @return List<Integer>
	 */
	public List<Integer> getDivisor(int num) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=1;i<=num;i++) {
			if(num % i == 0) {
				list.add(i);
			}
		}
		
		System.out.println("divisor " + num + " : " + Arrays.toString(list.toArray()));
		return list;
	}
	
	/**
	 * 두 수의 공약수를 구한다.
	 * 
	 * @param int a
	 * @param int b
	 * @return List<Integer>
	 */
	public List<Integer> getRetainDivisor(List<Integer> a, List<Integer> b) {
		a.retainAll(b);
		System.out.println("common divisor : " + Arrays.toString(a.toArray()));
		return a;
	}
	
	/**
	 * 두 수의 최소 공배수를 구한다.
	 * 1. 최대 공약수를 이용한다.
	 * 
	 * @param int a
	 * @param int b
	 * @param int commonDivisor
	 * @return int
	 */
	public int getCommonMultiple(int a, int b, int commonDivisor) {
		return a * b / commonDivisor;
	}
	
	/**
	 * 두 수의 최대 공약수를 구한다.
	 * 2. 소인수 분해를 이용한다.
	 * 
	 * @param int a
	 * @param int b
	 * @return int
	 */
	public int getCommonDivisor(List<Integer> a, List<Integer> b) {
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> tmpA = new ArrayList<Integer>(a);
		
		tmpA.retainAll(b);
		
		List<Integer> uniqueList = removeDuplicateList(tmpA);
		for(int i=0;i<uniqueList.size();i++) {
			int x = Collections.frequency(a, uniqueList.get(i));
			int y = Collections.frequency(b, uniqueList.get(i));
			int min = Math.min(x, y);
			list.add((int)Math.pow(uniqueList.get(i), min));
		}
		
		System.out.println("prime factorization common divisor : " + Arrays.toString(list.toArray()));
		int multiple = 1;
		for(int i=0;i<list.size();i++) {
			multiple *= list.get(i);
		}
		return multiple;
	}
	
	/**
	 * 두 수의 최소 공배수를 구한다.
	 * 2. 소인수 분해를 이용한다.
	 * 
	 * @param List<Integer> a
	 * @param List<Integer> b
	 * @return int
	 */
	public int getCommonMultiple(List<Integer> a, List<Integer> b) {
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> tmpA = new ArrayList<Integer>(a);
		List<Integer> tmpB = new ArrayList<Integer>(b);
		
		tmpA.removeAll(b);
		list.addAll(tmpA);
		tmpB.removeAll(a);
		list.addAll(tmpB);
		
		tmpA = new ArrayList<Integer>(a);
		tmpA.retainAll(b);
		
		List<Integer> uniqueList = removeDuplicateList(tmpA);
		for(int i=0;i<uniqueList.size();i++) {
			int x = Collections.frequency(a, uniqueList.get(i));
			int y = Collections.frequency(b, uniqueList.get(i));
			int max = Math.max(x, y);
			list.add((int)Math.pow(uniqueList.get(i), max));
		}
		
		System.out.println("prime factorization common multiple : " + Arrays.toString(list.toArray()));
		int multiple = 1;
		for(int i=0;i<list.size();i++) {
			multiple *= list.get(i);
		}
		return multiple;
	}
	
	/**
	 * 수의 소인수 분해를 구한다.
	 * 
	 * @param int num
	 * @return List<Integer>
	 */
	public List<Integer> getPrimeFactorization(int num) {
		List<Integer> list = new ArrayList<Integer>();
		
		int debugNum = num;
		int divided = 0;
		do {
			int i = 2;
			while(num % i != 0) {
				i++;
			}
			
			list.add(i);
			divided = num / i;
			num = divided;
		} while(divided > 1);
		
		System.out.println("prime factorization " + debugNum + " : " + Arrays.toString(list.toArray()));
		
		return list;
	}
	
	/**
	 * list의 중복을 제거한다.
	 * 
	 * @param List<Integer> list
	 * @return List<Integer>
	 */
	public List<Integer> removeDuplicateList(List<Integer> list) {
		HashSet<Integer> distinctData = new HashSet<Integer>(list);
        return new ArrayList<Integer>(distinctData);
	}
	
	/**
	 * 두 수의 최대 공약수를 구한다.
	 * 3. 유클리드 호제법을 이용한다.
	 * 
	 * @param int a
	 * @param int b
	 * @return int
	 */
	public int getCommonDivisor(int a, int b) {
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		
		while(max % min != 0) {
			int mod = max % min;
			max = min;
			min = mod;
		}
		
		return min;
	}
	
	public static void main(String[] args) {
		DivisorMultiple divisorMultiple = new DivisorMultiple();
		System.out.println(Arrays.toString(divisorMultiple.gcdlcm(192, 72)));
	}

}
