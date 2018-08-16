package com.archisaurus.peeaSpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.archisaurus.peeaSpringBoot.dao.CourseRepository;

@Controller 
public class CourseController { 
  @Autowired 
  private CourseRepository courseRepository; 
 
  @RequestMapping("/courses") 
  public String getCourses(Model model) { 
    model.addAttribute("courses", courseRepository.findAll()); 
    return "courses"; 
  } 
} 