package com.codecool.workbook.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Builder
@NoArgsConstructor
public class Question {

    @Id
    @GeneratedValue
    @NotNull
    private Long id;

    @NotNull
    private String question;

    @NotNull
    @Enumerated
    private Module module;

    @NotNull
    private boolean isAnswered;

    private String answer;
}
