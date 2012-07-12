package com.github.princeofmar5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class PrinceMMO extends JavaPlugin
{
	private ArrayList<Object> list = new ArrayList<Object>();
	public Map<Player, Boolean> pluginEnabled = new HashMap<Player, Boolean>();
	
	public void onEnable()
	{
		getLogger().info("PrinceMMO Enabled!");
		loadMap(); //Loads example.bin
	}

	public void onDisable()
	{
		getLogger().info("PrinceMMO Disabled!");
		saveMap(); //Saves to example.bin
	}

	//Loads HashMap
	@SuppressWarnings("unchecked")
	private void loadMap() 
	{
		try 
		{
			list = (ArrayList<Object>)SLAPI.load("example.bin");
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	//Saves HasMap
	private void saveMap() 
	{
		try 
		{
			SLAPI.save(list,"example.bin");
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
