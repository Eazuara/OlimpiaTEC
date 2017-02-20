/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olimpiatec;

import java.util.ArrayList;

/**
 *
 * @author esteb
 */
public class Sport {
  public class Sports {
    private String name;
    private ArrayList<Student> student;
    
    public Sports(String name){
        this.name=name;
        this.student=new ArrayList();
    }
    public String getname() {
        return name;
    }
    public boolean addStudent(Student student){
        for(Student entry : this.student) {
            if(entry.getname.equals(student.getname())){
                return false;
            }
        }
        this.student.add(student);
        student.addSport(this);
        return true;
    }
    public boolean removeStudent(Student student){
        for(Student entry : this.student) {
            if(entry.getname().equalsIgnoreCase(student.getname())){
                student.remove(entry);
                return true;
            }
        } return false;
    }
    @Override
    public String toString(){
        String string="Sport="+this.getname()+"\nAttendees={\n";
        for (Student student : student) {
            string+="\t Name="+student.getname()+",ID="+student.getid()+"\n";
        }
       
        return string;
    }
}