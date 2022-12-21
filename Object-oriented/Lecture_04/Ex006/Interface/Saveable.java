package Lecture_04.Ex006.Interface;

import Lecture_04.Ex006.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
