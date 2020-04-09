package pl.ymz.promac.testyprotokoly.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class User extends BaseEntity {
    //Użytkownik, tester

    private String firstName;
    private String lastName;
    private String login;
    private String pass;
    private Boolean admin;
    private Boolean tester;
    private String signature;   //podpis w postaci obrazka/skanu
    @OneToMany
    private List<Product> product;
}
