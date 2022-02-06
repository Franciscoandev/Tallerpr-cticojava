/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.práctico.java;

import java.util.Date;

/**
 *
 * @author Pacho
 */


/*
*Atributos asignados al a clase Person
*/

public class Person 
 {

    public int id;
    public String name;
    public String lastName1;
    public String lastName2;
    public String in;
    public Date dateBirht;
    public int age;
    public float heigt; 
    public String nationality;
    public String city;
    public String adress;
    public String phone;
    public String email;   

/*
*Constructores de los atributos de la clase
*/

public Person()
  {

    this.id= 01;
    this.name="francisco";
    this.lastName1="Guayazan";
    this.lastName2="francisco";
    this.in="1023882344";
    Date dateBirht =new Date();
    this.heigt=(float) 1.76;
    this.age=34;
    this.city="bogota";
    this.adress="carrera 30 # 65 45";
    this.phone="3505320767";
    this.email="pacho189838@gmail.com";

  }

/*
*Métodos de la clase person
*/

 public int SearchId()
 {
  return this.id;
 }

  public String SearchIn()
 {
  return this.in;
 }

}

