package org.codeforegypt.cleanarchitcturenoteapp.feature_note.domain.use_case


import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import org.codeforegypt.cleanarchitcturenoteapp.feature_note.domain.model.Note
import org.codeforegypt.cleanarchitcturenoteapp.feature_note.domain.repository.NoteRepository
import org.codeforegypt.cleanarchitcturenoteapp.feature_note.peresentation.util.NoteOrder
import org.codeforegypt.cleanarchitcturenoteapp.feature_note.peresentation.util.OrderType

class GetNotes(
    private val repo: NoteRepository
) {
    operator fun invoke(
        noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending)
    ): Flow<List<Note>>{
        return repo.getNotes().map { notes ->
            when(noteOrder.orderType){
                is OrderType.Ascending -> {
                    when(noteOrder){
                       is NoteOrder.Title -> notes.sortedBy { it.title.lowercase() }
                       is NoteOrder.Date -> notes.sortedBy { it.timestamp }
                       is NoteOrder.Color -> notes.sortedBy { it.color }

                    }
                }
                is OrderType.Descending -> {
                    when(noteOrder){
                        is NoteOrder.Title -> notes.sortedByDescending { it.title.uppercase()}
                        is NoteOrder.Date -> notes.sortedByDescending { it.timestamp }
                        is NoteOrder.Color -> notes.sortedByDescending { it.color }

                    }
                }
            }

        }
    }

}