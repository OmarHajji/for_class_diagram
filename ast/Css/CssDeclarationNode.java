package ast.Css;

import ast.ASTNode;

public class CssDeclarationNode extends ASTNode {

    // الكونستركتور الجديد يستقبل فقط رقم السطر
    public CssDeclarationNode(int line) {
        super("CssDeclaration", line);
    }

    @Override
    public void print(int indent) {
        String ind = getIndent(indent);
        System.out.println(ind + "+-- CssDeclaration (Line: " + lineNumber + ")");

        // طباعة الأبناء (PropertyNode و ValueNode)
        for (ASTNode child : children) {
            child.print(indent + 2);
        }
    }

    @Override
    public String getDescription() {
        return "CSS Declaration";
    }
}
