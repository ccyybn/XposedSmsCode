package com.tianma.xsmscode.data.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.tianma.xsmscode.data.db.entity.DaoMaster;

import org.greenrobot.greendao.database.Database;

public class TSQLiteOpenHelper extends DaoMaster.OpenHelper{

    public TSQLiteOpenHelper(Context context, String name) {
        super(context, name);
    }

    public TSQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory) {
        super(context, name, factory);
    }

    @Override
    public void onUpgrade(Database db, int oldVersion, int newVersion) {
        super.onUpgrade(db, oldVersion, newVersion);
    }
}
