package com.example.android.waitlist.data;

import android.provider.BaseColumns;

public class WaitlistContract {


  // TODO (1) Create an inner class named WaitlistEntry class that implements the BaseColumns interface
  public final static class WaitlistEntry implements BaseColumns {

    // TODO (2) Inside create a static final members for the table name and each of the db columns
    // TABLE_NAME -> waitlist;
    // COLUMN_GUEST_NAME -> guestName
    // COLUMN_PARTY_SIZE -> partySize
    // COLUMN_TIMESTAMP -> timestamp
    private final static String TABLE_NAME = "wailtlist";
    private final static String COLUMN_GUEST_NAME = "guestName";
    private final static String COLUMN_PARTY_SIZE = "partySize";
    private final static String COLUMN_TIMESTAMP = "timestamp";


  }

}
