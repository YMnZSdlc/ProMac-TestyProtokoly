package pl.ymz.promac.testyprotokoly.domain;

import javax.persistence.Embeddable;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.LocalDateTime;

@Embeddable
public class Audit {

    private LocalDateTime created;
    private LocalDateTime updated;

    @PrePersist
    void prePersist() {
        created = LocalDateTime.now();
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    @PreUpdate
    void preUpdate() {
        updated = LocalDateTime.now();
    }
}
