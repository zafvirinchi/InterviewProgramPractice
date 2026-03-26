package com.ds.hashing;

public class CacheEntry<K,V> {
	private final K key;
	private final V value;
    private final long expiryTime;

    public CacheEntry(V value, K key, long ttlMillis) {
    	this.key = key;
        this.value = value;
        this.expiryTime = System.currentTimeMillis() + ttlMillis;
    }

    public V getValue() {
        return value;
    }
    
    public K getKey() {
        return key;
    }

    public boolean isExpired() {
        return System.currentTimeMillis() > expiryTime;
    }
}
