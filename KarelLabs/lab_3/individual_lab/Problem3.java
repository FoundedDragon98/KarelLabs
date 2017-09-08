package lab_3.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem3 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem3(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void carpetRooms(){
        carpetRoom();
        carpetRoom();
        carpetRoom();
        carpetRoom();
        carpetRoom();
        carpetRoom();
        carpetRoom();
        carpetRoom();
    }
    
    public void carpetRoom() {
        findRoom();
        if(checkRoom()) {
            putBeeper();
            reposition();
        }
        else {
            reposition();
        }
    }
    
    public boolean checkRoom() {
        if(!checkLeftWall() && !checkRightWall() && !checkCeiling()) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean checkLeftWall() {
        faceWest();
        if(frontIsClear()) {
            return false;
        }
        else {
            return true;
        }
    }
    
    public boolean checkRightWall() {
        faceEast();
        if(frontIsClear()) {
            return false;
        }
        else {
            return true;
        }
    }
    
    public boolean checkCeiling() {
        faceNorth();
        if(frontIsClear()) {
            return false;
        }
        else {
            return true;
        }
    }
    
    public void findRoom() {
        move();
        faceNorth();
        if(frontIsClear()) {
            move();
            if(frontIsClear()) {
                move();
                if(frontIsClear()) {
                    move();
                }
            }
        }
    }
    
    public boolean checkReposition() {
        faceEast();
        if(frontIsClear()) {
            faceWest();
            if(frontIsClear()) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
    
    public void reposition() {
        faceSouth();
        if(checkReposition()) {
            faceSouth();
            move();
        }
        else {
            faceEast();
        }
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void faceEast() {
        if(!facingWest()) {
                if(facingNorth()) {
                    turnRight();
                }
                if(facingSouth()) {
                    turnLeft();
                }
        }
        else {
            turnLeft();
            turnLeft();
        }
    }
    
    public void faceNorth() {
        if(!facingNorth()) {
            if(facingSouth()) {
                turnLeft();
                turnLeft();
            }
            if(facingEast()) {
                turnLeft();
            }
            if(facingWest()) {
                turnRight();
            }
        }
    }
    
    public void faceWest() {
        if(!facingWest()) {
            if(facingEast()) {
                turnLeft();
                turnLeft();
            }
            if(facingNorth()) {
                turnLeft();
            }
            if(facingSouth()) {
                turnRight();
            }
        }
    }
    
    public void faceSouth() {
        if(!facingSouth()) {
            if(facingNorth()) {
                turnLeft();
                turnLeft();
            }
            if(facingWest()) {
                turnLeft();
            }
            if(facingEast()) {
                turnRight();
            }
        }
    }
}

