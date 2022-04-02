public class less3 {

    public static void main(String args[]){

        watchText("Привіт",10);
        watchText("Вай-фай",20);

    }
    public static void watchText(String text, int count){

        for(int i = 0; i < count; i++){
            System.out.println(text);
        }
    }
}
