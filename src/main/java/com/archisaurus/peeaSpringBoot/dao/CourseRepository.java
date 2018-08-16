package com.archisaurus.peeaSpringBoot.dao;

import com.archisaurus.peeaSpringBoot.bean.Course;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends CrudRepository<Course, Long>{

}
