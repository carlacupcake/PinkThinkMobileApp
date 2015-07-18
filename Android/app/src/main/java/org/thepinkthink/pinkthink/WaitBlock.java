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
public class WaitBlock extends MethodCallBlock{

    //default wait in seconds
    private static final int DEFAULT_WAIT = 1;
    
    public WaitBlock(){
        this(DEFAULT_WAIT);
    }
    
    public WaitBlock(int wait){
        super(Constants.DELAY, waitToParams(wait));
    }
    
    public void setWait(int seconds){
        setParams(waitToParams(seconds));
    }

    private static int secsToMillisecs(int seconds){
        return seconds*1000;
    }
    
    private static ArrayList<String> waitToParams(int wait){
        int millisWait = secsToMillisecs(wait);
        String waitString = Integer.toString(millisWait);
        ArrayList<String> params = new ArrayList<String>();
        params.add(waitString);
        return params;
    }
    
}
