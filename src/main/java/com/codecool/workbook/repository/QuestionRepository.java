package com.codecool.workbook.repository;

import com.codecool.workbook.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
