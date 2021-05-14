public class Car {
   private int modelYear; 
   // TODO: Declare purchasePrice field (int)
   private int purchasePrice;
   private int currentValue;
   
   public void setModelYear(int userYear){
      modelYear = userYear;
   }
   
   public int getModelYear() {
      return modelYear;
   }
   
   // TODO: Define setPurchasePrice() method
      public void setPurchasePrice(int val){
         purchasePrice = val;
      }
   
   // TODO: Define getPurchasePrice() method
      public int getPurcahcePrice(){
         return purchasePrice;
      }
   
   public void calcCurrentValue(int currentYear) {
      double depreciationRate = 0.15;
      int carAge = currentYear - modelYear;
      
      // Car depreciation formula
      currentValue = (int) 
         Math.round(purchasePrice * Math.pow((1 - depreciationRate), carAge));
   }
   
   // TODO: Define printInfo() method to output modelYear, purchasePrice, and currentValue
   public void printInfo(){
      System.out.println("car is: "+ modelYear+" years");
      System.out.println("car was bought at: $"+purchasePrice);
      System.out.println("car is now: $"+currentValue);
   }
}