package ast;

public class ElseNode extends StatementNode {
    private ASTNode body;

    public ElseNode(int lineNumber) {
        super("Else", lineNumber);
    }

    public void setBody(ASTNode body) {
        this.body = body;
    }

    @Override
    public void print(int indent) {
        String ind = getIndent(indent);
        System.out.println(ind + "+-- Else (Line: " + lineNumber + ")");
        if (body != null) body.print(indent + 1);
    }

    @Override
    public String getDescription() {
        return "Else";
    }
}