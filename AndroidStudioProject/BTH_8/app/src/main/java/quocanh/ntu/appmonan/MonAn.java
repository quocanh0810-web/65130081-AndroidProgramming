package quocanh.ntu.appmonan;

public class MonAn {
    private  String tenMonAn;
    private double donGia;
    private  String moTa;
    private  int idAnhMinhHoa;

    public MonAn(String tenMonAn, int idAnhMinhHoa, String moTa, double donGia) {
        this.tenMonAn = tenMonAn;
        this.idAnhMinhHoa = idAnhMinhHoa;
        this.moTa = moTa;
        this.donGia = donGia;
    }

    // cac getter , setter

    public String getTenMonAn() {
        return tenMonAn;
    }

    public void setTenMonAn(String tenMonAn) {
        this.tenMonAn = tenMonAn;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getIdAnhMinhHoa() {
        return idAnhMinhHoa;
    }

    public void setIdAnhMinhHoa(int idAnhMinhHoa) {
        this.idAnhMinhHoa = idAnhMinhHoa;
    }
}
