package MODEL;

public class SmartTV extends SmartDevice implements Switchable, Connectable {
    private int channel;
    private int volume;
    private ConnectionType connectionType;

    public SmartTV(String id, String nama, Double daya, int channel, int volume, ConnectionType connectionType) {
        super(id, nama, daya, "Mati");
        this.channel = channel;
        this.volume = volume;
        this.connectionType = connectionType;
    }

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }

    public ConnectionType getConnectionType() {
        return connectionType;
    }

    @Override
    public void turnOn() {
        setStatus("Menyala");
    }

    @Override
    public void turnOff() {
        setStatus("Mati");
    }

    @Override
    public void Connect() {
        System.out.println("Smart Tv Berhasil Terhubung");
    }

    @Override
    public void disconnect() {
        System.out.println("Smart Tv Berhasil Tidak Terhubung");
    }

    @Override
    public String getDeviceDetails() {
        return "Smart TV [" + getNama() + "] (ID: " + getId() + ") - Daya: " + getDaya() +
                "W | Status: " + getStatus() + " | Koneksi: " + connectionType +
                " | Channel: " + channel + " | Volume: " + volume;
    }

}
