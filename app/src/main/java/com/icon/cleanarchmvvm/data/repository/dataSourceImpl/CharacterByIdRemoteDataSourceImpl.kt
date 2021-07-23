package com.icon.cleanarchmvvm.data.repository.dataSourceImpl

import com.icon.cleanarchmvvm.data.ApiService
import com.icon.cleanarchmvvm.data.repository.dataSource.CharacterByIdRemoteDataSource
import com.icon.cleanarchmvvm.data.responsies.GetCharacterByIdResponse
import retrofit2.Response

class CharacterByIdRemoteDataSourceImpl(
    private val apiService: ApiService
): CharacterByIdRemoteDataSource {
    override suspend fun getCharacterById(id: Int):
            Response<GetCharacterByIdResponse> = apiService.getCharacterById(id)
}