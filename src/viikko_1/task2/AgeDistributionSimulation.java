package viikko_1.task2;

/*
    Let's say you are making a statistic about the age structure of students in the TVT22-O group.
    After that, you should draw 1000 age values and
    these should be distributed in the same way as the ages of the students in the group are distributed.
    How do you work? State the algorithm so precisely that it can be directly programmed.
    Take an idea/model from the examples on pages 18 and 19 of the 02_Three-phase simulation slide series.
*/


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    private final String name;
    private final int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int compareTo(Student st) {
        if (age == st.age)
            return 0;
        else if (age > st.age)
            return 1;
        else
            return -1;
    }

    public String toString() {
        return name;
    }
}

public class AgeDistributionSimulation {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Student1", 20));
        studentList.add(new Student("Student2", 21));
        studentList.add(new Student("Student3", 22));
        studentList.add(new Student("Student4", 23));
        studentList.add(new Student("Student5", 24));
        studentList.add(new Student("Student6", 25));
        studentList.add(new Student("Student7", 26));
        studentList.add(new Student("Student8", 27));
        studentList.add(new Student("Student9", 28));
        studentList.add(new Student("Student10", 29));


        // Sort the students based on their ages
        Collections.sort(studentList);

        int numSamples = 1000;
        for (int i = 0; i < numSamples; i++) {
            // Generate a random index within the sorted student list
            int randomIndex = (int) (Math.random() * studentList.size());
            Student sampledStudent = studentList.get(randomIndex);
            System.out.println("Sampled Student " + (i + 1) + ": " + sampledStudent);
        }
    }
}
