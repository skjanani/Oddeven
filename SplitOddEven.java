package janani;
import java.util.Scanner;
public class SplitOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,l;
String str;
String str1="",str2="";
System.out.println("enter the string");
Scanner ja=new Scanner(System.in);
str=ja.next();
String s[]=str.split("");
l=str.length();
for(i=0;i<l;i++){
if(i%2!=0)
	str1=str1+s[i];
else
	str2=str2+s[i];
}
System.out.println(str2+" "+str1);
}
	}


