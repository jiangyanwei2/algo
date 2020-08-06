package tree.trie;

import java.util.HashMap;
import java.util.Map;

public class Trie {
	private class TrieNode {
		private boolean end;
		private Map<Character, TrieNode> subNodes = new HashMap<>();
		
		public void addSubNodes(Character c, TrieNode node) {
			subNodes.put(c, node);
		}
		public TrieNode getSubNodes(Character c) {
			return subNodes.get(c);
		}
		
		public void setEnd(boolean end) {
			this.end = end;
		}
		public boolean getEnd() {
			return end;
		}
	}
	
	private TrieNode rootNode = new TrieNode();
	private static final String REPLACEMENT = "***";
	
	public String filter(String text) {
		StringBuilder sb = new StringBuilder();
		TrieNode tmp = rootNode;
		int begin = 0;
		int position = 0;
		String replacement = REPLACEMENT;
		while (position < text.length()) {
			char c = text.charAt(position);
			tmp = tmp.getSubNodes(c);
			
			
			if (tmp == null) {
				sb.append(text.charAt(begin));
				position = begin + 1;
				begin = position;
				tmp = rootNode;
			} else if (tmp.getEnd()) {
				sb.append(replacement);
				position = position + 1;
				begin = position;
				tmp = rootNode;
			} else {
				position++;
			}
		}
		sb.append(text.substring(begin));
		return sb.toString();
	}
	
	public void addWords(String text) {
		TrieNode tmp = rootNode;
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			TrieNode node = tmp.getSubNodes(c);
			if (node == null) {
				node = new TrieNode();
				tmp.addSubNodes(c, node);
			}
			tmp = node;
			if (i == text.length() - 1) {
				tmp.setEnd(true);
			}
			
		} 
	}
	
	public static void main(String[] args) {
		Trie trie = new Trie();
		trie.addWords("seqing");
		trie.addWords("色情");
		String res = trie.filter("你好色情abcseqingabc");
		System.out.println(res);
	}
}
