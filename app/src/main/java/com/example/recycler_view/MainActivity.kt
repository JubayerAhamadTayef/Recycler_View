package com.example.recycler_view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.recycler_view.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    var itemData = listOf<ItemData>(

        ItemData(
            R.drawable.my_image,
            "Jubayer Ahamad Tayef",
            "5:00 AM",
            "Assalamualaikum..."
        ),
        ItemData(
            R.drawable.shohan_hossain_ean_sir,
            "Shohan Hossain Ean sir",
            "6:00 AM",
            "Walaikumussalam..."
        ),
        ItemData(
            R.drawable.jubayer_al_asad_sir,
            "Jubayer Al A'sad sir",
            "6:50 AM",
            "Hello"
        ),
        ItemData(
            R.drawable.sadek_bhuiya_shimon_sir,
            "Sadek Buiya Shimon sir",
            "02:00 PM",
            "Class e asen"
        ),
        ItemData(
            R.drawable.sayed_riazul_ferdous,
            "Sayed Riazul Ferdous",
            "02:00 PM",
            "Online class hobe?"
        ),
        ItemData(
            R.drawable.nazmul_hasan_rifat,
            "Nazmul Hasan Rifat",
            "02:00 PM",
            "Ki re? Class korbi ajke?"
        ),
        ItemData(
            R.drawable.foiz_mahbub_soroj,
            "Foiz Mahbub Soroj",
            "02:10 PM",
            "Class ki shuru hoye geche?"
        ),
        ItemData(
            R.drawable.rokonuzzaman_rudhro,
            "Foiz Mahbub Soroj",
            "6:20 PM",
            "Sent a photo"
        )

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = Adapter(
            ItemData(
                itemData[0].image,
                itemData[0].name,
                itemData[0].time,
                itemData[0].lastMessage
            )
        )
        adapter.submitList(itemData)

        binding.recyclerView.adapter = adapter
    }
}