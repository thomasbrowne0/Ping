import greenfoot.*;
import java.util.List;

/**
 * A paddle is an object that goes back and forth. Though it would be nice if balls would bounce of it.
 * 
 * @author The teachers 
 * @version 1
 */
public class RoboPaddle extends Actor
{
    private int width;
    private int height;
    private int dx;
    private int paddleSpeed = 3;
    private int randomY = Greenfoot.getRandomNumber(400);
    
    /**
     * Constructs a new paddle with the given dimensions.
     */
    public RoboPaddle(int width, int height)
    {
        this.width = width;
        this.height = height;
        dx = 1;
        
    }
    //FOR SECOND PADDLE
    //tryChangeDirection();
    //setLocation(getX(0) + dx, get(600));
    public void act() 
    {
        // automaticRobotMovement(); 
        followingBall();
    }    
      
    private void followingBall(){
        Ball b = moveForBall();
        if(b != null){
            turnTowards(b.getX(), 50);
            move(1);
        }
    }
    
    private Ball moveForBall(){
        List<Ball> bList = getObjectsInRange(700, Ball.class);
        return bList.get(0);
    }
    
    private void automaticRobotMovement() //moves the paddle automatically, places it on a random Y coordinate
    {
        move(2);
        if(getX()>= 499){
            setLocation (1,Greenfoot. getRandomNumber(randomY)+40); //+40 so paddle is not half out of screen
        }
        
    }


    /**
     * Creates and sets an image for the paddle, the image will have the same dimensions as the paddles width and height.
     */
    private void createImage()
    {
        GreenfootImage image = new GreenfootImage(width, height);
        image.setColor(Color.BLUE);
        image.fill();
        setImage(image);
    }

}
