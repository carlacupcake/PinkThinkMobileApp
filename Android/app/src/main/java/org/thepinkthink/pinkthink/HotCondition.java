/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.thepinkthink.pinkthink;

/**
 *
 * @author Mikayla
 */
public class HotCondition extends Condition{
    
    public HotCondition(){
        super(Constants.DEFAULT_ANALOG_PIN+" > "+Constants.THRESHOLD);
    }
    
}
