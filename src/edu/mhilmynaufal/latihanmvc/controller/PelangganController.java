/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mhilmynaufal.latihanmvc.controller;

import edu.mhilmynaufal.latihanmvc.model.PelangganModel;
import edu.mhilmynaufal.latihanmvc.view.PelangganView;
import javax.swing.JOptionPane;

/**
 * @author
 *  Nama              : M. Hilmy Naufal
 *  Kelas             : IF2
 *  NIM               : 10118046
 */
public class PelangganController {
    
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    public void resetForm(PelangganView view) {
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String notelp = view.getTxtNoTelp().getText();
        
        
        if (nama.equals("") && email.equals("") && notelp.equals("")) {
            
        } else {
            model.resetForm();
        }
    }
    
    public void simpanForm(PelangganView view) {
        
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String notelp = view.getTxtNoTelp().getText();
    
        if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama Masih Kosong");    
        } else if (email.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Email Masih Kosong");
        } else if (notelp.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "No Telepon Masih Kosong");
        } else {
            model.simpanForm();
        }
    }
    
}
