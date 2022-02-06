/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.práctico.java;

import java.util.ArrayList;

/**
 *
 * @author Pacho
 */
/*
*atributos asignados a la clase fruit
*/

public class Fruit {

    public String name;
    private float averageWeight;
    public ArrayList<String> colors;

/*
*Getter y setters de averageWeight atributo con estado de nivel de seguridad private
*/
    public float getAverageWeight() {
        return averageWeight;
    }

    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }
        
/*
*Constructores de los atributos de la clase Fruit
*/

public Fruit()
    {

    this.name="cherry";
    this.averageWeight= 6;
    colors= new ArrayList<String>();
    colors.add("Blue");
    colors.add("Red");
    colors.add("Yellow");


    }
/*
*Métodos de la clase Fruit
*/

 public String FilterName()
 {
  return this.name;
 }

  public String SelectColors()
 {
  return this.SelectColors();
 }
   
}
