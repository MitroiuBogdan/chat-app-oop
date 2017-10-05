
package seriaf.oop.project;


public class Message {
    private String mSender;
    private String mContent;
    
    public Message(String mSender,String mContent){
        this.mSender=mSender;
        this.mContent=mContent;
    }
    public String toString(){
        return this.mSender+": "+this.mContent;}
    
}
