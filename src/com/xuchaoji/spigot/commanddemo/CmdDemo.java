package com.xuchaoji.spigot.commanddemo;

import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class CmdDemo extends JavaPlugin {
	//���ز��ִ��
	@Override
	public void onEnable() {
		getServer().getConsoleSender().sendMessage(ChatColor.AQUA+"[CmdDemo]�Ѽ���");
		//ע��cjcmd�������
		this.getCommand("cjcmd").setExecutor(new CjCmd());
		getServer().getConsoleSender().sendMessage(ChatColor.AQUA+"[CmdDemo]cjcmd����ע��ɹ���");
		//ע���¼�������
		getServer().getPluginManager().registerEvents(new ListenerDemo(), this);
	}
	//ͣ�ò��ִ��
	@Override
	public void onDisable() {
		getServer().getConsoleSender().sendMessage(ChatColor.RED+"[CmdDemo]��ͣ��");
	}
}
