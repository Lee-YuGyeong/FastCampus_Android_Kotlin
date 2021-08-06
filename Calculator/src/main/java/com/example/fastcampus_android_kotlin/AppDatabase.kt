package com.example.fastcampus_android_kotlin

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.fastcampus_android_kotlin.dao.HistoryDao
import com.example.fastcampus_android_kotlin.model.History

@Database(entities = [History::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun historyDao():HistoryDao

}