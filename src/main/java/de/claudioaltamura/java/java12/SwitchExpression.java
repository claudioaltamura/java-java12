package de.claudioaltamura.java.java12;

/**
 * @see <a href="https://www.journaldev.com/28666/java-12-features#1-switch-expressions-preview">switch expressions</a>
 */
class SwitchExpression {

  String day(String day) {
    return switch (day) {
      case "M", "W", "F" -> "MWF";
      case "T", "TH", "S" -> "TTS";
      default -> {
        if(day.isEmpty())
          break "Please insert a valid day.";
                else
        break "Looks like a Sunday.";
      }
    };
  }

}
