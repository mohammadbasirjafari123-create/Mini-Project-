
import java.util.ArrayList;


class StudentAnalyzer
{ private ArrayList<Student> studentList;
    public StudentAnalyzer(ArrayList<Student> list)
    {
        studentList = list;
    }

    // A

    public int countAbove(int threshold) {
        int count = 0;
        for (Student s : studentList)
        {  if (s.getMarks() > threshold)
            {count++;
            }}  return count;
    }
    //  B '

    public void removeFailing(int passMark)
    {int i = 0;
        while (i < studentList.size())
        {  if (studentList.get(i).getMarks() < passMark)
            { studentList.remove(i);
            } else {
                i++;
        }    }   }
    //  C

    public Student findTopStudent() {
        Student top = studentList.get(0);
        for (Student s : studentList)
        {if (s.getMarks() > top.getMarks())
            {top = s;
            } }return top;
    }
    // D

    public ArrayList<Student> getTopStudents(int threshold) {
        ArrayList<Student> result = new ArrayList<Student>();
        for (Student s : studentList)
        {if (s.getMarks() >= threshold)
            {result.add(s);
            }}return result;
    }
    //  E

    public boolean hasDuplicateNames() {
        for (int i = 0; i < studentList.size(); i++)
        {for (int j = i + 1; j < studentList.size(); j++)
            {if (studentList.get(i).getName().equals(studentList.get(j).getName()))
                {return true;
                }}}return false;
    }
    //  F

    public boolean isSorted() {
        for (int i = 0; i < studentList.size() - 1; i++)
        {if (studentList.get(i).getMarks() > studentList.get(i + 1).getMarks())
            {return false;
            }}return true;
    }
    //  G

    public int countImprovingPairs() {
        int count = 0;
        for (int i = 1; i < studentList.size(); i++)
        {if (studentList.get(i).getMarks() > studentList.get(i - 1).getMarks())
            {count++;
            }}
        return count;
    }
}
