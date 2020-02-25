import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class cos {

    private String Name;
    private int Score;
    private char Grade;

    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\kudirat\\IdeaProjects\\TRY\\src\\log\\data.csv");
        Scanner sc = new Scanner(f);
        String [] students = new String[102];

//        while (sc.hasNextLine()) {
//            System.out.println(sc.nextLine());
//        }

    }

    public cos(String name, int score, char grade) {
        this.Name = name;
        this.Score = score;
        this.Grade = grade;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
        System.out.println("Content of csv file:" + Name);
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int score) {
        Score = score;
    }

    public char getGrade() {
        return Grade;
    }

    public void setGrade(char grade) {
        Grade = grade;
    }
}
