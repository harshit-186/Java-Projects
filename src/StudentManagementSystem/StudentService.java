package StudentManagementSystem;

import java.util.List;
import java.util.Map;

public class StudentService {
    private List<Student> stList;
    private Map<Integer,Student> stMap;

    public void addStudent(int roll , String name){
        if(stMap.containsKey(roll)){
            System.out.println("Student roll : "+roll+" already present!");
            return;
        }
        Student s = new Student(roll ,name);
        stMap.put(roll,s);
        stList.add(s);
        System.out.println("Student with roll : "+roll+" added successfully");
    }

    public void removeStudent(int roll){
        Student s = stMap.get(roll);
        if(s==null){
            System.out.println("Student roll : "+roll+" not Found!");
            return;
        }
        stMap.remove(roll);
        stList.remove(s);
        System.out.println("Student roll : "+roll+" removed successfully");
    }
    public void viewAllStudent(){
        if(stMap.isEmpty()){
            System.out.println("No records found!");
            return;
        }
        System.out.println("Displaying.....");
        for(Student s : stList){
            System.out.println(s);
        }
    }

    public void searchStudentById(int roll){
        Student s = stMap.get(roll);
        if(s==null){
            System.out.println("Student roll : "+roll+" not Found!");
            return;
        }
        System.out.println(s);
    }

    public void enrollStudentInCourse(int roll , String course){
       Student s = stMap.get(roll);
       if(s==null){
           System.out.println("Student Roll is Not found");
           return;
       } else if (s.enrollCourse(course)) {
           System.out.println("Student roll : "+roll+" course enrolled successfully in "+course);
       }
       else{
           System.out.println("Student roll : "+roll+" already enrolled in "+course);
       }
    }
}
