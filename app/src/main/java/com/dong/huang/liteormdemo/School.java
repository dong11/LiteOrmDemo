package com.dong.huang.liteormdemo;

import java.util.List;

/**
 * Created by dong on 16/4/7.
 */
public class School extends BaseModel{
    private String name;
    private String numNo;
    private List<Student> students;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumNo() {
        return numNo;
    }

    public void setNumNo(String numNo) {
        this.numNo = numNo;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", numNo='" + numNo + '\'' +
                ", students=" + students +
                '}';
    }
}
