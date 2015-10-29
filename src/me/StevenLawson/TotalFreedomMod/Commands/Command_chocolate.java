package me.StevenLawson.TotalFreedomMod.Commands;

import org.apache.commons.lang3.StringUtils;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.OP, source = SourceType.BOTH)
@CommandParameters(description = "Shows how much u love choc", usage = "/<command>", aliases = "chocolate")
public class Command_chocolate extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        sender.sendMessage(ChatColor.AQUA + "[Stranger]Yo you like chocolate?");
        sender.sendMessage(ChatColor.AQUA + "[ME]Me luvs it");
        sender.sendMessage(ChatColor.DARK_GREEN + "[Sranger] YOU DO?!?");
        sender.sendMessage(ChatColor.DARK_GREEN + "[ME] YES!!");
        sender.sendMessage(ChatColor.LIGHT_PURPLE + "[ME] GIVE ME SOME");
        sender.sendMessage(ChatColor.LIGHT_PURPLE + "[Stranger] You have money bioatch?");
        sender.sendMessage(ChatColor.RED + "[ME] Yeah, I have $5 Millon dollar");
        sender.sendMessage(ChatColor.RED + "*Gets robbed*");
        sender.sendMessage(ChatColor.DARK_PURPLE + "[Stranger] Get f***ed bioatch :D");
        sender.sendMessage(ChatColor.DARK_PURPLE + "[ME] Damn it, F*** YOU!");
        sender.sendMessage(ChatColor.DARK_PURPLE + "*Shoots stranger with sniper rifle*");
        sender.sendMessage(ChatColor.BLUE + "[Stranger] Damn it! F*** YOU! MY CHOCOLATE, NO!");
        sender.sendMessage(ChatColor.BLUE + "[ME] Kay. Bye");

        return true;
    }
}
