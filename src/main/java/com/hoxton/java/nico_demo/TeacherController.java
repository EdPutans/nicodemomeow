package com.hoxton.java.nico_demo;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {

 @GetMapping("/teachers")
  public ArrayList<Teacher> getTeachers() {
      return Teacher.teachers;
    }

  @PostMapping("/teachers")
  public Teacher createTeacher(){
    Teacher newGuy = new Teacher();
    return newGuy;
  }
}
