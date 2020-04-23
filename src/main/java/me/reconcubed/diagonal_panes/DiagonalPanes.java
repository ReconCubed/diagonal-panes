package me.reconcubed.diagonal_panes;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(DiagonalPanes.MODID)
public class DiagonalPanes {
    public static final String MODID = "diagonal_panes";

    public DiagonalPanes() {

        MinecraftForge.EVENT_BUS.register(this);
    }

}
