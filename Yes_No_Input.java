package com.index;

import java.util.Scanner;

public class Yes_No_Input {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String a;
		do {
			System.out.println("Do you want to continue?(y/n)");
			a = sc.nextLine();
			if(a.equals("y")) {
				System.out.println("Continue....");		
			}else if(a.equals("n")){
				System.out.println("Thank You");
			}else {
				System.out.println("Enter y/n only");
			}
		}while(!a.equals("n"));
	}
	}


