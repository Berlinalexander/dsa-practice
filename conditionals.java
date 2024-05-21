//if conditionals
/*
if(conditionals)
{

}
else if(conditionals)
{
	
}
*/
public class Main
{
	public static void main(String[] args) {
		int salary=27000;
		if(salary >20000)
		{
		    salary+=2000;
		}
		else if(salary<10000)
		{
		    salary+=1000;
		}
		System.out.print(salary);
	}
}

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
// 		for(int i=1; i<=5; i++)
// 		{
// 		    System.out.println(i);
// 		}
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        
        // for(int num=1;num<=n;num++)
        // {
        //     //System.out.print(num+" ");
        //     System.out.print("Hello World"+" ");
        // }
        
        // int num=1;
        
        // while(num<=n)
        // {
        //     System.out.print(num+" ");
        //     num+=1;
        // }
        // int num=1;
        // do{
        //     System.out.print(num+" ");
        //     num+=1;
        // }while(num<=n);
        int num=1;
        do{
            System.out.print("hello world");
        }while(num!=1);
        
        
        
		
	}
}

//Largest number

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {

     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int b=sc.nextInt();
     int c=sc.nextInt();
     
    //  int max=a;
    //  if(b>max)
    //  {
    //      max=b;
    //  }
    //  if(c>max)
    //  {
    //      max=c;
    //  }

    //     System.out.print(max);
        
//         int max=0;
//         if(a>b)
//         {
//             max=a;
//         }
//         else
//         {
//             max=b;
//         }
// 		if(c>max)
// 		{
// 		    max=c;
// 		}
// 		System.out.print(max);

     System.out.print(Math.max(a,Math.max(b,c)));
	}
}

//check lowercase or upper case
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    char ch=sc.next().trim().charAt(0);
    
    if (ch>='a' && ch <='z')
    {
        System.out.print("lowercase");
    }
    else{
         System.out.print("uppercase");
    }
    
}
}

//fibonacci series number

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    
    int a=0;
    int b=1;
    // int c=0;
    int count=2;
    
    while(count<=n)
    {
        int temp=b;
        b+=a;
        a=temp;
        count++;
        
    }
    
    System.out.print(b+" ");
    
//     for(int i=2;i<=n;i++)
//     {
//         c=a+b;
//         a=b;
//         b=c;
//     }
//     System.out.print(b);
	}
}

//counting the digit 

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int n=1233434;
	    int count=0;
	    while(n>0)
	    {
	        int rem=n%10;
	        if(rem==3)
	        {
	            count++;
	        }
	        n=n/10;
	    }
	    System.out.print(count);
	    
}

}

//reverse the digit

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int num=12345;
	    int ans=0;
	    while(num>0)
	    {
	        int rem=num%10;
	        num=num/10;
	        ans=ans*10+rem;
	    }
	    System.out.print(ans);
	    
}

calculator

Scanner sc=new Scanner(System.in);
int ans=0;
while(true)
{
    System.out.print("enter the operator");
    char ch=sc.next().trim().charAt(0);
    System.out.println();
    
    if(ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='%')
    { 
        System.out.print("enter the numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println();
        if(ch=='+')
        {
            ans=a+b;
        }
        if(ch=='-')
        {
            ans=a-b;
        }
        if(ch=='*')
        {
            ans=a*b;
        }
        if(ch=='/')
        {
            if(b!=0)
            {
                ans=a/b;
            }
        }
        if(ch=='%')
        {
            ans=a%b;
        }
        System.out.print("answer is "+ans);
        
        
    }else if(ch=='x' || ch=='X')
    {
        break;
    }
    else{
        System.out.println("wrong operand");
    }
    
}



