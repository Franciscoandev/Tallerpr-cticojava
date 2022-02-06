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
*atributos asignados a la clase VirtualBank
*/
public class VirtualBank {

    private String username;
    private String in;
    protected String password; 

/*
*Getter y setters de averageWeight atributo con estado de nivel de seguridad private
*/

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIn() {
        return in;
    }

    public void setIn(String in) {
        this.in = in;
    }

  /*
*Constructores de los atributos de la clase
*/

public VirtualBank()
{
    this.username="fr@nc1sc0";
    this.in="123456";
    this.password="123123";
}

/*
*Métodos de la clase VirtualBank
*/

public String Filteridentification()
{
return this.in;
}

}


