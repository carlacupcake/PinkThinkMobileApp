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
public class IfBlock extends Block{

    private Condition condition;
    private ArrayList<Block> body;
    
    public IfBlock(){
        this(new HotCondition(), new ArrayList<Block>());
    }
    
    private IfBlock(Condition condition, ArrayList<Block> body){
        super();
        this.condition = condition;
        this.body = body;
    }
    
    public void addBlock(Block b){
        body.add(b);
    }
    
    @Override
    public String code() {
        String code = "";
        
        //if(condition){
        code += Constants.IF;
        
        code += Constants.openParen;
        
        code += condition.getString();
        
        code += Constants.closeParen;
        
        code += Constants.openCurly;
        
        code += Constants.newLine;
        
        //body
        for(Block block : body){
            code += block.code();
        }
        
        //}
        code += Constants.closeCurly;
        
        //\n
        code += Constants.newLine;
        
        return code;
    }
    
}
