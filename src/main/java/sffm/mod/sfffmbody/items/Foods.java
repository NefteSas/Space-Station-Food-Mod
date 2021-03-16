package sffm.mod.sfffmbody.items;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import sffm.mod.sfffmbody.Core;

import java.util.List;

public class Foods {
    public static class Ingridients {
        public static class row_paty extends Item {
            public row_paty(Settings settings) {
                super(settings);
            }

            @Override
            public void onCraft(ItemStack stack, World world, PlayerEntity player) {
                player.giveItemStack(new ItemStack(Core.kostil.KITCHEN_KNIFE));
                super.onCraft(stack, world, player);
            }

            @Override
            public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                tooltip.add(new TranslatableText("item.ssfm.raw_patty.tooltip").formatted(Formatting.GOLD));
                super.appendTooltip(stack, world, tooltip, context);
            }
        }

        public static class fired_paty extends Item {

            @Override
            public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                tooltip.add(new TranslatableText("item.ssfm.fired_patty.tooltip").formatted(Formatting.GOLD));
                tooltip.add(new TranslatableText("item.ssfm.fired_patty.tooltip2").formatted(Formatting.GOLD));
                super.appendTooltip(stack, world, tooltip, context);
            }

            public fired_paty(Settings settings) {
                super(settings);
            }
        }

        public static class bun extends Item {
            @Override
            public void onCraft(ItemStack stack, World world, PlayerEntity player) {
                player.giveItemStack(new ItemStack(Core.kostil.KITCHEN_KNIFE));
                super.onCraft(stack, world, player);
            }

            @Override
            public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                tooltip.add(new TranslatableText("item.ssfm.bun_item.tooltip").formatted(Formatting.GOLD));
                tooltip.add(new TranslatableText("item.ssfm.bun_item.tooltip2").formatted(Formatting.GOLD));
                tooltip.add(new TranslatableText("item.ssfm.bun_item.tooltip3").formatted(Formatting.GOLD));
                tooltip.add(new TranslatableText("item.ssfm.bun_item.tooltip4").formatted(Formatting.GOLD));
                tooltip.add(new TranslatableText("item.ssfm.bun_item.tooltip5").formatted(Formatting.GOLD));
                super.appendTooltip(stack, world, tooltip, context);
            }

            public bun(Settings settings) {

                super(settings);
            }
        }

        public static class Cheese_Class {

            public static class Cheese_Wedge extends Item{
                @Override
                public void onCraft(ItemStack stack, World world, PlayerEntity player) {
                    stack.setDamage(5);
                    player.giveItemStack(new ItemStack(Core.kostil.KITCHEN_KNIFE));
                    super.onCraft(stack, world, player);
                }
                public Cheese_Wedge(Settings settings) {
                    super(settings);
                }
            }

            public static class Cheese_Wheel extends Item{

                public Cheese_Wheel(Settings settings) {
                    super(settings);
                }
            }

        }

        public static class Other {
            public static class Universal_Enzyme extends Item{

                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(new TranslatableText("item.ssfm.universal_enzyme.tooltip").formatted(Formatting.GOLD));
                    super.appendTooltip(stack, world, tooltip, context);
                }

                public Universal_Enzyme(Settings settings) {

                    super(settings);
                }
            }
        }
    }

    public static class Burgers{

        public static class Burger extends Item{
            @Override
            public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                tooltip.add(new TranslatableText("item.ssfm.standart_burger.tooltip").formatted(Formatting.GOLD));
                super.appendTooltip(stack, world, tooltip, context);
            }
            public Burger(Settings settings) {
                super(settings);
            }
        }


        public static class Redstone_Burger extends Item{
            @Override
            public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                tooltip.add(new TranslatableText("item.ssfm.redstone_burger.tooltip").formatted(Formatting.GOLD));
                super.appendTooltip(stack, world, tooltip, context);
            }
            public Redstone_Burger(Settings settings) {
                super(settings);
            }

        }

        public static class Super_Bite_Burger extends Item{
            @Override
            public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                tooltip.add(new TranslatableText("item.ssfm.cheese_burger.tooltip").formatted(Formatting.GOLD));
                super.appendTooltip(stack, world, tooltip, context);
            }
            public Super_Bite_Burger(Settings settings) {
                super(settings);
            }
        }

        public static class Big_Bite_Burger extends Item{
            @Override
            public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                tooltip.add(new TranslatableText("item.ssfm.cheese_burger.tooltip").formatted(Formatting.GOLD));
                super.appendTooltip(stack, world, tooltip, context);
            }
            public Big_Bite_Burger(Settings settings) {
                super(settings);
            }
        }

        public static class Cheese_Burger extends Item {
            @Override
            public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                tooltip.add(new TranslatableText("item.ssfm.cheese_burger.tooltip").formatted(Formatting.GOLD));
                super.appendTooltip(stack, world, tooltip, context);
            }
            public Cheese_Burger(Settings settings) {
                super(settings);
            }
        }

        public static class Ghost_Burger extends Item {
            @Override
            public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                tooltip.add(new TranslatableText("item.ssfm.ghost_burger.tooltip").formatted(Formatting.GOLD));
                super.appendTooltip(stack, world, tooltip, context);
            }
            public Ghost_Burger(Settings settings) {
                super(settings);
            }
        }
    }
}
