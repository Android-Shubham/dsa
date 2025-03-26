package algomap.io.trie;

class Trie{
    TrieNode root;
    public Trie(){
        root = new TrieNode();
    }

    public void insert(String word){
        TrieNode node = root;
        for(char ch : word.toCharArray()){
            if(node.children[ch-'a']==null){
                node.children[ch-'a'] = new TrieNode();
            }
            node = node.children[ch-'a'];
        }
        node.word = word;
    }
}

class TrieNode{
    String word = null;
    TrieNode[] children = new TrieNode[26];
}