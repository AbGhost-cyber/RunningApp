package com.crushtech.runningapp.di

import android.content.Context
import androidx.room.Room
import com.crushtech.runningapp.db.RunningDatabase
import com.crushtech.runningapp.others.Constants.RUNNING_DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object AppModule {

    //generates a single instance
    @Singleton
    @Provides
    fun provideRunningDatabase(
        @ApplicationContext app:Context
    ) = Room.databaseBuilder(
       app,
        RunningDatabase::class.java,
        RUNNING_DATABASE_NAME
    ).fallbackToDestructiveMigration().build()

    @Singleton
    @Provides
    fun provideRunDao(db:RunningDatabase) = db.getRunDao()
}