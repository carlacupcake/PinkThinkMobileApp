/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.thepinkthink.pinkthink;

import org.thepinkthink.pinkthink.Condition;
import org.thepinkthink.pinkthink.Constants;

/**
 *
 * @author Mikayla
 */
public class ColdCondition extends Condition {
    public ColdCondition(){
        super(Constants.DEFAULT_ANALOG_PIN+" <= "+Constants.THRESHOLD);
    }
}
