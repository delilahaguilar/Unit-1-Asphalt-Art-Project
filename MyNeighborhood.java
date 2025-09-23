import org.code.neighborhood.*;

public class MyNeighborhood {
  public static void main(String[] args){
    // FlagPainter myFlagPainter = new FlagPainter();
    // myFlagPainter.setPaint(1000);

    
    //instantiate framePainter
    framePainter d = new framePainter();
    //set paint for framePainter
    d.setPaint(1000);
    //Paints frame
    d.paintFrame("pink");
   // Instantiate a CheckerPainter object
   CheckerPainter dd = new CheckerPainter();
     //  enough paint to complete the checkerboard
    dd.setPaint(1000);
      // Move CheckerPainter to the starting position
    dd.goToStart();
       // Paint the checkerboard pattern
    dd.paintCheckers();
     // Move CheckerPainter to the far corner after painting
    dd.goToCorner();
   
  }
}