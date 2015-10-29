package me.StevenLawson.TotalFreedomMod.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.OP, source = SourceType.BOTH)
@CommandParameters(description = "Info about the server", usage = "/<command>", aliases = "info")
public class Command_ai extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        sender.sendMessage(ChatColor.AQUA + "Ahh! I see you wish to be admin!");
        sender.sendMessage(ChatColor.AQUA + "go to our forums 'Legendary-freedom.boards.net'!");
        sender.sendMessage(ChatColor.DARK_GREEN + "Lets go over some tips!:");
        sender.sendMessage(ChatColor.DARK_GREEN + "Always be respectful");
        sender.sendMessage(ChatColor.LIGHT_PURPLE + "Never fuss admins for recommendations");
        sender.sendMessage(ChatColor.LIGHT_PURPLE + "Never be immature!");
        sender.sendMessage(ChatColor.RED + "Always respect admins reply to you.");
        sender.sendMessage(ChatColor.RED + "Always be polite to new members!");
        sender.sendMessage(ChatColor.DARK_PURPLE + "Remember all that and you might have a chance of being admin!");

        return true;
    }
}
