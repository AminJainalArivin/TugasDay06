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
        namaBarang.add(new NamaBarang("Cat Tembok Nippon Paint Spot-less","\n >SPOT-LESS adalah cat premium yang diformulasikan untuk pemakaian interior \n >Keunggulan SPOT-LESS adalah mudah dibersihkan dan water resistant \n>SPOT-LESS cocok untuk dekorasi dan melindungi permukaan dinding yang terbuat dari semen, plester, batu bata dan dinding fiber ", "Rp. 80.000.00.," ,R.drawable.tembok);
        namaBarang.add(new NamaBarang("Cat Tembok Dulux Catylac", "\n>Dulux Catylac Interior dengan formulai Chroma Brite Technology untuk warna dinding cerah menakjubkan lebih lama \n>Waktu Pengeringan 1-2 jam \n>Hasil akhir: Matt", "Rp. 80.000.00.," ,R.drawable.tembokk));
        namaBarang.add(new NamaBarang("Cat Tembok Dulux Easy Clean","\n>ulux EasyClean adalah cat tembok berkualitas tinggi untuk interior \n>berbahan dasar air dengan KidProof TechnologyTM \n>Waktu pengeringan 1-2 jam \n>Hasil akhir: Mid Sheen","Rp. 80.000.00.,", R.drawable.tembokkk));
        namaBarang.add(new NamaBarang("Cat Tembok Avitex","\n>Avitex Cat Tembok adalah cat tembok interior berbahan dasar resin terbaik (styrene acrylic emulsion) \n>Diproduksi menggunakan pigmen pilihan yang menghasilkan tampilan akhir “matt” \n>Hadir dengan formula baru + anti jamur sehingga cat lebih tahan lama","Rp. 85.000.00.,", R.drawable.tembokkkk));
        namaBarang.add(new NamaBarang("Cat Tembok Nippon Paint Vinilex",,"\"Rp. 120.000.00.,", R.drawable.tembokkkkk));
        namaBarang.add(new NamaBarang("Cat Minyak Molwilex",,"Rp. 70.000.00.,", R.drawable.minyak));
        namaBarang.add(new NamaBarang("Cat Minyak Avian",,"Rp. 75.000.00.,", R.drawable.minyakk));
        namaBarang.add(new NamaBarang("Cat Minyak Propan Aquaprimtop",,"Rp. 80.000.00.,", R.drawable.minyakkk));
        namaBarang.add(new NamaBarang("Cat Minyak Propan Primtop",,"Rp. 75.000.00.,", R.drawable.minyakkkk));
        namaBarang.add(new NamaBarang("Cat Minyak Nippon Paint",,"Rp. 120.000.00.,", R.drawable.minyakkkkk));
        namaBarang.add(new NamaBarang("Cat Anti Bocor No Drop",,"Rp. 50.000.00.,", R.drawable.anti));
        namaBarang.add(new NamaBarang("Cat Anti Bocor Wel Proof",,"Rp. 45.000.00.,", R.drawable.antii));
        namaBarang.add(new NamaBarang("Cat Anti Bocor Aqua Proof",,"Rp. 55.000.00.,", R.drawable.antiii));
        namaBarang.add(new NamaBarang("Cat Anti Bocor Top Seal",,"Rp. 60.000.00.,", R.drawable.antiiii));
        namaBarang.add(new NamaBarang("Cat Anti Bocor Dulux Weathershield",,"Rp. 70.000.00.,", R.drawable.antiiiii));
     }
 }