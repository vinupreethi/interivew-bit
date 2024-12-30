package org.designpatterns.CreationalDesignPatterns;

public class User {
    String name;
    int id;
    String email;
    String phoneNo;


    public User(UserBuilder userBuilder) {
        this.name = userBuilder.name;
        this.id = userBuilder.id;
        this.email = userBuilder.email;
        this.phoneNo = userBuilder.phoneNo;
    }


    static class UserBuilder {
        String name;
        int id;
        String email;
        String phoneNo;

        UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        UserBuilder setId(int id) {
            this.id = id;
            return this;
        }

        UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        UserBuilder setphoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }

        User build() {
            return new User(this);
        }


    }


}

class Director1 {
    User.UserBuilder userBuilder;

    Director1(User.UserBuilder userBuilder) {
        this.userBuilder = userBuilder;
    }

    public User createStudent() {
        return userBuilder.setEmail("vinuvas321@gmail.com").setId(1).setName("vinu").build();
    }

}