package io.marelso.offline_first

import android.app.Application
import io.marelso.offline_first.di.appModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        GlobalContext.startKoin {
            androidContext(this@App)
            modules(appModules)
        }
    }
}