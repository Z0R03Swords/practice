import java.util.Scanner;

public class pJava{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.println("Enterthe first number");
int a = sc.nextInt();
System.out.println("Enterthe second number");
int b = sc.nextInt();

System.out.println("Enterthe choice");

int choice = sc.nextInt();

switch(choice){

case 1:

int sum = add(a,b);
System.out.println(sum); 
break;

case 2:
int sub = sub(a,b);
System.out.println(sub);
break;

default:

System.out.println("enter the valid choice");

}




}


public static int add(int a, int b){
return a+b;
}

public statuc int sub(int a, int b){
return a-b;

}


}
