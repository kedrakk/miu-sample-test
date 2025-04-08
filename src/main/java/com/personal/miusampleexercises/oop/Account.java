/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.personal.miusampleexercises.oop;

/**
 *
 * @author kedk
 */
class Account {
    private double balance;
    
    public double getBalance(){
        return this.balance;
    }
    
    public void deposit(double amount){
        this.balance+=amount;
    }
}
