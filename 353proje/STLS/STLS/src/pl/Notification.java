package pl;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Notification {

    private int duyuruID; // notification ID
    private int ogretmenID;
    private String ogretmenAdi;
    private String baslik;
    private String tarih;
    private String aciklama;

    public Notification() {
    }

    public Notification(int duyuruID, int ogretmenID, String ogretmenAdi, String baslik, String tarih, String aciklama) {
        this.duyuruID = duyuruID;
        this.ogretmenID = ogretmenID;
        this.ogretmenAdi = ogretmenAdi;
        this.baslik = baslik;
        this.tarih = tarih;
        this.aciklama = aciklama;
    }

    public int getDuyuruID() {
        return duyuruID;
    }

    public void setDuyuruID(int duyuruID) {
        this.duyuruID = duyuruID;
    }

    public int getOgretmenID() {
        return ogretmenID;
    }

    public void setOgretmenID(int ogretmenID) {
        this.ogretmenID = ogretmenID;
    }

    public String getOgretmenAdi() {
        return ogretmenAdi;
    }

    public void setOgretmenAdi(String ogretmenAdi) {
        this.ogretmenAdi = ogretmenAdi;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    @Override
    public String toString() {
        return "Notification{" + "duyuruID=" + duyuruID + ", ogretmenID=" + ogretmenID + ", ogretmenAdi=" + ogretmenAdi + ", baslik=" + baslik + ", tarih=" + tarih + ", aciklama=" + aciklama + '}';
    }
    
    
}
