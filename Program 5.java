import java.util.*;
public class Main{
static int pali(String str,int s,int e)
{
if(s == e)
  return 1;
if(s > e)
  return 1;
if((str.charAt(s)) != (str.charAt(e))) // Comparing two characters in a String.
    return -1;                         // Only str.equals(str) is used to equate Strings beacuse we cannot use '==' as it checks both the 
                                       // objects are in same memory loacation but equals() method comapres the Content in Strings.
return pali(str,s+1,e-1);              // But we can use '<','>','!'= in Strings to compare them as these does not cause any problems.
}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the String");
String str = sc.nextLine();
int s = 0;
int e = str.length() - 1;
int result = pali(str,s,e);
if(result == 1){
System.out.println("The String is palindrome");}
else{
System.out.println("The String is NOT palindrome");
}
}
}
