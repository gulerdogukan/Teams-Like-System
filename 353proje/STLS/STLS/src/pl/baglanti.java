
package pl;


public class baglanti {  
   public String url="jdbc:mysql://localhost:3306/pl";
   public String root="root";
   public String sifre="admin";
   
   public baglanti(){       
   }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
   
       
}
