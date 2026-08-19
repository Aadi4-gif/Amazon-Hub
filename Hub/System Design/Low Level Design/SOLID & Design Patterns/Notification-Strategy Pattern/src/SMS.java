public class SMS extends Notification{
    public SMS(EncryptionStrategy encryptionStrategy, CompressionStrategy compressionStrategy) {
        super(encryptionStrategy, compressionStrategy);
    }

    @Override
    void send() {
        System.out.println("Sending SMS...");
    }
}
