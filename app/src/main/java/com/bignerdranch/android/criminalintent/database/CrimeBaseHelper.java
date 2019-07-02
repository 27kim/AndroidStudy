package com.bignerdranch.android.criminalintent.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.support.annotation.Nullable;

public class CrimeBaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "CrimeBase.db";
    private static final int VERSION = 1;

    public CrimeBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(("create table " + CrimeDbSchema.CrimeTable.NAME + "(" +
                        "_id integer primary key autoincrement, " +
                        CrimeDbSchema.CrimeTable.Cols.UUID + ", " +
                        CrimeDbSchema.CrimeTable.Cols.TITLE + ", " +
                        CrimeDbSchema.CrimeTable.Cols.DATE + ", " +
                        CrimeDbSchema.CrimeTable.Cols.SOLVED + ")"
                )
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}