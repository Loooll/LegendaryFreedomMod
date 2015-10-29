package me.StevenLawson.TotalFreedomMod.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.OP, source = SourceType.BOTH)
@CommandParameters(description = "Shows how much u love choc", usage = "/<command>", aliases = "chocolate")
public class Command_FNAF extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        sender.sendMessage(ChatColor.RED + "[Kid] Hey mommy! Look at hem. Its a flippin ugly chica!");
        sender.sendMessage(ChatColor.RED + "[Mom] You're right! F*** this place!");
        sender.sendMessage(ChatColor.RED + "[Chica]Ffs.Go f*** yourself.");
        sender.sendMessage(ChatColor.DARK_RED + "[Freddy] EAT THEIR BRAIN!");
        sender.sendMessage(ChatColor.DARK_RED + "[Night Shift Guard] Go fuck yoself! *Shoots erm with MPG*");
        sender.sendMessage(ChatColor.DARK_RED + "[Kid] Assasult!Mommy, call the f***ing police!");
        sender.sendMessage(ChatColor.DARK_BLUE + "[Golden Freddy]STFU KID.*Eats hes body*");
        sender.sendMessage(ChatColor.RED + "[Mom] OH damn!*Runs*");
        sender.sendMessage(ChatColor.DARK_PURPLE + "[Night Shift Guard] Get f***ed bioatch :D. Wait no,Freddy, NO!!!!!!!");

        return true;
    }
}