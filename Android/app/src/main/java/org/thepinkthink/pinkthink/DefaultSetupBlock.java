/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.thepinkthink.pinkthink;

import org.thepinkthink.pinkthink.InitializePinBlock;

/**
 *
 * @author Mikayla
 */
public class DefaultSetupBlock extends SetupBlock{
    
    public DefaultSetupBlock(){
        super();
        addBlock(new InitializePinBlock());
        addBlock(new InitializePixelsBlock());
    }
    
}
