
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class IPAddressValidator{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here
class MyRegex {
    
    String pattern = 
        "((25[0-5]|2[0-4][0-9]|[0-1]?[0-9]?[0-9])\\.){3}" +
        "(25[0-5]|2[0-4][0-9]|[0-1]?[0-9]?[0-9])";
}


/*
Problem Statement:
Write a regular expression to validate an IPv4 address.

An IP address is in the form A.B.C.D, where:
- A, B, C, and D are numbers between 0 and 255
- Leading zeros are allowed
- Each part can have at most 3 digits

You are given multiple strings, and for each string you must check
whether it is a valid IP address or not using regex.

Print true if the IP address is valid, otherwise print false.
*/
