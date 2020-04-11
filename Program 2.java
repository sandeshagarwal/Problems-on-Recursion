import java.util.*;
public class Main{
static void fun(int n){
if(n == 0)
 return;
fun(n-1);
System.out.println(n); // It is called after the method fun(n-1) so it will print from the bottom of the stack ie. 1,2,3,4,5
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
