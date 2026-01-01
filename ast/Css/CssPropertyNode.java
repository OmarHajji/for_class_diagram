package ast.Css;
import  ast.ASTNode;

public class CssPropertyNode extends ASTNode {
    private final String name;

    public CssPropertyNode(String name, int line) {
        super("CssProperty", line);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print(int indent) {
        System.out.println(getIndent(indent) + "+-- Property: " + name);
    }

    @Override
    public String getDescription() {
        return "CSS Property: " + name;
    }
}

