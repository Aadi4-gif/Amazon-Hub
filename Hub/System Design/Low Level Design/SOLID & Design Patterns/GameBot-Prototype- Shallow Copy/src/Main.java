public class Main {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

// Previous System.
//        GameBotCharacters gbc1 = new GameBotCharacters("Bot1", 100, 0);
//        GameBotCharacters gbc2 = new GameBotCharacters("Bot2", 100, 0);
//        GameBotCharacters gbc3 = new GameBotCharacters("Bot3", 100, 0);
//        GameBotCharacters gbc4 = new GameBotCharacters("Bot4", 100, 0);
//        GameBotCharacters gbc5 = new GameBotCharacters("Bot5", 100, 0);


// Issue: All have the same Info
//        GameBotCharacters gbc1 = new GameBotCharacters("Bot1", 100, 0);
//        GameBotCharacters gbc2 = gbc1.customizedClone();
//        GameBotCharacters gbc3 = gbc1.customizedClone();
//        GameBotCharacters gbc4 = gbc1.customizedClone();
//        GameBotCharacters gbc5 = gbc1.customizedClone();


        GameBotCharacters gbc1 = new GameBotCharacters("Bot1", 100, 0);
        GameBotCharacters gbc2 = gbc1.customizedClone();
        gbc2.setName("Bot2");
        GameBotCharacters gbc3 = gbc1.customizedClone();
        gbc3.setName("Bot3");
        GameBotCharacters gbc4 = gbc1.customizedClone();
        gbc4.setName("Bot4");
        GameBotCharacters gbc5 = gbc1.customizedClone();
        gbc5.setName("Bot5");


        System.out.println(gbc1);
        System.out.println(gbc2);
        System.out.println(gbc3);
        System.out.println(gbc4);
        System.out.println(gbc5);



        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
}