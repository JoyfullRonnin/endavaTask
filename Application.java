package com.company;

import java.util.ArrayList;


public class Application {

    public static void main(String[] args) {
        timeStamp todayDate = new timeStamp(8, 10, 2020);
        int nowday, nowmonth, nowyear;
        nowday = todayDate.getDay();
        nowmonth = todayDate.getMonth();
        nowyear = todayDate.getYear();
        int nowDays = (nowyear * 365) + (nowmonth * 30) + nowday;

        ArrayList<User> Users = setUserList();

        getUserList(Users);

        Users = StatusToNew(nowDays, Users);
        Users = StatusToBLocked(nowDays, Users);

        getUserList(Users);

    }


    public static ArrayList setUserList() {
        ArrayList<User> List = new ArrayList<User>();

        List.add(new User("Afan", "Gheorghe", 20, "af.gherghe1201@gmail.com", 2, 20, 11, 2005));
        List.add(new User("Mitu", "Nicolae", 24, "mi.ni3212@protomail.com", 1, 20, 11, 2001));
        List.add(new User("Ciorescu", "Vladislav", 30, "danger.boy229@gmail.com", 2, 1, 10, 2012));
        List.add(new User("Popin", "Nadejda", 19, "srikaka@mail.ru", 1, 20, 11, 2003));
        List.add(new User("Minascurta", "Alexandra", 18, "minexa.superpuper@gmail.com", 0, 4, 10, 2020));
        List.add(new User("Ganita", "Vadim", 31, "vadim.ganita@mail.ru", 2, 20, 11, 2018));
        List.add(new User("Gandraburca", "Sergiu", 42, "sergiu1992@mail.ru", 1, 20, 11, 2007));
        List.add(new User("Crutoi", "Vlada", 21, "secondsoul@protomail.com", 2, 11, 9, 2020));
        List.add(new User("Botgros", "Ana-Maria", 56, "mariutsa230@gmail.com", 0, 2, 10, 2020));
        List.add(new User("Sochirca", "Elena", 45, "my.mailismine@mail.ru", 1, 20, 11, 2001));

        return List;

    }


    public static void getUserList(ArrayList List) {
        int i;
        int size;

        size = List.size();
        System.out.println();
        for (i = 0; i < size; i++) {
            System.out.println(List.get(i));
        }
        System.out.println();


    }

    public static ArrayList StatusToNew(int nowDays, ArrayList List)
    {
        int uday, umonth, uyear;
        int i;
        int size;
        size = List.size();
        ArrayList<User> User = List;

        for (i = 0; i < size; i++) {
            uday = User.get(i).timeStamp.getDay();
            umonth = User.get(i).timeStamp.getMonth();
            uyear = User.get(i).timeStamp.getYear();
            int days = (uyear * 365) + (umonth * 30) + uday;
            int diff = nowDays - days;

            if (User.get(i).getStatus() == "NEW") {
                if (diff > 0)
                    User.get(i).setStatus(1);
            }

        }
        return User;

    }

    public static ArrayList StatusToBLocked(int nowDays, ArrayList List)
    {
        int uday, umonth, uyear;
        int i;
        int size;

        size = List.size();
        ArrayList<User> User = List;

        for (i = 0; i < size; i++) {
            uday = User.get(i).timeStamp.getDay();
            umonth = User.get(i).timeStamp.getMonth();
            uyear = User.get(i).timeStamp.getYear();
            int days = (uyear * 365) + (umonth * 30) + uday;
            int diff = nowDays - days;

            if (User.get(i).getStatus() == "INACTIVE") {
                if (diff > 30)
                    User.get(i).setStatus(3);
            }

        }
        return User;
    }
}