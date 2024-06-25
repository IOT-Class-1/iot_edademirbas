package com.edademirbas.examples;

public class Engineer extends Employee{ //Mühendis sınıf miras alıyor.Personel sınıfından
    public Engineer(String name, double salary, int age) {
        super(name, salary, age);
        // İsim, maaş ve yaş bilgilerini
        // Personel sınıfından miras aldığı için "super" anahtar kelimesi ile çağırıyoruz.
    }
    public double getAnnualBonus(){
        return super.salary*.05;
    }
}
