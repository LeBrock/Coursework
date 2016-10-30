
/**
 * Class Train - 
 * This class causes a representation of a train to be created in the Shapes
 * Window, and for it to move across the screen
 * 
 * @author (M250 Course Team) 
 * @version (1.0)
 */
import ou.*;
public class Train
{
   private Square cabin;       // represents the train's cabin 
   private Square engine;      // represents the train's engine
   private Square funnel;      // represents the train's funnel
   private Square window;      // represents the train's window
   private Circle frontWheel;  // represents the train's frontwheel
   private Circle backWheel;   // represents the train's backwheel
   private Circle smoke;       // represents a puff of smoke

   /**
    * Constructor for objects of class Train
    */
   public Train(Square e, Square c, Square f, Square w, Circle fw, Circle bw, Circle s)
   {
      super();
      this.engine = e;
      this.cabin = c;
      this.funnel = f;
      this.window = w;
      this.frontWheel = fw; 
      this.backWheel = bw; 
      this.smoke = s;
      this.makeTrain(); // will be written in Q2(a)
   }
   
   /**
    * Moves the cabin of the receiver Train object to its initial position
    */
   private void setInitialCabinPos()
   {
      this.getCabin().setLength(80);
      this.getCabin().setYPos(220);
      this.getCabin().setXPos(0);
      this.getCabin().setColour(OUColour.RED);
   }
   
   /**
    * Moves the engine of the receiver Train object to its initial position
    */
   private void setInitialEnginePos()
   {
      this.getEngine().setColour(OUColour.RED);
      this.getEngine().setLength(50);
      this.getEngine().setYPos(250);
      this.getEngine().setXPos(80);
   }
    
   /**
    * Moves the funnel of the receiver Train object to its initial position
    */
   private void setInitialFunnelPos()
   {
      this.getFunnel().setColour(OUColour.BLACK);
      this.getFunnel().setLength(20);
      this.getFunnel().setYPos(230);
      this.getFunnel().setXPos(110);
   }
   
   /**
    * Moves the window of the receiver Train object to its initial position
    */
   private void setInitialWindowPos()
   {
      this.getWindow().setColour(OUColour.BLACK);
      this.getWindow().setLength(20);
      this.getWindow().setYPos(230);
      this.getWindow().setXPos(50);
   }
   
 
   /**
    * Moves the frontwheel of the receiver Train object to its initial position
    */
   private void setInitialFrontWheelPos()
   {
      this.getFrontWheel().setDiameter(30);
      this.getFrontWheel().setXPos(100);
      this.getFrontWheel().setYPos(295);
   }
   
   /**
    * Moves the backwheel of the receiver Train object to its initial position
    */
   private void setInitialBackWheelPos()
   {
      this.getBackWheel().setDiameter(30);
      this.getBackWheel().setXPos(0);
      this.getBackWheel().setYPos(295);
   }
      
   /**
    * Moves the smoke of the receiver Train object to a home 
    * position relative to the funnel.
    */
   private void setInitialSmokePos()
   {
      this.getSmoke().setColour(OUColour.BROWN);
      this.getSmoke().setDiameter(10);
      this.getSmoke().setXPos(funnel.getXPos()+5); 
      this.getSmoke().setYPos(funnel.getYPos()-20);
   }
   
   /**
    * Returns the Square object representing the engine of the receiver Train object
    */  
   private Square getEngine()
   {
      return this.engine;
   }
   
   /**
    * Returns the Square object representing the cabin of the receiver Train object
    */  
   private Square getCabin()
   {
      return this.cabin;
   }
   
   /**
    * Returns the Square object representing the funnel of the receiver Train object
    */  
   private Square getFunnel()
   {
      return this.funnel;
   }
   
   /**
    * Returns the Square object representing the window of the receiver Train object
    */ 
   private Square getWindow()
   {
      return this.window;
   }
   
