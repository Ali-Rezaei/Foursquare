package com.sample.android.cafebazaar.di

import android.app.Application
import com.sample.android.cafebazaar.FoursquareApplication
import com.sample.android.cafebazaar.database.DatabaseModule
import com.sample.android.cafebazaar.network.Network

import javax.inject.Singleton

import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@Singleton
@Component(
    modules = [ActivityBindingModule::class,
        AndroidSupportInjectionModule::class,
        ApplicationModule::class,
        Network::class,
        DatabaseModule::class]
)
interface AppComponent : AndroidInjector<FoursquareApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}