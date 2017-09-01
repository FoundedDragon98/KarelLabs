package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem2 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem2(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void setField() {
        row1();
        row2();
        row3();
        row4();
        row5();
        row6();
        row7();
        returnpos();
    }
    public void row1() {
        move();
        turnLeft();
        setrightoutTurn();
    }
    public void row2() {
        setmoveTwo();
        setleftoutTurn();
    }
    public void row3() {
        setmoveTwo();
        setmoveTwo();
        setrightoutTurn();
    }
    public void row4() {
        setmoveTwo();
        setmoveTwo();
        setmoveTwo();
        setleftinTurn();
    }
    public void row5() {
        setmoveTwo();
        setmoveTwo();
        setrightinTurn();
    }
    public void row6() {
        setmoveTwo();
        setleftinTurn();
    }
    public void row7() {
        putBeeper();
    }
    public void returnpos() {
        turnLeft();
        move();
        move();
        move();
        move();
        move();
        move();
        move();
        turnLeft();
        turnLeft();
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void setmoveTwo() {
        putBeeper();
        move();
        move();
    }
    public void setrightinTurn() {
        putBeeper();
        turnRight();
        move();
        turnRight();
        move();
    }
    public void setleftinTurn() {
        putBeeper();
        turnLeft();
        move();
        turnLeft();
        move();
    }
    public void setrightoutTurn() {
        putBeeper();
        move();
        turnRight();
        move();
        turnRight();
    }
    public void setleftoutTurn() {
        putBeeper();
        move();
        turnLeft();
        move();
        turnLeft();
    }
}
