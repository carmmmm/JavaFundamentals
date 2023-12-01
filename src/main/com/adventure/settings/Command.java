package main.com.adventure.settings;



public class Command {

    private CommandVerb verb = CommandVerb.INVALID;
    private String objectName;

    /**
     * Creates a command.
     * @param verb - the verb of the command
     * @param objectName - the object(s) to which the command is directed.
     */
    public Command(CommandVerb verb, String objectName) {
        this.verb = verb;
        this.objectName = objectName;
    }

    /**
     * Creates a command with no direct object (e.g. "help").
     * @param verb - the verb of the command
     */
    public Command(CommandVerb verb) {
        this.verb = verb;
        this.objectName = "";
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public CommandVerb getVerb() {
        return verb;
    }

    public void setVerb(CommandVerb verb) {
        this.verb = verb;
    }

    @Override
    public String toString() {
        return "Command{" +
                "verb='" + verb + '\'' +
                ", objectName='" + objectName + '\'' +
                '}';
    }
}
