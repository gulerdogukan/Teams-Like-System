package pl;


public class Comment {
    private int idyorumlar;
    private int idpost;
    private int idyorumcu;
    private String yorumcuAdSoyad;
    private String yorum;
    private String tarih;

    public Comment(int idyorumlar, int idpost, int idyorumcu, String yorumcuAdSoyad, String yorum, String tarih) {
        this.idyorumlar = idyorumlar;
        this.idpost = idpost;
        this.idyorumcu = idyorumcu;
        this.yorumcuAdSoyad = yorumcuAdSoyad;
        this.yorum = yorum;
        this.tarih = tarih;
    }

    public int getIdyorumlar() {
        return idyorumlar;
    }

    public void setIdyorumlar(int idyorumlar) {
        this.idyorumlar = idyorumlar;
    }

    public int getIdpost() {
        return idpost;
    }

    public void setIdpost(int idpost) {
        this.idpost = idpost;
    }

    public int getIdyorumcu() {
        return idyorumcu;
    }

    public void setIdyorumcu(int idyorumcu) {
        this.idyorumcu = idyorumcu;
    }

    public String getYorumcuAdSoyad() {
        return yorumcuAdSoyad;
    }

    public void setYorumcuAdSoyad(String yorumcuAdSoyad) {
        this.yorumcuAdSoyad = yorumcuAdSoyad;
    }

    public String getYorum() {
        return yorum;
    }

    public void setYorum(String yorum) {
        this.yorum = yorum;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    @Override
    public String toString() {
        return "Comment{" + "idyorumlar=" + idyorumlar + ", idpost=" + idpost + ", idyorumcu=" + idyorumcu + ", yorumcuAdSoyad=" + yorumcuAdSoyad + ", yorum=" + yorum + ", tarih=" + tarih + '}';
    }
    
    
}
