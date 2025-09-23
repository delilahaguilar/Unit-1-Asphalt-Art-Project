import org.code.neighborhood.*;
public class framePainter extends PainterPlus {
   /* 
   * paintFrame(String color)
   * This method paints a (border) around a grid area. 
   *The method moves the painter along 
   * each side of the rectangle, painting as it goes, 
   * and turning at the corners to color the frame
   */
  public void paintFrame(String color) {
    // Top side of the frame
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    // Turn right to begin right side of the frame
    turnRight();
    paint(color); 
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    // Turn right to begin bottom side of the frame
    turnRight();
    paint(color); 
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
     // Turn right to begin left side of the frame
    turnRight();
    paint(color);
    move();
    paint(color); 
    move();
    paint(color); 
    move();
    paint(color); 
    move();
    paint(color); 
    move();
    paint(color); 
    move();
    paint(color); 
    move();
    paint(color);
  }
}