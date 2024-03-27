public class Pizza{
    private int price;
    private Boolean veg;
    private int extraCheesePrice=100;
    private int addExtraToppingsPrice=150;
    private int backPackPrice=20;
    private int basePizzaPrice;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isTakewawy = false;


    //creating constructor
    public Pizza(Boolean veg){
        this.veg = veg;
        if(this.veg){
            this.price = 300;
        }else{
            this.price=500;
        }
        basePizzaPrice = this.price;

    }

    public void getPizzaPrice(){
        System.out.println(this.price);
    }

    public static void main(String args[]){
        Pizza mainPizza = new Pizza(false);
        mainPizza.getPizzaPrice();
       }
    
       public void addExtraCheese(){
        isExtraCheeseAdded = true;
        this.price +=extraCheesePrice;
          // System.out.println("Extra cheese added");
    
       }
       public void addExtraToppings(){
        isExtraToppingsAdded = true;
        this.price +=addExtraToppingsPrice;
                 // System.out.println("Extra Toopings added");
    
       }
       public void AddTakeAway(){
        isTakewawy = true;
        this.price +=backPackPrice;
                    // System.out.println("backPackPrice");
       }

       public void getBill() {
        System.out.println("----------------------------- Your Bill -----------------------------");
        System.out.printf("| %-20s | %-10s |\n", "Item", "Price");
        System.out.println("---------------------------------------------------------------------");
    
        System.out.printf("| %-20s | %-10s |\n", "Base Pizza", "NRS - " + basePizzaPrice);
        
        if (isExtraCheeseAdded) {
            System.out.printf("| %-20s | %-10s |\n", "Extra Cheese", "NRS - " + extraCheesePrice);
        }
        if (isExtraToppingsAdded) {
            System.out.printf("| %-20s | %-10s |\n", "Extra Toppings", "NRS - " + addExtraToppingsPrice);
        }
        if (isTakewawy) {
            System.out.printf("| %-20s | %-10s |\n", "Takeaway (Backpack)", "NRS - " + backPackPrice);
        }
    
        System.out.println("---------------------------------------------------------------------");
        System.out.printf("| %-20s | %-10s |\n", "Total Bill", "NRS - " + this.price);
        System.out.println("---------------------------------------------------------------------");
    }
    
  
}