package dev.hail.confluence_anvil_craft;

import dev.anvilcraft.lib.v2.registrum.util.entry.ItemEntry;
import dev.dubhe.anvilcraft.item.AnvilHammerItem;
import net.minecraft.core.component.DataComponents;
import org.confluence.lib.ConfluenceMagicLib;
import org.confluence.lib.common.component.ModRarity;
import org.confluence.mod.common.init.item.ModItems;

import static dev.hail.confluence_anvil_craft.ConfluenceAnvilCraft.REGISTRATE;

@SuppressWarnings("unused")
public class CACItems {
    public static final ItemEntry<AnvilHammerItem> LEAD_ANVIL_HAMMER = REGISTRATE.item("lead_anvil_hammer", AnvilHammerItem::new)
            .properties(properties -> properties.durability(43))
            .register();
    public static final ItemEntry<AnvilHammerItem> MYTHRIL_ANVIL_HAMMER = REGISTRATE.item("mythril_anvil_hammer", AnvilHammerItem::new)
            .properties(properties -> properties.durability(10000)
                    .component(DataComponents.UNBREAKABLE, ModItems.UNBREAKABLE).component(ConfluenceMagicLib.MOD_RARITY, ModRarity.RED))
            .register();
    public static final ItemEntry<AnvilHammerItem> ORICHALCUM_ANVIL_HAMMER = REGISTRATE.item("orichalcum_anvil_hammer", AnvilHammerItem::new)
            .properties(properties -> properties.durability(10000)
                    .component(DataComponents.UNBREAKABLE, ModItems.UNBREAKABLE).component(ConfluenceMagicLib.MOD_RARITY, ModRarity.RED))
            .register();

    public static void register() {
    }
}
