package com.example.multipleroomtable.entity.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.example.multipleroomtable.entity.Director
import com.example.multipleroomtable.entity.School

data class SchoolAndDirector(
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val director: Director
)