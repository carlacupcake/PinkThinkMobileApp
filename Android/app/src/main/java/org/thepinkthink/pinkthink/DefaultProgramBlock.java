/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.thepinkthink.pinkthink;

import org.thepinkthink.pinkthink.DefaultSetupBlock;

/**
 *
 * @author Mikayla
 */
public class DefaultProgramBlock extends ProgramBlock{
    
    public DefaultProgramBlock(){
        super();
        setImports(new DefaultImportsBlock());
        setSetup(new DefaultSetupBlock());
        setLoop(new DefaultLoopBlock());
    }
    
}
