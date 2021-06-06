/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sriharsha Aitharaju
 */
import java.util.*;

public class Ex21
{

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int month;
        System.out.print("Please enter the number of the month: ");
        month = kb.nextInt();
        switch(month)
        {
            case 1:
                System.out.print("The name of the month is January.");
                break;
            case 2:
                System.out.print("The name of the month is February.");
                break;
            case 3:
                System.out.print("The name of the month is March.");
                break;
            case 4:
                System.out.print("The name of the month is April.");
                break;
            case 5:
                System.out.print("The name of the month is May.");
                break;
            case 6:
                System.out.print("The name of the month is June.");
                break;
            case 7:
                System.out.print("The name of the month is July.");
                break;
            case 8:
                System.out.print("The name of the month is August.");
                break;
            case 9:
                System.out.print("The name of the month is September.");
                break;
            case 10:
                System.out.print("The name of the month is October.");
                break;
            case 11:
                System.out.print("The name of the month is November.");
                break;
            case 12:
                System.out.print("The name of the month is December.");
                break;
            default :
                System.out.println("Invalid choice. ");
        }

    }
}
