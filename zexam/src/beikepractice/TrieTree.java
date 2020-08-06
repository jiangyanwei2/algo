package beikepractice;
import java.util.HashMap;
import java.util.Map;

public class TrieTree {
    private class TrieNode {
        private boolean end = false;
        private Map<Character, TrieNode> subNodes = new HashMap<>();

        public void addSubNode(Character ch, TrieNode node) {
            subNodes.put(ch, node);
        }

        public TrieNode getSubNode(Character ch) {
            return subNodes.get(ch);
        }

        public void setEnd(boolean end) {
            this.end = end;
        }

        public boolean isEnd() {
            return this.end;
        }

        private TrieNode root = new TrieNode();

        public String filter(String text) {
            int begin = 0;
            int pos = 0;
            TrieNode tmp = root;
            String replace ="***";
            StringBuilder sb = new StringBuilder();
            while (pos < text.length()) {
                Character ch = text.charAt(pos);
                tmp = tmp.getSubNode(ch);
                if (tmp == null) {
                    sb.append(ch);
                    pos = begin + 1;
                    begin = pos;
                    tmp = root;
                } else if (tmp.isEnd()) {
                    sb.append(replace);
                    pos = pos + 1;
                    begin = pos;
                    tmp = root;
                } else {
                    pos++;
                }
            }

            sb.append(text.substring(begin));
            return sb.toString();
        }

        public void addWords(String str) {
            TrieNode tmp = root;
            for (int i = 0; i < str.length(); i++) {
                Character ch = str.charAt(i);
                TrieNode node = tmp.getSubNode(ch);
                if (node == null ) {
                    node = new TrieNode();
                    tmp.addSubNode(ch, node);
                }
                tmp = node;

                if (i == str.length() - 1) {
                    tmp.setEnd(true);
                }

            }
        }
    }
}
