package com.codecool.workbook;

public class CreatePostgresData {

    public void createInitializationData(String [] questionArray, Integer moduleName){
        for (int i = 0; i < questionArray.length; i++) {
            System.out.println("INSERT INTO questions (question, module, is_answered) VALUES (\'" + questionArray[i] + "\', " + moduleName + ", false)" );
        }
    }
}
