package ru.geekbrains.lesson6.core.domain;

import java.util.Date;

public class Note {

    //region Private Fields

    private int id;
    private int userId;
    private String title;
    private String details;
    private Date creationDate;
    private Date editDate;

    //endregion

    //region Public Methods (Properties)

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

    //endregion

    //region Constructors

    public Note (int id, int userId, String title, String details, Date creationDate){
        this.id = id;
        this.title = title;
        this.details = details;
        this.creationDate = creationDate;
        this.userId = userId;
    }

    //endregion


    @Override
    public String toString() {
        return String.format("%d - %s - %s \n", id, title, details);
    }
}
