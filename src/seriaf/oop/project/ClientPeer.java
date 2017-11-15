/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriaf.oop.project;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * @author Yllub-pc
 */
public class ClientPeer {
    
    private String mSender;
    private Socket  soket;

    public ClientPeer(String mSender, Socket soket) {
        this.mSender = mSender;
        this.soket = soket;
    }
    public void sendMessage(String message) throws IOException{
        Message ms=new Message(this.mSender,message);
        
        try(ObjectOutputStream outputstream=new ObjectOutputStream(this.soket.getOutputStream())){
        outputstream.writeObject(ms);
        }catch(IOException e){
        e.printStackTrace();}
        
    }
    public void sendPrivateMessage(String message,String recipient) throws IOException{
        PrivateMessage ms=new PrivateMessage(recipient,this.mSender,message);
        
        try(ObjectOutputStream outputstream=new ObjectOutputStream(this.soket.getOutputStream())){
        outputstream.writeObject(ms);
        }catch(IOException e){
            e.printStackTrace();}
        
        
    }
    
        
    
    
    
}
