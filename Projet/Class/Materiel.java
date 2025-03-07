import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("0aab13ce-bb46-4cae-9d4d-8a9e913cf359")
public class Materiel {
    @objid ("5ef6fdbe-6950-45e7-bcfb-faf97517dcf4")
    private String nom;

    @objid ("8dfa9374-01d4-498e-addb-62fe0b761472")
    private double tarif;

    @objid ("7b5b7ce5-91ec-4ca8-bc16-1f126bcbcf9f")
    public String getNom() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nom;
    }

    @objid ("e91aec7b-b379-463b-9485-20c28be35073")
    public void setNom(final String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nom = value;
    }

    @objid ("cf00247c-9f52-4223-9ceb-df1f2a7cf580")
    public double getTarif() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.tarif;
    }

    @objid ("e3dd8b47-e932-4452-8a86-6224fda4004a")
    public void setTarif(final double value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.tarif = value;
    }

}
