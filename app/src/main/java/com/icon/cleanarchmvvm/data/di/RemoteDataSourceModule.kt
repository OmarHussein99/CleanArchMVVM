package com.icon.cleanarchmvvm.data.di

import com.icon.cleanarchmvvm.data.ApiService
import com.icon.cleanarchmvvm.data.repository.dataSource.CharacterByIdRemoteDataSource
import com.icon.cleanarchmvvm.data.repository.dataSourceImpl.CharacterByIdRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RemoteDataSourceModule {

    @Provides
    @Singleton
    fun provideCharacterByIdRemoteDataSource(apiService: ApiService):
            CharacterByIdRemoteDataSource = CharacterByIdRemoteDataSourceImpl(apiService)
}