package sk.stuba.fiit.martin.szabo.gymbro.utils;

public enum Places{

    DUBRAVKA("Dubravka", new Vector2D(185, 272)),
    LAMAC("Lamac", new Vector2D(275, 266)),
    DEVIN("Devin", new Vector2D(175, 372)),
    KARLOVA_VES("Karlova Ves", new Vector2D(273, 366)),
    DEVINSKA_NOVA_VES("Devinska Nova Ves", new Vector2D(88, 144)),
    ZAHORSKA_BYSTRICA("Zahorska Bystrica", new Vector2D(224, 114)),
    STARE_MESTO("Stare Mesto", new Vector2D(367, 413)),
    NOVE_MESTO("Nove Mesto", new Vector2D(394, 359)),
    RACA("Raca", new Vector2D(500, 248)),
    VAJNORY("Vajnory", new Vector2D(608, 257)),
    PETRZALKA("Petrzalka", new Vector2D(398, 512)),
    RUZINOV("Ruzinov", new Vector2D(490, 400)),
    VRAKUNA("Vrakuna", new Vector2D(618, 389)),
    PODUNAJSKE_BISKUPICE("Podunajske Biskupice", new Vector2D(557, 640)),
    JAROVCE("Jarovce", new Vector2D(369, 712)),
    RUSOVCE("Rusovce", new Vector2D(447, 819)),
    CUNOVO("Cunovo", new Vector2D(536, 864));

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
