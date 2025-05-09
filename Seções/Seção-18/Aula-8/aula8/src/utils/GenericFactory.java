package utils;

import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class GenericFactory<K, V, R> {
	private final BiFunction<K, V, R> mapper;
	
    public GenericFactory(BiFunction<K, V, R> mapper) {
        this.mapper = mapper;
    }
    
    public List<R> fromMap(Map<K, V> data) {
    	return data.entrySet().stream()
    			.map(entry -> mapper.apply(entry.getKey(), entry.getValue()))
    			.collect(Collectors.toList());
    }
}
