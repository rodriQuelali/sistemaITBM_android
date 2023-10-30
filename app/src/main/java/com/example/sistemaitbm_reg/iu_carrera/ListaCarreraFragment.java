package com.example.sistemaitbm_reg.iu_carrera;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.sistemaitbm_reg.R;
import com.example.sistemaitbm_reg.adapter.listaCarreras;
import com.example.sistemaitbm_reg.Models.Carrera;
import com.example.sistemaitbm_reg.configHttp.ApiClient;
import com.example.sistemaitbm_reg.configHttp.ApiService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ListaCarreraFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ListaCarreraFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ListaCarreraFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ListaCarreraFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ListaCarreraFragment newInstance(String param1, String param2) {
        ListaCarreraFragment fragment = new ListaCarreraFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    List<Carrera> listaCarrera;
    RecyclerView reListaCarrera;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View view = inflater.inflate(R.layout.fragment_lista_carrera, container, false);
        reListaCarrera = view.findViewById(R.id.listaCarreraFrament);
        reListaCarrera.setLayoutManager(new LinearLayoutManager(requireContext()));

        showCarreras();

        return view;
    }

    public void showCarreras (){
        Call<List<Carrera>> call = ApiClient.getcarrera().create(ApiService.class).getCarreras();
        call.enqueue(new Callback<List<Carrera>>() {
            @Override
            public void onResponse(Call<List<Carrera>> call, Response<List<Carrera>> response) {
                if(response.isSuccessful()){
                    listaCarrera = new ArrayList<>();
                    listaCarrera.addAll(response.body());

                    listaCarreras adapter = new listaCarreras((ArrayList<Carrera>) listaCarrera);
                    adapter.setOnClickListener(new listaCarreras.OnItemClickListener() {
                        @Override
                        public void onItemClick(int position, Carrera carrera) {

                            Toast.makeText(reListaCarrera.getContext(),  "Nombre: " + carrera.getNombre()+ " posicion: " + position, Toast.LENGTH_SHORT).show();
                        }

           /* @Override
            public void onItemClick(int position) {
                Carrera personaSelec = listaCarrera.get(position);
                Toast.makeText(actividades_itbm.this, "Nombre: " + personaSelec.getNombre(), Toast.LENGTH_SHORT).show();
            }*/
                    });
                    reListaCarrera.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Call<List<Carrera>> call, Throwable t) {
                Toast.makeText(getActivity(), "Error en la peticion", Toast.LENGTH_SHORT).show();
            }
        });
    }

}