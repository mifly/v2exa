package me.maza.v2exa;

public class Tag {
    private int id;
    private String title;

    public Tag(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
