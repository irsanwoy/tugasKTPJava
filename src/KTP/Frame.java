package KTP;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame extends JFrame{
    JFrame frame = new JFrame();
    JLabel provinsi = new JLabel();
    JLabel nik = new JLabel();
    JLabel nama = new JLabel();
    JLabel tgl = new JLabel();
    JLabel kelamin = new JLabel();
    JLabel alamat = new JLabel();
    JLabel rt = new JLabel();
    JLabel desa = new JLabel();
    JLabel kecamatan = new JLabel();
    JLabel agama = new JLabel();
    JLabel status = new JLabel();
    JLabel pekerjaan = new JLabel();
    JLabel warga = new JLabel();
    JLabel hingga = new JLabel();
    JLabel gambar = new JLabel();
    ImageIcon pasFoto = new ImageIcon();
    
    String Provinsi = " PROVINSI JAWA BARAT";
    String Nik = "NIK                            :  3171234567890123";
    String Nama = "NAMA                       :  M IRSAN";
    String Tgl = "Tempat/Tgl Lahir     :  CIANJUR , 24-03-2002";
    String Kelamin = "Jenis Kelamin          :  LAKI - LAKI";
    String Alamat = "Alamat                      :  KP.Cinangsi KEC. CIKALONGKULON";
    String Rt = "       RT/RW               :  002/001";
    String Desa = "       Kel/Desa           :  MENTENGSARI";
    String Kecamatan = "       Kecamatan       :  CIKALONGKULON";
    String Agama = "Agama                      :  ISLAM";
    String Status = "Status Perkawinan  :  BELUM MENIKAH";
    String Pekerjaan = "Pekerjaan                 :  MAHASISWA";
    String Warga = "Kewarganegaraan   :  WNI";
    String Hingga = "Berlaku Hingga        :  22-02-22025";
    
    public Frame(){
        pasFoto = new ImageIcon(this.getClass().getResource("fotoBgRed.png"));
        gambar.setIcon(pasFoto);
        gambar.setBounds(450, 2, 400, 400);
        frame.add(gambar);
        
        provinsi.setText(Provinsi);
        provinsi.setHorizontalAlignment(JLabel.CENTER);
        provinsi.setBounds(40, 0, 500, 100);
//        provinsi.setOpaque(true);
        provinsi.setBackground(Color.BLUE);
        frame.add(provinsi);
        
        
        nik.setText(Nik);
        nik.setHorizontalAlignment(JLabel.LEFT);
        nik.setBounds(20, 40, 500, 100);
        nik.setBackground(Color.BLUE);
        frame.add(nik);
        
        nama.setText(Nama);
        nama.setHorizontalAlignment(JLabel.LEFT);
        nama.setBounds(20, 60, 500, 100);
        nama.setBackground(Color.BLUE);
        frame.add(nama);
        
        tgl.setText(Tgl);
        tgl.setHorizontalAlignment(JLabel.LEFT);
        tgl.setBounds(20, 80, 500, 100);
        tgl.setBackground(Color.BLUE);
        frame.add(tgl);
        
        kelamin.setText(Kelamin);
        kelamin.setHorizontalAlignment(JLabel.LEFT);
        kelamin.setBounds(20, 100, 500, 100);
        kelamin.setBackground(Color.BLUE);
        frame.add(kelamin);
        
        alamat.setText(Alamat);
        alamat.setHorizontalAlignment(JLabel.LEFT);
        alamat.setBounds(20, 120, 500, 100);
        alamat.setBackground(Color.BLUE);
        frame.add(alamat);
        
        rt.setText(Rt);
        rt.setHorizontalAlignment(JLabel.LEFT);
        rt.setBounds(20, 140, 500, 100);
        rt.setBackground(Color.BLUE);
        frame.add(rt);
        
        desa.setText(Desa);
        desa.setHorizontalAlignment(JLabel.LEFT);
        desa.setBounds(20, 160, 500, 100);
        desa.setBackground(Color.BLUE);
        frame.add(desa);
        
        kecamatan.setText(Kecamatan);
        kecamatan.setHorizontalAlignment(JLabel.LEFT);
        kecamatan.setBounds(20, 180, 500, 100);
        kecamatan.setBackground(Color.BLUE);
        frame.add(kecamatan);
        
        agama.setText(Agama);
        agama.setHorizontalAlignment(JLabel.LEFT);
        agama.setBounds(20, 200, 500, 100);
        agama.setBackground(Color.BLUE);
        frame.add(agama);
        
        status.setText(Status);
        status.setHorizontalAlignment(JLabel.LEFT);
        status.setBounds(20, 220, 500, 100);
        status.setBackground(Color.BLUE);
        frame.add(status);
        
        pekerjaan.setText(Pekerjaan);
        pekerjaan.setHorizontalAlignment(JLabel.LEFT);
        pekerjaan.setBounds(20, 240, 500, 100);
        pekerjaan.setBackground(Color.BLUE);
        frame.add(pekerjaan);
        
        warga.setText(Warga);
        warga.setHorizontalAlignment(JLabel.LEFT);
        warga.setBounds(20, 260, 500, 100);
        warga.setBackground(Color.BLUE);
        frame.add(warga);
        
        hingga.setText(Hingga);
        hingga.setHorizontalAlignment(JLabel.LEFT);
        hingga.setBounds(20, 280, 500, 100);
        hingga.setBackground(Color.BLUE);
        frame.add(hingga);
        
        setFrame();
    }
    
    public void setFrame(){
        frame.setTitle("KTP");
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.BLUE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setResizable(false);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}


