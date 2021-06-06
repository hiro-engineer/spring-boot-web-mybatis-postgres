package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class SampleController {

    @Autowired
    private SampleRepository sampleRepository;

    @GetMapping("/displayNames")
    public String displayNames() {
        List<String> names = this.sampleRepository.findAllEmployeeNames();
        return names.stream().collect(Collectors.joining(","));
    }
}
