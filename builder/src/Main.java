public class Main {
    public static void main(String[] args) {

        Person person = PersonBuilder
                .builder()
                .name("amir")
                .family("fathi")
                .identityNo(12345L)
                .build();
        System.out.println(person.toString());

    }
}