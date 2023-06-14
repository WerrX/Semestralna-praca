package com.example.sem_dendis.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "info_table")
data class UserD(
    @PrimaryKey(autoGenerate = true) val id : Int = 0,
    @ColumnInfo(name = "date") val date : Long,
    @ColumnInfo(name = "weight") val weight : Double,
)
