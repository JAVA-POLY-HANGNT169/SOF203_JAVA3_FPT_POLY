/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import entity.Lop;

/**
 *
 * @author HangNT
 */
public interface LopService {

    List<Lop> getAll();

    Lop getOne(String ma);

    String add(Lop lop);

    String update(Lop lop, String ma);

    String delete(String ma);
    
}
