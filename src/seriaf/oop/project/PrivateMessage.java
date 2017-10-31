package seriaf.oop.project;




public class PrivateMessage extends Message{
       private String mRecipient;
         
 public PrivateMessage(String mRecipent,String mSender,String mContent){
      super(mSender,mContent);
        this.mRecipient=mRecipent;
        }
@Override
       
 public String toString(){
         return"(priv) "+super.toString();
}
 public String getRecipient(){
      return  this.mRecipient;
 }
 }    
     
