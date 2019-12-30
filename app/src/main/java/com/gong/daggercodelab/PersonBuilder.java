package com.gong.daggercodelab;

import android.app.Person;

public class PersonBuilder {
    private String name;
    private Integer age;
    private String address;
    private String phoneNumber;
    private Integer height;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setAge(Integer age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public PersonBuilder setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public PersonBuilder setHeight(Integer height){
        this.height = height;
        return this;
    }

    public PersonInfo build() {
        PersonInfo personInfo = new PersonInfo(name, age, address, phoneNumber, height);
        return personInfo;
    }

    class PersonInfo {
        String name;
        Integer age;
        String address;
        String phoneNumber;
        Integer height;

        public PersonInfo(String name , Integer age ,String address , String phoneNumber , Integer height) {
            this.name = name;
            this.age = age;
            this.address = address;
            this.phoneNumber = phoneNumber;
            this.height = height;
        }
    }

    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder();
        personBuilder.setAddress("a")
                .setAge(1)
                .setName("gong");
    }
}
