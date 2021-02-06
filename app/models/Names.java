package models;

import io.ebean.Model;
import play.data.format.Formats;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Names extends Model {

  public Names(String name, Date create_date, Date modified_date) {
    super();
    this.name = name;
    this.create_date = create_date;
    this.modified_date = modified_date;
  }

  @Id
  private Integer id;

  private String name;

  @Formats.DateTime(pattern = "dd/MM/yyyy")
  public Date create_date = new Date();

  @Formats.DateTime(pattern = "dd/MM/yyyy")
  public Date modified_date = new Date();

//  public static Finder<Integer, Names> find = new Finder<>(Names.class);

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getCreate_date() {
    return create_date;
  }

  public void setCreate_date(Date create_date) {
    this.create_date = create_date;
  }

  public Date getModified_date() {
    return modified_date;
  }

  public void setModified_date(Date modified_date) {
    this.modified_date = modified_date;
  }
}
