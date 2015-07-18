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
public class LoopBlock extends MethodDeclarationBlock{
    public LoopBlock(){
        super(Constants.VOID, Constants.LOOP, new ArrayList<String>(), new ArrayList<String>(), new ArrayList<Block>());
    }
}
