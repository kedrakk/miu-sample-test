/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.personal.miusampleexercises.oop;

/**
 *
 * @author kedk
 */
class Animal {
    void makeSound(){
        System.out.println("Make animal sound");
    }
}

class Cat extends Animal{
    
    @Override
    void makeSound(){
        //super.makeSound();
        System.out.println("Cat Sound");
    }
}


