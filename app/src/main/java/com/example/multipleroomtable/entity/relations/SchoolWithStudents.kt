package com.example.multipleroomtable.entity.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.example.multipleroomtable.entity.School
import com.example.multipleroomtable.entity.Student

data class SchoolWithStudents(
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val students: List<Student>
)