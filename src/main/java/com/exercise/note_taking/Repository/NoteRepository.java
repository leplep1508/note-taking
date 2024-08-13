package com.exercise.note_taking.Repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;
import com.exercise.note_taking.Dto.Note;

@Repository
public class NoteRepository {

    private final List<Note> notes = new ArrayList<>();
    private final AtomicLong counter = new AtomicLong();

    public List<Note> findAll() {
        return notes;
    }

    public Optional<Note> findById(Long id) {
        return notes.stream().filter(note -> note.getId().equals(id)).findFirst();
    }

    public Note save(Note note) {
        note.setId(counter.incrementAndGet());
        notes.add(note);
        return note;
    }

    public Note update(Long id, Note updatedNote) {
        Note note = findById(id).orElseThrow(() -> new RuntimeException("Note not found"));
        note.setTitle(updatedNote.getTitle());
        note.setBody(updatedNote.getBody());
        return note;
    }

    public void delete(Long id) {
        notes.removeIf(note -> note.getId().equals(id));
    }
}