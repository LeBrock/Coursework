
/**
 * Objects of the Book class have the attributes of width and depth which are integer numbers, as well as title and willFit with are strings. 
 * 
 * The class constructor will initialise objects with the attributes width, depth and title. 
 * Throughout the class the attributes width and depth should be given as CM.
 * 
 * The class also has setter and getter messages for the attributes. 
 * 
 * The method in the class is willFit, this method requres a a Bookshelf object to have been created 
 * and will work out if the book object will fit on the bookshelf and return a statement stating if it will fit or not. 
 * 
 * The class also has the method toString which will return a statment giving the state of the object. 
 * 
 * The method putOnShelf with return a statement that the book is on the bookshelf and remove the books width from the remainingSpace 
 * on the book shelf if it will fit. Else it will return a string stating that it will not fit.
 * 
 * @author (Ross Barden) 
 * @version (17.01.2016)
 */
public class Book
{
   // instance variables - replace the example below with your own
   private int width; 
   private int depth;
   private String title; 

   /**
    * Constructor for objects of Book class. 
    * 
    * It it takes the argunments of width, and depth which should be given as integers. As well as title which should be given as a string. 
    */
   public Book(int width, int depth, String title)
   {
      // initialise instance variables
      super (); 
      this.width = width ; //The integer for width should be given in CM
      this.depth = depth ; //The integer for depth should be given in CM
      this.title = title ; //This attribute is important for the toString and willFit methods 
   }

   /** 
    * Returns the width of the object, as an integer. 
    */
   public int getWidth ()
   {
      return this.width;
   }
   
   /** 
    * A modifier method which sets the width of the object and takes the desired width given as an integer taken as an argument. 
    */
   public void setWidth(int aWidth) 
   {
      this.width = aWidth;
   }
   
   /**
    * Returns the depth of the object, as an integer. 
    */
   public int getDepth()
   {
      return this.depth;
   }
   
   /**
    *  A modifier method which sets the depth of the object and takes the desired width given as an integer taken as an argument. 
    */
   public void setDepth(int aDepth)
   {
      this.depth = aDepth;
   }
   
   /**
    * Returns the title of the object, as a string. 
    */
   public String getTitle()
   {
      return this.title;
   }
   
   /**
    * A modifier method which sets th title of the object and takes the desred title given as a string as an argument. 
    */
   public void setTitle(String aTitle)
   {
      this.title = aTitle;
   }
   
   /**
    * Returns a string describing the state of the of object. 
    */
   @Override
   public String toString()
   {
      return "The book " + this.getTitle() + " is " + this.getWidth() + "CM wide, and " + this.getDepth() + "CM deep.";      
   }
   
   /**
    * This method requires an object of the Bookshelf class to have been constructed. 
    * 
    * If the book will fit onto the bookshelf this method will return a string giving 
    * the title and stating that it will fit into the shelf. 
    * 
    * If the book will not fit onto the bookshelf the method will return a string giving 
    * the title and stating that it will not fit on the shelf. 
    * 
    */
   public String willFit(Bookshelf aBookshelf)
   {
      
      if (this.getWidth() <= aBookshelf.getRemainingSpace())// This method calls an object of the Bookshelf class. 
      {
         return "The book " + this.getTitle() + " will fit on the bookshelf" ; 
      }
      else 
      {
         return "The book " + this.getTitle() + " will not fit on the bookshelf" ; 
      }
   }
   
   /**
    * This method requires an object of the Bookshelf class to have been constructed. 
    * 
    * If the book will fit on the shelf, the width of the book will be taken away from the remainingSpace of the bookshelf. 
    * It will also return a string stating that the book has been put onto the shelf. 
    * 
    * If the book will not fit on the self it will return a string stating that it will not fit. 
    */
   public String putOnShelf(Bookshelf aBookshelf) 
   {
      if (this.getWidth() <= aBookshelf.getRemainingSpace())// This method calls an object of the Bookshelf class. 
      {
         aBookshelf.usedSpace = aBookshelf.usedSpace + this.getWidth(); 
         return "The book " + this.getTitle() + " is on the bookshelf." ;
      }
      else 
      {
         return "The book " + this.getTitle() + " will not fit on the bookshelf." ;
      }
   }
}
