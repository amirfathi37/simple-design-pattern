public class Person {
    private String name;
    private String family;
    private Long identityNo;



    public Person() {
    }

    public Person(String name, String family, Long identityNo) {
        this.name = name;
        this.family = family;
        this.identityNo = identityNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public Long getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(Long identityNo) {
        this.identityNo = identityNo;
    }
}
