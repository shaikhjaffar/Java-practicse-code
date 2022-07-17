import java.util.*;
public class calculator {
    public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
int n1=sc.nextInt();
int n2=sc.nextInt();
int answer;
System.out.println("Chose the operator:");
char operator=sc.next().charAt(0);
switch(operator){
    case '+':
    answer=n1+n2;
    System.out.println(answer);
    break;
    case '-':
    answer=n1-n2;
    System.out.println(answer);
    break;
    case '*':
    answer=n1*n2;
    System.out.println(answer);
    break;
    case '/':
    answer=n1/n2;
    System.out.println(answer);
    break;
    case '%':
    answer=n1%n2;
    System.out.println(answer);
    break;
    default:
    System.out.println("invalid operator");
}
sc.close();
    }
   
}
