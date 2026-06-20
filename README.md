StudentAnalyzer ArrayList FRQ Project

Project Title  
StudentAnalyzer – ArrayList FRQ Project

Description of the System  
This project is based on AP Computer Science A FRQ style questions.  
The program uses an ArrayList of Student objects. Each Student has a name and marks.  
The StudentAnalyzer class performs different operations on the list, such as counting, filtering, checking conditions, and analyzing patterns.


Explanation of Algorithms  

Part (a): countAbove  
Traverses the ArrayList and counts students with marks above a given threshold.
Part (b): removeFailing  
Safely removes students with marks below the passing mark using a loop.
Part (c): findTopStudent  
Finds and returns the student with the highest marks.
Part (d): getTopStudents  
Creates a new ArrayList containing students who meet the required threshold without changing the original list.
Part (e): hasDuplicateNames  
Uses nested loops to compare student names and detect duplicates.
Part (f): isSorted  
Checks if the list is sorted in non-decreasing order by comparing adjacent marks.
Part (g): countImprovingPairs  
Counts how many times a student's marks are greater than the student immediately before them.

Sample Output  

Above 70: 5
Top Student: Nia : 95
Top Students >= 80:  
[Zed : 88, Nia : 95, Rex : 81, Tia : 92]
Has Duplicate Names: true
Is Sorted: false
Improving Pairs: 5
After Removing Failing Students:
Bob : 55  
Zed : 88  
Kai : 72  
Nia : 95  
Wai : 67  
Lex : 54  
Rex : 81  
Tia : 92  
Jay : 60  

Challenges Faced  
One challenge was removing elements from an ArrayList without skipping items or causing errors.  
Another challenge was using nested loops correctly to check for duplicate names.  
I also had to make sure the methods worked for any valid dataset instead of hardcoding values.

GitHub  
This repository includes meaningful commits made over time and this README file.

Overall, this project helped me understand how ArrayLists are used in Java and how different traversal techniques can solve common programming problems.
