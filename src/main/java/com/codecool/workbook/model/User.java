package com.codecool.workbook.model;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Entity
@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
