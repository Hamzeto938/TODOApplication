package com.pronoy.mukhe.todoapplication.Helper;

/**
 * Created by mukhe on 26-Apr-18.
 * This is the class to Keep all the constants for the App.
 */

public class Constants {
    public static DatabaseController databaseController;
    /**
     * Database Constants.
     */
    static final String DATABASE_NAME = "todoDatabase";
    static final int DATABASE_VERSION = 1;
    /**
     * Table Name Constants.
     */
    public static final String CATEGORY_TABLE_NAME = "Category";
    public static final String TODO_TABLE_NAME = "Todo";
    /**
     * Attribute names constants.
     */
    public static final String CATEGORY_TABLE_ID = "id";
    public static final String CATEGORY_TABLE_DESC = "categoryDesc";
    public static final String TODO_TABLE_ID = "id";
    public static final String TODO_TABLE_TITLE = "title";
    public static final String TODO_TABLE_DESC = "desc";
    public static final String TODO_TABLE_PRIOROTY = "priority";
    public static final String TODO_TABLE_CATEGORYID = "catId";
    public static final String TODO_TABLE_TIME_MILIS = "timeMilis";

    /**
     * Create the Category Table.
     */
    static final String CREATE_CATEGORY_TABLE = "CREATE TABLE " +
            Constants.CATEGORY_TABLE_NAME +
            " ( " + Constants.CATEGORY_TABLE_ID + " INTEGER PRIMARY KEY AUTO_INCREMENT, " +
            Constants.CATEGORY_TABLE_DESC + " varchar(100));";

    /**
     * Create the TO_DO Table.
     */
    static final String CREATE_TODO_TABLE = "CREATE TABLE " + Constants.TODO_TABLE_NAME +
            " ( " + Constants.TODO_TABLE_ID + " INTEGER PRIMARY KEY AUTO_INCREMENT, " +
            Constants.TODO_TABLE_TITLE + " varchar(255), " +
            Constants.TODO_TABLE_DESC + " varchar(500), " +
            Constants.TODO_TABLE_PRIOROTY + " INTEGER, " +
            Constants.TODO_TABLE_CATEGORYID + " INTEGER, " +
            Constants.TODO_TABLE_TIME_MILIS + " varchar(300), " +
            "FOREIGN KEY " + Constants.TODO_TABLE_CATEGORYID + " REFERENCES " +
            Constants.CATEGORY_TABLE_NAME + " (" + Constants.CATEGORY_TABLE_ID + "));";
    /**
     * Drop Table.
     */
    static final String DROP_TABLE_CATEGORY="DROP TABLE "+Constants.CATEGORY_TABLE_NAME;
    static final String DROP_TABLE_TODO="DROP TABLE "+Constants.TODO_TABLE_NAME;
}
