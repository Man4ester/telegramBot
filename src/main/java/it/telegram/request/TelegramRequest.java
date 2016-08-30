package it.telegram.request;


import java.io.File;
import java.util.List;

import org.apache.http.message.BasicNameValuePair;

import it.telegram.client.RequestType;
/**
 *
 * This class represents a TelegramRequest
 *
 * @since 0.0.1
 */
public class TelegramRequest {
	private RequestType requestType;
	private List<BasicNameValuePair> parameters;
	private File file;
	private String fileType;
	/**
	 * This constructor instantiates a new TelegramRequest
	 * You should not create TelegramRequests objects, instead use the TelegramRequestFactory
	 *
	 * @param requestType The type of request
	 * @param parameters The map of parameters
	 * @see io.github.nixtabyte.telegram.jtelebot.request.factory.TelegramRequestFactory
	 */
	public TelegramRequest(final RequestType requestType, final List<BasicNameValuePair> parameters){
		this(requestType,parameters,null,null);
	}
	/**
	 * This constructor instantiates a new TelegramRequest
	 * You should not create TelegramRequests objects, instead use the TelegramRequestFactory
	 *
	 * @param requestType The type of request
	 * @param parameters The map of parameters
	 * @param file	The file to upload
	 * @param fileType The type of file to upload (audio, video, photo, document, sticker)
	 * @param fileType The type of file to upload (audio, video, photo, document, sticker)
	 * @see io.github.nixtabyte.telegram.jtelebot.request.factory.TelegramRequestFactory
	 */
	public TelegramRequest(final RequestType requestType, final List<BasicNameValuePair> parameters, final File file, final String fileType){
		this.requestType = requestType;
		this.parameters = parameters;
		this.file = file;
		this.fileType = fileType;
	}
	/**
	 * <p>Getter for the field <code>requestType</code>.</p>
	 *
	 * @return The request type
	 */
	public RequestType getRequestType() {
		return requestType;
	}

	/**
	 * <p>Getter for the field <code>parameters</code>.</p>
	 *
	 * @return a {@link java.util.List} object.
	 */
	public List<BasicNameValuePair> getParameters() {
		/**
		 * TODO:
		 * should we return a copy?
		 * thus making this unmutable ?
		 */
		return parameters;
	}
	/**
	 * <p>Getter for the field <code>file</code>.</p>
	 *
	 * @return the file
	 */
	public File getFile(){
		return file;
	}
	/**
	 * <p>Getter for the field <code>fileType</code>.</p>
	 *
	 * @return The file type
	 */
	public String getFileType() {
		return fileType;
	}
	
}

