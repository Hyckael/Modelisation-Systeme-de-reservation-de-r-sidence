import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("e536f84d-a87c-4b57-8b66-eb4b0e43b7b7")
public class Prestation {
    @objid ("ccbd2d3a-b4bb-4301-9f14-c89a50af53b4")
    private String nom;

    @objid ("b7788ab0-8fb7-4368-b389-9ab71a60c2d7")
    private double tarif;

    @objid ("1fba5fbc-6ec0-495f-84ae-dfcdd6c61c66")
    private String type;

    @objid ("f7b2edd1-6acd-42df-87fb-6c5e4577d3a0")
    public String getNom() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nom;
    }

    @objid ("c6e74281-17e7-4631-abc5-1799ac7dace9")
    public void setNom(final String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nom = value;
    }

    @objid ("e88e0d1d-72ea-4c59-a7e0-395af7aa26c7")
    public double getTarif() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.tarif;
    }

    @objid ("590ef0e9-34c4-4e75-9d31-16717633467c")
    public void setTarif(final double value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.tarif = value;
    }

    @objid ("53bce65c-c55e-4aa8-8fdb-a468f28e5faf")
    public String getType() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.type;
    }

    @objid ("b1f02ac7-192b-4a7c-bbda-70fbb025df37")
    public void setType(final String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.type = value;
    }

}
