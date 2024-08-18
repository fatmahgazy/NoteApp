package org.codeforegypt.cleanarchitcturenoteapp.feature_note.data.repository

import kotlinx.coroutines.flow.Flow
import org.codeforegypt.cleanarchitcturenoteapp.feature_note.data.data_source.Dao
import org.codeforegypt.cleanarchitcturenoteapp.feature_note.domain.model.Note
import org.codeforegypt.cleanarchitcturenoteapp.feature_note.domain.repository.NoteRepository

class NoteRepositoryImpl(
    private val dao: Dao
): NoteRepository {
    override fun getNotes(): Flow<List<Note>> {
       return dao.getNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return dao.getNoteById(id)
    }

    override suspend fun insertNote(note: Note) {
       dao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        dao.deleteNote(note)
    }
}