package com.xuchaoji.spigot.commanddemo;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import net.md_5.bungee.api.ChatColor;

public class CjCmd implements CommandExecutor{
	 // This method is called, when somebody uses our command
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lable, String[] args) {
		//�ж�sender�Ƿ�Ϊ��ң������û�б������޷�����Ʒ
		if (sender instanceof Player){
			Player player = (Player)sender;
			player.sendMessage(ChatColor.AQUA+"[CmdDemo]"+ChatColor.AQUA+sender.getName()+ChatColor.AQUA+"ִ����cjcmdָ����淢����Ʒ��");
			//����ItemStack��bread��diamond��ItemStack��Ҫ������������һ���ǲ������ƣ��ڶ�����������
			ItemStack bread = new ItemStack(Material.BREAD,10);
			ItemStack diamond = new ItemStack(Material.DIAMOND,2);
			player.getInventory().addItem(bread, diamond);
			
		}else {
			//�������ִ������ʱ������������ʾ��
			sender.sendMessage(ChatColor.DARK_RED+"[CmdDemo]ֻ����Ҳ���ִ�д����");
		}
		//��ָ��ִ��˳��ʱ������true���������ÿ������ָ����ڿͻ��˿����Լ����͵�ָ�
		return true;
	}
	

}
