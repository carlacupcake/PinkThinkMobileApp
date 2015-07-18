/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.thepinkthink.pinkthink;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Mikayla
 */
public class Constants {
    
    //curly braces
    public static final String openCurly = "{";
    public static final String closeCurly = "}";
    
    //parentheses
    public static final String openParen = "(";
    public static final String closeParen = ")";
    
    //separators
    public static final String comma = ",";
    public static final String semicolon = ";";
    
    //white space
    public static final String space = " ";
    public static final String newLine = "\n";
    public static final String tab = "\t";
    
    //if, else, for, while, do
    public static final String IF = "if";
    public static final String ELSE = "else";
    public static final String FOR = "for";
    public static final String WHILE = "while";
    public static final String DO = "do";
    
    //secret for-loop stuff masked by
    //having the user just select a number of iterations
    public static final String INITIAL = "int i = 0";
    public static final String CONDITION = "i < ";
    public static final String INCREMENT = "i ++";
    
    //import color stuff
    public static final String IMPORT_COLOR = "#include<Adafruit_NeoPixel.h>";
    public static final String IMPORT_COLOR_2 = "Adafruit_NeoPixel pixels = Adafruit_NeoPixel(2, 6, NEO_GRB + NEO_KHZ800);";
    
    //return types
    public static final String VOID = "void";
    
    //method names
    public static final String SETUP = "setup";
    public static final String LOOP = "loop";
    public static final String DIGITAL_WRITE = "digitalWrite";
    public static final String PIN_MODE = "pinMode";
    public static final String DELAY = "delay";
    public static final String INITIALIZE_PIXELS = "pixels.begin";
    public static final String SET_COLOR = "pixels.setPixelColor";
    
    //default parameters
    public static final String DEFAULT_PIN = "6";
    public static final String DEFAULT_ANALOG_PIN = "A0";
    public static final String OUTPUT = "OUTPUT";
    public static final String HIGH = "HIGH";
    public static final String LOW = "LOW";
    public static final String COLOR1 = "0";
    public static final String COLOR2 = "1";
    
    //default color parameter lists
    private static final String [] pinkParamsArray = {"255", "20", "147"};
    private static final String [] purpleParamsArray = {"148", "0", "211"};
    
    //default threshold for analog input
    public static final String THRESHOLD = "400";
    
    public static final ArrayList<String> pinkParams = new ArrayList<String>(Arrays.asList(pinkParamsArray));
    public static final ArrayList<String> purpleParams = new ArrayList<String>(Arrays.asList(purpleParamsArray));

    
    //default parameter lists
    private static final String [] onParamsArray = {DEFAULT_PIN, HIGH};
    public static final ArrayList<String> onParams = new ArrayList<String>(Arrays.asList(onParamsArray));
 
    private static final String [] offParamsArray = {DEFAULT_PIN, LOW};
    public static final ArrayList<String> offParams = new ArrayList<String>(Arrays.asList(offParamsArray));
    
    private static final String [] initializePinParamsArray = {DEFAULT_PIN, OUTPUT};
    public static final ArrayList<String> initializePinParams = new ArrayList<String>(Arrays.asList(initializePinParamsArray));
}
