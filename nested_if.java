package Example;

import java.util.Scanner;

public class nested_if {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the 5 subject marks out of 100  ");
	int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt(),e=sc.nextInt();
	 int sum=a+b+c+d+e;
	 float avg=sum/5f;
	System.out.println("Total= "+sum);
	System.out.println("Average= "+avg+"%");
	if(a>=35 && b>=35 && c>=35 && d>=35&& e>=35)
	{ System.out.println("Result Pass");
		{if (sum>400&&sum<=500)
			System.out.println("A grade");
		else if (sum>300&&sum<=400)
			System.out.println("B grade");
		else if (sum>200&&sum<=300)
			System.out.println("C grade");
		else if (sum>100&&sum<=200)
			System.out.println("D grade");
			
	}
	}
	else 
		System.out.println(" Result Fail");

	}

}
