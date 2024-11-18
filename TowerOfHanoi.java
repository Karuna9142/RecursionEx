package com.recursion;

public class TowerOfHanoi {
	public static void calc_tower(int n, String src, String helper, String dest)
	{
		if(n==1)
		{
			System.out.println("Transfer disk " +n+ " from " +src+ " to " +dest);
			return;
		}
		calc_tower(n-1, src, dest, helper);
		System.out.println("Transfer disk " +n+ " from " +src+ " to " +dest);
		calc_tower(n-1, helper,src, dest);
	}

	public static void main(String[] args) 
	{
		int n = 3;
		calc_tower(n, "S", "H", "D");
		
	}

}
