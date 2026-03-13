package array;


public class ArrayStudent {
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 65, 90};
        int sum = 0;
        for (int score : scores) {
            sum += score;

        }
        System.out.println("총점:"+sum);
        System.out.println("평균:"+(double)sum/scores.length);
    }
}
