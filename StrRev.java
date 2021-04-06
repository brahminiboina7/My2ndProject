import java.util.*;
public class StrRev{
public static void main(String args[]) {
String str, rev="";
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string to reverse");
str=sc.nextLine();
int length=str.length();
for(int i=length-1;i>=0;i--)
  rev=rev+str.charAt(i);
System.out.println("Reversed string: "+rev);
}
}