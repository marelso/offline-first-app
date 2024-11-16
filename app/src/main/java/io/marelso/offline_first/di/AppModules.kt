package io.marelso.offline_first.di

import io.marelso.offline_first.data.network.networkModule
import org.koin.dsl.module

val appModules = module {
    includes(networkModule)
}