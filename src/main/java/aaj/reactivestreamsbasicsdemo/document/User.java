package aaj.reactivestreamsbasicsdemo.document;

import aaj.reactivestreamsbasicsdemo.dto.UserOtherContactDTO;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Objects;

@Document
@JsonSerialize
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuppressWarnings("unused")
public class User {
  @JsonProperty("id")
  private String id;
  @JsonProperty("name")
  private String name;
  @JsonProperty("lastname")
  private String lastname;
  @JsonProperty("phone_number")
  private String phoneNumber;
  @JsonProperty("email")
  private String email;
  @JsonProperty("region")
  private String region;
  @JsonProperty("other_contacts")
  private List<UserOtherContactDTO> userOtherContactDTO;

  @Id
  public String getId() {
    return id;
  }

  public User setId(String id) {
    this.id = id;
    return this;
  }

  public String getName() {
    return name;
  }

  public User setName(String name) {
    this.name = name;
    return this;
  }

  public String getLastname() {
    return lastname;
  }

  public User setLastname(String lastname) {
    this.lastname = lastname;
    return this;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public User setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  public String getEmail() {
    return email;
  }

  public User setEmail(String email) {
    this.email = email;
    return this;
  }

  public String getRegion() {
    return region;
  }

  public User setRegion(String region) {
    this.region = region;
    return this;
  }

  public List<UserOtherContactDTO> getUserOtherContactDTO() {
    return userOtherContactDTO;
  }

  public User setUserOtherContactDTO(List<UserOtherContactDTO> userOtherContactDTO) {
    this.userOtherContactDTO = userOtherContactDTO;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(id, user.id) && Objects.equals(name, user.name) && Objects.equals(lastname, user.lastname) && Objects.equals(phoneNumber, user.phoneNumber) && Objects.equals(email, user.email) && Objects.equals(region, user.region) && Objects.equals(userOtherContactDTO, user.userOtherContactDTO);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, lastname, phoneNumber, email, region, userOtherContactDTO);
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("User{");
    sb.append("id='").append(id).append('\'');
    sb.append(", name='").append(name).append('\'');
    sb.append(", lastname='").append(lastname).append('\'');
    sb.append(", phoneNumber='").append(phoneNumber).append('\'');
    sb.append(", email='").append(email).append('\'');
    sb.append(", region='").append(region).append('\'');
    sb.append(", userOtherContactDTO=").append(userOtherContactDTO);
    sb.append('}');
    return sb.toString();
  }
}
