import java.util.ArrayList;

public class Student {

     long id;
     String name;
     ArrayList<Integer> grades;

public Student(String name, long id){
     this.name= name;
     this.id=id;
     this.grades = new ArrayList<>();
}

     public long getId() {
          return id;
     }

     public void setId(long id) {
          this.id = id;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public ArrayList<Integer> getGrades() {
          return grades;
     }

     public void updateGrade(int position, int grade) {
          this.grades.set(position, grade);
     }
     public void deleteGrade(int position) {
          this.grades.remove(position);
     }
     public void addGrade(int grade) {
     this.grades.add(grade);
     }

     public double getGradeAverage() {
     int total =0;
     for(int grade: this.grades){
          total+=grade;
     }
     return (double)total/this.grades.size();
     }
}
