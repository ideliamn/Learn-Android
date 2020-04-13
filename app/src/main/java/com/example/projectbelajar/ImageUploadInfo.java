package com.example.projectbelajar;

public class ImageUploadInfo {
    String title;
    String description;
    String image;
    String search;
    String date;
    public ImageUploadInfo() {

    }
    public ImageUploadInfo(String title, String description, String image, String search, String date) {
        this.title = title;
        this.description = description;
        this.image = image;
        this.search = search;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

    public String getSearch() {
        return search;
    }

    public String getDate() {
        return date;
    }
}
