//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/** Check the password for effecitvity
 * @param  takes String for password
 * */
import java.util.Scanner;

         public class Main {
            public static void main(String[] args) {
                /** Allow user to see menu and what they want to do
                 * @param  input for user choice
                 * */
                Scanner input = new Scanner(System.in);
                int choice=6;
                int order;
                calculation price=new calculation();
                // call at end?? calculation order = new calculation();
                while(choice!=0){
                System.out.println("...");
                System.out.println("Pick a menu: 1. Drinks 2. Main Course 0. Finished");
                choice=input.nextInt();
                switch (choice){
                    case 1:
                        new DrinksMenu().displayMenu();
                        System.out.println("Pick one item by number");
                        order=input.nextInt();
                        if(order==1){
                            price.addItem(5.00);
                        }if (order==2){
                            price.addItem(15.87);
                    }if (order==3){
                            price.addItem(1.00);
                    }if (order==4){
                            price.addItem(5.34);
                    }
                        break;
                    case 2:
                        new MainMenu().displayMenu();
                        System.out.println("Pick one item by number");
                        order=input.nextInt();
                        if(order==1){
                            price.addItem(25.48);
                        }if (order==2){
                        price.addItem(24.79);
                    }if (order==3){
                        price.addItem(39.88);
                    }if (order==4){
                        price.addItem(20.99);
                    }
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("...");}

            }




            }
        }



