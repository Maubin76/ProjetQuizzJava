import java.io.Serializable;

public class Utilisateur implements Serializable{
    private String id;
    private String mdp;
    private boolean admin;

    public Utilisateur(String id, String mdp, boolean admin){
        this.id = id;
        this.mdp = mdp;
        this.admin = admin;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    
}
