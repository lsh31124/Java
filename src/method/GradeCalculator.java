package method;

public class GradeCalculator {
    public static String getGrade(int score) {
        if (score >= 90) {
            return "A";
        }else if (score >= 80) {
            return "B";
        }else if (score >= 70) {
            return "C";
        }else if (score >= 60) {
            return "D";
        }else{
            return "F";

        }
    }

    public static void main(String[] args) {
        int[] scores ={85, 92, 78, 65, 90};
        for (int score : scores) {
            String grade = getGrade(score);
            System.out.println("점수:" + score + ", 학점: " + grade);

        }

    }
}

