package com.srpc.communication;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
"type",
"value"
})
public class ParamPacket {

	@JsonProperty("type")
	public String type;
	
	@JsonProperty("value")
	public String value;

}
