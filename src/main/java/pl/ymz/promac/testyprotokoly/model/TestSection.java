package pl.ymz.promac.testyprotokoly.model;

public enum TestSection {

    IDENTIFICATION(1, "Identyfikacja modułu"),
    VISUAL_CHECK(2, "Kontrola wizualna");

    private int sectionId;
    private String definition;

    TestSection(int sectionId, String definition) {
        this.sectionId = sectionId;
        this.definition = definition;
    }
}
