import java.util.Scanner;
public class Main{
static int fact(int n, int val){
if (n == 0){
  return val;}
return fact(n-1,n*val); // This is a Tail Recursion
}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of n");
int n = sc.nextInt();
int val = 1;
int result = fact(n,val);
System.out.println("The output is : "+result); 
}
}
