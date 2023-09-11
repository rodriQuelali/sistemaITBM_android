package com.example.sistemaitbm_reg.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sistemaitbm_reg.R;
import com.example.sistemaitbm_reg.persona.Carrera;

import java.util.ArrayList;

public class listaCarreras extends RecyclerView.Adapter<listaCarreras.CarreraViewsHolder> {

    ArrayList<Carrera> carrera;

    public listaCarreras(ArrayList<Carrera> carrera){
        this.carrera = carrera;
    }

    @NonNull
    @Override
    public CarreraViewsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.carreras,null,false);
        return new CarreraViewsHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CarreraViewsHolder holder, int position) {
        holder.Ncarrera.setText(carrera.get(position).getNombre());
        holder.estTv.setText(carrera.get(position).getEstado());
        holder.tipoTv.setText(carrera.get(position).getTipo());
        holder.rangoTv.setText(String.valueOf(carrera.get(position).getRango()));
    }

    @Override
    public int getItemCount() {
        return carrera.size();

    }

    public class CarreraViewsHolder extends RecyclerView.ViewHolder {
        TextView Ncarrera, estTv, tipoTv, rangoTv;
        public CarreraViewsHolder(@NonNull View itemView) {
            super(itemView);
            Ncarrera = itemView.findViewById(R.id.txtCarreraL);
            estTv = itemView.findViewById(R.id.tvestado);
            tipoTv = itemView.findViewById(R.id.tvtTipo);
            rangoTv = itemView.findViewById(R.id.tvRango);

        }
    }
}
