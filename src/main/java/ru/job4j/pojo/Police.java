package ru.job4j.pojo;

import java.util.Date;

public class Police {
    public static void main(String[] args) {
        License license = new License();
        license.setOwner("Ruslan Kuzmin");
        license.setModel("Geely");
        license.setCode("РО911M");
        license.setCreated(new Date());

        System.out.println(license.getOwner() + " has a car - "
                + license.getModel() + " : " + license.getCode());
    }
}