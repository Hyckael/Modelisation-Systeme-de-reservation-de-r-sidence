import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("13d81a5a-9da3-441d-8b12-04ce9a94b6e9")
public class Gestionnaire {
    @objid ("9e07dbe6-6050-4a4a-a4ad-83102f29087a")
    private String email;

    @objid ("7af32243-449e-4c00-b8ea-c20c75b80fed")
    private String mobile;

    @objid ("e534803b-a57b-4cf5-bcf4-82115b101e82")
    private String prenom;

    @objid ("3a90800c-dc43-41e1-a40a-fa8c92acf01f")
    private String nom;

    @objid ("bd628e59-2e37-4fa8-bda9-58bc2e3b0e2a")
    public List<Residence>  = new ArrayList<Residence> ();

    @objid ("a542e213-4912-40e8-bfc3-4a39c5c62539")
    public String getEmail() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.email;
    }

    @objid ("c709763e-d615-48f4-8531-08ce1af200e7")
    public void setEmail(final String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.email = value;
    }

    @objid ("2c2218f5-a1de-4889-8c2f-85236db468f7")
    public String getMobile() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.mobile;
    }

    @objid ("498e70b5-9420-4faf-ab70-9a1ef61347a5")
    public void setMobile(final String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.mobile = value;
    }

    @objid ("75746f6b-41f1-436f-8543-38e3d16b4009")
    public String getPrenom() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.prenom;
    }

    @objid ("65cb7aa5-58f9-409b-a248-42366f895976")
    public void setPrenom(final String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.prenom = value;
    }

    @objid ("494da19b-d6b1-4c0f-b5b6-3c63642b58ef")
    public String getNom() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nom;
    }

    @objid ("a1f139a6-a116-4d5a-b42b-1db44e942e20")
    public void setNom(final String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nom = value;
    }

}
