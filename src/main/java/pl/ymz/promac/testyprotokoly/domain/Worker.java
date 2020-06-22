package pl.ymz.promac.testyprotokoly.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "workers")
public class Worker extends BaseEntity {
    //Użytkownik, tester

    private String firstName;
    private String lastName;
    private String login;
    private String pass;
    private Boolean admin;              //czy użytkownik jest adminem.
    private Boolean tester;             //czy użytkownik jest testerem.
    private String signature;           //podpis w postaci obrazka/skanu
    @OneToMany
    @JoinColumn(name = "worker_id")
    private List<Product> products;     //lista produktów wytestowanych przez użytkownika
    @Embedded
    private Audit audit = new Audit();  //Springowy mechanizm trzymania daty utworzenia i edycji

    @Builder
    public Worker(Integer id, String firstName, String lastName,
                  String login, String pass, Boolean admin,
                  Boolean tester, String signature, List<Product> products) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.pass = pass;
        this.admin = admin;
        this.tester = tester;
        this.signature = signature;
        this.products = products;
    }
}
