package markdown_tree;

public class BlockNode extends DocumentNode {

    public BlockNode(I_BlockNode parent) {
        super(parent);
    }

    @Override
    public StringBuilder outputToHtml() {
        StringBuilder string = new StringBuilder("");

        for (BlockNode node: children) {
            string.append(node.outputToHtml());
        }
        return string;
    }

    @Override
    public StringBuilder outputToLaTeX() {
        return null;
    }

    @Override
    public StringBuilder outputToASCII() {
        return null;
    }
}