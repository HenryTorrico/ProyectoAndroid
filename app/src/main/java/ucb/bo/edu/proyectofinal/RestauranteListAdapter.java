package ucb.bo.edu.proyectofinal;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


public class RestauranteListAdapter extends RecyclerView.Adapter<RestauranteListAdapter.ComidaListViewHolder> {

    private ArrayList<Restaurantes> lista;

    public RestauranteListAdapter(ArrayList<Restaurantes> lista) {
        this.lista = lista;
    }



    @Override
    public ComidaListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_restaurant, parent, false);
        return new RestauranteListAdapter.ComidaListViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ComidaListViewHolder holder, int position) {
        final Restaurantes comida = lista.get(position);
        holder.txtNombre.setText(comida.getNombre());
        holder.txtUbicacion.setText(comida.getUbicacion());
        holder.txtTipo.setText(comida.getTipo());
    }

    @Override
    public int getItemCount() {
        return this.lista.size();
    }


    public static class ComidaListViewHolder extends RecyclerView.ViewHolder {
        private TextView txtNombre;
        private TextView txtUbicacion;
        private TextView txtTipo;
        public ComidaListViewHolder(View itemView) {
            super(itemView);
            txtNombre = (TextView) itemView.findViewById(R.id.txt_nombre);
            txtUbicacion =( TextView) itemView.findViewById(R.id.txt_ubicacion);
            txtTipo =( TextView) itemView.findViewById(R.id.txt_tipo);

        }
    }

}
