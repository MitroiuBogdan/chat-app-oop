/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriaf.oop.project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class ServerConfig {
    
    
     private String fisier;
    
    
    public ServerConfig(String fisier) throws FileNotFoundException {
       
        try(Scanner scanner=new Scanner(new File(fisier))){
           
            while(scanner.hasNextLine()){
                    String str=scanner.nextLine();
                    
                    str=str.trim();
            if(!str.startsWith("#"))
                {
               
                    System.out.println(str);}
                         }
                
                        }
                    }
    
    
}
