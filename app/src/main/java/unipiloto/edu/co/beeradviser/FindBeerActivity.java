package unipiloto.edu.co.beeradviser;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class FindBeerActivity extends AppCompatActivity {

    public void onClickFindBeer(View view){
        TextView brands = (TextView) findViewById(R.id.brands);
        Spinner color = (Spinner) findViewById(R.id.color);
        String beerType = String.valueOf(color.getSelectedItem());
        List<String> arr = BeerExpert.getBrands(beerType);
        String salida = arr.get(0) +"\n"+ arr.get(1);
        brands.setText(salida);

    }


    public void onClickFindAnimal(View view){
        TextView races = (TextView) findViewById(R.id.racetxt);
        Spinner color = (Spinner) findViewById(R.id.raceSp);
        String animal_type = String.valueOf(color.getSelectedItem());
        List<String> arr = BeerExpert.getRaces(animal_type);
        String salida = arr.get(0) +"\n"+ arr.get(1)+"\n"+ arr.get(2)+"\n"+ arr.get(3);
        races.setText(salida);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }
}