import greenfoot.*;


/**
 * The Ping World is where Balls and Paddles meet to play pong.
 * 
 * @author The teachers 
 * @version 1
 */
public class PingWorld extends World
{
    private static final int WORLD_WIDTH = 500;
    private static final int WORLD_HEIGHT = 700;
    private Paddle playerPaddle;
    private RoboPaddle robotPaddle;
    /**
     * Constructor for objects of class PingWorld.
     */
    public PingWorld(boolean gameStarted)
    {
        super(WORLD_WIDTH, WORLD_HEIGHT, 1); 
        
        if (gameStarted)
        {
            GreenfootImage background = getBackground();
            background.setColor(Color.BLACK);
            // Create a new world with WORLD_WIDTHxWORLD_HEIGHT cells with a cell size of 1x1 pixels.
            addObject(new Ball(), WORLD_WIDTH/2, WORLD_HEIGHT/2);
            spawnPlayerPaddle();
            spawnRobotPaddle();
        }
        else
        {
            Greenfoot.setWorld(new IntroWorld());
        }
        
 
    }

    private void spawnPlayerPaddle(){
        playerPaddle = new Paddle(100,20);
        addObject(playerPaddle, WORLD_WIDTH / 2, WORLD_HEIGHT - 50);
    }
    
    private void spawnRobotPaddle(){
        robotPaddle = new RoboPaddle(100,20);
        addObject(robotPaddle, Greenfoot.getRandomNumber(WORLD_WIDTH), WORLD_HEIGHT - 650);
    }
}
