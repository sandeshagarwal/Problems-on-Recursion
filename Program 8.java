import java.util.*;
public class Main{
static int sum(int n){
if(n/10 == 0) // The function stops when there is a single digit left the condition can be rewritten as (n<10) return n
  return n;   // Both conditions will do the same job
return sum(n/10)+n%10;
}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Number");
int n = sc.nextInt();
int result = sum(n);
System.out.println("The Sum of digits is : "+sum(n));
}
}
