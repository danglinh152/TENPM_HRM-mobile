package com.example.tenpm_hrm.attendance;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.example.tenpm_hrm.DatabaseHandler;
import models.Attendance;

public class AttendanceDbAdapter {
    private static final int DATABASE_VERSION = 1;
    // Database Name
    private static final String DATABASE_NAME = "TenPM_HRM_DB";
    // Contacts table name
    private static final String TABLE_ATTENDANCE = "CHAMCONG";
    private final Context context;
    private DatabaseHandler dbHelper;
    private SQLiteDatabase db;

    public AttendanceDbAdapter(Context context) {
        this.context = context;
    }
    public long insertCheckIn(Attendance attendance) {
        dbHelper = new DatabaseHandler(context);
        db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("NGAYLAMVIEC", attendance.getWorkDate());
        values.put("MANV", attendance.getEmployeeId());
        values.put("GIOBATDAU", attendance.getCheckinTime());
        values.put("TRANGTHAI", attendance.getStatus());
        long id = db.insert(TABLE_ATTENDANCE, null, values);
        db.close();
        return id;
    }

    public Attendance getAttendance(int employeeId, String workDate){
        dbHelper = new DatabaseHandler(context);
        db = dbHelper.getWritableDatabase();
        String queryString = "SELECT * FROM " + TABLE_ATTENDANCE + " WHERE MANV = ? AND NGAYLAMVIEC = ?";
        String[] whereArgs  = { String.valueOf(employeeId),  workDate};
        Cursor cursor = db.rawQuery(queryString, whereArgs);
        if (cursor == null) return null;
        Attendance attendance = new Attendance();
        while (cursor.moveToNext()){
            attendance.setId(Integer.parseInt(cursor.getString(0)));
            attendance.setEmployeeId(Integer.parseInt(cursor.getString(1)));
            attendance.setWorkDate(cursor.getString(2));
            attendance.setCheckinTime(cursor.getString(3));
            attendance.setStatus(cursor.getString(5));
        }
        return attendance;
    }
}
