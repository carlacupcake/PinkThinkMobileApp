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
public class MethodDeclarationBlock extends Block{

    private final String returnType;
    private final String methodName;
    private final ArrayList<String> parameterTypes;
    private final ArrayList<String> parameterNames;
    private ArrayList<Block> body;
    
    
    public MethodDeclarationBlock(String returnType, String methodName, ArrayList<String> parameterTypes, ArrayList<String> parameterNames, ArrayList<Block> body) {
        this.returnType = returnType;
        this.methodName = methodName;
        this.parameterTypes = parameterTypes;
        this.parameterNames = parameterNames;
        this.body = body;
    }
    
    public void addBlock(Block b){
        body.add(b);
    }
    
    @Override
    public String code() {
        
        String code = "";
        
        //<return type>_
        code += returnType;
        code += Constants.space;
        
        //method name
        code += methodName;

        //start parameters
        code += Constants.openParen;

        int size = parameterTypes.size();
        for(int i = 0; i < size; i++){
            
            code += parameterTypes.get(i);
            code += parameterNames.get(i);
            
            if(i != size-1){
                code += Constants.comma;
                code += Constants.space;
            }
        }
        
        //end parameters
        code += Constants.closeParen;
        
        //start method body with curly brace on same line as declaration
        code += Constants.openCurly;
        
        //new line
        code += Constants.newLine;
        
        //eventually incorporate tabs/indentation? 
        //would involve passing a "# of tabs" argument down the method call chain
        
        //add body
        for(Block block : body){
            code += block.code();
        }
        
        //end method body
        code += Constants.closeCurly;
        
        //new line
        code += Constants.newLine;
            
        return code;
        
    }

    public Block getBlock(int index){
        return body.get(index);
    }

    public void removeLast(){
        if(body.isEmpty()){
            body.remove(body.size()-1);
        }

    }
    
}
