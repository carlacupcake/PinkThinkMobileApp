/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.thepinkthink.pinkthink;

import java.io.IOException;

/**
 *
 * @author Mikayla
 */
public class PinkThink {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        DefaultProgramBlock defaultProgram = new DefaultProgramBlock();
        defaultProgram.addBlock(new OnBlock());
        WaitBlock wait = new WaitBlock();
        defaultProgram.addBlock(wait);
        wait.setWait(2);
        defaultProgram.addBlock(new OffBlock());
        defaultProgram.addBlock(new WaitBlock());
        //CodeExtractor.extractCode(defaultProgram);
    }
    
}
