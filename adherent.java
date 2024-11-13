

/**
 * 
 */
public class adherent {

    /**
     * Default constructor
     */
    private String nom;
    private String prenom;
    private String adr;
    private String num_ins;
   
    public adherent(String nom, String prenom, String adr, String num_ins) {
        this.nom=nom;
        this.prenom=prenom;
        this.adr=adr;
        this.num_ins=num_ins;
    }
    /**
     * 
     */
    

    /**
     * 
     */
    public String getnom() { return nom; }
    

    /**
     * 
     */
    public String getprenom() { return prenom; }
    public void setprenom(String prenom) { this.prenom = prenom; }

    /**
     * 
     */
    public String getadr() { return adr; }
    public void setadr(String adr) { this.adr = adr; }


    public String getnum_ins() { return num_ins; }
    public void setnum_ins(String num_ins) { this.num_ins = num_ins; }

    


}