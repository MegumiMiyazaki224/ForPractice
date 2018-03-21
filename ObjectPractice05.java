public class ObjectPractice05 {
    public static void main(String[] args) {
        Person morita = new Person("森田","奈良");
        Person kimura = new Person("木村","埼玉");
        Person takayama = new Person("高山","東京");
        Person mogi = new Person("茂木","沖縄");

        morita.getSelfIntroduction();
        kimura.getSelfIntroduction();
        takayama.getSelfIntroduction();
        mogi.getSelfIntroduction();
    }
}
