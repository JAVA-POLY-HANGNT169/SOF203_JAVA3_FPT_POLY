/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author hangnt
 */
public class DongVat {

    private String id;
    private String maDongVat;
    private String tenDongVat;
    private Boolean gioiTinh;
    private Integer canNang;
    private String khuVucSong;
    private Integer namSinh;

    public DongVat() {
    }

    public DongVat(String id, String maDongVat, String tenDongVat, Boolean gioiTinh, Integer canNang, String khuVucSong, Integer namSinh) {
        this.id = id;
        this.maDongVat = maDongVat;
        this.tenDongVat = tenDongVat;
        this.gioiTinh = gioiTinh;
        this.canNang = canNang;
        this.khuVucSong = khuVucSong;
        this.namSinh = namSinh;
    }

    public DongVat(String maDongVat, String tenDongVat, Boolean gioiTinh, Integer canNang, String khuVucSong, Integer namSinh) {
        this.maDongVat = maDongVat;
        this.tenDongVat = tenDongVat;
        this.gioiTinh = gioiTinh;
        this.canNang = canNang;
        this.khuVucSong = khuVucSong;
        this.namSinh = namSinh;
    }

    public String getMaDongVat() {
        return maDongVat;
    }

    public void setMaDongVat(String maDongVat) {
        this.maDongVat = maDongVat;
    }

    public String getTenDongVat() {
        return tenDongVat;
    }

    public void setTenDongVat(String tenDongVat) {
        this.tenDongVat = tenDongVat;
    }

    public Boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Integer getCanNang() {
        return canNang;
    }

    public void setCanNang(Integer canNang) {
        this.canNang = canNang;
    }

    public String getKhuVucSong() {
        return khuVucSong;
    }

    public void setKhuVucSong(String khuVucSong) {
        this.khuVucSong = khuVucSong;
    }

    public Integer getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(Integer namSinh) {
        this.namSinh = namSinh;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    private Integer tinhTuoi(Integer namSinh) {
        return 2023 - namSinh;
    }

    public Object[] toDataRow() {
        return new Object[]{maDongVat, tenDongVat, canNang,
            gioiTinh == true ? "Duc" : "Cai", khuVucSong, tinhTuoi(namSinh)};
    }
}
