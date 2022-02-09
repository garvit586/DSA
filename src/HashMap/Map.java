package HashMap;

import java.util.ArrayList;

public class Map<K, V> {
    ArrayList<MapNode<K, V>> buckets;
    int size;
    int numBuckets;

    public Map(){
        numBuckets = 20;
        buckets = new ArrayList<>();
        for(int i=0; i< 20;i++){
            buckets.add(null);
        }
    }

    private int getBucketIndex(K key){
        int hashCode = key.hashCode();
        return hashCode % numBuckets;
    }
}
