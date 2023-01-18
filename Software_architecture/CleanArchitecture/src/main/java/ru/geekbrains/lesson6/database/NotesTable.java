package ru.geekbrains.lesson6.database;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class NotesTable {

    private Random random = new Random();
    private Collection<NotesRecord> records;


    public Collection<NotesRecord> getRecords(){
        prepareRecords();
        return records;
    }

    private void prepareRecords(){
        if (records == null){
            records = new ArrayList<>();
            int recordsCount = 5 + random.nextInt(10);
            for (int i = 0; i < recordsCount; i++){
                records.add(new NotesRecord("title #" + i, "details #" + i));
            }
        }
    }

}
