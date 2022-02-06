/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.práctico.java;

/**
 *
 * @author Pacho
 */

/*
*Atributos asignados al a clase CellPhone
*/

public class CellPhone {

    public String brand;
    public String model;
    public String os;
    public String camera; 
    public String chip;
    public String storage;
    private String imei;    

/*
*Getter y setters de averageWeight atributo con estado de nivel de seguridad private
*/

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

 /*
*Constructores de los atributos de la clase
*/

public CellPhone()
{

 this.brand="Iphone";
 this.model="13 promax";
 this.os=" apple";
 this.camera=" 12 mp gran angular";
 this.chip=" A13 bio";
 this.storage="64 GB";
 this.imei="2374982346gH";

}

/*
*Métodos de la clase CellPhone
*/

public String FilterBrand()
{
return this.brand;

}

public String FilterModel()
{
return this.model;
}

public String FilterStorage()
{
return this.storage;
}
}
