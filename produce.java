public class produce extends groceryItem {

//instance variable

  private boolean isFresh;
// no argument constructor
   public produce() {
    isFresh = true;
  }
// constructor, accessor, and mutator contructor respectivly
   public produce(String name, double price, boolean taxable, boolean isFresh) {
     super(name, price, taxable);
    this.isFresh = isFresh;
  }

   public boolean getIsFresh() {
    return isFresh;
  }

  public void setIsFresh(boolean IsFresh) {
    this.isFresh = IsFresh;
   
  }
   /*
this is a toString method which returns if the 
produce is fresh
     */
  public String toString() { 
         return super.toString() + "\nIs Fresh? " + isFresh;
    
  }
}