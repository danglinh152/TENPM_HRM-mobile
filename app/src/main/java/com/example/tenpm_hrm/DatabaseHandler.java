package com.example.tenpm_hrm;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHandler extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    // Database Name
    private static final String DATABASE_NAME = "TenPM_HRM_DB";
    private SQLiteDatabase db;
    private static final String CREATE_TABLE_PHONGBAN =
            "CREATE TABLE PHONGBAN (" +
                    "MAPB INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "TENPB TEXT NOT NULL, " +
                    "NGTHANHLAP TEXT NOT NULL, " +
                    "MATRUONGPHONG INTEGER, " +
                    "NGAYNHANCHUC TEXT " +
                    ");";
    private static final String CREATE_TABLE_NHANVIEN =
            "CREATE TABLE NHANVIEN (" +
                    "MANV INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "HOTEN TEXT NOT NULL, " +
                    "GIOITINH TEXT NOT NULL CHECK (GIOITINH IN ('Nam', 'Nu')), " +
                    "NGSINH TEXT NOT NULL, " +
                    "SDT TEXT NOT NULL UNIQUE, " +
                    "EMAIL TEXT NOT NULL UNIQUE, " +
                    "DIACHI TEXT, " +
                    "CCCD TEXT NOT NULL UNIQUE, " +
                    "CAPBAC TEXT NOT NULL, " +
                    "MAPB INTEGER NOT NULL, " +
                    "FOREIGN KEY (MAPB) REFERENCES PHONGBAN(MAPB)" +
                    ");";

    private static final String CREATE_TABLE_CHAMCONG =
            "CREATE TABLE CHAMCONG (" +
                    "ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "MANV INTEGER NOT NULL, " +
                    "NGAYLAMVIEC TEXT NOT NULL, " +
                    "GIOBATDAU TIME, " +
                    "GIOKETTHUC TIME, " +
                    "TANGCA INTEGER DEFAULT 0 CHECK (TANGCA >= 0), " +
                    "NGHIKHONGPHEP INTEGER DEFAULT 0 CHECK (NGHIKHONGPHEP IN (0, 1)), " +
                    "LYDO NVARCHAR(255), " +
                    "TRANGTHAI NVARCHAR(20),"  +
                    "CONSTRAINT chamcong_fk FOREIGN KEY (MANV) REFERENCES NHANVIEN (MANV)" +
                    ");";
    private static final String CREATE_TABLE_TAIKHOAN =
            "CREATE TABLE TAIKHOAN (" +
                    "MATK INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "MANV INTEGER, " +
                    "TENTK TEXT NOT NULL UNIQUE, " +
                    "MATKHAU TEXT NOT NULL, " +
                    "LOAITAIKHOAN TEXT NOT NULL CHECK (LOAITAIKHOAN IN ('quản lý', 'nhân viên')), " +
                    "FOREIGN KEY (MANV) REFERENCES NHANVIEN(MANV)" +
                    ");";
    private static final String CREATE_TABLE_YEUCAU =
            "CREATE TABLE YEUCAU (" +
                    "MAYC INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "MANV INTEGER, " +
                    "NOIDUNG TEXT, " +
                    "TRANGTHAI INTEGER CHECK (TRANGTHAI IN (0, 1)), " +
                    "FOREIGN KEY (MANV) REFERENCES NHANVIEN(MANV)" +
                    ");";
    private static final String CREATE_TABLE_COSOVATCHAT =
            "CREATE TABLE COSOVATCHAT (" +
                    "MACSVC INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "TENCSVC TEXT NOT NULL, " +
                    "SOLUONG INTEGER NOT NULL CHECK (SOLUONG > 0), " +
                    "NGAYMUA TEXT, " +
                    "TRANGTHAI TEXT NOT NULL CHECK (TRANGTHAI IN ('Sử dụng', 'Hư hỏng', 'Bảo trì')), " +
                    "MAPB INTEGER, " +
                    "FOREIGN KEY (MAPB) REFERENCES PHONGBAN(MAPB)" +
                    ");";
    private static final String CREATE_TABLE_DUAN =
            "CREATE TABLE DUAN (" +
                    "MADA INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "TENDUAN TEXT NOT NULL, " +
                    "NGAYBATDAU TEXT NOT NULL, " +
                    "NGAYKETTHUC TEXT, " +
                    "TRANGTHAI TEXT NOT NULL CHECK (TRANGTHAI IN ('Đang thực hiện', 'Hoàn thành', 'Bị hủy')), " +
                    "MAPB INTEGER, " +
                    "FOREIGN KEY (MAPB) REFERENCES PHONGBAN(MAPB)" +
                    ");";
    private static final String CREATE_TABLE_NHANVIEN_DUAN =
            "CREATE TABLE NHANVIEN_DUAN (" +
                    "MANV INTEGER, " +
                    "MADA INTEGER, " +
                    "VAITRO TEXT NOT NULL, " +
                    "NGAYTHAMGIA TEXT NOT NULL, " +
                    "PRIMARY KEY (MANV, MADA), " +
                    "FOREIGN KEY (MANV) REFERENCES NHANVIEN(MANV), " +
                    "FOREIGN KEY (MADA) REFERENCES DUAN(MADA)" +
                    ");";
    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_PHONGBAN);
        db.execSQL(CREATE_TABLE_NHANVIEN);
        db.execSQL(CREATE_TABLE_TAIKHOAN);
        db.execSQL(CREATE_TABLE_CHAMCONG);
        db.execSQL(CREATE_TABLE_YEUCAU);
        db.execSQL(CREATE_TABLE_COSOVATCHAT);
        db.execSQL(CREATE_TABLE_DUAN);
        db.execSQL(CREATE_TABLE_NHANVIEN_DUAN);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS NHANVIEN_DUAN");
        db.execSQL("DROP TABLE IF EXISTS DUAN");
        db.execSQL("DROP TABLE IF EXISTS COSOVATCHAT");
        db.execSQL("DROP TABLE IF EXISTS YEUCAU");
        db.execSQL("DROP TABLE IF EXISTS CHAMCONG");
        db.execSQL("DROP TABLE IF EXISTS TAIKHOAN");
        db.execSQL("DROP TABLE IF EXISTS NHANVIEN");
        db.execSQL("DROP TABLE IF EXISTS PHONGBAN");
        onCreate(db);
    }
    public void close() {
        db.close();
    }
    public void addDe() {
        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("TENPB", "Phòng Kỹ thuật");
        values.put("NGTHANHLAP", "2024-12-04");
        values.put("MATRUONGPHONG", 1);
        values.put("NGAYNHANCHUC", "2024-12-04");
        long rowId = db.insert("PHONGBAN", null, values);


    }
}
