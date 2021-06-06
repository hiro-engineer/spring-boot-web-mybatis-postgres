package com.example.demo;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SampleRepository {
    @Select("SELECT name FROM employee;")
    List<String> findAllEmployeeNames();
}
