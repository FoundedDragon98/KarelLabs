package lab_1.pair_programming;
import kareltherobot.*; 


/**
 * @author :  E. Hays
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void findAllBeepers() {
        turnLeft();
        moveThree();
        turnLeft();
        moveTwo();
        pickBeeper();
        moveThree();
        transLeft();
        moveThree();
        transLeft();
        moveThree();
        pickBeeper();
        moveTwo();
    }
   
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void moveThree() {
        move();
        move();
        move();
    }
    public void moveTwo() {
        move();
        move();
    }
    public void transLeft() {
        pickBeeper();
        turnLeft();
    }
    public void leftThree() {
        turnLeft();
        moveThree();
    }
}