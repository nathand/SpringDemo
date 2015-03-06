package sample.repository;

import org.springframework.data.annotation.Id;


public class User {

    @Id
    private int Id;

    private String FirstName;
    private String LastName;

    public User() {}

    public User(String firstName, String lastName) {
        this.FirstName = firstName;
        this.LastName = lastName;
        this.Id = 0;
    }

    @Override
    public String toString() {
        return String.format(
                "User[firstName='%s', lastName='%s']",
                this.FirstName, this.LastName);
    }

    public int getId() {
      return this.Id;
    }

    public String getFirstName() {
      return this.FirstName;
    }

    public String getLastName() {
      return this.LastName;
    }

}
