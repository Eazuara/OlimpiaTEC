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
public class Student {
    private String name;
    private String id;
    private ArrayList<Sport> sport;
    //////////////
    public Student (String name, String id){
        this.name=name;
        this.id=id;
        this.sport=new ArrayList();
        }
    public String getname (){
        return this.name;
    }
    public String id (){
        return this.id;
    }
    public boolean addSport(Sport sport){
        for(Sport entry : this.sport){
            if(entry.getname().equals(sport.getname())){
                 return false;
                
            }
                this.sport.add(sport);
                return true;
    }
    public boolean removeSport(Sport sport){
        for(Sport entry : this.sport){
            if(entry.getname().equals(sport.getname())){
                 this.sport.remove(entry);
            }
        }
                return false;
    }
     public String getSports() {
        String format=toString()+" Sports=";
        for (Sport entry : this.sport) {
            format+=entry.getname()+",";
        }
        format=format.substring(0, format.length()-1);
        return format;
    }
    @Override
    public String toString(){
        return "Name= " + this.name + " , Id= " + this.id;
         
  
}
}
