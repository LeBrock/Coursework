
/**
 * Objects of the Multiplier class are integer numbers.
 * The class models them has storing two integers, labed a and b. 
 * 
 * The protocol either returns the value of multiplying two interger values together. 
 * Or it can print our a message relating to the value of the product of the two integers, determining if it is positive, zero or negative. 
 * 
 * @author (Ross Barden) 
 * @version (05.12.2015)
 */
public class Multiplier
{
   private int a,b;

   /**
    * Constructor for objects of class Multiplier. 
    */
   public Multiplier()
   {    
   }

   /**
    * Returns the value of multiplying two intergers, taken as arguments. 
    */
   public int multiply(int a, int b)
   {
      return a * b; 
   }
   
   /**
    * Caculates the value of multiplying two intergers, and prints out a statement relating to the value. 
    * If the product is a positive number, it prints out the message "The product is positive"
    * If the product is zero, it prints out the message "The product is zero"
    * If the product is a negative number, it prints out the message "The product is negative"
    */
   public void printSign(int a, int b)
   {
      int product = this.multiply(a,b); 
      {
         if (product >= 1)
         {
            System.out.println("The product is positive");
         }
         else if (product == 0) 
         {
            System.out.println("The product is zero");
         }
         else 
         {
            System.out.println("The product is negative");
         }
      }
   }
}
