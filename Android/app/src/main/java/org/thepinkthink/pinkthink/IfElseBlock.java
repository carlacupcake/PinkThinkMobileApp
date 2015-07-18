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
public class IfElseBlock extends Block{

    private Condition condition;
    private ArrayList<Block> ifBody;
    private ArrayList<Block> elseBody;
    
    public IfElseBlock(){
        this(new HotCondition(), new ArrayList<Block>(), new ArrayList<Block>());
    }
    
    private IfElseBlock(Condition condition, ArrayList<Block> ifBody, ArrayList<Block> elseBody){
        super();
        this.condition = condition;
        this.ifBody = ifBody;
        this.elseBody = elseBody;
    }
    
    public void addBlockToIf(Block b){
        ifBody.add(b);
    }
    
    public void addBlockToElse(Block b){
        elseBody.add(b);
    }
    
    @Override
    public String code() {
        String code = "";
        
        //if(condition){\n
        code += Constants.IF;
        
        code += Constants.openParen;
        
        code += condition.getString();
        
        code += Constants.closeParen;
        
        code += Constants.openCurly;
        
        code += Constants.newLine;
        
        //if body
        for(Block block : ifBody){
            code += block.code();
        }
        
        //}\n
        code += Constants.closeCurly;
        code += Constants.newLine;
        
        //else{\n
        code += Constants.ELSE;
        code += Constants.openCurly;
        code += Constants.newLine;
        
        //else body
        for(Block block : elseBody){
            code += block.code();
        }
        
        //}/n
        code += Constants.closeCurly;
        code += Constants.newLine;
        
        return code;
    }
    
    
    
}
