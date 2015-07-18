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
public class ProgramBlock extends Block{
    
    private ImportsBlock imports;
    private SetupBlock setup;
    private LoopBlock loop;

    @Override
    public String code() {
        String code = "";
        code += imports.code();
        code += setup.code();
        code += loop.code();
        return code;
    }
    
    public void setImports(ImportsBlock imports){
        this.imports = imports;
    }
    
    public void setSetup(SetupBlock setup){
        this.setup = setup;
    }
    
    public void setLoop(LoopBlock loop){
        this.loop = loop;
    }
    
    public void addBlock(Block b){
        loop.addBlock(b);
    }

    public Block getBlock(int index){
        return loop.getBlock(index);
    }

    public void removeLast(){
        loop.removeLast();
    }
    
}
