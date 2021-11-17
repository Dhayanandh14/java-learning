interface language {
  void getLanguageName(String name);
}

// class implements interface
class ProgrammingLanguage implements language {

  // implementation of abstract method
  public void getLanguageName(String name) {
    System.out.println("Programming Language Name: " + name);
  }
}
class Framework implements language {

  // implementation of abstract method
  public void getLanguageName(String name) {
    System.out.println("Framework Name: " + name);
  }
}

class programming {
  public static void main(String[] args) {
    ProgrammingLanguage language = new ProgrammingLanguage();
    Framework frameworkobj = new Framework();
    language.getLanguageName("Java");
    frameworkobj.getLanguageName("Spring Boot");
  }
}
