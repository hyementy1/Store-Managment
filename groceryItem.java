public class groceryItem {
private String name;
  private double price; 
    private boolean taxable;

  public groceryItem() {
    this("no name", 0.0, false );
  }

  public groceryItem(String name) {
    this(name,0.0, false);
  }

  
    public groceryItem(String name, double price, boolean taxable) {
    this.name = name ;
      this.price = price;
      this.taxable = taxable;
  }
//get methods are the accessor methods
  public String getName(){
    return name;
  }
 public double getPrice(){
    return price;
  }

 public boolean getTaxable(){
    return taxable;
  }

// set methods which are the mutator methods
   public void setName(String name){
  this.name = name;
  }

  public void setPrice(double price){
  this.price = price;
  }

  public void setTaxable(boolean taxable){
  this.taxable = taxable;
  }
   /*
this is a toString method which tells us if the item is taxable
or not
     */
public String toString(){
  String taxableText;
  if(taxable) {
  taxableText = "[YES]";
} else {
  taxableText ="[NO]";
}
       return "Produce name: " + name + "\nPrice: " + price + "\nIs it taxable?: " + taxableText;
  }

  
}
