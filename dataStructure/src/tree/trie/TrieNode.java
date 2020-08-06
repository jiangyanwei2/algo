package tree.trie;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
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
