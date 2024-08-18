package org.codeforegypt.cleanarchitcturenoteapp.feature_note.peresentation.notes

import org.codeforegypt.cleanarchitcturenoteapp.feature_note.domain.model.Note
import org.codeforegypt.cleanarchitcturenoteapp.feature_note.peresentation.util.NoteOrder
import org.codeforegypt.cleanarchitcturenoteapp.feature_note.peresentation.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
