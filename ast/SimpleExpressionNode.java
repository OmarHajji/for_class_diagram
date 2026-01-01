package ast;

public class SimpleExpressionNode extends ExpressionNode {

    private final String text;

    public SimpleExpressionNode(String text, int lineNumber) {
        super("Expression", lineNumber);
        this.text = text;
    }

    @Override
    public String getDescription() {
        return text;
    }

    @Override
    public void print(int indent) {
        String indentStr = getIndent(indent);
        System.out.println(indentStr + "+-- Expression: " + text + " (Line: " + lineNumber + ")");
    }
}
