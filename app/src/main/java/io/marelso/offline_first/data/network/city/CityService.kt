package io.marelso.offline_first.data.network.city

import io.marelso.encalhes.domain.City
import retrofit2.Response
import retrofit2.http.GET

interface CityService {
    @GET("/api/city")
    suspend fun getCities(): Response<List<City>>;
}