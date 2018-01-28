/**
 * A class for a Purchase object, which stores a single date and amount of money
 *
 * @Kiersten Campbell, Arselyne Chery, Karmen Liang, Vicky Liu, Grace Mazzarella -- SavingsU Team
 * @1/27/18
 */
public class Purchase
{
  private double amount;  //stores purchase amount
  private String date;    //stores date of purchase

  /**
   * Constructor for objects of class Purchase
   */
  public Purchase(double amount, String date)
  {
    this.date=date;
    this.amount=amount;
  }

  //accessors for instance variables
  public double getPurchaseAmount(){ return amount; }

  public String getPurchaseSDate(){ return date; }

  public void print(){
    System.out.println("Date: " +date);
    System.out.println("Amount: "+ amount);
  }
}
