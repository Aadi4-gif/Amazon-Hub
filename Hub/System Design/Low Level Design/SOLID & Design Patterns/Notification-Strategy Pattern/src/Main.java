public class Main {
    public static void  main(String[] args){

Notification Email = new Email(new AESEncryption(), new ZIP());
Email.encrypt();
Email.compress();
Email.send();

Notification SMS = new SMS(new AESEncryption(), new GZIP());
SMS.encrypt();
SMS.compress();
SMS.send();

Notification Push = new Push(new RSAEncryption(), new ZIP());
Push.encrypt();
Push.compress();
Push.send();
    }
    
}