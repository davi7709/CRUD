/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Person {

    private Long id;
    private String cpf;
    private String name;;
    private Integer cel;
    private String email;

    public Person(String cpf, String name, int cel, String email) {
        this.cpf = cpf;
        this.name = name;
        this.cel = cel;
        this.email = email;
    }

    public Person(){

    }

    public String getName() {
        return name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getCel() {
        return cel;
    }

    public void setCel(Integer cel) {
        this.cel = cel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
