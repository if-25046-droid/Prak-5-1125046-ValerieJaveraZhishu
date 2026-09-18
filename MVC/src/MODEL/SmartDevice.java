package MODEL;

public abstract class SmartDevice {
    String id;
    String nama;
    double daya;
    String status;

    public SmartDevice(String id, String nama, double daya, String statusAwal){
        this.id=id;
        this.nama=nama;
        this.daya=daya;
        this.status=statusAwal;
    }
    public String getId() {
        return id;
    }
    public String getNama() {
        return nama;
    }
    public double getDaya() {
        return daya;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public abstract String getDeviceDetails();
}
