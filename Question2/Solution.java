public class Bottle{
  private double capacity
  private double amount

  public Bottle(double n, double c){
    this.capacity = n;
    this.amount  = c;
  }

  public double updateAMount(double used){
    amount -= used;
    if (amount < capacity * 0.25){
      amount = capcity;
    }
  return amount;
}
    
