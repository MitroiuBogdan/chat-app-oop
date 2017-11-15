/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriaf.oop.project;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yllub-pc
 */
public class TextClient {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
    
    String usename=scanner.next();
    try(Socket socket=new Socket("127.0.0.1",9000)){
    
    ClientPeer person=new ClientPeer(usename, socket);
   
   
    while(true){
      String Text=scanner.nextLine();
        
     if(Text.startsWith("/q")){
            break;}
     if(Text.startsWith("/w")){
           String user[]=Text.split(" ",3);
           person.sendPrivateMessage(user[2],user[1]);
            }
     else{
           person.sendMessage(Text);}
         }
    
    
    }
    catch (IOException ex) {
           ex.printStackTrace();
        }
        
        
        
    }
    
}
