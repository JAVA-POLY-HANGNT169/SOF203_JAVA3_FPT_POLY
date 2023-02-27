/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author HangNT
 */
public class SinhVien {

    private String id;
    private String chuyenNganhId;
    private String lopId;
    private String maSV;
    private String hoTen;
    private boolean gioiTinh;
    private String email;

    public SinhVien() {
    }

    public SinhVien(String id, String chuyenNganhId, String lopId, String maSV, String hoTen, boolean gioiTinh, String email) {
        this.id = id;
        this.chuyenNganhId = chuyenNganhId;
        this.lopId = lopId;
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getChuyenNganhId() {
        return chuyenNganhId;
    }

    public void setChuyenNganhId(String chuyenNganhId) {
        this.chuyenNganhId = chuyenNganhId;
    }

    public String getLopId() {
        return lopId;
    }

    public void setLopId(String lopId) {
        this.lopId = lopId;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
