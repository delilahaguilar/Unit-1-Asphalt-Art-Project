import org.code.neighborhood.*;
public class CheckerPainter extends PainterPlus {
   /* 
   * goToStart()
   * This method moves the CheckerPainter to the starting position 
   * where the checkerboard painting should begin.
   */

  public void goToStart () {
    turnRight(); //turn right to allign with path
    move(); //move one step
    turnLeft(); //turn left to face correct direction
  }
  /*
   * paintCheckers()
   * This method paints a checkerboard pattern by colors
   * ("white" and "pink") across rows.
   */

  public void paintCheckers() {
    //First row
    move();
    paint("white");
    move();
    paint("pink");
    move();
    paint("white");
    move();
    paint("pink");
    move();
    paint("white");
    move();
    paint("pink");
//Second row
    turnRight();
    move();
    paint("white");
    turnRight();
    move();
    paint("pink");
    move();
    paint("white");
    move();
    paint("pink");
    move();
    paint("white");
    move();
    paint("pink");
//Third ROw
    turnLeft();
    move();
    turnLeft();
    paint("white");
    move();
    paint("pink");
    move();
    paint("white");
    move();
    paint("pink");
    move();
    paint("white");
    move();
    paint("pink");
//Fourth ROw
    turnRight();
    move();
    turnRight();
    paint("white");
    move();
    paint("pink");
    move();
    paint("white");
    move();
    paint("pink");
    move();
    paint("white");
    move();
    paint("pink");
//Fifth row
    turnLeft();
    move();
    turnLeft();
    paint("white");
    move();
    paint("pink");
    move();
    paint("white");
    move();
    paint("pink");
    move();
    paint("white");
    move();
    paint("pink");
//Sixth row
    turnRight();
    move();
    turnRight();
    paint("white");
    move();
    paint("pink");
    move();
    paint("white");
    move();
    paint("pink");
    move();
    paint("white");
    move();
    paint("pink");
  }
  /* 
   * goToCorner()
   * This method moves the CheckerPainter from its current position 
   * to the  corner of the  grid.
   */
  public void goToCorner() {
    move(); //move foward 
    turnRight(); //turn to align with path
    move(); //move doward to reach corner
    move();
    move();
    move();
    move();
    move();
  }
}