package com.example.botanichandbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    List<Plant> plants = new ArrayList<Plant>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // инициализируем контейнер
        setInitialData();

        // создадим объект RecyclerView и привяжем к нему соответствующий id
        RecyclerView recyclerView = findViewById(R.id.list_plants);

        // создадим адаптер и загрузим в него контейнер с данными
        PlantAdapter adapter = new PlantAdapter(this, plants);

        // на recyclerView подадим адаптер
        recyclerView.setAdapter(adapter);
    }

    private void setInitialData() {
        // добавление в контейнер animals объектов сущности Animal
        plants.add( new Plant("Ромашка", "Абсолютно неприхотливое растение, \nцветущее в первый год жизни. Имеет \nтонкий стебель и узкие зеленые листья",
                R.drawable.chamomile));
        plants.add( new Plant("Папоротник", "Споровое растение с крупными, сильно рассечёнными листьями",
                R.drawable.fern));
        plants.add( new Plant("Мята", "Душистое растение, употребляющееся \nдля медицинских, парфюмерных \nи кондитерских целей",
                R.drawable.mint));
        plants.add( new Plant("Мелисса", "Травянистое многолетнее растение, \nвыращивается как эфиромасличное, \nпряное, медоносное, лекарственное \nи декоративное растение",
                R.drawable.melissa));
        plants.add( new Plant("Клевер", "Бывает как однолетним так \nи многолетним растением. \nЦветы обычно белые или красные \nи собраны в виде головок",
                R.drawable.clover));
    }
}