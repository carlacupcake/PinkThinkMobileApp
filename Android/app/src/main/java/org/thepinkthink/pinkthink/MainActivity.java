package org.thepinkthink.pinkthink;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.io.IOException;
import java.util.ArrayList;

public class MainActivity extends ActionBarActivity {

    public static final String EXTRA_MESSAGE = "org.thepinkthink.app.MESSAGE";
    //private ArrayList<BlockAndView> blocks;
    private ArrayList<View> views;
    DefaultProgramBlock program;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //program = new DefaultProgramBlock();
        //blocks = new ArrayList<BlockAndView>();
        views = new ArrayList<View>();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void undo(View view){
        if(!views.isEmpty()){
            int last = views.size()-1;
            views.remove(last);
            LinearLayout blocks = (LinearLayout) findViewById(R.id.blocks);
            blocks.removeViewAt(last);
        }

    }

    public void addStuff(View view){
        RadioGroup radioGroup = (RadioGroup)findViewById(R.id.radioGroup);
        int radioButtonID = radioGroup.getCheckedRadioButtonId();
        RadioButton selectedButton = (RadioButton) radioGroup.findViewById(radioButtonID);
        String choice = selectedButton.getText().toString();
        LinearLayout.LayoutParams globalParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        if(choice.equals("On")){
            Button onButton = new Button(this);
            onButton.setText("ON");
            LinearLayout rl = (LinearLayout) findViewById(R.id.blocks);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            //ListView list = (ListView) findViewById(R.id.listView);
            //list.addView(onButton);
            rl.addView(onButton, lp);
            views.add(onButton);
            //OnBlock on = new OnBlock();
            //program.addBlock(on);
            //blocks.add(new BlockAndView(on, onButton));
        }else if(choice.equals("Off")){
            Button offButton = new Button(this);
            offButton.setText("OFF");
            LinearLayout rl = (LinearLayout) findViewById(R.id.blocks);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            rl.addView(offButton, lp);
            //ListView list = (ListView) findViewById(R.id.listView);
            //list.addView(offButton);
            //Block off = new OffBlock();
            views.add(offButton);
            //program.addBlock(off);
            //blocks.add(new BlockAndView(off, offButton));
        }else if(choice.equals("Wait")){
            GridLayout wait = new GridLayout(this);

            //RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
            TextView label = new TextView(getApplicationContext());
            label.setText("Wait for: ");
            wait.addView(label);
            EditText seconds = new EditText(getApplicationContext());
            seconds.setText("1");
            seconds.setBackgroundColor(Color.BLACK);
            wait.addView(seconds);
            LinearLayout layout = (LinearLayout)findViewById(R.id.blocks);
            layout.addView(wait, globalParams);
            //ListView list = (ListView) findViewById(R.id.listView);
            //list.addView(wait);
            views.add(seconds);
            //Block waitBlock = new WaitBlock();
            //program.addBlock(waitBlock);
            //blocks.add(new BlockAndView(waitBlock, seconds));
//            seconds.addTextChangedListener(new TextWatcher(){
//                public void afterTextChanged(Editable e){
//                    try{
//                        EditText t = new EditText(null);
//                        View v = (View)t.getEditableText();
//                        System.out.println("t == v ? : "+(t==v));
//                        System.out.println();
//                        Integer count = Integer.parseInt(e.toString());
//                        System.out.println("wait count: "+count);
//                        View view = (View)((EditText)e);
//                        System.out.println("");
//                        ((WaitBlock)BlockAndView.BlockOf(view, blocks)).setWait(count);
//                    }catch(Exception ex){
//
//                    }
//
//                }
//                public void beforeTextChanged(CharSequence s, int start, int count, int after){
//
//                }
//                public void onTextChanged(CharSequence s, int start, int count, int after){
//
//                }
//            });
        }

//        else if(choice.equals("Color")){
//            GridLayout gl = new GridLayout(this);
//            //ListView lv = new ListView(this);
//            ToggleButton LightNum = new ToggleButton(this);
//            LightNum.setText("0");
//            LightNum.setOnClickListener(new View.OnClickListener() {
//
//                public void onClick(View v) {
//                    if(((ToggleButton)v).getText().equals("0")){
//                        ((ToggleButton) v).setText("1");
//                    }else{
//                        ((ToggleButton) v).setText("0");
//                    }
//                }
//            });
//            //lv.addView(LightNum);
//            gl.addView(LightNum);
//            ToggleButton Color = new ToggleButton(this);
//            Color.setText("purple");
//            Color.setOnClickListener(new View.OnClickListener() {
//
//                public void onClick(View v) {
//                    if(((ToggleButton)v).getText().equals("purple")){
//                        ((ToggleButton) v).setText("pink");
//                    }else{
//                        ((ToggleButton) v).setText("purple");
//                    }
//
//                }
//            });
//
//            //lv.addView(Color);
//            gl.addView(Color);
//            LinearLayout layout = (LinearLayout)findViewById(R.id.blocks);
//            //layout.addView(lv);
//            layout.addView(gl, globalParams);
//            //views.add(lv);
//        }
    }

    public void saveStuff(View view) throws IOException {
        program = new DefaultProgramBlock();
        for(View v : views){
            if(v.getClass().equals(Button.class)){
                //System.out.println(((Button)v).getText().toString());
                if(((Button)v).getText().toString().equals("ON")){
                    program.addBlock(new OnBlock());
                }else{
                    program.addBlock(new OffBlock());
                }
            }else if(v.getClass().equals(EditText.class)){
                WaitBlock b = new WaitBlock();
                b.setWait(Integer.parseInt((((EditText)v).getText().toString())));
                program.addBlock(b);
            }else if(v.getClass().equals(ListView.class)){
                String num = ((ToggleButton)((ListView)v).getChildAt(0)).getText().toString();
                SetColor colorBlock = new SetColor();
                String color = ((ToggleButton)((ListView)v).getChildAt(1)).getText().toString();
                ArrayList<String> colorA;
                if(color.equals("pink")){
                    colorA = Constants.pinkParams;
                }else{
                    colorA = Constants.purpleParams;
                }
                colorBlock.setLightAndColor(num, colorA);
                program.addBlock(colorBlock);
            }
        }
        String code = program.code();
        Intent intent = new Intent(this, DisplayCodeActivity.class);
        intent.putExtra(EXTRA_MESSAGE, code);
        //Context context = getApplicationContext();
        //CodeExtractor.extractCode(program);
        startActivity(intent);
    }
}
