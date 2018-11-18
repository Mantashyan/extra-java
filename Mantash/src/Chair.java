
public class Chair {
  public int numberOfLegs;
  public String color;
  public Chair(int number,String color)
  {
    numberOfLegs = number;
  this.color=color;
  }

  public void breakLeg()
  {
    this.numberOfLegs--;
  }
  public void RepairLeg()
  {
    numberOfLegs++;
  }
}