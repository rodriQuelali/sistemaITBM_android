package com.example.sistemaitbm_reg.models.api;

import com.example.sistemaitbm_reg.models.objetos.Carrera;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("Grado/listarGrado")
    Call<List<Carrera>> getCarreras();

}
