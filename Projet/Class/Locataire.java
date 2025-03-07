import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("7696e429-d3dd-47d5-969e-d2c82183db59")
public class Locataire {
    @objid ("d51dc21a-0085-4059-b1e0-3ea24426262c")
    private String nom;

    @objid ("66d6bcb5-2d85-4b57-9e8d-7e138fa91a0e")
    private String prenom;

    @objid ("a5f434c7-dec1-455a-958c-f4b691b59a73")
    private String email;

    @objid ("4fe2462d-bb36-4df0-a678-a933f62c164a")
    private String mobile;

    @objid ("e118eeae-4ece-49da-9eb1-8ca689a29057")
    public List<Avis>  = new ArrayList<Avis> ();

    @objid ("2150b24b-987b-4e59-b9e8-d6b4d162292d")
    public List<Reservation>  = new ArrayList<Reservation> ();

    @objid ("15607fec-e482-4116-8e36-c7f724eb5c3f")
    public String getNom() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nom;
    }

    @objid ("aeb4ac8a-bb5b-48b8-af30-1890251a4354")
    public void setNom(final String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nom = value;
    }

    @objid ("cef92dd8-9149-4759-9068-725f5eb56f65")
    public String getPrenom() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.prenom;
    }

    @objid ("c5cad20e-f30a-4f1c-8a92-f913f2c07ed7")
    public void setPrenom(final String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.prenom = value;
    }

    @objid ("74c7306e-d5b4-4c35-811e-e14180a6a7ff")
    public String getEmail() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.email;
    }

    @objid ("aa18af1f-eb14-4680-acf3-e73c3e338ff0")
    public void setEmail(final String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.email = value;
    }

    @objid ("08de4ee8-98fa-4ea4-96ac-278d7416d2a7")
    public String getMobile() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.mobile;
    }

    @objid ("c19fd23d-6cee-4132-ad49-8b1467fb6835")
    public void setMobile(final String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.mobile = value;
    }

}
