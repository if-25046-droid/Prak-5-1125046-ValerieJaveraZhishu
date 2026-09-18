package MODEL;

public class SmartDoorLock extends SmartDevice implements Lockable {
    private String pin;

    public SmartDoorLock(String id, String nama, Double daya, String pin) {
        super(id, nama, daya, "Terkunci");
        this.pin = pin;
    }

    @Override
    public void lock() {
        setStatus("Terkunci");
    }

    @Override
    public void unlock() {
        setStatus("Terbuka");
    }

    public String getPin() {
        return pin;
    }
    @Override
    public String getDeviceDetails() {
        return "Smart TV [" + getNama() + "] (ID: " + getId() + ") - Daya: " + getDaya() +
                "W | Status: " + getStatus() + " | Pin: " + pin ;
    }

}
