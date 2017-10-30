/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bufferingcamposdelimitados;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Arles Cerrato
 */
public class Buffer {

    ArrayList<Person> Persons = new ArrayList();
    File Archive;

    public Buffer() {        
    }

    public void addPerson(Person person) {
        Persons.add(person);
    }

    public void deletePerson(int posicion) {
        Persons.remove(posicion);
    }

    public String writePerson(Person person) {
        String text = "";
        text += person.getLastName() + "|" + person.getFirstName() + "|"
                + person.getAdress() + "|" + person.getCity() + "|"
                + person.getState() + "|" + person.getZipCode() + "|";
        return text;
    }

    public void writePersons() {
        try {
            FileWriter fw = new FileWriter(Archive);
            for (int i = 0; i < Persons.size(); i++) {
                fw.append(writePerson(Persons.get(i)));
            }

            fw.flush();
            fw.close();
        } catch (IOException e) {
            System.out.println("Hubo un error en la escritura.");
        }
    }

    public boolean readPersons() {
        FileReader fr;
        Persons = new ArrayList();
        try {
            fr = new FileReader(Archive);
            int character;
            do {
                char character1;

                String LastName = "";
                do {
                    character = fr.read();
                    if (character == -1) {
                        fr.close();
                        return true;
                    }
                    character1 = (char) character;
                    if (character != 124) {
                        LastName += character1;
                    }
                } while (character != 124);

                String FirstName = "";
                do {
                    character = fr.read();
                    character1 = (char) character;
                    if (character != 124) {
                        FirstName += character1;
                    }
                } while (character != 124);

                String Adress = "";
                do {
                    character = fr.read();
                    character1 = (char) character;
                    if (character != 124) {
                        Adress += character1;
                    }
                } while (character != 124);

                String City = "";
                do {
                    character = fr.read();
                    character1 = (char) character;
                    if (character != 124) {
                        City += character1;
                    }
                } while (character != 124);

                String State = "";
                do {
                    character = fr.read();
                    character1 = (char) character;
                    if (character != 124) {
                        State += character1;
                    }
                } while (character != 124);

                String ZipCode = "";
                do {
                    character = fr.read();
                    character1 = (char) character;
                    if (character != 124) {
                        ZipCode += character1;
                    }
                } while (character != 124);

                Persons.add(new Person(LastName, FirstName,
                        Adress, City, State, ZipCode));

                if (character == -1) {
                    break;
                }
            } while (true);

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al abrir el archivo.");
        }
        return false;
    }

    public ArrayList<Person> getPersons() {
        return Persons;
    }

    public void setPerson(int i, Person person) {
        this.Persons.set(i, person);
    }
    
    public void setPersons(ArrayList<Person> Persons) {
        this.Persons = Persons;
    }

    public File getArchive() {
        return Archive;
    }

    public void setArchive(File Archive) {
        this.Archive = Archive;
    }

}
