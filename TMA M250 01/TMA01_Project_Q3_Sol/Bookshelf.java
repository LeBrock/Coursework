
/**
 * The Bookshelf class has the variables of shelfDepth, shelfWidth, usedSpace and SpaceRemaining which are all given as itegers. 
 * 
 * The class constructor will initialise the object with shelfDepth, shelfWidth and usedSpace, which should be given in CM. 
 * The variable spaceRemaining will automatically be caculated by taking the usedSpace from the shelfWidth. 
 * 
 * There are both setter and getter messages for shelfDepth, shelfWidth and usedSpace. 
 * The attribute spaceRemaining only has a getter message as it is caculated from the attributes shelfWidth and usedSpace. 
 * 
 * The toString method returns a string giving the state of the object.  
 * 
 * 
 * @author (Ross Barden) 
 * @version (17.01.2016)
 */
public class Bookshelf
{
   // instance variables - replace the example below with your own
   private int shelfDepth; 
   private int shelfWidth; 
   public int usedSpace;
   private int spaceRemaining; 

   /**
    * Constructor for objects of class Bookshelf
    */
   public Bookshelf(int shelfDepth, int shelfWidth, int usedSpace)
   {
      // initialise instance variables
      this.shelfDepth = shelfDepth; //This should be given in CM
      this.shelfWidth = shelfWidth; //This should be given in CM
      this.usedSpace = usedSpace; //This should be given in CM
      spaceRemaining = shelfWidth - usedSpace;
   }
   
   /**
    * Returns the depth of the shelf as an integer.
    */
   public int getShelfDepth()
   {
      return this.shelfDepth;
   }
   
   /**
    * A modifier method which sets the depth of the object and takes the desired width given as an integer taken as an argument. 
    */
   public void setShelfDepth(int depth)
   {
      this.shelfDepth = depth;
   }
   
   /**
    * Returns the width of the shelf as an integer. 
    */
   public int getShelfWidth()
   {
      return this.shelfWidth;
   }
   
   /**
    * A modifier method which sets the width of the object and takes the desired width given as an integer taken as an argument. 
    */
   public void setShelfWidth(int width)
   {
      this.shelfWidth = width;
   }

   /**
    * Returns the space that has already been used on the bookshelf as an integer. 
    */
   public int getUsedSpace()
   {
      return this.usedSpace;
   }
   
   /**
    * A modifier method which sets the used space of the object and takes the desired width given as an integer taken as an argument.
    */
   public void setUsedSpace(int space)
   {
      this.usedSpace = space; 
   }
   
   /**
    * Returns the remaining space on the bookshelf as an integer. 
    */
   public int getRemainingSpace()
   {
      return this.getShelfWidth() - this.getUsedSpace(); 
   }
   
   /**
    * Returns a string giving the state of the bookshef. 
    */
   @Override
   public String toString()
   {
      return "The bookshelf is " + this.getShelfWidth() + " CM wide, and is " + this.getShelfWidth() + " and has " + this.getRemainingSpace() + " CM of free space remaining."; 
   }
}
