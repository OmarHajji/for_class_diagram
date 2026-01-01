package ast.Css;
import  ast.ASTNode;
public class CssSelectorNode extends CssNode {
private final String selectorText;

public CssSelectorNode(String selectorText, int lineNumber) {
    super("CssSelector", lineNumber);
    this.selectorText = selectorText;
}

public String getSelectorText() {
    return selectorText;
}

@Override
public void print(int indent) {
    String ind = getIndent(indent);
    System.out.println(ind + "+-- Selector: " + selectorText + " (Line: " + lineNumber + ")");
}

@Override
public String getDescription() {
    return "Selector: " + selectorText;
}
}
