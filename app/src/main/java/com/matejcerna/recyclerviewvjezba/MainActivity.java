package com.matejcerna.recyclerviewvjezba;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;

    private ArrayList<String> text = new ArrayList<>();
    private ArrayList<String> slika = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        listajText();

    }

    private void listajText(){
        text.add("Boki");
        slika.add("https://i.skyrock.net/7802/42887802/pics/1740308584.jpg");

        text.add("Aca");
        slika.add("https://i2.wp.com/folkoteka.org/wp-content/uploads/2015/02/aca-amadeus.jpg?zoom=2&resize=414%2C400");

        text.add("Tokan");
        slika.add("https://scontent-vie1-1.xx.fbcdn.net/v/t1." +
                "0-9/313701_535300873159670_1008786483_n.jpg?_nc_cat=1" +
                "02&_nc_sid=e007fa&_nc_ohc=6i_jkeRRFN0AX-8sIXd&_nc_ht=scon" +
                "tent-vie1-1.xx&oh=08844a42713fd2e47c89b03be879c632&oe=5EED7612");

        text.add("Milan");
        slika.add("https://img.discogs.com/XyO7wMEwpnWD0xSKaBIUC6kkUMo=/600x839/smart/filters:strip_icc():format(jpeg):mode_rgb():quality(90)/discogs-images/A-781394-1543089206-2696.jpeg.jpg");

        text.add("Džaja");
        slika.add("https://scontent-lga3-1.cdninstagram.com/v/t51.2885-15/sh0.08/e35/s640x640/8161" +
                "5307_901277293602246_7608275521303782804_n.jpg?_nc_ht=s" +
                "content-lga3-1.cdninstagram.com&_nc_cat=106&_nc_ohc=gZyfjchOHz4AX-ST84" +
                "X&oh=c7c5f035c93577d644057968f76371da&oe=5ECB5E69");

        initRecyclerView();
    }

    private void initRecyclerView(){
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(this, text, slika);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
