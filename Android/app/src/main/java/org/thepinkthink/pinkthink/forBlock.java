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
public class forBlock extends Block{

    private int iterations;
    private ArrayList<Block> body;
    
    public forBlock(int iterations, ArrayList<Block> body){
        this.iterations = iterations;
        this.body = body;
    }
    
    public void setIteration(int iterations){
        this.iterations = iterations;
    }
    
    public void addBlock(Block b){
        body.add(b);
    }
    
    @Override
    public String code() {
        
        String code = "";
        
        //for(
        code += Constants.FOR;
        code += Constants.openParen;
        
        //int i = 0;_
        code += Constants.INITIAL;
        code += Constants.semicolon;
        code += Constants.space;
        
        //i < X;_
        code += Constants.CONDITION;
        code += iterations;
        code += Constants.semicolon;
        code += Constants.space;
        
        //i++){\n
        code += Constants.INCREMENT;
        code += Constants.closeParen;
        code += Constants.openCurly;
        code += Constants.newLine;
        
        //body
        for(Block block : body){
            code += block.code();
        }
        
        //}\n
        code += Constants.closeCurly;
        code += Constants.newLine;
        
        return code;
    }
    
}
