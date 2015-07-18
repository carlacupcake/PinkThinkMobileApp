package org.thepinkthink.pinkthink;

import android.view.View;

import java.util.ArrayList;

/**
 * Created by Mikayla on 7/18/2015.
 */
public class BlockAndView {

    public Block block;
    public View view;

    public static Block BlockOf(View view, ArrayList<BlockAndView> blocks){

        for(BlockAndView bAndV : blocks){
            if(bAndV.view == view){
                return bAndV.block;
            }
        }
        return null;
    }

    public BlockAndView(Block b, View v){
        block = b;
        view = v;
    }
}
