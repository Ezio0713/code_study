package com.xinzengqi;
/*
 创建一个长度为6的int型数组，要求数组元素的值都在1-30之间，且是随即赋值，且要求元素的值各不相同。
 */
//import java.math.*;
public class CaiPiao {
public static void main(String[] args){
	int[] str = new int[6];//声明长度为6的一维数组
	for (int i = 0; i < str.length; i++) {
		str[i] = (int) (Math.random() * 30);
		for (int j = i; j >= 0; j--) {
			if(str[i] == str[j]){
				str[i] = (int) (Math.random() * 30);
			}
		}
		System.out.print(str[i] + " ");
	}
	
}
}
