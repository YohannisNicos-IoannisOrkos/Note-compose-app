package com.example.noteappcleanarchitecture.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.noteappcleanarchitecture.ui.theme.*

@Entity
data class Note(
    val title:String,
    val content: String,
    val timestamp:String,
    val color: Int,
    @PrimaryKey val id: Int? = null
){
    companion object {
    val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
}

}
