package ru.job4j.pattern.decorator.service;

public class MainService {
    public static void main(String[] args) {
        Service taro = new Divination("Таро", 1000);
        Service chakra = new Chakra(taro);
        Service aura = new Aura(chakra);
        System.out.println(aura.getPrice());

        Service horoscope = new Horoscope("Персональный гороскоп", 1000);
        Service channenling = new Channeling(horoscope);
        Service avatar = new Avatar(channenling);
        System.out.println(avatar.getPrice());
    }
}
