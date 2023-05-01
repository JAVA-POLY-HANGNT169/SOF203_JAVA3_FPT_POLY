/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entity.DongVat;
import java.util.List;

/**
 *
 * @author hangnt
 */
public interface DongVatService {

    List<DongVat> getAll();

    String addDongVat(DongVat dongVat);

    String updateDongVat(String id, DongVat dongVat);

    String xoaDongVat(String id);

    List<Integer> getAllNamSinh();

}
