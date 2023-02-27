/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.List;
import entity.Lop;
import repository.LopRepository;
import service.LopService;

/**
 *
 * @author HangNT
 */
public class LopServiceImpl implements LopService {

    private LopRepository LopRepository = new LopRepository();

    @Override
    public List<Lop> getAll() {
        return LopRepository.getAll();
    }

    @Override
    public Lop getOne(String ma) {
        return LopRepository.getOne(ma);
    }

    @Override
    public String add(Lop lop) {
        if (lop.getMaLop().isEmpty()) {
            return "Mã lớp không được trống";
        }
        if (LopRepository.getOne(lop.getMaLop()) != null) {
            return "Mã không được trùng";
        }
        if (lop.getTenLop().isEmpty()) {
            return "Tên lớp không được trống";
        }
        if (LopRepository.add(lop) == true) {
            return "Thêm thành công";
        } else {
            return "Thêm thất bại";
        }
    }

    @Override
    public String update(Lop lop, String ma) {
        if (lop.getMaLop().isEmpty()) {
            return "Mã lớp không được trống";
        }
        if (lop.getTenLop().isEmpty()) {
            return "Tên lớp không được trống";
        }
        if (LopRepository.update(lop, ma) == true) {
            return "Sửa thành công";
        } else {
            return "Sửa thất bại";
        }
    }

    @Override
    public String delete(String ma) {
        if (ma.isEmpty()) {
            return "Mã lớp không được trống";
        }
        if (LopRepository.delete(ma) == true) {
            return "Xoa thành công";
        } else {
            return "Xoá thất bại";
        }
    }
}
