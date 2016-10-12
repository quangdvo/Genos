package model;

/**
 * Created by Allen on 10/3/2016.
 */
public enum Title {
    Mr ("Mister", "Mr."),
    Mrs ("Missus", "Mrs."),
    Ms ("Miss", "Ms."),
    Dr ("Doctor","Dr.");

    private final String name;
    private final String charRep;

    /**
     * Counstructor for AccountType enumeration
     * @param cName
     * @param cRep
     */
    Title(String cName, String cRep) {
        name = cName;
        charRep = cRep;
    }

    /**
     * returns the full string name
     * @return full name string
     */
    public String getName() {return name;}

    /**
     * returns the shortened char representation
     * @return char rep string
     */
    public String getCharRep() {return charRep;}

    /**
     * returns the shortened char rep
     * @return char rep string
     */
    public String toString() {return name;}
}
