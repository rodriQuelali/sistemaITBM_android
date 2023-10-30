package com.example.sistemaitbm_reg.configHttp;

import com.example.sistemaitbm_reg.Models.Carrera;
import com.example.sistemaitbm_reg.Models.Usuario;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {
    @GET("Grado/listarGrado")
    Call<List<Carrera>> getCarreras();

}
