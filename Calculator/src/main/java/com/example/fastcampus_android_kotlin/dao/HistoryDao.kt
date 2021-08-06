package com.example.fastcampus_android_kotlin.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.fastcampus_android_kotlin.model.History

@Dao
interface HistoryDao {

    @Query("SELECT * FROM history")
    fun getAll(): List<History>

    @Insert
    fun insertHistory(history: History)

    @Query("DELETE FROM history")
    fun deleteAll()

//    @Delete
//    fun delete(history: History) // 원하는 것 삭제

//    @Query("SELECT * FROM history WHERE result LIKE :result")
//    fun findByResult(result:String) : List<History> // result 걸치는것 다 삭제

//    @Query("SELECT * FROM history WHERE result LIKE :result LIMIT 1")
//    fun findByResult(result:String) : History // result 걸치는 것 하나만 삭제
}