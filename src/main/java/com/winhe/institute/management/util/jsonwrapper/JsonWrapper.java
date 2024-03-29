package com.winhe.institute.management.util.jsonwrapper;

public class JsonWrapper {

	

	private String code;
	private String message;
	private Object data;
	
	public JsonWrapper(String code, String message, Object data) {
		super();
		this.code = code;
		this.message = message;
		this.data = data;
	}
	
	public JsonWrapper(String code, String message) {
		super();
		this.code = code;
		this.message = message;
	}
	
	public JsonWrapper() {

	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "JsonWrapper [code=" + code + ", message=" + message + ", data=" + data + "]";
	}
	
}
