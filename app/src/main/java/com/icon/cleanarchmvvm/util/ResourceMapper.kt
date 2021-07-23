package com.icon.cleanarchmvvm.util
import com.icon.goldentours.util.Resource
import retrofit2.Response

class ResourceMapper<T> {
     fun map(response: Response<T>): Resource<T> {
        if (response.isSuccessful){
            response.body()?.let { result->
                return Resource.Success(result)
            }
        }
        return Resource.Error(response.message())
    }
}