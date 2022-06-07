package com.hoxton.java.nico_demo;

import java.util.ArrayList;

public class Teacher {
  public String name;
  // TODO: Number vs Integer? 😅
  public Number age;
  public Number yearOfBirth;
  public Boolean isNico;

  // TODO: find out the diff between ArrayList vs Collection vs List; 🤮
  public static ArrayList<Teacher> teachers = new ArrayList<Teacher>();
  
  // Remember, can be static or nah
  static {
    new Teacher("Dick", 22, false);
  }


  public Teacher(String name, Number age, Boolean isNico) {
    this.name = name;
    this.age = age;
    this.isNico = isNico;
    teachers.add(this);
  } 

  // This is called an overload. 😏
  public Teacher (){
    this.name = "Henlo";
    this.age = 22;
    this.isNico = false;
    teachers.add(this);
  }  
}
