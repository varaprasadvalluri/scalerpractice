package hacker.test;

import java.util.*;

public class SortExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        List<Student> studentList = new ArrayList<Student>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();
            Student st = new Student(id, fname, cgpa);
            studentList.add(st);
            testCases--;
        }
        Collections.sort(studentList, Comparator.comparing(Student::getCgpa).reversed().
                thenComparing(Student::getFname).thenComparing(Student::getId));
        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}

class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }

//    @Override
//    public int compare(Student s1, Student s2) {
//        if (s1.getCgpa() == s2.getCgpa()) {
//            if (s1.getFname().compareTo(s2.getFname()) == 0) {
//                return s1.getId() - s2.getId();
//            } else {
//                return s1.getFname().compareTo(s2.getFname());
//            }
//        } else {
//            double d = s2.getCgpa() - s1.getCgpa();
//            if (d < 0)
//                return -1;
//            else
//                return 1;
//        }
//    }
}

