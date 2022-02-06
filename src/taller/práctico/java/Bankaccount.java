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
*Atributos asignados a la clase Bankaccount
*/
public class Bankaccount {
    private int accountNumber;
    private String Numberidentification;
    protected boolean activated;

/*
*Getter y setters de averageWeight atributo con estado de nivel de seguridad private
*/

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getNumberidentification() {
        return Numberidentification;
    }

    public void setNumberidentification(String Numberidentification) {
        this.Numberidentification = Numberidentification;
    }

/*
*Constructores de los atributos de la clase
*/

public Bankaccount()
{

    this.accountNumber=234555;
    this.Numberidentification="1023887473";
    boolean activated= true;


}
/*
*Métodos de la clase Bankaccount
*/

 public String ValidateDocument()
 {
  return this.Numberidentification;
 }
public boolean authorization()
{
return this.activated; 
}

}
