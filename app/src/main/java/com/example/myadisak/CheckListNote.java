package com.example.myadisak;

import android.os.Build;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.List;

// เพิ่ม public เพื่อให้คลาสอื่นเรียกใช้งานได้
public class CheckListNote extends Note {
    private List<String> items;
    private List<Boolean> status;

    @RequiresApi(api = Build.VERSION_CODES.O)
    public CheckListNote(String title, String content) {
        super(title, content);
        this.items = new ArrayList<>();
        this.status = new ArrayList<>();
    }

    public List<String> getItems() {
        return items;
    }

    public List<Boolean> getStatus() {
        return status;
    }

    public void addItem(String item) {
        items.add(item);
        status.add(false);
    }

    public void checkItem(int index) {
        if (index >= 0 && index < status.size()) {
            status.set(index, true);
        }
    }

    public void showList() {
        System.out.println("Checklist: " + getTitle());
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". [" + (status.get(i) ? "✓" : " ") + "] " + items.get(i));
        }
    }

    @Override
    public void getSummary() {
        System.out.println("Checklist Note: " + getTitle() + " (" + items.size() + " items)");
    }
}
