package ast;
// routes بس اسمو
public class DecoratorNode extends ASTNode {
    private String name;

    public DecoratorNode(String name, int lineNumber) {
        super("Decorator", lineNumber);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print(int indent) {
        String ind = getIndent(indent);
        System.out.println(ind + "+-- Decorator: " + name + " (Line: " + lineNumber + ")");
        printChildren(indent + 1);
    }

    @Override
    public String getDescription() {
        return "Decorator: " + name;
    }
}