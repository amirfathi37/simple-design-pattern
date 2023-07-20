public class PersonBuilder {
    private String name;
    private String family;
    private Long identityNo;


    public PersonBuilder name(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder family(String family) {
        this.family = family;
        return this;
    }

    public PersonBuilder identityNo(Long identityNo) {
        this.identityNo = identityNo;
        return this;
    }

    public Person build() {
        return new Person(name, family, identityNo);
    }

    public static PersonBuilder builder(){
        return new PersonBuilder();
    }

}
