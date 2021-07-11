/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luduslatrunculorum.controller;

import com.luduslatrunculorum.view.MainScreen;

/**
 *
 * @author vinicius
 */
public class MainController {
    
    private MainScreen mainScreen;
    
    public MainController(){
        mainScreen = new MainScreen();
        mainScreen.setVisible(true);
    }
    
}
