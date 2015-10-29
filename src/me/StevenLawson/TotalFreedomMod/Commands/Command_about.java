package me.StevenLawson.TotalFreedomMod.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.OP, source = SourceType.BOTH)
@CommandParameters(description = "Info about the server", usage = "/<command>", aliases = "info")
public class Command_about extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        sender.sendMessage(ChatColor.AQUA + "Welcome to LegendaryFreedom!");
        sender.sendMessage(ChatColor.AQUA + "This server is hosted by server.pro");
        sender.sendMessage(ChatColor.DARK_GREEN + "Lets go over some rules:");
        sender.sendMessage(ChatColor.DARK_GREEN + "Griefing will never be tolerated");
        sender.sendMessage(ChatColor.LIGHT_PURPLE + "Being racist will also not be tolerated");
        sender.sendMessage(ChatColor.LIGHT_PURPLE + "Sexual contents are also not allowed");
        sender.sendMessage(ChatColor.RED + "[--------------------------------------------------");
        sender.sendMessage(ChatColor.RED + "We have custom commands just like this one!");
        sender.sendMessage(ChatColor.DARK_PURPLE + "Enjoy it and have fun!");
        sender.sendMessage(ChatColor.DARK_PURPLE + "Do /ai for more information to be admin");
        sender.sendMessage(ChatColor.DARK_PURPLE + "Asking for admin will get you nowhere");
        sender.sendMessage(ChatColor.BLUE + "Thank you for reading!");
        sender.sendMessage(ChatColor.BLUE + "More commands will be listed in a command!");

        return true;
    }
}
