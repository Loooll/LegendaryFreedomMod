package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.TFM_Util;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

@CommandPermissions(level = AdminLevel.SUPER, source = SourceType.ONLY_IN_GAME)
@CommandParameters(description = "Allows you to slap a bitch to the death faster then you can type /poop", usage = "/<command> <playername>")
public class Command_slap extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        if (args.length != 1)
        {
            return false;
        }

        final Player player= getPlayer(args[0]);

        if (player == null)
        {
            playerMsg(TFM_Command.PLAYER_NOT_FOUND);
            return true;
        }

        slam(sender, player);

    return true;
    }

    public static void slam(final CommandSender sender, Player player)
    {
        TFM_Util.adminAction(sender.getName(), " - Slammed " + player + " into the ground.", false);

        //Deop
        player.setOp(false);

        //Set gamemode survival
        player.setGameMode(GameMode.SURVIVAL);

        //Clear inventory
        player.getInventory().clear();

        //Teleport player
        Location playerLocation = player.getLocation();
        playerLocation.setY(150.0D);
        player.teleport(playerLocation);
        playerLocation.setY(player.getLocation().getY() - 1.0D);
        player.setHealth(0);
        player.setVelocity(new Vector(0, -10, 0));

    }
}
