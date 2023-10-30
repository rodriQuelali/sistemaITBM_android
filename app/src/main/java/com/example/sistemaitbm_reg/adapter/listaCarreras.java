package com.example.sistemaitbm_reg.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sistemaitbm_reg.R;
import com.example.sistemaitbm_reg.Models.Carrera;

import java.util.ArrayList;

public class listaCarreras extends RecyclerView.Adapter<listaCarreras.CarreraViewsHolder> {

    ArrayList<Carrera> carrera;
    private OnItemClickListener onClickCarrera;

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

    public void setOnClickListener(OnItemClickListener onClickCarrera){
        this.onClickCarrera = onClickCarrera;
    }

    public interface OnItemClickListener {
        void onItemClick(int position, Carrera carrera);
    }


    public class CarreraViewsHolder extends RecyclerView.ViewHolder {
        TextView Ncarrera, estTv, tipoTv, rangoTv;
        public CarreraViewsHolder(@NonNull View itemView) {
            super(itemView);
            Ncarrera = itemView.findViewById(R.id.txtCarreraL);
            estTv = itemView.findViewById(R.id.tvestado);
            tipoTv = itemView.findViewById(R.id.tvtTipo);
            rangoTv = itemView.findViewById(R.id.tvRango);

            //devolvemos la posiscion
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(onClickCarrera != null){
                        int position = getAdapterPosition();
                        if(position != RecyclerView.NO_POSITION){
                            //para la posicion
                            Carrera carrSelec = carrera.get(position);
                            onClickCarrera.onItemClick(position, carrSelec);
                        }
                    }
                }
            });

        }
    }
}
