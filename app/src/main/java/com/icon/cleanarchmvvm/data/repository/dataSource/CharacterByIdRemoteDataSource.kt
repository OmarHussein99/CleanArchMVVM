package com.icon.cleanarchmvvm.data.repository.dataSource

import com.icon.cleanarchmvvm.data.responsies.GetCharacterByIdResponse
import retrofit2.Response

interface CharacterByIdRemoteDataSource{
    suspend fun getCharacterById (id : Int) : Response<GetCharacterByIdResponse>
}