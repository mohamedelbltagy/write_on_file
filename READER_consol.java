/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication26;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.*;
import java.io.BufferedWriter;

/**
 *
 * @author carnival
 */
public class READER_consol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException  {
        

        System.out.println("enter the text:__________");
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader r=new BufferedReader(in);
        String name=r.readLine();
        
        FileWriter wr=new FileWriter("D:\\mm.txt");
        BufferedWriter w=new BufferedWriter(wr);
        while( !(name.equals("stop"))){
            System.out.println("you enter :___"+ name);
            name=r.readLine();
            w.write(name);
            w.newLine();
            
            
            
        
        }
        w.close();
        // TODO code application logic here
    }
    
}
