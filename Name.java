	import java.util.Date;

public class Name {
    private String title;
    private String first;
    private String middle;
    private String surname;
    private String surnameParent1;
    private String surnameParent2;
    private String suffixGenerational; // e.g., III, Jr., Sr., etc.
    private String suffixProfessional; // e.g., Ph.D., CPA, etc.

    public Name (
                 String title,
                 String first,
                 String middle,
                 String surname,
                 String surnameParent1,
                 String surnameParent2,
                 String generational,
                 String professional
                 ) {
        this.title = title;
        this.first = first;
        this.middle = middle;
        this.surname = surname;
        this.surnameParent1 = surnameParent1;
        this.surnameParent2 = surnameParent2;
        this.suffixGenerational = generational;
        this.suffixProfessional = professional;
    }

    public String getTitle() {


        return title;


    }

    /**
     * This method will output the first name of the name
     * @author Anthony Russell, Dillon Furey, Eric Miers, Andrew McNeill
     * @return first String containing the first name
     */
    public String getFirst() {

        return first;
    }

    public String getMiddle() {
		return this.middle;
        /* return Name's middle name */
    }

    public String getSurname() {
        /* return Name's last name */
		return surname;
    }

    public String getSurnameParent1() {
        return this.surnameParent1;
    }

    public String getSurnameParent2() {
        return this.surnameParent2;
    }

    public String getSuffixProfessional() {
    	return suffixProfessional;
    }



    public String getSuffixGenerational() {
        return this.suffixGenerational;

    }
}
