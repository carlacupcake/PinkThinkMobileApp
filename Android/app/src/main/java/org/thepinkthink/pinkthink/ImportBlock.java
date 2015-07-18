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
public class ImportBlock extends Block{
    
    private String IMPORT;
    
    public ImportBlock(String IMPORT){
        this.IMPORT = IMPORT;
    }

    @Override
    public String code() {
        String code = "";
        code += IMPORT;
        code += Constants.newLine;
        return code;
    }
    
}
