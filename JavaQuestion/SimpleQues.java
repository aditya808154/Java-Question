package JavaQuestion;

import java.util.Scanner;

public class SimpleQues {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Que:-1.Priority of operators in the above code:(*,+,-).System.out.println(-6+4*2).
        // System.out.println(-6+4*2);
        //-6+4*2
        //-6+8
        //2

        // Que:-2.Priority of operators in the above code:(*,+,-).System.out.println((2+3)*4).
        // System.out.println((2+3)*4);
        //(2+3)*4
        //5*4
        //20

        // Que:-2.Priority of operators in the above code:(*,+,-).System.out.println(9+6-3*4/2%5).
        // System.out.println(9+6-3*4/2%5);
        //9+6-3*4/2%5(* / % + -)
        //9+6-12/2%5
        //9+6-6%5
        //9+6-1
        //15-1
        //14

        //que:-3 WAP for taking two numbars using scanner and print sum.
        // System.out.print("enter the first no:-");
        // int a=sc.nextInt();
        // System.out.print("enter the second no:-");
        // int b= sc.nextInt();
        // System.err.println("The Sum of "+a+" and "+b+" is:-"+(a+b));

        //Que:-4WAP to print even and add number for the taking using scanner.
        // System.out.print("Enter the value:-");
        // int num=sc.nextInt();
        // if(num%2==0){
        //     System.out.println(num+" :-is even number");
        // }
        // else{
        //     System.out.println(num+" is add number");
        // }


        //Qus:-6 print table of any number.
        // System.out.print("Enter the value:-");
        // int num=sc.nextInt();

        // for (int i = 1; i <=10; i++) {
        //     System.out.println(num+" x "+i+"="+(num*i));
        // }


        //Que:-7 WAP to check whether the given year is a leap year.
        // System.out.print("Enter the year:-");
        // int year=sc.nextInt();
        // if(year%4==0){
        //     System.out.println("This is a leap year..");
        // }
        // else{
        //     System.out.println("This is not a leap year..");
        // }

        //Que:-8 WAP to System.out.println(7+(3*5)*(4/2)+(5%3)-1);
        // System.out.println(7+(3*5)*(4/2)+(5%3)-1);
        //(7+(3*5)*(4/2)+(5%3)-1)
        //(7+15*2+2-1)
        //(7+30+2-1)
        //39-1
        //38


        //Que:-9 WAP to check whether the given character is a vowel
        // System.out.println("enter the char:-");
        // char cr=sc.next().charAt(0);
        // sc.close();
        // boolean isVowel=false;
        // switch (cr) {
        //     case 'a' :
        //     case 'e' :
        //     case 'i' :
        //     case 'o' :
        //     case 'u' :
        //     case 'A' :
        //     case 'E' :
        //     case 'I' :
        //     case 'O' :
        //     case 'U' : isVowel=true;
                
             
        // }
        // if(isVowel){
        //     System.out.println(cr+" is a Vowel");
        // }
        // else{
        //     System.out.println(cr+" is not vowel");
        // }


        //Que:-10 Area of circle
        // System.out.print("Enter the redius:-");
        // int redius=sc.nextInt();
        // System.out.println("Area of Circle is:-"+(Math.PI*redius*redius));


        // Que:-11 WAP intake two numbers and Finds the quotiemt and reminder
        // System.out.print("Enter the first value:-");
        // int a=sc.nextInt();
        // System.out.print("Enter the Second value:-");
        // int b=sc.nextInt();
        // System.out.println("Quotiemt is:-"+(a/b));
        // System.out.println("reminder is:-"+(a%b));

        //Que:-12 java Program to find the perimeter tf the circle
        // System.out.print("Enter the radius:-");
        // int radius=sc.nextInt();
        // System.out.println("perimeter tf the circle:-"+(2*Math.PI*radius));

        //Que:-13 java program to find the power of a number
        // System.out.print("Enter the base:-");
        // double base=sc.nextInt();
        // System.out.print("Enter the power:-");
        // double power=sc.nextInt();
        // double result=Math.pow(base, power);
        // System.out.println(base+" and "+power+" is "+result);

        //Que:-14WAP to print Fibonacci series
        // int a=0;
        // int b=1;
        // System.out.println(a);
        // System.out.println(b);
        // for(int i=2;i<10;i++){
        //     int next=a+b;
        //     a=b;
        //     b=next;
        //     System.out.println(next);
        // }

        //Que:-15 WAP to print trhe sum of 100 numbar
        int sum=0;
        for(int i=1;i<=100;i++){
            sum=sum+i;
        }
        System.out.println(sum);


    }
}