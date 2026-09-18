package MODEL;

public class SmartSpeaker extends SmartDevice implements Switchable,Connectable {
    private int volume;
    private ConnectionType connectionType;

    public SmartSpeaker(String id, String nama, Double daya, int volume){
        super(id, nama, daya, "Mati");
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
                " | Volume: " + volume;
    }
}