   /**
    * Returns the Circle object representing the frontwheel of the receiver Train object
    */ 
   private Circle getFrontWheel()
   {
      return this.frontWheel;
   }
   
   /**
    * Returns the Circle object representing the backwheel of the receiver Train object
    */ 
   private Circle getBackWheel()
   {
      return this.backWheel;
   }
    
 
   /**
    * Returns the Circle object representing the smoke of the receiver Train object
    */ 
   private Circle getSmoke()
   {
      return this.smoke;
   }
 
   /**
    * Moves all the component parts of the train into their initial positions 
    */
   private void makeTrain()
   {
     this.setInitialCabinPos();
     this.setInitialEnginePos();
     this.setInitialFunnelPos();
     this.setInitialWindowPos();
     this.setInitialFrontWheelPos();
     this.setInitialBackWheelPos();
     this.setInitialSmokePos(); 
   }

   /**
    * Moves each component of the receiver Train object (except the smoke) 
    * by numUnits to the right 
    */
   public void moveTrainBy(int numUnits)
   {

      // to be written in Q2(c)
      this.getCabin().setXPos(cabin.getXPos()+ numUnits);
      this.getEngine().setXPos(engine.getXPos()+ numUnits);
      this.getFunnel().setXPos(funnel.getXPos()+ numUnits);
      this.getWindow().setXPos(window.getXPos()+ numUnits);
      this.getFrontWheel().setXPos(frontWheel.getXPos()+ numUnits);
      
      this.getBackWheel().setXPos(backWheel.getXPos()+ numUnits);
   }

   /**
    * Repeatedly moves the train numUnits to the right (except the smoke) 
    * by numMoves number of times.  The smoke, however moves separately as follows:
    * Every move the train makes, the smoke moves 5 units backwards and 10 units up, 
    * and its diameter increases by 3. However at every sixth move, the smoke 
    * is reset to its initial size and position above the funnel.
    */
   public void animateTrain(int numUnits, int numMoves) 
   {
       // To be written in Q2(d).  
       // You will need to making appropriate use of a delay() message 
       // with an argument of about 20 to slow down the motion 
       int distanceRight = numUnits;
       int timesRight = numMoves; 
       int timeDelay = 100;
       int smokeReset = 6; 
       while (timesRight > 0)
       {
          this.moveTrainBy(distanceRight);
          this.delay(timeDelay);
          timesRight--; 
       
       if (smokeReset >0)
       {
          this.getSmoke().setXPos(smoke.getXPos() - 10);
          this.getSmoke().setYPos(smoke.getYPos() - 5);
          this.getSmoke().setDiameter(smoke.getDiameter() +3);
          this.delay(timeDelay);
          smokeReset--;
       }
       if (smokeReset == 0)
       {
          this.setInitialSmokePos();
          smokeReset = smokeReset + 6; 
       }
      }
   }
   
   /**
    * Gets the number of units for each move from the user, then the 
    * method gets the number of moves from the user. 
    * If (number of units * number of moves) is more than the guestimated
    * width of the maximised Shapes window, the user  
    * is told that the train will not run and the method ends. 
    * Otherwise the train moves as required.  
    */
   public void run()
   {
      // To be written in Q2(e) 
      String moveDistance = OUDialog.request("Please enter a positive number for the distance of each move"); 
      int distance = Integer.parseInt(moveDistance);
      String moveTimes = OUDialog.request("Please enter s positive number for the number of times the train will move"); 
      int times = Integer.parseInt(moveTimes);
     if (distance*times <= 1000) // The estimated size of my screen was 1000. 
     {
        this.animateTrain(distance, times);
     }
     else
     {
        OUDialog.alert("You have exceeded the with of the screen");
     }
   }
  
   
   /**
    * Causes execution to pause by time number of milliseconds
    */
   private void delay(int time)
   {
      try
      {
         Thread.sleep(time); 
      }
      catch (Exception e)
      {
         System.out.println(e);
      } 
   }
   
}   
   
 


