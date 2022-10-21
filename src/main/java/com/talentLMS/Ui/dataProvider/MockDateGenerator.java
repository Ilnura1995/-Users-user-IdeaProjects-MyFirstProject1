package com.talentLMS.Ui.dataProvider;

import com.github.javafaker.Faker;


public class MockDateGenerator {

    private static final Faker faker = new Faker();

    public static String generateMockFirstName(){
        return faker.name().firstName();
    }

    public static String generateMockLastName(){
        return faker.name().lastName();
    }

    public static String generateMockEmail(){
        return faker.internet().emailAddress();
    }

    public static String generateMockUserName(){
        return faker.name().username();
    }
    public static String generateMockPassword(){
        return faker.internet().password(8,10,true,true);
    }
    public static String generateMockBio(){
        return faker.internet().userAgentAny();
    }
}
