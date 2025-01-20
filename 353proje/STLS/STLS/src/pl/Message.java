package pl;


import java.text.SimpleDateFormat;
import java.util.Date;


public class Message {
    private int messageID;
    private int senderID;
    private String senderEmail;
    private String message;
    private int receiverID;
    private String date;
    
    public Message() {
        
    }

    public Message(int messageID, int senderID, String senderEmail, String message, int receiverID, String date) {
        this.messageID = messageID;
        this.senderID = senderID;
        this.senderEmail = senderEmail;
        this.message = message;
        this.receiverID = receiverID;
        this.date = date;
    }
    

    public int getMessageID() {
        return messageID;
    }

    public void setMessageID(int messageID) {
        this.messageID = messageID;
    }

    public String getSenderEmail() {
        return senderEmail;
    }

    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }
    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getReceiverID() {
        return receiverID;
    }

    public void setReceiverID(int receiverID) {
        this.receiverID = receiverID;
    }

    public int getSenderID() {
        return senderID;
    }

    public void setSenderID(int senderID) {
        this.senderID = senderID;
    }

    public String getDate() {
        return date;
    }

    public void setDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date time=new Date();
       this.date=formatter.format(time);
    }

    @Override
    public String toString() {
        return "messageID=" + messageID + ", message=" + message + ", receiverID=" + receiverID + ", senderID=" + senderID + ", date=" + date;
    }

    
    
    
}
