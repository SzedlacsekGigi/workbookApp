package com.codecool.workbook.controller;

import com.codecool.workbook.repository.QuestionRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
@RequestMapping("/prep")
@CrossOrigin
public class PrepController {

    @Autowired
    QuestionRepository questionRepository;

    @Autowired
    RestTemplate restTemplate;
}
