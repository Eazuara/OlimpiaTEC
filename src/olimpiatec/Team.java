/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olimpiatec;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author esteb
 */
public class Team {
   private String name;
    private ArrayList<Student> students;
    private ArrayList<Sport> sport;
    public Team(String Name){
        this.name = name;
        this.students = new ArrayList();
    }
    public String getName() {
        return name;
    }
    public boolean addStudent(Student student){
        for(Student temp : this.students) {
            if(temp.getname().equalsIgnoreCase(student.getname())){
                return false;
            }
        }
        this.students.add(student);
        return true;
    }
    public boolean addTeam(Sport sport){
        for(Sport temp : this.sport){
            if(temp.getname().equalsIgnoreCase(sport.getname())){
                return false;
            }
        }
        this.sport.add(sport);
        return true;
    }
      public String getStudents(){
        String list="Students={\n";
        for (Student temp : this.student) {
            list+="\t"+temp.getStudent()+"\n";
        }
        return list;
      }
 

@Override
public String toString(){
     String list="Team="+this.getName()+"\n Members = \n";
        for (Student student : students) {
            list+="\t Name="+student.getname()+",ID="+student.getid()+", Career = "+student.getcarrer()+"\n";
        }
        list += "\t ";
        return list;
    
            
   
}
}

