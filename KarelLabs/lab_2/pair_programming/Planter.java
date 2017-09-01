package lab_2.pair_programming;


import kareltherobot.*; 
/**
 * @author :
 * teacher :
 * due date:
 */
public class Planter extends Harvester
{
    //Constructor method that utilizes the constructor method of the super class (UrRobot)
    public Planter(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);

    }
    
    public void harvest() {
        harvestTwoRows();
        harvestTwoRows();
        harvestTwoRows();
    } 
    
    /**
     * Precondition:  Robot facing east one block away from a row of beepers
     * Postcondition: Robot facing east, two streets above where it started, one block away from a beeper
     */
    public void harvestTwoRows() {
        harvestOneRow();
        repositionLeft();
        harvestOneRow();
        repositionRight();
    }
    
    public void harvestOneRow() {
        move();
        harvestCorner();
        move();
        harvestCorner();
        move();
        harvestCorner();
        move();
        harvestCorner();
        move();
        harvestCorner();
        move();
    }
    
    public void harvestCorner() {
        //
        putBeeper();
    }
    
    public void repositionLeft() {
        turnLeft();
        move();
        turnLeft();
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void repositionRight() {
        turnRight();
        move();
        turnRight();
    }
}