package builderPattern;

public class Person {

    private String name;
    private String email;
    private String address;
    private String age;

    public Person(Builder builder) {
        this.address = builder.address;;
        this.address = builder.age;
    }


    public static class Builder{
        private final String name;
        private final String email;

        private String address;

        private String age;

        public Builder(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public Builder setAddress(String address){
            this.address = address;
            return this;
        }

        public Builder setAge(String age){
            this.age = age;
            return this;
        }


        public Person build(){
            return new Person(this);
        }
    }
}
