import ou.*;
/**
 * Class FrogDanceCoordinator
 * 
 * Objects of the FrogDanceCoordinator class allow showing
 * dance sequences involving Frog objects.
 * 
 * @author M250 Course Team
 * @version 1.2
 */
public class FrogDanceCoordinator
{
   /**
    * instance variables
    */
   private int numOfFrogsDancing;
   private int numOfDanceMoves;

   private Frog frog1;
   private Frog frog2;
   private Frog frog3;

   private String danceMove1;
   private String danceMove2;
   private String danceMove3;

   /**
    * Constructor for objects of class FrogDanceCoordinator.
    */
   public FrogDanceCoordinator (Frog aFrog1, Frog aFrog2, Frog aFrog3)
   {
      super();
      this.frog1 = aFrog1;
      this.frog2 = aFrog2;
      this.frog3 = aFrog3;
      this.numOfFrogsDancing = 0;
      this.numOfDanceMoves = 0;      
   }

   /* instance methods */    

   /**
    * Returns true if the argument is in the range 1 to 3 (inclusive),
    * otherwise false.
    */
   public boolean isValidNumOfMoves(int aNumber)
   {
      return ((aNumber >= 1) && (aNumber <= 3));
   }   

   /**
    * Prompts the user for a number of dance moves in the range 1 to 3 inclusive. 
    * If the number that the user entered is within the range of 1 to 3 inclusive, it will return the number. 
    * If the number is not within this range or if the user entered something other than an number the method will set the number of dance moves 
    * to 0, and ask the user to enter a numer of dance moves. 
    */
   public int promptForNumOfMoves()
   {
      int moves = 0; 
    while (! isValidNumOfMoves(moves));
    {
    try 
    {
      moves = Integer.parseInt(OUDialog.request
         ("Please enter the number of dance moves to be performed - between 1 and 3 (inclusive)"));
    }
    catch (NumberFormatException e) 
    {
      moves = 0;
    }
    } 
    return moves;
   }
  
/**
 * This method sets the number of Frogs Dancing to 0, as well as setting the three frogs used as arguments for the FrogDanceCoordination 
 * to the colour of green. 
 * It then prompt the user if they would like each of the frogs to dance one by one. 
 * If you user clicks yes it sets their colour to Red, Position to 1 and increases the number of Frogs dancing by one. 
*/
public void selectDancingFrogs() 
{
   numOfFrogsDancing = 0; 
   frog1.setColour(OUColour.GREEN); 
   frog2.setColour(OUColour.GREEN); 
   frog3.setColour(OUColour.GREEN); 
   boolean frog1awnser = OUDialog.confirm("Would you like frog1 to dance"); 
   if ( frog1awnser == true) 
      {
         frog1.setColour(OUColour.RED) ;
         frog1.setPosition(1);
         numOfFrogsDancing ++; 
      }
   else 
      {
         frog1.setColour(OUColour.GREEN); // This ensures that if the user clicked no frog1 will not dance
      }
   boolean frog2awnser = OUDialog.confirm("Would you like frog2 to dance"); 
   if ( frog2awnser == true) 
      {
         frog2.setColour(OUColour.RED) ;
         frog2.setPosition(1);
         numOfFrogsDancing ++; 
      }
   else 
      {
         frog2.setColour(OUColour.GREEN); // This ensures that if the user clicked no frog1 will not dance
      }
   boolean frog3awnser = OUDialog.confirm("Would you like frog3 to dance");
   if ( frog3awnser == true) 
      {
         frog3.setColour(OUColour.RED) ;
         frog3.setPosition(1);
         numOfFrogsDancing ++; 
      }
   else 
      {
         frog3.setColour(OUColour.GREEN); // This ensures that if the user clicked no frog1 will not dance
      }
}
   
   /**
    * This method asks the user to type the number of dance moves that they want to be performed. 
    * It will keep asking the user to input a number until the user enters a valid number. 
    * This then calls the method prompForDanceMove. 
    * If the number of dancemoves is greater than 1 the user is requested to enter the name of danceMove2. 
    * If the number of danceMoves is greater than 2 the user is requested to enter the name of danceMove3. 
    */
   public void createDance()
   {
   int input = 0; 
  while (! isValidNumOfMoves(input))
    try 
    {
     input = Integer.parseInt(OUDialog.request
         ("Please enter the number of dance moves to be performed"));
    }
    catch (NumberFormatException e) 
    {
      input = 0;
    }
   numOfDanceMoves = input; 
   if (numOfDanceMoves > 1)
   {
      danceMove1 = promptForDanceMove();
   }
   if (numOfDanceMoves > 1)
   {
      danceMove2 = promptForDanceMove();
   }   
   if (numOfDanceMoves > 2)
   {
      danceMove3 = promptForDanceMove();
   } 
   }   
    
