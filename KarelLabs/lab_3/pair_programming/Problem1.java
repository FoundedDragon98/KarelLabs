package lab_3.pair_programming;

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

    public void checkSurrounded() {
        if(!frontIsClear()) {
            turnLeft();
            if(!frontIsClear()) {
                turnLeft();
                if(!frontIsClear()) {
                    turnLeft();
                    if(!frontIsClear()) {
                        turnLeft();
                        turnOff();
                    }
                    else {
                        turnLeft();
                    }
                }
                else {
                    turnLeft();
                    turnLeft();
                }
            }
            else {
                turnLeft();
                turnLeft();
                turnLeft();
            }
        }
    }
}

