package org.codeforegypt.cleanarchitcturenoteapp.feature_note.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import org.codeforegypt.cleanarchitcturenoteapp.feature_note.domain.model.Note

@Database(
    entities = [Note::class],
    version = 1
)
abstract class NoteDatabase: RoomDatabase() {
    abstract val noteDao: Dao

    companion object{
        const val DATABASE_NAME = "notes_db"

    }

}
