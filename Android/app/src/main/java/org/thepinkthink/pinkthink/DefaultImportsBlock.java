/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.thepinkthink.pinkthink;

import org.thepinkthink.pinkthink.ImportsBlock;

/**
 *
 * @author Mikayla
 */
public class DefaultImportsBlock extends ImportsBlock {
    
    public DefaultImportsBlock(){
        super();
        addImport(new ImportColorBlock());
        addImport(new ImportColorBlock2());
    }
    
}
