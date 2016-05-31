package com.dong.huang.liteormdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.litesuits.orm.LiteOrm;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LiteOrmDBUtil.createDb(this, "liteorm.db");

        School school = new School();
        List<Student> list = new ArrayList<>();
        list.add(new Student("zhangsan", "0000001"));
        list.add(new Student("lisi", "0000002"));
        list.add(new Student("Rex", "0000003"));
        list.add(new Student("xiaoming", "0000004"));
        list.add(new Student("xiaohong", "0000005"));

        school.setName("chaoyang");
        school.setNumNo("00001");
        school.setStudents(list);

        LiteOrmDBUtil.insert(school);


        List<School> scList = LiteOrmDBUtil.getQueryAll(School.class);
        Log.i("MainActivity", "---1-->" + scList);

        School school2 = new School();
        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("zhangsan2", "0000021"));
        list2.add(new Student("lisi2", "0000022"));
        list2.add(new Student("Rex2", "0000023"));
        list2.add(new Student("xiaoming2", "0000024"));
        list2.add(new Student("xiaohong2", "0000025"));

        school2.setName("chaoyang2");
        school2.setNumNo("00021");
        school2.setStudents(list2);

        LiteOrmDBUtil.insert(school2);

        List<School> scList2 = LiteOrmDBUtil.getQueryAll(School.class);
        Log.i("MainActivity", "---2-->" + scList2);

        LiteOrmDBUtil.deleteAll(School.class);
        Log.i("MainActivity", "---3-->" + LiteOrmDBUtil.getQueryAll(School.class));

    }
}
