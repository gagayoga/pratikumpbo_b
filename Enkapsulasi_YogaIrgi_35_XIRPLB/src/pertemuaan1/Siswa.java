/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuaan1;

import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Siswa {
    
    private String nama;
    private int nilaimath=0;
    private int nilaipa=0;
    private int nilaiingg=0;
    private int nilairata=0;
    private String kelas;
    private String alamat;
    private int umur=0;
    
    private void Datadiri(String nama, int umur, String kelas, String alamat){
        this.nama = nama;
        this.umur = umur;
        this.kelas = kelas;
        this.alamat = alamat;
    }
    private void cetakdata(){
       JOptionPane.showMessageDialog(null," Nama :"+nama+"\n Umur :"+umur+"\nKelas  :"+kelas+"\nAlamat  :"+alamat,"Data Diri Siswa",JOptionPane.INFORMATION_MESSAGE);
    }
    private void nilai(){
        nilaimath = 90;
        nilaipa = 95;
        nilaiingg = 92;
    }
    private void cetaknilai(){
        nilairata = (nilaimath+nilaipa+nilaiingg)/3;
        System.out.print("Data Nilai Siswa SMK NEGERI 5 SURAKARTA");
        System.out.println("\nNilai Matematika      : " + nilaimath );
        System.out.println("Nilai Ipa             : " + nilaipa );
        System.out.println("Nilai English         : " + nilaiingg );
        System.out.println("Nilai Rata-Rata       : " + nilairata );
    }
    public void tampilMenu(){
        while(true){
        int pilihMenu =Integer.parseInt(JOptionPane.showInputDialog(null,"Masukan menu yang anda pilih :\n1.Data Siswa \n2.Data Nilai Siswa"));
        switch (pilihMenu){
            case 1:
            String inputnama = JOptionPane.showInputDialog("Masukan nama  :");
            int inputumur =Integer.parseInt(JOptionPane.showInputDialog("Masukan umur  :"));
            String inputkelas = JOptionPane.showInputDialog("Masukan kelas  :");
            String inputalamat = JOptionPane.showInputDialog("Masukan alamat  :");
            Datadiri(inputnama,inputumur,inputkelas,inputalamat);
            cetakdata();
            break;
            case 2:
            nilai();
            cetaknilai();
            break;
            default :
            JOptionPane.showMessageDialog(null,"Terima Kasih");
        }
    }
}
}
