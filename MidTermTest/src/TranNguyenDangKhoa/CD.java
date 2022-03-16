package TranNguyenDangKhoa;

public class CD {
    private int maCD;
    private String chuoiCD;
    private String caSi;
    private int soBaihat;
    private double giaThanh;

    public CD(int maCD, String chuoiCD, String caSi, int soBaihat, double giaThanh){
        this.maCD = maCD;
        this.chuoiCD = chuoiCD;
        this.caSi = caSi;
        this.soBaihat = soBaihat;
        this.giaThanh = giaThanh;
    }

    public int getMaCD() {
        return maCD;
    }

    public void setMaCD(int maCD) {
        this.maCD = maCD;
    }

    public String getChuoiCD() {
        return chuoiCD;
    }

    public void setChuoiCD(String chuoiCD) {
        this.chuoiCD = chuoiCD;
    }

    public String getCaSi() {
        return caSi;
    }

    public void setCaSi(String caSi) {
        this.caSi = caSi;
    }

    public int getSoBaihat() {
        return soBaihat;
    }

    public void setSoBaihat(int soBaihat) {
        if(soBaihat > 0){
            this.soBaihat = soBaihat;
        }else{
            System.out.println("So bai hat khong hop le! (>0)");
        }
    }

    public double getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(double giaThanh) {
        if(giaThanh > 0){
            this.giaThanh = giaThanh;
        } else {
            System.out.println("Gia thanh khong hop le! (>0)");
        }
    }

    public String toString(){
        String str;
        str = "Ma CD: " + this.maCD + "Chuoi CD: " + this.chuoiCD + "Ca si: " + this.caSi;
        str += "So luong bai hat: " + this.soBaihat + "Gia: " + this.giaThanh;
        return str;
    }

    
}
