package sffm.mod.sfffmbody;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.*;
import sffm.mod.sfffmbody.items.Tools;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import sffm.mod.sfffmbody.items.Register_Items;

public class Core implements ModInitializer {
    public static class kostil{
        public static final Tools.Kitchen_Knife KITCHEN_KNIFE = new Tools.Kitchen_Knife(
                Tools.Kitchen_Knife.Kitchen_Knife_Material.INSTANCE,
                2,
                -1F,
                new Item.Settings().group(ITEM_GROUP) .recipeRemainder(kostil.KITCHEN_KNIFE));
    }
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier("ssfm", "general"),
            () -> new ItemStack(kostil.KITCHEN_KNIFE));


    @Override
    public void onInitialize() {
        Register_Items.register();
        Registry.register(Registry.ITEM, new Identifier("ssfm","kitchen_knife"), kostil.KITCHEN_KNIFE);
    }
}
