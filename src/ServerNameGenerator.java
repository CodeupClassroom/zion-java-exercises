public class ServerNameGenerator {

    static String[] adjectives = {"old","smart","witty","clumsy","plucky"};
    static String[] nouns = {"toenail","banana","panda","fork","toothbrush"};



    static String randomString(String[] words) {
        int ri = (int)(Math.random() * words.length);
        return words[ri];
    }

    public static void main(String[] args) {
        String adjective = randomString(adjectives);
        String noun = randomString(nouns);
        String serverName = adjective + "-" + noun;
        System.out.printf("Here is your server name:%n%s",serverName);
    }

}


