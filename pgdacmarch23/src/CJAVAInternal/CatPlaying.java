package CJAVAInternal;

public class CatPlaying {
	
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer && temperature >= 25 && temperature <= 45) {
            return true;
        } else {
            return !summer && temperature >= 25 && temperature <= 35;
        }
    }
	

    public static void main(String[] args) {
        if (isCatPlaying(true, 40)) {
            System.out.println("cat can play");
        } else {
            System.out.println("cat can't play in the given temperature.");
        }
    }
    
}




