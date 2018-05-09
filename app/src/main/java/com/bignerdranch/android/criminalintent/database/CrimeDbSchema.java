package com.bignerdranch.android.criminalintent.database;

/**
 * Created by Ben on 7/18/2017.
 */

public class CrimeDbSchema {
    public static final class CrimeTable {
        public static final String NAME = "crimes";

        // E.g. to refer to the column named "title" use CrimeTable.Cols.TITLE
        public static final class Cols {
            public static final String UUID = "uuid";
            public static final String TITLE = "title";
            public static final String DATE = "date";
            public static final String SOLVED = "solved";
            public static final String SUSPECT = "suspect";
        }
    }
}
