package com.example.myadisak;
import android.os.Build;
import androidx.annotation.RequiresApi;

abstract class Note {
    String title;
    String content;
    String createdDate;

    @RequiresApi(api = Build.VERSION_CODES.O)
    public Note(String title, String content) {
        this.title = title;
        this.content = content;
        this.createdDate = java.time.LocalDateTime.now().toString();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public abstract void getSummary();
}