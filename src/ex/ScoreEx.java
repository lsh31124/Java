package ex;

public class ScoreEx {
    public static void main(String[] args) {
        int score = 80;

        if (score >= 90) {
            System.out.println("학점은 A");
        } else if (score >= 85) {
            System.out.println("학점은 B");
        }else if (score >= 75) {
            System.out.println("학점은 C");
        }else if (score >= 65) {
            System.out.println("학점은 D");
        }else {
            System.out.println("학점은 F");
        }
    }
}
