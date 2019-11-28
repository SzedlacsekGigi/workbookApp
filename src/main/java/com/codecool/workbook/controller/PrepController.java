package com.codecool.workbook.controller;

import com.codecool.workbook.model.Question;
import com.codecool.workbook.repository.QuestionRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/prep")
@CrossOrigin
public class PrepController {

    @Autowired
    QuestionRepository questionRepository;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/{module}")
    public List<Question> getAllQuestionsForModule(@PathVariable("module") String module){
        return questionRepository.findAllByModule(module);
    }
}
