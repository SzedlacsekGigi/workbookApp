package com.codecool.workbook.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Singular;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Entity
@Slf4j
@NoArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue
    @NotNull
    private Long id;

    @NotNull
    private String username;

    @NotNull
    private String password;

    @Enumerated
    private Branch branch;

    private String currentModule;

    @ElementCollection
    @Singular
    private List<String> roles;
}
