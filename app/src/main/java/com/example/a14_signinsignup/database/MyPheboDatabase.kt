package com.example.a14_signinsignup.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.a14_signinsignup.dao.PheboDao
import com.example.a14_signinsignup.entity.CategoryItems

@Database(entities = [CategoryItems::class], version = 1, exportSchema = false)
abstract class MyPheboDatabase : RoomDatabase() {

    abstract fun pheboDao(): PheboDao

    companion object {
        private const val DATABASE_NAME = "my_phebo_database"

        @Volatile
        private var INSTANCE: MyPheboDatabase? = null

        fun getDatabase(context: Context): MyPheboDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    MyPheboDatabase::class.java,
                    DATABASE_NAME
                ).fallbackToDestructiveMigration().build()
                INSTANCE = instance
                instance
            }
        }
    }
}
