package com.example.android.waitlist.data;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.android.waitlist.data.WaitlistContract.WaitlistEntry;

// TODO (1) extend the SQLiteOpenHelper class
public class WaitlistDbHelper extends SQLiteOpenHelper {

  // TODO (2) Create a static final String called DATABASE_NAME and set it to "waitlist.db"
  private static final String DATABASE_NAME = "waitlist.db";
  // TODO (3) Create a static final int called DATABASE_VERSION and set it to 1
  private static final int DATABASE_VERSION = 1;


  // TODO (4) Create a Constructor that takes a context and calls the parent constructor
  public WaitlistDbHelper(Context context) {
    super(context, DATABASE_NAME, null, DATABASE_VERSION);
  }


  // TODO (5) Override the onCreate method
  // TODO (6) Inside, create an String query called SQL_CREATE_WAITLIST_TABLE that will create the table
  // TODO (7) Execute the query by calling execSQL on sqLiteDatabase and pass the string query SQL_CREATE_WAITLIST_TABLE
  @Override
  public void onCreate(SQLiteDatabase db) {
    final String SQL_CREATE_WAITLIST_TABLE = "CREATE TABLE"
        + WaitlistEntry.TABLE_NAME + "(" +
        WaitlistEntry._ID +"INTEGER PRIMARY KEY AUTOINCREMENT,"
        +WaitlistEntry.COLUMN_GUEST_NAME + "TEXT NOT NULL,"
        +WaitlistEntry.COLUMN_PARTY_SIZE + "INTEGER NOT NULL,"
        +WaitlistEntry.COLUMN_PARTY_SIZE +" TIMESTAMP DEFAULT CURRENT_TIMESTAMP"
        +");";
    db.execSQL(SQL_CREATE_WAITLIST_TABLE);

  }

  // TODO (8) Override the onUpgrade method

  // TODO (9) Inside, execute a drop table query, and then call onCreate to re-create it
  @Override
  public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    db.execSQL("DROP TABLE IF EXISTS " + WaitlistEntry.TABLE_NAME);
    onCreate(db);
  }


}