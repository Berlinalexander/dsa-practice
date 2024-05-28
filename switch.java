/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
// 		Scanner sc =new Scanner(System.in);
// 		String fruit=sc.next();
		
// 		switch(fruit)
// 		{
// 		    case "mango":
// 		        System.out.println("best fruit");
// 		        break;
// 		    case "apple":
// 		        System.out.println("round fruit");
// 		        break;
// 		    case "banana":
// 		        System.out.println("yellow fruit");
// 		      //  break;
// 		    default:
// 		        System.out.println("invalid fruit");
// 		}

//          switch(fruit)
//          {
//              case "mango"  ->System.out.println("best fruit");
//              case "apple"  ->System.out.println("round fruit");
//              case "banana"  ->System.out.println("yellow fruit");
//              default  ->System.out.println("invalid fruit");         }
// 	}
	
	   //  switch (day)
	   //  {
	   //      case 1 ->System.out.println("Monday");
	   //      case 2 ->System.out.println("Tuesday");
	   //      case 3 ->System.out.println("Wednessday");
	   //      case 4 ->System.out.println("Thursday");
	   //      case 5 ->System.out.println("Friday");
	   //      case 6 ->System.out.println("Saturday");
	   //      case 7 ->System.out.println("Sunday");
	   //  }
	   
	        int day =5;
	       switch(day)
	       {
	           case 1:
	               System.out.println("Monday");
	               break;
	           case 2:
	               System.out.println("Tuesday");
	               break;
	           case 3:
	               System.out.println("Wednessday");
	               break;
	           case 4:
	               System.out.println("Thursday");
	               break;
	           case 5:
	               System.out.println("Friday");
	               break;
	           case 6:
	               System.out.println("Saturday");
	               break;
	           case 7:
	               System.out.println("Sunday");
	               break;
	       }
	       
	       //Scanner sc=new Scanner(System.in);
	       //int days=sc.nextInt();
	       
	       //switch (days)
	       //{
	       //    case 1:
	       //    case 2:
	       //    case 3:
	       //    case 4:
	       //    case 5:
	       //        System.out.println("Weekdays");
	       //        break;
	       //    case 6:
	       //    case 7:
	       //        System.out.println("Weekends");
	       //        break;
	       //}
	       
	       
	       Scanner sc=new Scanner(System.in);
	       int empId=sc.nextInt();
	       String department=sc.next();
	       
	       switch(empId)
	       {
	           case 1:
	               System.out.println("Berlin");
	               break;
	           case 2:
	               System.out.println("rahul");
	               break;
	           case 3:
	               switch(department)
	               {
	                   case "IT":
	                       System.out.println("IT Department");
	                       break;
	                   case "MANAGEMENT":
	                       System.out.println("management department");
	                       break;
	                   default:
	                   System.out.println("no department");
	               }
	               break;
	               default:
	               System.out.println("no employee id");
	       }
	       
	}
}
