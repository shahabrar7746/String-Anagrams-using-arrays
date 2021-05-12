package Cancellation;
import java.util.*;



public class Anagram{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
System.out.println("First String");
String ip = s.nextLine();//this will take our first string input 
System.out.println("Second String");
String ip2 = s.nextLine();//this will take our second string input
char array[] = new char[ip.length()];//this arrays will contain all the character of 1st strings
char array_2[] = new char[ip.length()];//this arrays will contain all the character of 2nd strings
String temp = "";//this string will be used to converts character into string
String temp_1= "";//this string will be used to converts character into string
String ans = "";//this Strings will contain final ans String(Answer)

String ans_1 = "";//this Strings will contain final ans String(Answer)

ip = ip.toLowerCase();//this is used to avoid case sensivity for Strings
ip2 = ip2.toLowerCase();//this is used to avoid case sensivity for Strings
//if length for both strings found equal then it will execute if statement
//if not found equal then it will tell us "Not an anagram" that means it has executed else block
if(ip.length() == ip2.length()) {
	//this loop will put all character of both the strings into their particular arrays
	for(int i = 0;i<ip.length();i++) {
		array[i] = ip.charAt(i);
		array_2[i] = ip.charAt(i);
	}//this will sort our array 
	Arrays.sort(array);
Arrays.sort(array_2);	
//this loop will be used to put all the character in string
for(int i = 0;i<ip.length();i++) {
	temp = temp.valueOf(array[i]);
	temp_1 = temp_1.valueOf(array_2[i]);
	ans = ans + temp;
	ans_1 = ans_1 + temp_1;
	
	
}
//now we have our final strings in ans and ans_1 variables
//if both the strings are equal then it will execute if statements will say "Anagaram"
//if not then then it will say "Not an anagram" by executing else block
if(ans.equals(ans_1)) {
	System.out.println("Anagram");
}else {
	System.out.println("Not an anagrams");
}
}else {
	System.out.println("Not an anagram");
}
	}

}
