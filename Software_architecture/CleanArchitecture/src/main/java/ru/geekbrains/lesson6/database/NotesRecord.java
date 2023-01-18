package ru.geekbrains.lesson6.database;

import java.util.Date;

public class NotesRecord {

    private static int counter;
    private int userId;
    private int id;
    private String title;
    private String details;
    private Date creationDate;
    private Date editDate;

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public String getTitle() {
        return title;
    }

    public String getDetails() {
        return details;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Date getEditDate() {
        return editDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setEditDate(Date editDate) {
        this.editDate = editDate;
    }

    {
        id = ++counter;
        userId = 20001;
    }

    public NotesRecord(String title, String details){
        this.title = title;
        this.details = details;
        creationDate = new Date();
    }
}
