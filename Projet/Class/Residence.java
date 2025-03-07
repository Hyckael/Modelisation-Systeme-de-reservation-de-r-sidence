import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("cb8bc104-743f-4e79-9103-0077bdb85341")
public class Residence {
    @objid ("a4ef5760-e785-42fc-bd64-510ee15c2bb3")
    private String adresse;

    @objid ("506c3701-0e6f-4169-adbd-97fd1b6d05fc")
    private String description;

    @objid ("5bea274c-caf7-4156-9a9e-f9e4446214b3")
    private String nom;

    @objid ("a6254e61-23cc-4ac2-904a-1602b047be32")
    public List<Element>  = new ArrayList<Element> ();

    @objid ("71459ee9-fd02-4a09-a414-2f84a5723d14")
    public void set(final List<Element> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this. = value;
    }

    @objid ("f26872f8-0506-4717-903c-7d9cbcd99378")
    public String getAdresse() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.adresse;
    }

    @objid ("f9b89ebd-1a4e-48eb-880c-2bb7f63fc1f6")
    public void setAdresse(final String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.adresse = value;
    }

    @objid ("dff4636f-45ff-4ad0-a233-51c69f550976")
    public String getDescription() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.description;
    }

    @objid ("fdab95f7-d95a-40e6-ab1f-d2ccd2648954")
    public void setDescription(final String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.description = value;
    }

}
