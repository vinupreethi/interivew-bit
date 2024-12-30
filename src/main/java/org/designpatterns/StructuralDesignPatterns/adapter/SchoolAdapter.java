package org.designpatterns.StructuralDesignPatterns.adapter;

public class SchoolAdapter implements Student {
    School school;

    public SchoolAdapter(School school) {
        this.school = school;
    }


    @Override
    public String getName() {
        return this.school.getName();
    }

    @Override
    public String getEmail() {
        return this.school.getEmail();
    }

    @Override
    public String getPhone() {
        return this.school.getPhone();
    }
}
