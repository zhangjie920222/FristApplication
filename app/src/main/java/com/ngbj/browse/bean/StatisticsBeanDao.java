package com.ngbj.browse.bean;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "STATISTICS_BEAN".
*/
public class StatisticsBeanDao extends AbstractDao<StatisticsBean, Long> {

    public static final String TABLENAME = "STATISTICS_BEAN";

    /**
     * Properties of entity StatisticsBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Ad_id = new Property(1, String.class, "ad_id", false, "AD_ID");
        public final static Property Date = new Property(2, String.class, "date", false, "DATE");
        public final static Property Is_clicked = new Property(3, boolean.class, "is_clicked", false, "IS_CLICKED");
    };


    public StatisticsBeanDao(DaoConfig config) {
        super(config);
    }
    
    public StatisticsBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"STATISTICS_BEAN\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"AD_ID\" TEXT," + // 1: ad_id
                "\"DATE\" TEXT," + // 2: date
                "\"IS_CLICKED\" INTEGER NOT NULL );"); // 3: is_clicked
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"STATISTICS_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, StatisticsBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String ad_id = entity.getAd_id();
        if (ad_id != null) {
            stmt.bindString(2, ad_id);
        }
 
        String date = entity.getDate();
        if (date != null) {
            stmt.bindString(3, date);
        }
        stmt.bindLong(4, entity.getIs_clicked() ? 1L: 0L);
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, StatisticsBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String ad_id = entity.getAd_id();
        if (ad_id != null) {
            stmt.bindString(2, ad_id);
        }
 
        String date = entity.getDate();
        if (date != null) {
            stmt.bindString(3, date);
        }
        stmt.bindLong(4, entity.getIs_clicked() ? 1L: 0L);
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public StatisticsBean readEntity(Cursor cursor, int offset) {
        StatisticsBean entity = new StatisticsBean( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // ad_id
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // date
            cursor.getShort(offset + 3) != 0 // is_clicked
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, StatisticsBean entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setAd_id(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setDate(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setIs_clicked(cursor.getShort(offset + 3) != 0);
     }
    
    @Override
    protected final Long updateKeyAfterInsert(StatisticsBean entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(StatisticsBean entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}