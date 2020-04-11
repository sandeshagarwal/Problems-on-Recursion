import java.util.*;
public class Main{
static int fun(int n){
if(n == 0)
 return 1;
return n*fun(n-1); // This is not Tail Recursive as the function call is multiplied by n so that will be executed after the fun() call
}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of n");
int n = sc.nextInt();
//int k = 1;
//Main obj = new Main();
int k =fun(n);
System.out.println("The output is : "+k); // We can direcly call without making object by declaring the function as static
//k =obj.fun(n);

}
}
