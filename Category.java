import java.util.Vector;
/**
 * A Category object tracks the name of an input category, a spending goal/limit,
 * the current total spent under the category, and a vector of individual purcchases
 * made under the category.
 *
 * @Kiersten Campbell, Arselyne Chery, Karmen Liang, Vicky Liu, Grace Mazzarella -- SavingsU Team
 * @1-27-18
 */
public class Category
{
  String categoryName;
  double runningTotal;
  double SpendingGoal;
  Vector<Purchase> categoryPurchases;

  /**
   * Constructor for objects of class Category
   */
  public Category(String categoryName, double SpendingGoal)
  {
    this.categoryName=categoryName;
    this.SpendingGoal=SpendingGoal;
    runningTotal=0;
    categoryPurchases=new Vector<Purchase>();
  }

  public void addPurchase(double amount, String date){
    Purchase newPurch= new Purchase(amount,date);
    newPurch.print();
    categoryPurchases.add(newPurch);
    runningTotal+=amount;
  }

  public void editSpendingGoal(double newGoal){ SpendingGoal= newGoal; }

  public boolean CheckOverGoal(){ return runningTotal>SpendingGoal; }

  public void print(){
    System.out.println("Category: " + categoryName);
    System.out.println("Spending Limit: " +SpendingGoal);
    System.out.println("Running Total: "+runningTotal);
  }

  public void printPurchases(){
    for(Purchase pur:categoryPurchases){ pur.print(); }
  }

  public double getRunningTotal(){ return runningTotal; }

  public String getCategoryName(){ return categoryName; }
}
