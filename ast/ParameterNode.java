package ast;
// parameters
public class ParameterNode extends ASTNode {
    private String name;


    public ParameterNode(String name, int lineNumber) {
        super("Parameter", lineNumber);
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public void print(int indent) {
        String ind = getIndent(indent);
        System.out.print(ind + "+-- Parameter: " + name);
            System.out.println();

    }
    @Override
    public String getDescription() {
        return "Parameter: " + name;
    }
}