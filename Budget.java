import java.util.Scanner;

public class Budget {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //input bills
        System.out.print("How much is your car insurance?: ");
        double carInsurance = scanner.nextDouble();
        System.out.print("How much is your car note?: ");
        double carNote = scanner.nextDouble();
        System.out.print("How much is your rent?: ");
        double rent = scanner.nextDouble();
        System.out.print("How much is your phone bill?: ");
        double phoneBill = scanner.nextDouble();
        System.out.print("Input any other bills or enter 0: ");
        double extraBill = scanner.nextDouble(); 
        //calculate totalbill and return
        double totalBill = carInsurance + carNote + rent + phoneBill + extraBill;
        System.out.println("You owe this amount of money this month: " + totalBill);


        System.out.print("How much do you have currently?: ");
        double currentMoney = scanner.nextDouble();


        double totalBill2 = totalBill - currentMoney; 

        
        System.out.println("Would you like to know how much you need to make for the month?: (Enter Y for yes or N for No)");
        char response = scanner.next().charAt(0);
        
        
        
        if (response == 'Y'){
            System.out.println("Please enter the number of the month:");
            int month = scanner.nextInt();
            System.out.println("Please enter the day(number) of the month:");
            Double currentDay = scanner.nextDouble();


            Double case2DayOfMonth = 28.0; 
            Double payByDay = ( (totalBill2)/ (case2DayOfMonth - currentDay) );

            Double case4_6_9_11 = 30.0; 
            Double payByDay2 = ( (totalBill2)/ (case4_6_9_11 - currentDay) );

            Double restOfcase = 31.0;
            Double payByDay3 = ( (totalBill2)/ (restOfcase - currentDay) );

            switch(month) {
                case 2:
                    System.out.println("You'll need to make $" + payByDay + " each day til the end of month");
                break;

                case 4: 
                    System.out.println("You'll need to make $" + payByDay2 + " each day til the end of month");
                break;
                
                case 6: 
                    System.out.println("You'll need to make $" + payByDay2 + " each day til the end of month");
                break;

                case 9: 
                    System.out.println("You'll need to make $" + payByDay2 + " each day til the end of month");
                break;

                case 11: 
                    System.out.println("You'll need to make $" + payByDay2 + " each day til the end of month");
                break;

                default:
                 System.out.println("You'll need to make $" + payByDay3 + " each day til the end of month");

                   }
            }


        
        else {
        System.out.println("Thank you, I hope that you can pay your bills :) ");
           
        }



        
        scanner.close();  


        
    }
}
