package com.example.note_coders_android;

//to create a list of notes
public class Model
{
        String title;
        String description;
        String id;

    public Model(String id, String title, String description)
    {
        this.title = title;
        this.description = description;
        this.id = id;
    }

    //getter and setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
