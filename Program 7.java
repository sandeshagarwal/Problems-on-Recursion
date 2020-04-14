import java.util.*;
public class Main{
static int fib(int n){
if(n<=1)
  return n;
return fib(n-1)+fib(n-2);
}

public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the position ");
int n = sc.nextInt();
System.out.println("The Series till position "+n+" is");
//int result = fib(n);
for(int i = 0;i<=n;i++)
System.out.println(fib(i)); // This for loop prints the fibonacci series till the position specified.
}

}
