package com.calculator;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public static double getSquareRoot(double n1){
        logger.info("Starting Square root operation");

        if(n1<0){
            logger.warn("Invalid Input");
            return -1;
        }

        double result=Math.sqrt(n1);
        logger.info("Square root is computed");

        return result;
    }

    public static int getFactorial(int x){
        logger.info("Starting Factorial Function");

        if(x<0){
            logger.warn("Invalid Input");
            return -1;
        }

        int result=1;
        if(x>0){
            for(int i=1;i<=x;i++) result*=i;
        }
        logger.info("Factorial is computed");

        return result;
    }

    public static double getNaturalLogarithm(double x){
        logger.info("Started Natural Logarithm Function");

        if(x<=0) {
            logger.warn("Invalid Input");
            return Double.MAX_VALUE;
        }

        double result = Math.log(x);
        logger.info("Natural Logarithm Computed");
        return result;
    }

    private static double powerFunc(double x, int y){
        if(y==0) return 1;
        if(y==1) return x;
        if(y%2==0) return powerFunc(x*x, y/2);
        
        return x*powerFunc(x, y-1);
    }
    
    public static double getPower(double x, int y){
        logger.info("Starting Power Function");
        if(x==0 && y<=0) {
            logger.warn("Invalid Input");
            return Double.MAX_VALUE;
        }
        
        double result=0;

        if(y<0) result=1/powerFunc(x,-y);
        else result=powerFunc(x, y);
        logger.info("Power Function Computed");
        return result;
    }

    public static void main(String args[]){
        logger.info("Starting Execution");

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the Operation Code :");

        while(true){

            System.out.println("-------- Please Enter the Operation Code: ------------");
            System.out.println("1. Square Root");
            System.out.println("2. Natural Logarithm");
            System.out.println("3. Factorial");
            System.out.println("4. Power Function");
            System.out.println("5. Exit");

            System.out.println("");

            int op = sc.nextInt();

            if(op == 1)
            {
                System.out.print("Please Enter a number: ");

                double num1 = sc.nextDouble();

                double result = getSquareRoot(num1);
                
                if(result==-1){
                    System.out.println("Please Enter a valid Input");
                }
                else {
                    System.out.println("The Final Result is : " + result);
                }
            }
            else if(op == 2)
            {
                System.out.print("Please Enter a value: ");

                double num1 = sc.nextDouble();

                double result = getNaturalLogarithm(num1);

                if(num1==Double.MAX_VALUE){
                    System.out.println("Please Enter valid Input");
                }
                else{
                    System.out.println("The Final Result is : " + result);
                }
            }
            else if(op == 3)
            {
                System.out.print("Please Enter an integer: ");

                int num1 = sc.nextInt();

                int result = getFactorial(num1);

                if(result == -1)
                    System.out.println("Please Enter valid non-negative Integer Input");
                else
                    System.out.println("The Final Result is : " + result);
            }
            else if(op == 4)
            {
                System.out.print("Please Enter the number and the power: ");

                double num1 = sc.nextDouble();
                int val=sc.nextInt();

                double result = getPower(num1,val);
                if(result==Double.MAX_VALUE){
                    System.out.println("Please Enter Valid Input");
                }
                else {
                    System.out.println("The Final Result is : " + result);
                }
            }
            else
            {
                System.out.println("Exiting Calculator");
                break;
            }

        }

        logger.info("Exiting Calculator Program");
        sc.close();
        
    }
}
