import greenfoot.*;


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
    private int randomY = Greenfoot.getRandomNumber(500)+40; //get random value Y between 40px and 540px
    /**
     * Constructs a new paddle with the given dimensions.
     */
    public RoboPaddle(int width, int height)
    {
        this.width = width;
        this.height = height;
        dx = 1;
        createImage();
    }

    /**
     * Act - do whatever the RoboPaddle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        robotMovement();
    }    
    
    private void robotMovement(){
        move(2);
        if(getX()>= 499){
            setLocation(1, Greenfoot.getRandomNumber(randomY));
        }
    }

    /**
     * Creates and sets an image for the paddle, the image will have the same dimensions as the paddles width and height.
     */
    private void createImage()
    {
        GreenfootImage image = new GreenfootImage(width, height);
        image.setColor(Color.BLACK);
        image.fill();
        setImage(image);
    }

}
