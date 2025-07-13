package Aston.step5.Builder;

import java.util.ArrayList;
import java.util.List;

public class Director {
    public Builder junior(Builder builder){
        List<String> hardSkills = new ArrayList<>();
        hardSkills.add("Java core");
        hardSkills.add("Git");
        builder.setHardSkills(hardSkills);
        List<String> softSkills = new ArrayList<>();
        softSkills.add("Коммуникация");
        softSkills.add("Веселый");
        softSkills.add("Обучаемый");
        builder.setSoftSkills(softSkills);
        return builder;
    }
    public Builder middle(Builder builder){
        List<String> hardSkills = new ArrayList<>();
        hardSkills.add("Java EE");
        hardSkills.add("SQL");
        hardSkills.add("Spring Framework");
        builder.setHardSkills(hardSkills);
        List<String> softSkills = new ArrayList<>();
        softSkills.add("Коммуникация");
        softSkills.add("Стрессоустойчивость");
        softSkills.add("Трудолюбивый");
        builder.setSoftSkills(softSkills);
        return builder;
    }
    public Builder senior(Builder builder){
        List<String> hardSkills = new ArrayList<>();
        hardSkills.add("1C");
        hardSkills.add("Java");
        hardSkills.add("Python");
        builder.setHardSkills(hardSkills);
        List<String> softSkills = new ArrayList<>();
        softSkills.add("Организационные навыки");
        softSkills.add("Навык обучения");
        softSkills.add("Веселый");
        builder.setSoftSkills(softSkills);
        return builder;
    }
}
