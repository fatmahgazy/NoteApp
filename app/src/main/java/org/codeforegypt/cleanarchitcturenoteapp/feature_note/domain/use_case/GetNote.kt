package org.codeforegypt.cleanarchitcturenoteapp.feature_note.domain.use_case

import org.codeforegypt.cleanarchitcturenoteapp.feature_note.domain.model.Note
import org.codeforegypt.cleanarchitcturenoteapp.feature_note.domain.repository.NoteRepository

class GetNote(
    private val repo: NoteRepository
) {
    suspend operator fun invoke(id: Int): Note?{
        return repo.getNoteById(id)
    }

}