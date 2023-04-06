package sk.stuba.fiit.martin.szabo.gymbro.utils;

public enum Places{

    DUBRAVKA("Dubravka", new Vector2D(-200, -200)),
    LAMAC("Lamac", new Vector2D(-140, -202)),
    DEVIN("Devin", new Vector2D(-253, -111)),
    KARLOVA_VES("Karlova Ves", new Vector2D(-132, -70)),
    DEVINSKA_NOVA_VES("Devinska Nova Ves", new Vector2D(-331, -317)),
    ZAHORSKA_BYSTRICA("Zahorska Bystrica", new Vector2D(-161, -313)),
    STARE_MESTO("Stare Mesto", new Vector2D(-58, -71)),
    NOVE_MESTO("Nove Mesto", new Vector2D(17, -124)),
    RACA("Raca", new Vector2D(80, -228)),
    VAJNORY("Vajnory", new Vector2D(210, -227)),
    PETRZALKA("Petrzalka", new Vector2D(-46, 84)),
    RUZINOV("Ruzinov", new Vector2D(139, -72)),
    VRAKUNA("Vrakuna", new Vector2D(232, -32)),
    PODUNAJSKE_BISKUPICE("Podunajske Biskupice", new Vector2D(211, 46)),
    JAROVCE("Jarovce", new Vector2D(-4, 249)),
    RUSOVCE("Rusovce", new Vector2D(78, 292)),
    CUNOVO("Cunovo", new Vector2D(201, 373));

    private String label;
    private Vector2D position;

    Places(String label, Vector2D position){
        this.label = label;
        this.position = position;
    }

    public String getLabel(){
        return label;
    }

    public Vector2D getPosition(){
        return position;
    }

    @Override
    public String toString(){
        return label;
    }
}
