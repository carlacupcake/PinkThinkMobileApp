/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.thepinkthink.pinkthink;

import android.content.Context;
import android.os.Environment;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Mikayla
 */
public class CodeExtractor{
    
    public static void extractCode(ProgramBlock program) throws IOException{
        String code = program.code();
        File arduino = new File("output.ino");
        FileWriter writer = new FileWriter(arduino);
        writer.write(code);
        writer.close();
    }
    
}
