package edu.upc.eseiaat.pma.countrylist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class CountryListActivity extends AppCompatActivity {

    private ArrayList<String> country_list;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_list);

        final String[] countries = getResources().getStringArray(R.array.countries);
        country_list = new ArrayList<>(Arrays.asList(countries));

        ListView list = (ListView) findViewById(R.id.country_list);

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, country_list);
        list.setAdapter(adapter);

    }
}
