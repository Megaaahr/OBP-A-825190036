public class Data extends KartuKeluarga{
    private String name;
    private int nik;
    private String tempatLahir;
    private String tanggalLahir;
    private String jenisKelamin;
    private String agama;
    private String statuspernikahan;

    public Data(int noKK,String name, int nik, String jenisKelamin, String agama, String tempatLahir, String tanggalLahir, String statuspernikahan) {
        super(noKK);
        this.name = name;
        this.nik = nik;
        this.jenisKelamin = jenisKelamin;
        this.agama = agama;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.statuspernikahan = statuspernikahan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNik() {
        return nik;
    }

    public void setNik(int nik) {
        this.nik = nik;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getStatuspernikahan() {
        return statuspernikahan;
    }

    public void setStatuspernikahan(String statuspernikahan) {
        this.statuspernikahan = statuspernikahan;
    }

    @Override
    public String toString() {
        return "Data:" +
                "\nNama = " + name + '\n' +
                "NIK = " + nik + '\n' +
                "Tempat Lahir = " + tempatLahir + '\n' +
                "Tanggal Lahir = " + tanggalLahir + '\n' +
                "Jenis Kelamin = " + jenisKelamin + '\n' +
                "Agama = " + agama + '\n' +
                "Status Pernikahan = " + statuspernikahan + '\n';
    }
}
