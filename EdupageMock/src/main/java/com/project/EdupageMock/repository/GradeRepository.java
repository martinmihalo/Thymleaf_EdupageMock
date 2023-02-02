package com.project.EdupageMock.repository;

import java.util.ArrayList;
import java.util.List;

import com.project.EdupageMock.pojo.Grade;

import org.springframework.stereotype.Repository;

@Repository
public class GradeRepository {
    
    private List<Grade> studentGrades = new ArrayList<>();

    public Grade getGrade(int index) {
        return studentGrades.get(index);
    }

    public void addGrade(Grade grade) {
        studentGrades.add(grade);
    }

    public void updateGrade(Grade grade, int index) {
        studentGrades.set(index, grade);
    }
    
    public List<Grade> getGrades() {
        return studentGrades;
    }

}
