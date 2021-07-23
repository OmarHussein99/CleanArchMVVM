package com.icon.cleanarchmvvm.data

import com.icon.cleanarchmvvm.data.responsies.GetCharacterByIdResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("character/{character-id}")
    suspend fun getCharacterById(
        @Path("character-id") characterId :Int
    ) : Response<GetCharacterByIdResponse>
}