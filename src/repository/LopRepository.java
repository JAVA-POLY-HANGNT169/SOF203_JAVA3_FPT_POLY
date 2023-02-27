/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.List;
import entity.Lop;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import util.DBContext;

/**
 *
 * @author HangNT
 */
public class LopRepository {

    public List<Lop> getAll() {
        String query = "SELECT [id]\n"
                + "      ,[ma_lop]\n"
                + "      ,[ten_lop]\n"
                + "      ,[so_luong_sv]\n"
                + "  FROM [dbo].[lop]";
        try ( Connection con = DBContext.getConnection(); 
                PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            List<Lop> lstLops = new ArrayList<>();
            while (rs.next()) {
                lstLops.add(new Lop(rs.getString(1), rs.getString(2), 
                        rs.getString(3), rs.getInt(4)));
            }
            return lstLops;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Lop getOne(String ma) {
        String query = "SELECT [id]\n"
                + "      ,[ma_lop]\n"
                + "      ,[ten_lop]\n"
                + "      ,[so_luong_sv]\n"
                + "  FROM [dbo].[lop] WHERE ma_lop = ?";
        try ( Connection con = DBContext.getConnection(); 
                PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, ma);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return new Lop(rs.getString(1), rs.getString(2), 
                        rs.getString(3), rs.getInt(4));
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    

    public boolean add(Lop lop) {
        String query = "INSERT INTO lop(ma_lop,ten_lop,so_luong_sv) VALUES (?,?,?)";
        int check = 0;
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, lop.getMaLop());
            ps.setObject(2, lop.getTenLop());
            ps.setObject(3, lop.getSoLuongSV());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean update(Lop lop, String ma) {
        String query = "UPDATE lop SET ten_lop = ?, so_luong_sv = ? WHERE ma_lop = ?";
        int check = 0;
        try ( Connection con = DBContext.getConnection(); 
                PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, lop.getTenLop());
            ps.setObject(2, lop.getSoLuongSV());
            ps.setObject(3, ma);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean delete(String ma) {
        String query = "DELETE FROM lop WHERE ma_lop = ?";
        int check = 0;
        try ( Connection con = DBContext.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, ma);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }
    
}
