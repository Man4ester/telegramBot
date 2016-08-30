package it.telegram.mapper.json;


import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;

public enum MapperHandler {
	INSTANCE;
	
	private ObjectMapper objectMapper;
	
	private MapperHandler(){
		initMapper();
	}
	
	private void initMapper(){
		objectMapper = new ObjectMapper();
		objectMapper.enable(DeserializationConfig.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
	}
	
	/**
	 * <p>Getter for the field <code>objectMapper</code>.</p>
	 *
	 * @return a {@link org.codehaus.jackson.map.ObjectMapper} object.
	 */
	public ObjectMapper getObjectMapper(){
		if(objectMapper==null){
			initMapper();
		}
		return objectMapper;
	}

}
