/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klinik;

import View.StartProgram;



/**
 *
 * @author Opang
 */
public class Klinik {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       StartProgram sp = new StartProgram();
       sp.setVisible(true);
       login menu = new login();
       
       try{
           for(int i = 0; i<=100; i++){
               
               Thread.sleep(i);
               sp.Time.setText(Integer.toString(i)+"%");
               
               if(i == 100){
                   sp.setVisible(true);
                   menu.setVisible(true);
                   
               }
           }
       } catch (Exception e){
    }
    }
}