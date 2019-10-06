import java.util.Scanner;

class prime{

public static void main(String[]args){

    boolean flag= true;

    System.out.println("Enter any number: ");	
	Scanner sc=new Scanner(System.in);

    int n = sc.nextInt();
	
    for(int i = 2; i <= n / 2; i++){

        if(n%i==0)
        {
            flag=false;
            break;
        }
    }

    if(flag)
	System.out.println(n+" is prime.");
    else
	System.out.println(n+"is not prime.");
}
}
