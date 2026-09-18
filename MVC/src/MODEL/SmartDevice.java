package MODEL;

public abstract class SmartDevice {
    String id;
    String nama;
    int daya;
    String status;

    public SmartDevice(String id, String nama, Double daya2, String statusAwal){
        this.id=id;
        this.nama=nama;
        this.status=statusAwal;
    }
    public String getId() {
        return id;
    }
    public String getNama() {
        return nama;
    }
    public int getDaya() {
        return daya;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    abstract String getDeviceDetails();
}
