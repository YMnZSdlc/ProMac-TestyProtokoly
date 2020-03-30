package pl.ymz.promac.testyprotokoly.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class User extends BaseEntity{
    //Użytkownik, tester

    private String firstName;
    private String lastName;
    private String login;
    private String pass;
    private Boolean Admin;
    private Boolean Tester;
    private String signature;   //podpis w postaci obrazka/skanu
}
