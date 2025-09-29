import java.util.ArrayList;

public class Dosen 
{
    private String nama;
    private String id;
    private ArrayList<Matkul> matkulAjar;

    public Dosen(String nama, String id) 
    {
        this.nama = nama;
        this.id = id;
        this.matkulAjar = new ArrayList<>();
    }

    public String getNama() 
    {
        return nama;
    }

    public void setNama(String nama) 
    {
        this.nama = nama;
    }

    public String getId() 
    {
        return id;
    }

    public void setId(String id) 
    {
        this.id = id;
    }

    public void ajarMatkul(Matkul m) 
    {
        matkulAjar.add(m);
    }

    public void lihatMatkul() 
    {
        System.out.println("Mata kuliah yang diajar oleh " + nama + ":");
        for (Matkul m : matkulAjar) {
            System.out.println("- " + m.getNama() + " (" + m.getKode() + ")");
        }
    }
}
