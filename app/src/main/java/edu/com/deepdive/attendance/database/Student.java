package edu.com.deepdive.attendance.database;

import android.animation.ValueAnimator;
import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(
    tableName = "students",
    indices = {
        @Index(value = {"last_name", "first_name"}, unique = true),
        @Index(value = {"display_name"}, unique = true)

    }
)
public class Student {

  @PrimaryKey(autoGenerate = true)
  @ColumnInfo(name = "student_id")
  private long id;

  @NonNull
  @ColumnInfo(name = "last_name", collate = ColumnInfo.NOCASE)
  private String lastName;

  @NonNull
  @ColumnInfo(name = "first_name", collate = ColumnInfo.NOCASE)
  private String firstName;

  @NonNull
  @ColumnInfo(name = "display_name", collate = ColumnInfo.NOCASE)
  private String displayname;

  @ColumnInfo(name = "phone_number", index = true)
  private String phonenumber;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  @NonNull
  public String getLastName() {
    return lastName;
  }

  public void setLastName(@NonNull String lastname) {
    this.lastName = lastname;
  }

  @NonNull
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(@NonNull String firstName) {
    this.firstName = firstName;
  }

  @NonNull
  public String getDisplayname() {
    return displayname;
  }

  public void setDisplayname(@NonNull String displayname) {
    this.displayname = displayname;
  }

  public String getPhonenumber() {
    return phonenumber;
  }

  public void setPhonenumber(String phonenumber) {
    this.phonenumber = phonenumber;
  }

  @Entity(
      tableName = "absences",
      indices = {
          @Index(value = {"start,"end"}),
          @Index(value = {"student_id", "start, end"},
          @Index(value = {"student_id", "start"}, unique = true),


      public class Absence {

      @PrimaryKey(autoGenerate = true)
      @ColumnInfo(name = "absence_id")
      private long id;


      @ColumnInfo(name = "student_id")
      private long studentid;

      @NonNull
      private Date start = new Date();
      private Date end;

      private boolean excused;




  }


}



}
