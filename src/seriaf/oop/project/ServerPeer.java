/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriaf.oop.project;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.net.Socket;

/**
 *
 * @author Yllub-pc
 */
public class ServerPeer {
    
    private Socket socket;

    public ServerPeer(Socket socket) {
        this.socket = socket;
    }
    public void run() throws IOException,ClassNotFoundException{
        while(socket.isConnected()){
        
        try(ObjectInputStream inputStream=new ObjectInputStream(this.socket.getInputStream())){
            Object message=inputStream.readObject();
            Message FormatMessage=(Message)message;
            System.out.println(FormatMessage.toString());
        } 
            
            }
        }
    
    
    
    
}
