package ru.netology.neworkapp.repository

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ru.netology.neworkapp.dto.User
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
interface RepositoryModule {
    @Binds
    @Singleton
    fun bindPostRepositoryImpl(postRepositoryImpl: PostRepositoryImpl): PostRepository

    @Binds
    @Singleton
    fun bindAuthRepositoryImpl(authRepositoryImpl: AuthRepositoryImpl): AuthRepository


    @Binds
    @Singleton
    fun bindUserRepository(userRepositoryImpl: UserRepositoryImpl): UserRepository

    @Binds
    @Singleton
    fun bindsJobRepository(jobRepositoryImpl: JobRepositoryImpl): JobRepository
}