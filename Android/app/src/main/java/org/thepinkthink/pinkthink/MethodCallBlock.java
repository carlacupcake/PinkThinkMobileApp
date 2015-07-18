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
public class MethodCallBlock extends Block{
    
    private final String methodName;
    private ArrayList<String> parameters;
    
    public MethodCallBlock(String methodName, ArrayList<String> parameters) {
        this.methodName = methodName;
        this.parameters = parameters;
    }
    
    public void setParams(ArrayList<String> parameters){
        this.parameters = parameters;
    }
    
    @Override
    public String code() {
        
        String code = "";
        
        //method name
        code += methodName;

        //start parameters
        code += Constants.openParen;

        int size = parameters.size();
        for(int i = 0; i < size; i++){
            code += parameters.get(i);
            if(i != size-1){
                code += Constants.comma;
                code += Constants.space;
            }
        }
        
        //end parameters
        code += Constants.closeParen;
        
        //end method call
        code += Constants.semicolon;
        
        //new line
        code += Constants.newLine;
            
        return code;
        
    }
    
}
