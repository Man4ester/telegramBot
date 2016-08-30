package it.telegram.client;

import it.telegram.response.json.Message;
import it.telegram.response.json.Update;
import it.telegram.response.json.User;
import it.telegram.response.json.UserProfilePhotos;

/**
*
* Enum that contains all the request types
*
* @since 0.0.1
*/
public enum RequestType {
	GET_ME("getMe",User.class),
	GET_UPDATES("getUpdates",Update.class),
	SEND_MESSAGE("sendMessage"), 
	FORWARD_MESSAGE("forwardMessage"), 
	SEND_PHOTO("sendPhoto"), 
	SEND_AUDIO("sendAudio"), 
	SEND_DOCUMENT("sendDocument"), 
	SEND_STICKER("sendSticker"), 
	SEND_VIDEO("sendVideo"), 
	SEND_LOCATION("sendLocation"), 
	SEND_CHAT_ACTION("sendChatAction",Boolean.class), 
	GET_USER_PROFILE_PHOTOS("getUserProfilePhotos",UserProfilePhotos.class), 
	SET_WEBHOOK("setWebhook");

	private Class<?> resultClass;
	private String methodName;
	/**
	 * A lot of methods return Message
	 * @param methodName
	 */
	private RequestType(final String methodName){
		this(methodName,Message.class);
	}
	

	private RequestType(final String methodName, final Class<?> clazz){
		this.resultClass = clazz;
		this.methodName = methodName;
	}

	/**
	 * <p>Getter for the field <code>resultClass</code>.</p>
	 *
	 * @return a {@link java.lang.Class} object.
	 */
	public Class<?> getResultClass() {
		return resultClass;
	}

	/**
	 * <p>Getter for the field <code>methodName</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getMethodName() {
		return methodName;
	}





	
	
	
}

