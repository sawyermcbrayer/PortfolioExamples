public class PlayingCats {
    public static boolean isCatPlaying (boolean summer , int temperature){
        if (!summer){
            return temperature <= 35 && temperature >= 25;
        } else return temperature <= 45 && temperature >= 25;
    }
}
