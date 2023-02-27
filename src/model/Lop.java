/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HangNT
 */
public class Lop {

    private String id;
    private String maLop;
    private String tenLop;
    private int soLuongSV;

    public Lop() {
    }

    public Lop(String id, String maLop, String tenLop, int soLuongSV) {
        this.id = id;
        this.maLop = maLop;
        this.tenLop = tenLop;
        this.soLuongSV = soLuongSV;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public int getSoLuongSV() {
        return soLuongSV;
    }

    public void setSoLuongSV(int soLuongSV) {
        this.soLuongSV = soLuongSV;
    }

    @Override
    public String toString() {
        return "Lop{" + "id=" + id + ", maLop=" + maLop + ", tenLop=" + tenLop + ", soLuongSV=" + soLuongSV + '}';
    }

    public Object[] toDataRow() {
        return new Object[]{maLop, tenLop, soLuongSV};
    }

}
