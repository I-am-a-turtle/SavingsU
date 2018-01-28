import java.util.Scanner;
import java.util.Vector;
/**
 * The Driver class controls the user's interaction with SavingsU
 *
 * @Kiersten Campbell, Arselyne Chery, Karmen Liang, Vicky Liu, Grace Mazzarella-SavingsU Team
 * @1-27-18
 */
public class Driver
{
  public static void main(String[]args){

    Vector<Category> userData= new Vector<Category>();

    Scanner userInput= new Scanner(System.in);

    System.out.println("Welcome to SavingsU!");
    System.out.println("Enter Category names (food, laundry, tuition payments, etc) to start building your profile");

    while(userInput.hasNext()){
      String choice = userInput.next();

      if (choice.equals("finish")){ break; }
      else{
        String catName=choice;

        System.out.println("What's your spending limit in this category?");
        double spendingGoal=userInput.nextDouble();

        Category thisCat= new Category(catName,spendingGoal);
        userData.add(thisCat);
      }
      System.out.println("Enter another Category or type finish to move on");
    }
    while(userInput.hasNextLine()){
      String command=userInput.nextLine();

      if(command.equals("QUIT")){ break; }

      if(command.equals("Enter spending event")){
        System.out.println("What category did this spending occur?");
        String cat= userInput.nextLine();

        Category current=null;
        for(Category category:userData){
          if(category.getCategoryName().equals(cat)){ current=category; }
        }

        if(current==null){ System.out.println("You haven't added this category to your profile yet!"); }
        else{
          System.out.println("How much?");
          double amt=userInput.nextDouble();

          System.out.println("Date? (MM/DD/YYYY)");
          String date=userInput.next();

          current.addPurchase(amt,date);
          if(current.CheckOverGoal()==true){ System.out.println("You've gone over your spending limit!"); }

          current.print();
        }
      }
      if(command.equals("View spending history")){
        for (int i = 0; i < userData.size() -1; i++) {// counter
          for (int j = 0; j < userData.size() - 1; j++) {// iterating through
            Category cat1=userData.get(j);
            Category cat2=userData.get(j+1);             //Compare total for index j and index j+1

            if(cat1.getRunningTotal()<cat2.getRunningTotal()) {//If total for index j is smaller, swap the two elements
              userData.set(j,cat2);
              userData.set((j+1),cat1);
            }
          }
        }

        for(int k=0; k<userData.size(); k++){
          System.out.println((k+1)+ " Category: " + userData.get(k).getCategoryName()+ " spent " + userData.get(k).getRunningTotal());
        }

        System.out.println("Do you want to see a detailed record of a category? (Yes/No)");
        String chosen=userInput.next();

        if(chosen.equals("Yes")){
          System.out.println("Type Category name");
          String catname=userInput.next();
          Category target=null;

          for(int y=0; y<userData.size();y++){
            if(userData.get(y).getCategoryName().equals(catname)){
              target=userData.get(y);
            }
          }
          target.printPurchases();
        }
      }

      if(command.equals("Change spending limit")){
        System.out.println("Enter category");
        String c= userInput.next();

        Category target=null;
        for(int y=0; y<userData.size();y++){
          if(userData.get(y).getCategoryName().equals(c)){
            target=userData.get(y);
          }
        }
        System.out.println("Enter new spending goal");
        
        double n= userInput.nextDouble();
        target.editSpendingGoal(n);
      }
      System.out.println("Enter one of the following commands: Enter spending event, Change spending limit, View spending history, QUIT");
    }
  }
}
