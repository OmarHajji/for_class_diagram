package ast;

public class ReturnNode extends StatementNode  {
    private ASTNode value;

    public ReturnNode(int lineNumber) {
        super("Return", lineNumber);
    }

    public void setValue(ASTNode value) {
        this.value = value;
        if (value != null)
            addChild(value);
    }

    public ASTNode getValue() {
        return value;
    }

    @Override
    public void print(int indent) {
        String ind = getIndent(indent);
        System.out.println(ind + "+-- Return (Line: " + lineNumber + ")");
        if (value != null) value.print(indent + 1);
    }

    @Override
    public String getDescription() {
        return "Return";
    }
}