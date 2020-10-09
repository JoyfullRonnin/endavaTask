package com.company;


 import java.util.Scanner;



  class timeStamp{
     int day,month,year;


     public timeStamp(int day, int month, int year) {
       setDay(day);
       setMonth(month);
       setYear(year);
     }

     public void setDay(int day) {
         if(day < 32 && day > 0)
         this.day = day;
      else{
          System.out.println("Wrong day");
            System.exit(0);
     }
     }

     public void setMonth(int month) {
         if(month < 13 && month > 0)
         this.month = month;
         else{
             System.out.println("Wrong month");
             System.exit(0);
     }
     }

     public void setYear(int year) {
         if (year < 2021 && year > 1999)
         this.year = year;
         else{
             System.out.println("Wrong year");
             System.exit(0);
     }
     }

     public int getDay() {
         return day;
     }

     public int getMonth() {
         return month;
     }

     public int getYear() {
         return year;
     }
     public String toString(){//overriding the toString() method
         return day+"/"+month+"/"+year;
     }

 }




public class User {
     String firstname;
     String lastname;
     int age;
     String email;
     String status;
     timeStamp timeStamp;
     Scanner scan = new Scanner(System.in);




    public User(String firstname, String lastname, int age, String email, int status, int day ,int month,int year)
    {
        setFirstname(firstname);
        setLastname(lastname);
        setAge(age);
        setEmail(email);
        setStatus(status);
        setTimeStamp(day,month,year);

    }



    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStatus(int status) {
        switch (status){
            case 0: this.status = "NEW";break;
            case 1: this.status = "ACTIVE";break;
            case 2: this.status = "INACTIVE";break;
            case 3: this.status = "BLOCKED";break;
            default:/*System.out.println("Wrong status");*/
                throw new IllegalStateException("Wrong status " + status);
        }
    }

    public void setTimeStamp(int day,int month ,int year) {

                timeStamp = new timeStamp(day, month, year);

        }



    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getStatus() {
        return status;
    }

    public void getTimeStamp() {
        System.out.println(timeStamp);
    }


    public String toString(){//overriding the toString() method
        return firstname+" "+lastname+" "+age+" "+email+" "+status+" "+timeStamp;
    }




}

