package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.TFM_Util;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.ALL, source = SourceType.BOTH)
@CommandParameters(description = "See how to become admin.", aliases = "ai", usage = "/<command>")
public class Command_admininfo extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        TFM_Util.playerMsg(sender_p, "To Apply for admin,", ChatColor.BLUE);
        TFM_Util.playerMsg(sender_p, "Go to our forums at http://stormfreedommc.boards.net/", ChatColor.GREEN);
        TFM_Util.playerMsg(sender_p, "Applications Are Closed, Contact an Administrator for more info. ChatColor.RED");
        return true;
        
    }
}

