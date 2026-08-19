public class Push extends Notification{
    public Push(EncryptionStrategy encryptionStrategy, CompressionStrategy compressionStrategy) {
        super(encryptionStrategy, compressionStrategy);
    }

    @Override
    void send() {
        System.out.println("Pushing...");
    }
}
