package ast;

import java.util.ArrayList;
import java.util.List;

public class DictNode extends ASTNode {
    private List<ASTNode> keys;
    private List<ASTNode> values;

    public DictNode(int lineNumber) {
        super("Dict", lineNumber);
        this.keys = new ArrayList<>();
        this.values = new ArrayList<>();
    }

    public void addEntry(ASTNode key, ASTNode value) {
        keys.add(key);
        values.add(value);
    }

    public List<ASTNode> getKeys() { return keys; }
    public List<ASTNode> getValues() { return values; }

    @Override
    public void print(int indent) {
        String ind = getIndent(indent);
        System.out.println(ind + "+-- Dict {" + keys.size() + " entries} (Line: " + lineNumber + ")");
        for (int i = 0; i < keys.size(); i++) {
            System.out.println(ind + "    +-- Entry " + (i + 1) + ":");
            System.out.println(ind + "        +-- Key:");
            keys.get(i).print(indent + 3);
            System.out.println(ind + "        +-- Value:");
            values.get(i).print(indent + 3);
        }
    }

    @Override
    public String getDescription() {
        return "Dict";
    }
}