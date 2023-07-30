package org.example.creational.factory_method;

import org.example.creational.factory_method.message.JSONMessage;
import org.example.creational.factory_method.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {
	@Override
	public Message createMessage() {
		return new JSONMessage();
	}
}
