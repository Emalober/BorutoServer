package com.emalober.di

import com.emalober.repository.HeroRepository
import com.emalober.repository.HeroRepositoryImpl
import org.koin.dsl.module

val koinModule = module {
    single<HeroRepository> {
        HeroRepositoryImpl()
    }
}