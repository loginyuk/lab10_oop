package com.example;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DocumentTest {

    @Test
    void parseShouldReturnEmptyStringForEmptyDocument() {
        Document document = new SmartDocument("");
        assertEquals("", document.parse());
    }

    @Test
    void parseShouldReturnEmptyStringForNullDocument() {
        Document document = new SmartDocument(null);
        assertEquals("", document.parse());
    }

    @Test
    void parseShouldReturnEmptyStringForDocumentWithOnlySpaces() {
        Document document = new SmartDocument("   ");
        assertEquals("", document.parse());
    }

    @Test
    void parseShouldReturnEmptyStringForDocumentWithOnlyTabs() {
        Document document = new SmartDocument("\t\t\t");
        assertEquals("", document.parse());
    }
    
}
