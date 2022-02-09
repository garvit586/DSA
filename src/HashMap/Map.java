package HashMap;

import java.util.ArrayList;

public class Map<K, V> {
    ArrayList<MapNode<K, V>> buckets;
    int size;
    int numBuckets;
}
