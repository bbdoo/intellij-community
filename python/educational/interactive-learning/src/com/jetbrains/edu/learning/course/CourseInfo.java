package com.jetbrains.edu.learning.course;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Implementation of class which contains information to be shawn in course description in tool window
 * and when project is being created
 */
public class CourseInfo {
  boolean is_public;
  public List<Integer> sections;
  @SerializedName("title")
  private String myName;
  @SerializedName("summary")
  private String myDescription;

  private String myAuthor;
  public static CourseInfo INVALID_COURSE = new CourseInfo("", "", "");

  public CourseInfo(String name, String author, String description) {
    myName = name;
    myAuthor = author;
    myDescription = description;
  }

  public String getName() {
    return myName;
  }

  public String getAuthor() {
    return myAuthor;
  }

  public String getDescription() {
    return myDescription;
  }

  @Override
  public String toString() {
    return myName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CourseInfo that = (CourseInfo)o;
    return that.getName().equals(myName) && that.getAuthor().equals(myAuthor)
           && that.getDescription().equals(myDescription);
  }

  @Override
  public int hashCode() {
    int result = myName != null ? myName.hashCode() : 0;
    result = 31 * result + (myAuthor != null ? myAuthor.hashCode() : 0);
    result = 31 * result + (myDescription != null ? myDescription.hashCode() : 0);
    return result;
  }
}
