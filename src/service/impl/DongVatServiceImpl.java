/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import entity.DongVat;
import java.util.ArrayList;
import java.util.List;
import repository.DongVatRepository;
import service.DongVatService;

/**
 *
 * @author hangnt
 */
public class DongVatServiceImpl implements DongVatService {

    private final DongVatRepository dongVatRepository = new DongVatRepository();

    @Override
    public List<DongVat> getAll() {
        return dongVatRepository.getAll();
    }

    @Override
    public String addDongVat(DongVat dongVat) {
        return dongVatRepository.add(dongVat) ? "Add thanh cong" : "Add that bai";
    }

    @Override
    public String updateDongVat(String id, DongVat dongVat) {
        return dongVatRepository.update(id, dongVat) ? "Update thanh cong" : "Update that bai";
    }

    @Override
    public String xoaDongVat(String id) {
        return dongVatRepository.delete(id) ? "Delete thanh cong" : "Delete that bai";
    }

    @Override
    public List<Integer> getAllNamSinh() {
        List<Integer> listNamSinh = new ArrayList<>();
        for (int i = 1990; i < 2016; i++) {
            listNamSinh.add(i);
        }
        return listNamSinh;
    }

}
