/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author HangNT
 */
public class ChuyenNganh {

    private String id;
    private String maChuyenNganh;
    private String tenChuyenNganh;

    public ChuyenNganh() {
    }

    public ChuyenNganh(String id, String maChuyenNganh, String tenChuyenNganh) {
        this.id = id;
        this.maChuyenNganh = maChuyenNganh;
        this.tenChuyenNganh = tenChuyenNganh;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaChuyenNganh() {
        return maChuyenNganh;
    }

    public void setMaChuyenNganh(String maChuyenNganh) {
        this.maChuyenNganh = maChuyenNganh;
    }

    public String getTenChuyenNganh() {
        return tenChuyenNganh;
    }

    public void setTenChuyenNganh(String tenChuyenNganh) {
        this.tenChuyenNganh = tenChuyenNganh;
    }

    @Override
    public String toString() {
        return "ChuyenNganh{" + "id=" + id + ", maChuyenNganh=" + maChuyenNganh + ", tenChuyenNganh=" + tenChuyenNganh + '}';
    }

    public Object[] toDataRow() {
        return new Object[]{maChuyenNganh, tenChuyenNganh};
    }
}
