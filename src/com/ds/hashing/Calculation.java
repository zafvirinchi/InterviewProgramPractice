package com.ds.hashing;

@FunctionalInterface
public interface Calculation<V,T> {
  abstract T add(V a,V b);
  
//  default T sum(V a, V b) {
//	  return (a + b);
//  }
}
