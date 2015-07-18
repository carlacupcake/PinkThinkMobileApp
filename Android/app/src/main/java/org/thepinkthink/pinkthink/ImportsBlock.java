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
public class ImportsBlock extends Block{
    
    private ArrayList<ImportBlock> imports;
    
    public ImportsBlock(){
        super();
        imports = new ArrayList<ImportBlock>();
    }

    @Override
    public String code() {
        String code = "";
        for(ImportBlock i : imports){
            code += i.code();
        }
        return code;
    }
    
    public void addImport(ImportBlock i){
        imports.add(i);
    }
    
    
    
}
