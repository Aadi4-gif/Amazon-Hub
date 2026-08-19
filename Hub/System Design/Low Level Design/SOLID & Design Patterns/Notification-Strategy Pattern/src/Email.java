public class Email extends Notification{
    public Email(EncryptionStrategy encryptionStrategy, CompressionStrategy compressionStrategy) {
        super(encryptionStrategy, compressionStrategy);
    }

    @Override
    void send() {
        System.out.println("Sending Email...");
    }
}
