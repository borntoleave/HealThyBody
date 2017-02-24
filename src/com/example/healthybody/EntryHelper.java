package com.example.healthybody;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class EntryHelper extends SQLiteOpenHelper {
	
	public static final int DATABASE_VERSION = 1;
	public static final String DATABASE_NAME = "HealThyBody.db";
	
	private static final String TEXT_TYPE = " TEXT";
	private static final String COMMA_SEP = ",";
	
	 private static final String SQL_CREATE_ENTRIES =
		        "CREATE TABLE " + DatabaseClass.DatabaseEntry.TABLE_NAME + " (" +
		        		DatabaseClass.DatabaseEntry.COLUMN_NAME_NAME + TEXT_TYPE + COMMA_SEP +
		        		DatabaseClass.DatabaseEntry.COLUMN_NAME_AGE + TEXT_TYPE + COMMA_SEP +
		        		DatabaseClass.DatabaseEntry.COLUMN_NAME_HEIGHT + TEXT_TYPE + COMMA_SEP +
		        		DatabaseClass.DatabaseEntry.COLUMN_NAME_WEIGHT + TEXT_TYPE + COMMA_SEP +
		        		DatabaseClass.DatabaseEntry.COLUMN_NAME_SCORE + " INTEGER PRIMARY KEY" +
		        " )";

		    private static final String SQL_DELETE_ENTRIES =
		        "DROP TABLE IF EXISTS " + DatabaseClass.DatabaseEntry.TABLE_NAME;
		    
		    
			public EntryHelper(Context context) {
				super(context, DATABASE_NAME, null, DATABASE_VERSION);
			}

			@Override
			public void onCreate(SQLiteDatabase db) {
				db.execSQL(SQL_CREATE_ENTRIES);
				
			}

			@Override
			public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
				db.execSQL(SQL_DELETE_ENTRIES);
				onCreate(db);
				
			}
			
		}


