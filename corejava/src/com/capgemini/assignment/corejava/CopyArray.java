package com.capgemini.assignment.corejava;

public class CopyArray {
	static int[] arr=new int[] {1,4,8,9,7};
	public static void copy() {
	int arr2[]=new int[arr.length];
	 
	for(int i=0;i<arr.length;i++) {
		arr2[i]=arr[i];
	}
	for(int j=0;j<arr.length;j++) {
		System.out.print(arr[j]+" ");
	}
	System.out.println();
	for(int i=0;i< arr2.length;i++) {
		System.out.print(arr2[i]+" ");
	}

	}
	public static void main(String[] args) {
		copy();
	}
}
