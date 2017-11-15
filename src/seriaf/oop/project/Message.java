
package seriaf.oop.project;

import java.io.Serializable;


public class Message implements Serializable{
    private String mSender;
    private String mContent;
    private static final long serialversionUID=1L;
    
    public Message(String mSender,String mContent){
        this.mSender=mSender;
        this.mContent=mContent;
    }
    @Override
    public String toString(){
        return this.mSender+": "+this.mContent;}
    
}
