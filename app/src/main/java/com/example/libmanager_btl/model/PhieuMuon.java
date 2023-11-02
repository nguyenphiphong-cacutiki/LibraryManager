package com.example.libmanager_btl.model;

import java.util.Calendar;
import java.util.Date;

public class PhieuMuon {
    public static final int DA_TRA = 1;
    public static final int CHUA_TRA = 0;
    public static final long HAN_MUON = 14*24*3600*1000;

    private int maPM;
    private String maTT;
    private int maTV;
    private int maSach;
    private Date ngay;
    private int tienThue;
    private int traSach;
    private int soLuong;

    public PhieuMuon() {
    }

    public PhieuMuon(int maPM, String maTT, int maTV, int maSach, Date ngay, int tienThue, int traSach, int soLuong) {
        this.maPM = maPM;
        this.maTT = maTT;
        this.maTV = maTV;
        this.maSach = maSach;
        this.ngay = ngay;
        this.tienThue = tienThue;
        this.traSach = traSach;
        this.soLuong = soLuong;
    }

    public int getMaPM() {
        return maPM;
    }

    public void setMaPM(int maPM) {
        this.maPM = maPM;
    }

    public String getMaTT() {
        return maTT;
    }

    public void setMaTT(String maTT) {
        this.maTT = maTT;
    }

    public int getMaTV() {
        return maTV;
    }

    public void setMaTV(int maTV) {
        this.maTV = maTV;
    }

    public int getMaSach() {
        return maSach;
    }

    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }

    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }

    public int getTienThue() {
        return tienThue;
    }

    public void setTienThue(int tienThue) {
        this.tienThue = tienThue;
    }

    public int getTraSach() {
        return traSach;
    }

    public void setTraSach(int traSach) {
        this.traSach = traSach;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public static boolean isQuaHan(PhieuMuon phieuMuon){
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(phieuMuon.getNgay());
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(new Date());

        return calendar2.getTimeInMillis() - calendar1.getTimeInMillis() > PhieuMuon.HAN_MUON;
    }
}
