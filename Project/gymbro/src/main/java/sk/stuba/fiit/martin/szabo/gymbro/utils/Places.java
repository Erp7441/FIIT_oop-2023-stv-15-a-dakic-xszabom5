package sk.stuba.fiit.martin.szabo.gymbro.utils;

/**
 * The enum Places.
 */
public enum Places{

    /**
     * The Dubravka.
     */
    DUBRAVKA("Dubravka", new Vector2D(185, 272)),
    /**
     * The Lamac.
     */
    LAMAC("Lamac", new Vector2D(275, 266)),
    /**
     * The Devin.
     */
    DEVIN("Devin", new Vector2D(175, 372)),
    /**
     * The Karlova ves.
     */
    KARLOVA_VES("Karlova Ves", new Vector2D(273, 366)),
    /**
     * The Devinska nova ves.
     */
    DEVINSKA_NOVA_VES("Devinska Nova Ves", new Vector2D(88, 144)),
    /**
     * The Zahorska bystrica.
     */
    ZAHORSKA_BYSTRICA("Zahorska Bystrica", new Vector2D(224, 114)),
    /**
     * The Stare mesto.
     */
    STARE_MESTO("Stare Mesto", new Vector2D(367, 413)),
    /**
     * The Nove mesto.
     */
    NOVE_MESTO("Nove Mesto", new Vector2D(394, 359)),
    /**
     * The Raca.
     */
    RACA("Raca", new Vector2D(500, 248)),
    /**
     * The Vajnory.
     */
    VAJNORY("Vajnory", new Vector2D(608, 257)),
    /**
     * The Petrzalka.
     */
    PETRZALKA("Petrzalka", new Vector2D(398, 512)),
    /**
     * The Ruzinov.
     */
    RUZINOV("Ruzinov", new Vector2D(490, 400)),
    /**
     * The Vrakuna.
     */
    VRAKUNA("Vrakuna", new Vector2D(618, 389)),
    /**
     * The Podunajske biskupice.
     */
    PODUNAJSKE_BISKUPICE("Podunajske Biskupice", new Vector2D(557, 640)),
    /**
     * The Jarovce.
     */
    JAROVCE("Jarovce", new Vector2D(369, 712)),
    /**
     * The Rusovce.
     */
    RUSOVCE("Rusovce", new Vector2D(447, 819)),
    /**
     * The Cunovo.
     */
    CUNOVO("Cunovo", new Vector2D(536, 864));

    private String label;
    private Vector2D position;

    Places(String label, Vector2D position){
        this.label = label;
        this.position = position;
    }

    /**
     * Get label string.
     *
     * @return the string
     */
    public String getLabel(){
        return label;
    }

    /**
     * Get position vector 2 d.
     *
     * @return the vector 2 d
     */
    public Vector2D getPosition(){
        return position;
    }

    @Override
    public String toString(){
        return label;
    }
}
