package Ex002Phonebook.Core.MVP;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import Ex002Phonebook.Core.Infrastructure.Phonebook;
import Ex002Phonebook.Core.Models.Contact;

public class Model {

    Phonebook currentBook;
    private int currentIndex;
    private String path;

    public Model(String path) {
        currentBook = new Phonebook();
        currentIndex = 0;
        this.path = path;
    }

    public Contact currentContact() {
        if (currentIndex >= 0) {
            return currentBook.getCotact(currentIndex);
        } else {
            // ???...
            return null;
        }
    }

    public void load() {
        try {
            File file = new File(path);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String fname = reader.readLine();
            while (fname != null) {
                String lname = reader.readLine();
                String description = reader.readLine();
                this.currentBook.add(new Contact(fname, lname, description));
                fname = reader.readLine();
            }
            reader.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void save() {

        try (FileWriter writer = new FileWriter(path, false)) {
            for (int i = 0; i < currentBook.count(); i++) {
                Contact contact = currentBook.getCotact(i);
                writer.append(String.format("%s\n", contact.firstName));
                writer.append(String.format("%s\n", contact.lastName));
                writer.append(String.format("%s\n", contact.description));
            }
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Phonebook currentBook() {
        return this.currentBook;
    }

    public int getCurrentIndex() {
        return this.currentIndex;
    }

    public void setCurrentIndex(int value) {
        this.currentIndex = value;
    }
}