/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xlumi
 */
public class Room {
    
    private String code;
    private int seats;
    
    public Room(String classCode, int numberofSeats) {
        this.code = classCode;
        this.seats = numberofSeats;
    }
}
