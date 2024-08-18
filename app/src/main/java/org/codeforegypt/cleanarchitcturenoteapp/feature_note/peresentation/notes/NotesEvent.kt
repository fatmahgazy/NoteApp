package org.codeforegypt.cleanarchitcturenoteapp.feature_note.peresentation.notes

import org.codeforegypt.cleanarchitcturenoteapp.feature_note.domain.model.Note
import org.codeforegypt.cleanarchitcturenoteapp.feature_note.peresentation.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()

}