package com.fashionscapeonline;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class FashionScapeOnlineTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(FashionScapeOnlinePlugin.class);
		RuneLite.main(args);
	}
}