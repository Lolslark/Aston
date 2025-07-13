package Aston.step5.Builder;

import java.util.List;

public class ProgrammerBuilder implements Builder {
    private String firstName;
    private String lastName;
    private int age;
    private List<String> hardSkills;
    private List<String> softSkills;

    @Override
    public void setFirstName(String firtstName) {
        this.firstName = firtstName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void setHardSkills(List<String> hardSkills) {
        this.hardSkills = hardSkills;
    }

    @Override
    public void setSoftSkills(List<String> softSkills) {
        this.softSkills = softSkills;
    }
    public Programmer createProgrammer() {
        return new Programmer(firstName, lastName, age, hardSkills, softSkills);
    }
}
