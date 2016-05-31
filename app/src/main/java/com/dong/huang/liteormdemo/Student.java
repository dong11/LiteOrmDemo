package com.dong.huang.liteormdemo;

/**
 * Created by dong on 16/4/7.
 */
public class Student extends BaseModel{
    private String name;
    private String numNo;

    public Student() {
    }

    public Student(String name, String numNo) {
        this.name = name;
        this.numNo = numNo;
    }

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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", numNo='" + numNo + '\'' +
                '}';
    }
}
