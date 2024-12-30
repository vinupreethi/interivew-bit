package org.designpatterns.StructuralDesignPatterns.adapter;

public class College implements Student {
    private String name;
    private String email;
    private String phone;

    public College(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPhone() {
        return phone;
    }
}
