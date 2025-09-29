import java.util.ArrayList;

public class Mahasiswa 
{
    private String nama;
    private String nrp;
    private String tanggalLahir;
    private ArrayList<Matkul> daftarMatkul;

    public Mahasiswa(String nama, String nrp, String tanggalLahir) 
    {
        this.nama = nama;
        this.nrp = nrp;
        this.tanggalLahir = tanggalLahir;
        this.daftarMatkul = new ArrayList<>();
    }

    public String getNama() 
    {
        return nama;
    }

    public void setNama(String nama) 
    {
        this.nama = nama;
    }

    public String getNrp() 
    {
        return nrp;
    }

    public void setNrp(String nrp) 
    {
        this.nrp = nrp;
    }

    public void ambilMatkul(Matkul m) 
    {
        daftarMatkul.add(m);
    }

    public void lihatKRS() 
    {
        System.out.println("Mata kuliah yang diambil " + nama + ":");
        for (Matkul m : daftarMatkul) 
        {
            System.out.println("- " + m.getNama() + " (" + m.getKode() + ")");
        }
    }
}
