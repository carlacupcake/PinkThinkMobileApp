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
public class SetupBlock extends MethodDeclarationBlock {
    public SetupBlock(){
        super(Constants.VOID, Constants.SETUP, new ArrayList<String>(), new ArrayList<String>(), new ArrayList<Block>());
    }
    public SetupBlock(ArrayList<Block> body){
        super(Constants.VOID, Constants.SETUP, new ArrayList<String>(), new ArrayList<String>(), body);
    }
    
}
