/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.thepinkthink.pinkthink;

import java.util.ArrayList;

/**
 *
 * @author Mikayla
 */
public class SetColor extends MethodCallBlock{
    
    private static final ArrayList<String> DEFAULT_COLOR = Constants.pinkParams;
    
    public SetColor(){
        this(Constants.COLOR1, DEFAULT_COLOR);
    }
    
    private SetColor(String pixel, ArrayList<String> color){
        this(params(pixel, color));
    }
    
    private SetColor(ArrayList<String> params){
        super(Constants.SET_COLOR, params);
    }
    
    public void setLightAndColor(String pixel, ArrayList<String> color){
        setParams(params(pixel, color));
    }
    
    private static ArrayList<String> params(String pixel, ArrayList<String> color){
        color.add(0, pixel);
        return color;
    }
}
