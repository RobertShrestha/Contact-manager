/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactmanager.objects;

/**
 *
 * @author ANUKUL CHHETRI
 */
public class Contact {

    private int Id;
    private String Firstname;
    private String Lastname;
    private String Email;
    private String Phone;
    private String Mobile;
    private String DOB;
    private String Facebook;
    private String Twitter;
    private String Linkedin;
    private String Googleplus;
    private String Added_date;
    private String modified_date;
    private String De;
    private String Fn;
    private String Ln;
    private String Em;

    public Contact() {
    }

    public Contact(int Id, String Firstname, String Lastname, String Email, String Phone, String Mobile, String DOB, String Facebook, String Twitter, String Linkedin, String Googleplus, String Added_date, String modified_date, String De, String Fn, String Ln, String Em) {
        this.Id = Id;
        this.Firstname = Firstname;
        this.Lastname = Lastname;
        this.Email = Email;
        this.Phone = Phone;
        this.Mobile = Mobile;
        this.DOB = DOB;
        this.Facebook = Facebook;
        this.Twitter = Twitter;
        this.Linkedin = Linkedin;
        this.Googleplus = Googleplus;
        this.Added_date = Added_date;
        this.modified_date = modified_date;
        this.De = De;
        this.Fn = Fn;
        this.Ln = Ln;
        this.Em = Em;
    }

    

    

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getFacebook() {
        return Facebook;
    }

    public void setFacebook(String Facebook) {
        this.Facebook = Facebook;
    }

    public String getTwitter() {
        return Twitter;
    }

    public void setTwitter(String Twitter) {
        this.Twitter = Twitter;
    }

    public String getLinkedin() {
        return Linkedin;
    }

    public void setLinkedin(String Linkedin) {
        this.Linkedin = Linkedin;
    }

    public String getGoogleplus() {
        return Googleplus;
    }

    public void setGoogleplus(String Googleplus) {
        this.Googleplus = Googleplus;
    }

    public String getAdded_date() {
        return Added_date;
    }

    public void setAdded_date(String Added_date) {
        this.Added_date = Added_date;
    }

    public String getModified_date() {
        return modified_date;
    }

    public void setModified_date(String modified_date) {
        this.modified_date = modified_date;
    }

    public String getDe() {
        return De;
    }

    public void setDe(String De) {
        this.De = De;
    }

   

    public String getFn() {
        return Fn;
    }

    public void setFn(String Fn) {
        this.Fn = Fn;
    }

    public String getLn() {
        return Ln;
    }

    public void setLn(String Ln) {
        this.Ln = Ln;
    }

    public String getEm() {
        return Em;
    }

    public void setEm(String Em) {
        this.Em = Em;
    }
    
    

}

   