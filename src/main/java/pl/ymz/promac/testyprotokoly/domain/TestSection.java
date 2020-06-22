package pl.ymz.promac.testyprotokoly.domain;

public enum TestSection {

    VISUAL_CHECK(1, "Kontrola wizualna"),
    CONTINUITY_CHECK(2, "Kontrola ciągłości przewodów"),
    INSULATION_RESISTANCE(3, "Pomiar rezystancji izolacji"),
    SPECIFIC_TEST(4, "Testy układu właściwe dla typu urządzenia");


    private Integer sectionId;
    private String definition;

    TestSection(Integer sectionId, String definition) {
        this.sectionId = sectionId;
        this.definition = definition;
    }

    public Integer getSectionId() {
        return sectionId;
    }

    public String getDefinition() {
        return definition;
    }
}
