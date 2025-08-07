public class Billcalculator {
    public static void main(String[] args) {
        int units = 150;
        double bill;
        if(units <=100)
        {
            bill = units * 1.50;
        }
        else if(units <= 200)
        {
            bill = (100*1.20) + ((units - 100)*2.50);
        }
        else 
        {
            bill = (100*1.20) + (100*1.50) + ((units - 200)*3.50);
        }
          System.out.println("bill amount is :" +bill);
        }
        
        }
        
    
        
