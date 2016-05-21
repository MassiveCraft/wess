package com.massivecraft.wess;

import org.bukkit.command.CommandSender;

import com.massivecraft.massivecore.util.PermissionUtil;

public enum Perm
{
	// -------------------------------------------- //
	// ENUM
	// -------------------------------------------- //
	
	WESS("wess"),
	
	// END OF LIST
	;
	
	// -------------------------------------------- //
	// FIELDS
	// -------------------------------------------- //
	
	public final String node;
	
	// -------------------------------------------- //
	// CONSTRUCT
	// -------------------------------------------- //
	
	Perm(final String permissionNode)
	{
		this.node = "wess."+permissionNode;
    }
	
	// -------------------------------------------- //
	// HAS
	// -------------------------------------------- //
	
	public boolean has(CommandSender sender, boolean informSenderIfNot)
	{
		return PermissionUtil.has(sender, this.node, informSenderIfNot);
	}
	
	public boolean has(CommandSender sender)
	{
		return has(sender, false);
	}
	
}
