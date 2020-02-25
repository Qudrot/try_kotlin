package log;

//A program to display the min, average and max score\\
public class StudentGrade {
    public static void main(String[] args) {
        double[] myArray = {40,50,55,60,56,70,88,50,40,30,35,
                40,60,65,75,80,90,77,39,45,50,20,48,67,55,54,67,20,60,53,39,35,91,94,77,37,50,50,50,50,50,60,67,37,59,58,98,80,81,82,85,87,86,83,75,78,79,70,72,60,69,68,67,64,65,55,54,53,59,25,28,27,30,
                35,37,39,40,56,47,32,34,37,88,85,89,80,81,84,85,90,95,45,65,54,54,68,78,77,73,82};
// Finding the Highest grade
        double highest = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > highest ) highest  = myArray[i];
        }
        System.out.println("Highest  is " + highest );
// Finding the Lowest grade
        double lowest = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] < lowest ) lowest  = myArray[i];
        }
        System.out.println("Lowest  is " + lowest );
// Finding the Average grade
        double total = 0;
        for (int i = 0; i < myArray.length; i++) {
            total += myArray[i];
        }
            for (int i = 0; i < myArray.length; i++) {
            total  /= myArray.length;
        }
        System.out.println("Average  is " + total );

    }
}

