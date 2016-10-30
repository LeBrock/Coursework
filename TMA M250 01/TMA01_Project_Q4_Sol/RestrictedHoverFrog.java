import ou.*;
/**
 * The class RestrictedHoverFrog is a subclass of HoverFrog. 
 * Unlike HoverFrog it can only move between the black stones 1 and 11. 
 * RestrictedHoverFrog is unable to change its colour and will be green unless it 
 * is hovering when it will be red. 
 * 
 * @author (Ross Barden) 
 * @version (17.01.2016)
 */
public class RestrictedHoverFrog extends HoverFrog implements Exercisable
{
   // instance variables - replace the example below with your own
   
   
   /**
    * Constructor for objects of class RestrictedHoverFrog
    * Zero argument constructor 
    */
   public RestrictedHoverFrog()
   {  
   }
   
   /**
    * Constructor for the RestrictedHoverFrog class that takes two arguments given as integers.
    * 
    * The first integer represents the position and if it is between 0 and 11 (inclusive) it will set the 
    * RestrictedHoverFrog's position to the value of the interger. If the argument is not within this range it will 
    * set the RestrictedHoverFrog's position to that set by the constructor of the Frog class. 
    * 
    * The second integer represents the height and if it is between 0 and 6 (inclusive) it will set the 
    * RestrictedHoverFrog's height to the value of the interger. If the argument is not within the range it will set 
    * the RestructedHoverFrog's height to that set by the constructor of the Frog class. If the height of the frog is 0 it
    * will set the colour to Green, and it it is between 1-5 (inclusive) it will set the colour to Red. 
    */
   public RestrictedHoverFrog(int a, int b)
   {
      super();
            if (a > 0 && a <=11)
      {
         this.setPosition(a);
      }
      if (b >= 0 && b <=6)
      {
         this.setHeight(b);
      }
   
   }

   /** 
    * A modifier method that overrides the setPosition method of its super class, and takes an integer as an argument. 
    * If the intgerer is between 1 and 11 (inclusive) it will set the RestrictedHoverFrog in that position. 
    * If the integer is not in the range, it will do nothing. 
    */
   @Override
   public void setPosition (int aPosition)
   {
      if (aPosition > 0 && aPosition <=11)
      {
         super.setPosition(aPosition);
      }
   }
   
   /**
    * A modifier method that overrides the setColour method its super class and does nothing. 
    */
   @Override
   public void setColour(OUColour aColour)
   {
   }
   
   /**
    * A modifier method that overrights the setHeight of its super class. 
    * It takes an interger as an argument. 
    * If the height is set to 0 it will set the colour of the frog to Green, if the height is 
    * more than 0 it will set the colour of the frog to Red. 
    */
   @Override
   public void setHeight(int aHeight)
   {
      super.setHeight(aHeight);
      if (this.getHeight() > 0)
      {
         super.setColour(OUColour.RED);
      }
      else
      {
         super.setColour(OUColour.GREEN);
      }
   }
   
   /**
    *This method calles the method from the interface Exercisable. 
    *It takes two arguments and interger and a boolean value. 
    *
    *If the boolean value is true, the object moves left, right, right, left according to the interger value. 
    *If the boolean value is false, the object moves  right, left, left, right accorinding to the interger value. 
    */
   public void exercise(int duration, boolean isStartingLeft)
   {
      if (isStartingLeft == true) 
   {
      while (duration > 0)
      {
         this.left();
         this.right(); 
         this.right();
         this.left(); 
         duration--; 
      }
   }
   else 
   {
      while (duration > 0)
   {
      this.right();
      this.left();
      this.left();
      this.right();    
      duration--;
   }
}
}
}

