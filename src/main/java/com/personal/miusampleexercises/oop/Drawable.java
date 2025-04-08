/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.personal.miusampleexercises.oop;

/**
 *
 * @author kedk
 */
interface Drawable {
    void draw();
}

interface Flyable{
    void fly();
}

class Circle implements Drawable,Flyable{
    
    public void draw(){
        System.out.println("Drawing a circle");
    }
    
    public void fly(){
        System.out.println("Fly");
    }
}
