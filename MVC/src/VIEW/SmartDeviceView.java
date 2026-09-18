package VIEW;
import MODEL.SmartDevice;
import java.util.List;
import java.util.Scanner;

public class SmartDeviceView {
    private Scanner Scanner;

    public SmartDevice(){

    }
    public void displayMainMenu() {
        System.out.println("\n=== SMART HOME MANAGEMENT ===");
        System.out.println("1. Tambah Perangkat");
        System.out.println("2. Tampilkan Semua Perangkat");
        System.out.println("0. Keluar");
        System.out.print("Pilih menu: ");
    }

    public void displaySubMenuType() {
        System.out.println("\nPilih Jenis Perangkat:");
        System.out.println("1. Smart TV");
        System.out.println("2. Smart Speaker");
        System.out.println("3. Smart Door Lock");
        System.out.print("Pilihan: ");
    }
}
