package MODEL;

public class SmartTV extends SmartDevice implements Switchable, Connectable  {
    private int channel;
    private int volume;
    private ConnectionType connectionType;

    public SmartTV(String id, String nama, Double daya, int channel, int volume){
        super(id, nama, daya, "Mati");
        this.channel=channel;
        this.volume=volume;
        this.connectionType= ConnectionType.NONE;
    }

    @Override 
    public void turnOn(){
        setStatus("Menyala");
    }
    @Override 
    public void turnOff(){
        setStatus("Mati");
    }
    @Override 
    public void Connect(ConnectionType Type){
        this.connectionType=Type;
    }
    @Override 
    public void disconnect(){
        this.connectionType=ConnectionType.NONE;        
    }

    @Override
    public String getDeviceDetails() {
        return "Smart TV [" + getNama() + "] (ID: " + getId() + ") - Daya: " + getDaya() + 
               "W | Status: " + getStatus() + " | Koneksi: " + connectionType + 
               " | Channel: " + channel + " | Volume: " + volume;
    }
}