   /**
    * This methods calls the method selectDancingFrogs and then createDance. 
    */
   public void setUpDance()
   {
      selectDancingFrogs(); 
      createDance(); 
   }
   
   /**
    * This method checks to see if the number of dancing frogs is 1 or more, and if it is it tells all of the frogs to perform danceMove 1. 
    * The method then checks to see if the number of dancing frogs is 1 or more and if it is, it tells all of the dancing frogs to perform danceMove2. 
    * Then the method checks to see if the number of dancing frogs is 2 or more and if it is, it tell all of the dancing frogs to perfrom danceMove3. 
    */
   public void performDance() 
   {
      if (numOfFrogsDancing >= 1) 
      {
         {
         if (danceMove1.equals("flip") ) 
         flipDancingFrogs(); 
         }
         {
         if (danceMove1.equals("slide")) 
         slideDancingFrogs();
         }
            if (numOfFrogsDancing > 1) 
            {
            {
               if (danceMove2.equals("flip") ) 
               flipDancingFrogs(); 
            }
            {
         if (danceMove2.equals("slide")) 
         slideDancingFrogs();
         }
         } 
         if (numOfFrogsDancing >2) 
         {
         {
         if (danceMove3.equals("flip") ) 
         flipDancingFrogs(); 
         }
         {
         if (danceMove3.equals("slide")) 
         slideDancingFrogs();
         }
         }
      }
   }
   
   /**
    * Repeatedly prompts the user for a number of moves, until they enter 
    * a valid input representing a number in the range 1 to 3 inclusive, and 
    * then returns this number.
    */    
   public int getNumOfMoves()
   {
      int moves = this.promptForNumOfMoves();
      while (!this.isValidNumOfMoves(moves))
      {
         OUDialog.alert("That is not a valid number of dance moves");
         moves = this.promptForNumOfMoves();    
      }
      return moves; 
   }
   
   /**
    * Returns true if the argument is either "flip" or "slide",
    * otherwise false.
    */
   public boolean isValidMove(String aMoveType)
   {
      return ((aMoveType.equals("flip")) || (aMoveType.equals("slide")));
   }

   /**
    * Prompts the user to enter the the name of a dance move which must be either "flip" or "slide".
    */    
   public String promptForDanceMove()
   {
      String danceMove = OUDialog.request
         ("Please enter type of dance move - flip or slide");
      while (!this.isValidMove(danceMove))
      {
         OUDialog.alert("This is not a valid type of move");
         danceMove = OUDialog.request
         ("Please enter type of dance move - \"flip\" or \"slide\"");
      }
      return danceMove;
   }
 
   /**
    * 'Flip' a frog depending on its position
    */        
   private void flip(Frog aFrog)
   {
      aFrog.jump();
      if (aFrog.getPosition() == 1)
      {
         aFrog.setPosition(11);
      }
      else
      {
         aFrog.setPosition(1);
      }
      aFrog.jump();
   }    

   /**
    * 'Slide' a frog depending on its position
    */        
   private void slide(Frog aFrog)
   {
      if (aFrog.getPosition() == 1)
      {
         while (aFrog.getPosition() < 11)
         {
            aFrog.setPosition(aFrog.getPosition() + 1);
         }
         aFrog.jump();
      }
      else
      {
         while (aFrog.getPosition() > 1)
         {
            aFrog.setPosition(aFrog.getPosition() - 1);
         }
         aFrog.jump();
      }
   }    

   /**
    * 'Flip' all frogs that have been set for dancing
    */    
   private void flipDancingFrogs()
   {
      if (this.frog1.getColour().equals(OUColour.RED))
      {
         this.flip(this.frog1);
      }
      if (this.frog2.getColour().equals(OUColour.RED))
      {
         this.flip(this.frog2);
      }
      if (this.frog3.getColour().equals(OUColour.RED))
      {
         this.flip(this.frog3);
      }
   }    

   /**
    * 'Slide' all frogs that have been set for dancing
    */        
   private void slideDancingFrogs()
   {
      if (this.frog1.getColour().equals(OUColour.RED))
      {
         this.slide(this.frog1);
      }
      if (this.frog2.getColour().equals(OUColour.RED))
      {
         this.slide(this.frog2);
      }
      if (this.frog3.getColour().equals(OUColour.RED))
      {
         this.slide(this.frog3);
      }
   }
}
