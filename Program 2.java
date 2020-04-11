import java.util.*;
public class Main{
static void fun(int n,int k){
 // start :
if(n == 0)
 return;
System.out.println(k);// The Tail Recursive statement can be rewritten as follows in the form of a goto statement which is done by the
                      // compiler automatically in Tail Recursion and which is fast because it does not use Recursion 
fun(n-1,k+1); // n = n-1 and k = k+1 
    // goto to start

}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of n");
int n = sc.nextInt();
int k = 1;
//Main obj = new Main();
System.out.println("The output is :"); // We can direcly call without making object by declaring the function as static
//obj.fun(n);
fun(n,k);
}
}
