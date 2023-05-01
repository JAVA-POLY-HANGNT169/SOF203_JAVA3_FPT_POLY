/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import config.SQLServerConnection;
import entity.DongVat;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author hangnt
 */
public class DongVatRepository {

    public List<DongVat> getAll() {
        String query = """
                       SELECT id, ma, ten, gioi_tinh,can_nang, khu_vuc_song, nam_sinh
                       FROM sof203_video.dbo.dong_vat;
                       """;
        try (Connection con = SQLServerConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            List<DongVat> listDongVats = new ArrayList<>();
            while (rs.next()) {
                listDongVats.add(new DongVat(rs.getString(1), rs.getString(2), rs.getString(3),
                        rs.getBoolean(4), rs.getInt(5), rs.getString(6), rs.getInt(7)));
            }
            return listDongVats;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean add(DongVat dongVat) {
        String query = """
                       INSERT INTO sof203_video.dbo.dong_vat
                       (ma, ten, can_nang, gioi_tinh, khu_vuc_song, nam_sinh)
                       VALUES(?,?,?,?,?,?);
                       """;
        int check = 0;
        try (Connection con = SQLServerConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, dongVat.getMaDongVat());
            ps.setObject(2, dongVat.getTenDongVat());
            ps.setObject(3, dongVat.getCanNang());
            ps.setObject(4, dongVat.getGioiTinh());
            ps.setObject(5, dongVat.getKhuVucSong());
            ps.setObject(6, dongVat.getNamSinh());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public Boolean update(String id, DongVat dongVat) {
        String query = """
                       UPDATE sof203_video.dbo.dong_vat
                       SET ma = ?, ten = ?, can_nang = ?, gioi_tinh = ?,
                       khu_vuc_song = ?, nam_sinh = ?
                       WHERE id = ?;
                       """;
        int check = 0;
        try (Connection con = SQLServerConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, dongVat.getMaDongVat());
            ps.setObject(2, dongVat.getTenDongVat());
            ps.setObject(3, dongVat.getCanNang());
            ps.setObject(4, dongVat.getGioiTinh());
            ps.setObject(5, dongVat.getKhuVucSong());
            ps.setObject(6, dongVat.getNamSinh());
            ps.setObject(7, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public Boolean delete(String id) {
        String query = """
                       DELETE FROM sof203_video.dbo.dong_vat
                       WHERE id = ?;
                       """;
        int check = 0;
        try (Connection con = SQLServerConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

}
