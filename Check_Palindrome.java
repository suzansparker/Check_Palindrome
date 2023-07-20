import java.sql.SQLOutput;
import java.util.Scanner;

public class Check_Palindrome {
    public static boolean pal(String s, int Start, int End){
        if (Start>End){
            return true;}
            if(Start!=End){
                return false;
            }
            return pal(s,Start+1,End-1);
        }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a name");
         String s=sc.next();
          int Start=s.charAt(0);

          int End =s.charAt(s.length()-1);
        System.out.println(Check_Palindrome.pal(s,Start,End));


    }}
