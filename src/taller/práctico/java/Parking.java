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
*Atributos asignados al a clase Parking
*/
public class Parking {

    private int trans;
    private int ticket;
    private String licenseplate;
    private Date entry;
    private Date exit;
    private String duration;
    private float subTotal;
    private float totalDue;

/*
*Getter y setters de averageWeight atributo con estado de nivel de seguridad private
*/

    public int getTrans() {
        return trans;
    }

    public void setTrans(int trans) {
        this.trans = trans;
    }

    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    public String getLicenseplate() {
        return licenseplate;
    }

    public void setLicenseplate(String licenseplate) {
        this.licenseplate = licenseplate;
    }

    public Date getEntry() {
        return entry;
    }

    public void setEntry(Date entry) {
        this.entry = entry;
    }

    public Date getExit() {
        return exit;
    }

    public void setExit(Date exit) {
        this.exit = exit;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public float getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(float subTotal) {
        this.subTotal = subTotal;
    }

    public float getTotalDue() {
        return totalDue;
    }

    public void setTotalDue(float totalDue) {
        this.totalDue = totalDue;
    }

/*
*Constructores de los atributos de la clase
*/

    public Parking()
    {
    
     trans=01;
     ticket=01;
     licenseplate="143HDI";
     Date entry = new Date();
     Date exit = new Date();
     duration= "1 hora";
     subTotal =(float) 5.000;
     totalDue=(float) 5.000;
             
     }

 /*
*Métodos de la clase Parking
*/
public String FilterPLate()
{

return this.licenseplate;
}

}

   
