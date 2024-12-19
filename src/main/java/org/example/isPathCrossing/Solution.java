package org.example.isPathCrossing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
class Pair<K,V>{
    private K key;
    private V value;
    public Pair(K key, V value){
        setKey(key);
        setValue(value);
    }
    public K getKey(){
        return key;
    }
    public V getValue(){
        return value;
    }
    public void setKey(K key){
        this.key = key;
    }
    public void setValue(V value){
        this.value = value;
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Pair<?,?> pair = (Pair<?,?>) o;
        if(key != null ? !key.equals(pair.key) : pair.key != null) return false;
        return value != null ? value.equals(pair.value) : pair.value == null;
    }
    @Override
    public int hashCode(){
        int result = key != null ? key.hashCode() : 0;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }
    @Override
    public String toString(){
        return "Pair{" + "key=" + key + ", value=" + value + '}';
    }
}
class Solution {
    public boolean isPathCrossing(String path) {
        Map<Character, Pair<Integer, Integer>> moves = new HashMap();
        moves.put('N', new Pair(0, 1));
        moves.put('S', new Pair(0, -1));
        moves.put('W', new Pair(-1, 0));
        moves.put('E', new Pair(1, 0));

        Set<Pair<Integer, Integer>> visited = new HashSet();
        visited.add(new Pair(0, 0));

        int x = 0;
        int y = 0;

        for (Character c : path.toCharArray()) {
            Pair<Integer, Integer> curr = moves.get(c);
            int dx = curr.getKey();
            int dy = curr.getValue();
            x += dx;
            y += dy;

            Pair<Integer, Integer> pair = new Pair(x, y);
            if (visited.contains(pair)) {
                return true;
            }

            visited.add(pair);
        }

        return false;
    }
}