import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("354c3dd3-7fd2-457a-80fa-01a9a46ff57f")
public class Reservation {
    @objid ("6712ecca-c467-4c70-8786-6904fb1599bd")
    private Date dateDeb;

    @objid ("9f8a7a65-4360-45d9-9989-15ad0ecb8da8")
    private Date dateFin;

    @objid ("2f794524-9377-421c-ad1a-af07416711e5")
    private double prixTotal;

    @objid ("818dc91b-8574-4ef9-a79a-52b396b45b88")
    private String status;

    @objid ("4c68c30f-0731-492d-b6ab-46fce2b5d3d8")
    public List<Prestation>  = new ArrayList<Prestation> ();

    @objid ("783d94cd-993c-46ca-8a16-4a67fc725a41")
    public List<Element>  = new ArrayList<Element> ();

    @objid ("e01f7814-f491-4047-937e-72eb030bde18")
    public Date getDateDeb() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.dateDeb;
    }

    @objid ("9852b1aa-f82e-4020-a59e-498a9f2840b8")
    public void setDateDeb(final Date value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.dateDeb = value;
    }

    @objid ("e8836074-e3e7-4caf-ba85-d3a063c9bd6a")
    public Date getDateFin() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.dateFin;
    }

    @objid ("7b07b8ba-ddd8-444a-b867-b510351279ab")
    public void setDateFin(final Date value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.dateFin = value;
    }

    @objid ("a4bb2c4a-1fd8-4592-a633-ad3d1277015a")
    public double getPrixTotal() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.prixTotal;
    }

    @objid ("ccee4e12-677b-40df-85eb-c19ffbd9b23d")
    public void setPrixTotal(final double value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.prixTotal = value;
    }

    @objid ("0b080209-4547-4108-9755-e9d1ffa2ac82")
    public String getStatus() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.status;
    }

    @objid ("5db9b9b4-17c9-40a5-896f-1e2253c28226")
    public void setStatus(final String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.status = value;
    }

}
