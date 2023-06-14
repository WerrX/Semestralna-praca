package com.example.sem_dendis.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [UserD :: class], version = 1, exportSchema = false)

abstract class AppData : RoomDatabase(){

    abstract fun userDao() : UserDDao

    companion object{

        @Volatile
        private var INSTANCE : AppData? = null

        fun getDatabase(context: Context): AppData{
            val tempInstance = INSTANCE
            if (tempInstance!= null){
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppData::class.java,
                    "app_databaseU"
                ).allowMainThreadQueries().build()
                INSTANCE = instance
                return instance
            }
        }
    }
}