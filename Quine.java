public class Quine {
  public static void main(String[] args) {
    char quotationMark = 34;
    String[] code = {
        "public class Quine {",
        "  public static void main(String[] args) {",
        "    char quotationMark = 34;",
        "    String[] code = {",
        "    ",
        "    };",
        "    for (int line = 0; line < 4; line++)",
        "      System.out.println(code[line]);",
        "    for (int line = 0; line < code.length; line++)",
        "      System.out.println(code[4] + code[4] + quotationMark + code[line] + quotationMark + ',');",
        "    for (int line = 5; line < code.length; line++)",
        "      System.out.println(code[line]);",
        "  }",
        "}",
    };
    for (int line = 0; line < 4; line++)
      System.out.println(code[line]);
    for (int line = 0; line < code.length; line++)
      System.out.println(code[4] + code[4] + quotationMark + code[line] + quotationMark + ',');
    for (int line = 5; line < code.length; line++)
      System.out.println(code[line]);
  }
}
