package ast.Css;

import ast.ASTNode;

public class CssValueNode extends ASTNode {
    private final String value;

    public CssValueNode(String value, int line) {
        super("CssValue", line);
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public void print(int indent) {
        System.out.println(getIndent(indent) + "+-- Value: " + value);
    }

    @Override
    public String getDescription() {
        return "CSS Value: " + value;
    }
}
