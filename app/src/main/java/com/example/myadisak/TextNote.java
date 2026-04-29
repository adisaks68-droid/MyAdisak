package com.example.myadisak; // ต้องเป็นบรรทัดแรกและไม่มีตัวอักษรข้างหน้า

import android.os.Build;
import androidx.annotation.RequiresApi;

class TextNote extends Note {
    private String fontStyle;

    @RequiresApi(api = Build.VERSION_CODES.O)
    public TextNote(String title, String content, String fontStyle) {
        super(title, content);
        this.fontStyle = fontStyle;
    }

    public String getFontStyle() {
        return fontStyle;
    }

    public void setFontStyle(String fontStyle) {
        this.fontStyle = fontStyle;
    }

    public void showNote() {
        System.out.println("Title: " + getTitle());
        System.out.println("Content: " + getContent());
        System.out.println("Font Style: " + fontStyle);
        System.out.println("Created Date: " + getCreatedDate());
    }

    @Override
    public void getSummary() {
        System.out.println("Text Note: " + getTitle() + " - " + getContent());
    }
}