
package net.akhilesh.constant;

public enum Sort {

  RECENT("mostRecent"), HELPFUL("mostHelpful");
  String name;

  Sort(String name) {
    this.name = name;
  }
}
