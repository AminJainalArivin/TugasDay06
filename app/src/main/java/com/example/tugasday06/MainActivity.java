 package com.example.tugasday06;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

 public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private  AdapterBuah adapterBuah;
    private ArrayList<NamaBarang> namaBarang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();

        recyclerView = findViewById(R.id.recycleview);
        adapterBuah = new AdapterBuah(namaBarang);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapterBuah);
    }

     private void getData() {
        namaBarang = new ArrayList<>();
        namaBarang.add(new NamaBarang("Cat Tembok Nippon Paint Spot-less","\n>SPOT-LESS adalah cat premium yang diformulasikan untuk pemakaian interior \n >Keunggulan SPOT-LESS adalah mudah dibersihkan dan water resistant \n>SPOT-LESS cocok untuk dekorasi dan melindungi permukaan dinding yang terbuat dari semen, plester, batu bata dan dinding fiber \n> daya tahan: 5-10 Tahun", "Rp. 80.000.00.," ,R.drawable.tembok)) ;
        namaBarang.add(new NamaBarang("Cat Tembok Dulux Catylac", "\n>Dulux Catylac Interior dengan formulai Chroma Brite Technology untuk warna dinding cerah menakjubkan lebih lama \n>Waktu Pengeringan 1-2 jam \n>Hasil akhir: Matt \n>Daya tahan:5-10 tahun", "Rp. 80.000.00.," ,R.drawable.tembokk));
        namaBarang.add(new NamaBarang("Cat Tembok Dulux Easy Clean","\n>ulux EasyClean adalah cat tembok berkualitas tinggi untuk interior \n>berbahan dasar air dengan KidProof TechnologyTM \n>Waktu pengeringan 1-2 jam \n>Hasil akhir: Mid Sheen","Rp. 80.000.00.,", R.drawable.tembokkk));
        namaBarang.add(new NamaBarang("Cat Tembok Avitex","\n>Avitex Cat Tembok adalah cat tembok interior berbahan dasar resin terbaik (styrene acrylic emulsion) \n>Diproduksi menggunakan pigmen pilihan yang menghasilkan tampilan akhir “matt” \n>Hadir dengan formula baru + anti jamur sehingga cat lebih tahan lama \n>Daya tahan:5-10 tahun","Rp. 85.000.00.", R.drawable.tembokkkk));
        namaBarang.add(new NamaBarang("Cat Tembok Nippon Paint Vinilex","\n>VINILEX SUPER EXTERIOR adalah cat tembok berkualitas tinggi dengan bahan dasar akrilik \n>Mempunyai daya tutup yang baik serta hasil yang halus dan merata \n>Memiliki Teknologi Anti-Pudar \n>Anti-Jamur \n>Water-Based \n>Hasil akhir: Matt","\"Rp. 120.000.00.,", R.drawable.tembokkkkk));
        namaBarang.add(new NamaBarang("Cat Minyak Molwilex","\n>Mowilex WOODSTAIN adalah cat pelapis kayu premium berbasis air yang didesain agar kayu tahan lebih lama, mudah untuk digunakan serta mudah dibersihkan \n>Memiliki daya rekat kuat \n>Anti jamur \n>ULTRA-LOW VOC \n>Tahan Cuaca","Rp. 70.000.00.,", R.drawable.minyak));
        namaBarang.add(new NamaBarang("Cat Minyak Avian","\n>Avian Synthetic adalah cat kayu dan besi yang sangat mengkilap \n>Cepat kering sehingga debu tidak mudah menempel \n>Tahan lama \n>Tidak mudah mengelupas \n>• Dapat dicuci","Rp. 75.000.00.,", R.drawable.minyakk));
        namaBarang.add(new NamaBarang("Cat Minyak Propan Aquaprimtop","\n>AQUA PRIMTOP adalah Cat Direct to Metal berpengencer air yang mempunyai daya lekat sangat baik \n>Langsung sebagai top coat, tanpa perlu primer \n>Excellent adhesion \n>Excellent water immersion test (50°C, 2 x 24 jam) \n>Lolos Salt Spray Test (SST) 500 jam, tanpa blister","Rp. 80.000.00.,", R.drawable.minyakkk));
        namaBarang.add(new NamaBarang("Cat Minyak Propan Primtop","\n>PRIMTOP PT – 88 adalah cat anti karat 2 in 1, yang berfungsi sebagai cat dasar sekaligus cat akhir yang diformulasikan khusus dalam satu kemasan \n>Praktis : Satu jenis cat untuk 2 (dua) fungsi \n>Efektif : Sebagai cat dasar anti karat \n>Tahan cuaca : Sebagai cat akhir yang tahan cuaca serta memiliki warna yang indah","Rp. 75.000.00.,", R.drawable.minyakkkk));
        namaBarang.add(new NamaBarang("Cat Minyak Nippon Paint","\n>PLATONE 8000 merupakan cat sintetis berdaya kilap tinggi, cepat kering, daya lekat yang baik, serta harga yang ekonomis \n>Tingkat Kilap yang Tinggi \n>Anti-Jamur \n>Daya Lekat yang Baik \n>Solvent-Based","Rp. 120.000.00.,", R.drawable.minyakkkkk));
        namaBarang.add(new NamaBarang("Cat Anti Bocor No Drop","\n>No Drop adalah cat pelapis anti bocor No. 1 di Indonesia yang memiliki sifat elastis, kedap air, dan tahan cuaca sehingga dapat melindungi Anda dari bahaya kebocoran di dalam rumah \n>Perlindungan 7 Tahun \n>Anti Jamur & Lumut \n>Daya Tutup Terbaik \n>Tahan Alkali & Efflorescence","Rp. 50.000.00.,", R.drawable.anti));
        namaBarang.add(new NamaBarang("Cat Anti Bocor Wel Proof","\n>Welproof adalah cat pelapis anti bocor yang di formulasikan untuk mencegah kebocoran dan menutup retak rambut \n>Welproof memiliki sifat elastis, kedap air, tahan alkali dan jamur, sehingga memberikan perlindungan dan keindahan pada tembok rumah \n>Hasil akhir: Satin \n>Anti Jamur dan Lumut","Rp. 45.000.00.,", R.drawable.antii));
        namaBarang.add(new NamaBarang("Cat Anti Bocor Aqua Proof","\n>AQUAPROOF merupakan campuran polimer thixotropic yang dirancang untuk melapisi berbagai tempat \n>Aquaproof cocok antara lain untuk atap genting, atap beton/seng/asbes, wuwungan, talang dan tampak muka/façade \n>Mudah diaplikasikan dan daya lekat kuat \n>Tidak menetes saat diaplikasikan \n>Anti leleh dan kedap air","Rp. 55.000.00.,", R.drawable.antiii));
        namaBarang.add(new NamaBarang("Cat Anti Bocor Top Seal","\n>TOP SEAL - GLOSS SUPER SEALER adalah pelapis anti bocor dan anti alkali yang memiliki sifat elastis, kedap air, serta tahan cuaca dengan hasil akhir gloss \n>Bau tidak menyengat \n>Kemampuan kedap air yang baik \n>Ketahanan terhadap zat alkali yang baik \n>Dilengkapi teknologi BIO ZINC Anti Virus & Bakteri","Rp. 60.000.00.,", R.drawable.antiiii));
        namaBarang.add(new NamaBarang("Cat Anti Bocor Dulux Weathershield","\n>Dulux Weathershield Pelapis anti bocor, Dulux AquaShield 2x lebih kuat melindungi \n>Pelapis anti bocor Dulux Aquashield hadir dengan Teknologi Hydroshield yang revolusioner \n>Lapisan Film 60% lebih tebal \n>Daya Tolak Air Lebih Baik \n>2x lebih kuat melindungi rumah Anda","Rp. 70.000.00.,", R.drawable.antiiiii));
     }
 }