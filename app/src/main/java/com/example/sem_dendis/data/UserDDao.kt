package com.example.sem_dendis.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query


@Dao
interface UserDDao {
    @Query("SELECT * FROM info_table")
    fun getAll(): List<UserD>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addUser(userR: UserD)

    @Delete
    fun deleteUser(userR: UserD)
}