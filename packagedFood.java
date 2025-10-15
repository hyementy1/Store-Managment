public class packagedFood extends groceryItem {
//instance variable
  private boolean isFrozen;
// no argument constructor
   public packagedFood() {
    isFrozen = true;
  }

// constructor, accessor, and mutator contructor respectivly
   public packagedFood(String name, double price, boolean taxable, boolean isFrozen) {
    super(name, price, taxable);
    this.isFrozen = isFrozen;
  }

   public boolean getIsFresh() {
    return isFrozen;
  } 
  public void setIsFresh(boolean IsFresh) {
    this.isFrozen = IsFresh;
   
  }
    /*
this is a toString method
which returns if it needs to be frozen
     */
  public String toString() { 
         return super.toString() + "\nDoes it need to be frozen? " + isFrozen;
    
  }
}