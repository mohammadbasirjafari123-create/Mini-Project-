import java.util.ArrayList;
public class  Miniproject{
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Bob", 55));
        students.add(new Student("Zed", 88));
        students.add(new Student("Kai", 72));
        students.add(new Student("Moe", 43));
        students.add(new Student("Nia", 95));
        students.add(new Student("wai", 67)); // duplicate name
        students.add(new Student("Lex", 54));
        students.add(new Student("Rex", 81));
        students.add(new Student("Tia", 92));
        students.add(new Student("Jay", 60));

        StudentAnalyzer analyzer = new StudentAnalyzer(students);

        System.out.println("Above 70: " + analyzer.countAbove(70));
        System.out.println("Top Student: " + analyzer.findTopStudent());
        System.out.println("Top Students >= 80:");
        System.out.println(analyzer.getTopStudents(80));
        System.out.println("Has Duplicate Names: " + analyzer.hasDuplicateNames());
        System.out.println("Is Sorted: " + analyzer.isSorted());
        System.out.println("Improving Pairs: " + analyzer.countImprovingPairs());
        analyzer.removeFailing(50);
        System.out.println("\nAfter Removing Failing Students:");
        for (Student s : students)
        {
            System.out.println(s);
        }
    }
}

