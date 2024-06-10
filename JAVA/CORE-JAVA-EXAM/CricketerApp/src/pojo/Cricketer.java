package pojo;

import java.util.Objects;

public class Cricketer {
//    String name,int age,String email_id,String Phone,int rating

    private String name;
    private int age;
    private String email;
    private String phoneNumber;
    private int rating;

    public Cricketer() {

    }

    public Cricketer(String name, int age, String email, String phoneNumber, int rating) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.rating = rating;
    }

    public Cricketer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "pojo.Cricketer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", rating=" + rating +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Cricketer) {
            Cricketer cricketer = (Cricketer) object;
            return this.name == cricketer.name;
        }
        return false;
    }

//    @Override
//    public int hashCode() {
//        return Objects.hashCode(name);
//    }
}
