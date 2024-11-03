package ProgramTunjangan;
/**
 *NAMA : NABE'ELA AYU NING TYAS ZAHRA
 * PRODI : TEKNIK INFORMATIKA
 * NIM       : 23215052
 * Deskripsi Program : Program ini akan menghitung jumlah tunjangan jika seorang karyawan di perusahaan sudah menikah
 */

    import java.util.Scanner;

public class ProgramTunjangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Tampilkan judul program
        System.out.println("============ Program Tunjangan ============");

        // Input gaji pokok
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        double gajiPokok = input.nextDouble();

        // Input status pernikahan
        System.out.print("Status Anda? (Menikah/Belum): ");
        String status = input.next();

        // Deklarasi variabel tunjangan
        double tunjangan = 0;

        // Perhitungan tunjangan berdasarkan status
        if (status.equalsIgnoreCase("Menikah")) {
            tunjangan = 0.35 * gajiPokok;
        } else {
            tunjangan = 0;
        }

        // Hitung total gaji
        double totalGaji = gajiPokok + tunjangan;

        // Tampilkan hasil perhitungan gaji
        System.out.println("\n======== Hasil Perhitungan Gaji Anda ========");
        System.out.println("Gaji Pokok\t\t: Rp " + gajiPokok);
        System.out.println("Tunjangan\t\t: Rp " + tunjangan);
        System.out.println("Total Gaji\t\t: Rp " + totalGaji);

        input.close();
    }
}
