package me.StevenLawson.TotalFreedomMod.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import me.StevenLawson.TotalFreedomMod.TFM_Util;

@CommandPermissions(level = AdminLevel.OP, source = SourceType.BOTH)
@CommandParameters(description = "A command.", usage = "/<command>", aliases = "legendary")
public class Command_legendary extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        TFM_Util.bcastMsg(ChatColor.GOLD + sender.getName() + ": Guys!");
        TFM_Util.bcastMsg(ChatColor.GOLD + sender.getName() + ": I found out something!");
        TFM_Util.bcastMsg(ChatColor.GOLD + sender.getName() + ": Captain_Redye is the most Legendary person in the universe!");
        sender.sendMessage(ChatColor.AQUA + "Captain_RedEye is our server founder!");
        sender.sendMessage(ChatColor.AQUA + "Do not ever disrespect him");
        sender.sendMessage(ChatColor.DARK_GREEN + "He is very legendary");
        sender.sendMessage(ChatColor.DARK_GREEN + "If you ever grief,HE WILL SMASH YOU!");
        sender.sendMessage(ChatColor.LIGHT_PURPLE + "Your words are so true.Live up to it!");
        
        return true;
    }
}
