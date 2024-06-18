package javabasic;
import java.util.Scanner;

public class secondtohour
{
    public static void main(String args[])
    {
        int h,m,s,ts;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter total seconds ");
        ts=sc.nextInt();
        h=ts/3600;
        m=(ts%3600)/60;
        s=(ts%3600)%60;
        System.out.println("Hours=" + h);
        System.out.println("Minutes=" + m);
        System.out.print("Seconds=" + s);
    }
}

