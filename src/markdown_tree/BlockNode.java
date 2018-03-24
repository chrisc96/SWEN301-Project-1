package markdown_tree;

public class BlockNode extends DocumentNode {

    public BlockNode(I_BlockNode parent) {
        super(parent);
    }

    @Override
    public StringBuilder outputToHtml() {
        StringBuilder hello = new StringBuilder("");
        for (BlockNode node: children) {
            hello.append(node.outputToHtml());
        }
        return hello;
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