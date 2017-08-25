package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void rearrangeBeepers() {
        findBeepers();
        retrieveBeepers();
        reposition();
        placeBeepers();
        finalposition();
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void leftTwo() {
        turnLeft();
        move();
        move();
    }
    public void rightTwo() {
        turnRight();
        move();
        move();
    }
    public void retrieveBeepers() {
        turnRight();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
    }
    public void placeBeepers() {
        turnLeft();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
    }
    public void reposition() {
        leftTwo();
        leftTwo();
    }
    public void findBeepers() {
        leftTwo();
        rightTwo();
    }
    public void finalposition() {
        leftTwo();
        leftTwo();
        turnLeft();
    }
}