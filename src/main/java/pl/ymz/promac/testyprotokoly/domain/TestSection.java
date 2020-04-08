package pl.ymz.promac.testyprotokoly.domain;

public enum TestSection {

    IDENTIFICATION(1, "Identyfikacja modułu"),
    VISUAL_CHECK(2, "Kontrola wizualna"),
    CONTINUITY_CHECK(3, "Kontrola ciągłości przewodów"),
    INSULATION_RESISTANCE(4, "Pomiar rezystancji izolacji"),
    SPECIFIC_TEST(5, "Testy układu właściwe dla typu urządzenia"),
    MEASURING_INSTRUMENTS(6, "Przyrządy pomiarowe"),
    FINAL_JUDGMENT(7, "Orzeczenie końcowe");

    private Integer sectionId;
    private String definition;

    TestSection(Integer sectionId, String definition) {
        this.sectionId = sectionId;
        this.definition = definition;
    }
}
