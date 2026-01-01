package ast.html;

import ast.ASTNode;
import ast.Css.CssStylesheetNode;

public class StyleBlockNode extends ASTNode {

    public StyleBlockNode(int lineNumber) {
        super("StyleBlock", lineNumber);
    }

    public void setStylesheet(CssStylesheetNode stylesheet) {
        addChild(stylesheet);
    }

    @Override
    public void print(int indent) {
        String ind = getIndent(indent);
        System.out.println(ind + "+-- StyleBlock (Line: " + lineNumber + ")");
        for (ASTNode child : getChildren()) {
            child.print(indent + 2);
        }
    }

    @Override
    public String getDescription() {
        return "<style>";
    }
}
