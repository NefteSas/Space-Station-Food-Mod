package sffm.mod.sfffmbody.items;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.*;
import net.minecraft.recipe.Ingredient;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class Tools {
    public static class Kitchen_Knife extends SwordItem {
        @Override
        public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
            tooltip.add(new TranslatableText("item.ssfm.kitchen_knife.tooltip").formatted(Formatting.GOLD));
            super.appendTooltip(stack, world, tooltip, context);
        }
        public Kitchen_Knife(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
            super(toolMaterial, attackDamage, attackSpeed, settings);
        }

        public static class Kitchen_Knife_Material implements ToolMaterial{
            public static final Kitchen_Knife_Material INSTANCE = new Kitchen_Knife_Material();
            @Override
            public int getDurability() {
                return 500;
            }

            @Override
            public float getMiningSpeedMultiplier() {
                return 0;
            }

            @Override
            public float getAttackDamage() {
                return 0;
            }

            @Override
            public int getMiningLevel() {
                return 0;
            }

            @Override
            public int getEnchantability() {
                return 0;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.ofItems(Items.IRON_INGOT);
            }
        }
    }
}
