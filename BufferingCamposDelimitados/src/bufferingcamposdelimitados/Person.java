/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bufferingcamposdelimitados;

/**
 *
 * @author Arles Cerrato
 */
public class Person {

    private String LastName, FirstName, Adress, City, State, ZipCode;

    public Person() {
    }

    public Person(String LastName, String FirstName, String Adress, String City, String State, String ZipCode) {
        this.LastName = LastName;
        this.FirstName = FirstName;
        this.Adress = Adress;
        this.City = City;
        this.State = State;
        this.ZipCode = ZipCode;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String Adress) {
        this.Adress = Adress;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getZipCode() {
        return ZipCode;
    }

    public void setZipCode(String ZipCode) {
        this.ZipCode = ZipCode;
    }

    @Override
    public String toString() {
        return "Person{" + "LastName=" + LastName + ", FirstName=" + FirstName + ", Adress=" + Adress + ", City=" + City + ", State=" + State + ", ZipCode=" + ZipCode + '}';
    }

}
