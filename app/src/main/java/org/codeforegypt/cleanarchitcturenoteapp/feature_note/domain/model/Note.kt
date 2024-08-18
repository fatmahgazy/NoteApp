package org.codeforegypt.cleanarchitcturenoteapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import org.codeforegypt.cleanarchitcturenoteapp.ui.theme.BabyBlue
import org.codeforegypt.cleanarchitcturenoteapp.ui.theme.LightGreen
import org.codeforegypt.cleanarchitcturenoteapp.ui.theme.RedOrange
import org.codeforegypt.cleanarchitcturenoteapp.ui.theme.RedPink
import org.codeforegypt.cleanarchitcturenoteapp.ui.theme.Violet

@Entity(tableName = "notes")
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey(autoGenerate = true) val id: Int? = 0,
){
    companion object
    {
        val noteColors = listOf(RedOrange , LightGreen , Violet , BabyBlue , RedPink)
    }
}

class InvalidNoteException(message: String): Exception(message)

