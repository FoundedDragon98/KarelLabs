package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem1 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem1(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }
    public void setPins() {
        setRow4();
        setRow3();
        setRow2();
        setRow1();
        returnpos();
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void turnAround() {
        turnLeft();
        turnLeft();
    }
    public void setRow4() {
        turnAround();
        move();
        setmoveTwo();
        setmoveTwo();
        setmoveTwo();
        setrightTurn();
    }
    public void setRow3() {
        setmoveTwo();
        setmoveTwo();
        setleftTurn();
    }
    public void setRow2() {
        setmoveTwo();
        setrightTurn();
    }
    public void setRow1() {
        putBeeper();
    }
    public void returnpos() {
        move();
        move();
        move();
        move();
        turnRight();
        move();
        move();
        move();
        turnLeft();
    }
    public void setmoveTwo() {
        putBeeper();
        move();
        move();
    }
    public void setrightTurn() {
        putBeeper();
        turnRight();
        move();
        turnRight();
        move();
    }
    public void setleftTurn() {
        putBeeper();
        turnLeft();
        move();
        turnLeft();
        move();
    }
}
