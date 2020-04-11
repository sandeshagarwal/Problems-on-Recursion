import java.util.*;
public class Main{
static void fun(int n){
if(n == 0)
 return;
System.out.println(n);
fun(n-1);
}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of n");
int n = sc.nextInt();
//Main obj = new Main();
System.out.println("The output is :"); // We can direcly call without making object by decalring the function as static
//obj.fun(n);
fun(n);
}
}
