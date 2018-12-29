package ucb.bo.edu.proyectofinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class RestaurantActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);
        ArrayList<Restaurantes> lista = new ArrayList<>();
        lista.add(new Restaurantes("Popeye","Avenida America Oeste","Hamburguesas"));
        lista.add(new Restaurantes("Pikas","Avenida de la Patria","Parrilla"));
        lista.add(new Restaurantes("Keiko","Avenida America Este","Pollo"));
        lista.add(new Restaurantes("Tia","Avenida Aroma","Pollo"));
        lista.add(new Restaurantes("America","Avenida America","Pollo"));
        lista.add(new Restaurantes("Panchita","Avenida America","Pollo"));
        lista.add(new Restaurantes("Planet Chicken","Avenida America","Pollo"));
        lista.add(new Restaurantes("F! House","Avenida America","Hamburguesas"));
        lista.add(new Restaurantes("Chesters","Avenida Juan de la Rosa","Pollo"));
        lista.add(new Restaurantes("Chiqui Pollo","Avenida Villavicencio","Pollo"));

        RestauranteListAdapter restauranteListAdapter =new RestauranteListAdapter(lista);
        this.recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        this.recyclerView.setAdapter(restauranteListAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        this.recyclerView.setLayoutManager(linearLayoutManager);

    }
}
