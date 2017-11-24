package info.chodev.algorithm.hanyeontak.fourth;

import java.util.Arrays;

import info.chodev.algorithm.pureu.third.ReverseStr;

public class moonzabaeyeol {
	public String reverseStr(String str){
		char[] sol = str.toCharArray();
		Arrays.sort(sol);
		return new StringBuilder(new String(sol)).reverse().toString();
	}
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
	ReverseStr rs= new ReverseStr();
	System.out.println(rs.reverseStr("Zbcdefg"));
	}

}
