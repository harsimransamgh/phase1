package com.businesscard.projectphase1.repository

import androidx.room.Query
import com.businesscard.projectphase1.database.NoteDatabase
import com.businesscard.projectphase1.model.Note

class NoteRepository(private val db: NoteDatabase) {

    suspend fun  insertNote(note: Note) = db.getNoteDao().insertNote(note)
    suspend fun  deleteNote(note: Note) = db.getNoteDao().deleteNote(note)
    suspend fun  updateNote(note: Note) = db.getNoteDao().updateNote(note)

    fun getAllNotes() = db.getNoteDao().getAllNotes()
    fun searchNote(query: String?) =db.getNoteDao().searchNote(query)
}