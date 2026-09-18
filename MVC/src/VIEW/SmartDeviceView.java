package VIEW;

import MODEL.SmartDevice;
import java.util.List;
import java.util.Scanner;

public class SmartDeviceView {
    private Scanner scanner;

    public SmartDeviceView() {
        this.scanner = new Scanner(System.in);
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

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public int getInt() {
        return Util.getInt(scanner);
    }

    public String getString() {
        return Util.getString(scanner);
    }

    public double getDouble() {
        return Util.getDouble(scanner);
    }

    public void showConnectionMenu() {
        System.out.println("1. WIFI");
        System.out.println("2. BLUETOOTH");
        System.out.print("Koneksi: ");
    }

    public void showAllDevices(List<SmartDevice> devices) {
        System.out.println("\n=== DAFTAR SEMUA PERANGKAT ===");
        if (devices.isEmpty()) {
            System.out.println("Belum ada perangkat yang terdaftar.");
        } else {
            for (SmartDevice device : devices) {
                System.out.println(device.getDeviceDetails());
            }
        }
    }

    public void showDeviceAdded(String nama) {
        System.out.println(nama + " berhasil ditambahkan.");
    }

    public void showExit() {
        System.out.println("Terima kasih, program selesai.");
    }

    public void showInvalid() {
        System.out.println("Pilihan tidak valid!");
    }

    public void close() {
        scanner.close();
    }
}