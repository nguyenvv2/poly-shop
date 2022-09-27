/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.shop.view;

import com.poly.shop.entity.DanhMuc;
import com.poly.shop.hibernateConfig.HibernateConfig;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author nguyenvv
 */
public class main {
    Session session = HibernateConfig.getFACTORY().openSession();

    public List<DanhMuc> getList() {
        Query q = session.createQuery("From DanhMuc");// truy vấn trên entity(HQL)
        List<DanhMuc> list = q.getResultList();
        for (DanhMuc danhMuc : list) {
            System.out.println(danhMuc.toString());
        }
        return list;
    }
    public static void main(String[] args) {
        new main().getList();
    }
}
