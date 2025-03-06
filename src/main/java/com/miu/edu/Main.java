package com.miu.edu;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        List<Patient> patients = List.of(
                new Patient(122,"Wilhelm","Stewart"),
                new Patient(123,"Williams","Bell"),
                new Patient(124,"Willy","James")
        );
        for (Patient patient : patients) {
            System.out.println(patient);
        }
    }
}