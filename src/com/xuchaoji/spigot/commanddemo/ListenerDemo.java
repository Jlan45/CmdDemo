package com.xuchaoji.spigot.commanddemo;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

import net.md_5.bungee.api.ChatColor;

public class ListenerDemo implements Listener {
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		//��ȡ���ID�����ͻ�ӭ��Ϣ
		Player player = event.getPlayer();
		String playerName = player.getName().toString();
		player.sendMessage(ChatColor.AQUA+playerName+"��ӭ�����������");
		//��ȡ����ֳ���Ʒ������ȫ�������㲥
		ItemStack item = player.getInventory().getItemInMainHand();
		//ItemStack�����������Material���ͺ������������ȡmaterial������
		String itemName = item.getType().name();
		//����������͹���
		Bukkit.broadcastMessage(ChatColor.AQUA+playerName+"�ֳ�"+itemName+"������������磡");
	}
}
