package sffm.mod.sfffmbody.items;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import sffm.mod.sfffmbody.Core;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

import java.util.Random;

public class Register_Items{

    public static final ItemGroup ITEM_GROUP = Core.ITEM_GROUP;

    //Burger

    public static final Foods.Burgers.Ghost_Burger GHOST_BURGER = new Foods.Burgers.Ghost_Burger(new Item.Settings().group(ITEM_GROUP)

            .maxCount(32)

            .food( new FoodComponent.Builder()

                    .hunger(3)

                    .statusEffect(new StatusEffectInstance(StatusEffect.byRawId(25),600), 1000F)

                    .saturationModifier(4F)

                    .meat()

                    .build()));



    public static final Foods.Burgers.Cheese_Burger CHEESE_BURGER = new Foods.Burgers.Cheese_Burger(new Item.Settings().group(ITEM_GROUP)

            .maxCount(32)

            .food( new FoodComponent.Builder()

                    .hunger(8)

                    .saturationModifier(4F)

                    .meat() //Описываем то что это мясо

                    .build()));



    public static final Foods.Burgers.Big_Bite_Burger BIG_BITE_BURGER = new Foods.Burgers.Big_Bite_Burger(new Item.Settings().group(ITEM_GROUP)

            .maxCount(32)

            .food( new FoodComponent.Builder()

                    .hunger(14)

                    .saturationModifier(4F)

                    .meat() //Описываем то что это мясо

                    .build()));

    public static final Foods.Burgers.Super_Bite_Burger SUPER_BITE_BURGER = new Foods.Burgers.Super_Bite_Burger(new Item.Settings().group(ITEM_GROUP)

            .maxCount(16)

            .food( new FoodComponent.Builder()

                    .hunger(18)

                    .saturationModifier(8F)

                    .meat() //Описываем то что это мясо

                    .build()));

    public static final Foods.Burgers.Redstone_Burger REDSTONE_BURGER = new Foods.Burgers.Redstone_Burger(new Item.Settings().group(ITEM_GROUP)

            .maxCount(5)

            .food( new FoodComponent.Builder()

                    .hunger(5)

                    .saturationModifier(2F)

                    .statusEffect(new StatusEffectInstance(StatusEffect.byRawId(1),600), 1000F)

                    .meat() //Описываем то что это мясо

                    .build()));



    public static final Foods.Burgers.Burger STANDART_BURGER_ITEM = new Foods.Burgers.Burger(new Item.Settings().group(ITEM_GROUP)

            .maxCount(13)

            .food( new FoodComponent.Builder()

                    .hunger(6)

                    .saturationModifier(2F)

                    .meat() //Описываем то что это мясо

                    .build()));

    //Ingridients

    public static final Foods.Ingridients.bun BUN_ITEM = new Foods.Ingridients.bun(new Item.Settings().group(ITEM_GROUP)
            .maxCount(32)


            .food( new FoodComponent.Builder()

                    .hunger(2)

                    .saturationModifier(0.5F)

                    .snack() //Описываем то что это растительное

                    .build()));



    public static final Foods.Ingridients.row_paty RAW_PATTY_ITEM = new Foods.Ingridients.row_paty(new Item.Settings().group(ITEM_GROUP)
            .maxCount(32)



            .food( new FoodComponent.Builder()

                    .hunger(1)

                    .saturationModifier(0.5F)

                    .snack() //Описываем то что это растительное

                    .build()));



    public static final Foods.Ingridients.fired_paty FIRED_PATTY_ITEM = new Foods.Ingridients.fired_paty(new Item.Settings().group(ITEM_GROUP)
            .maxCount(32)

            .food( new FoodComponent.Builder()

                    .hunger(2)

                    .saturationModifier(1F)

                    .snack() //Описываем то что это растительное

                    .build()));

    //Cheese

    public static final Foods.Ingridients.Cheese_Class.Cheese_Wheel CHEESE_WHEEL_ITEM = new Foods.Ingridients.Cheese_Class.Cheese_Wheel(new Item.Settings().group(ITEM_GROUP)
            .maxCount(1)

            .food(new FoodComponent.Builder()

            .hunger(5)

            .saturationModifier(1F)

            .build()));



    public static final Foods.Ingridients.Cheese_Class.Cheese_Wedge CHEESE_WEDGE_ITEM = new Foods.Ingridients.Cheese_Class.Cheese_Wedge(new Item.Settings().group(ITEM_GROUP)
            .maxCount(32)

            .food(new FoodComponent.Builder()

                    .hunger(2)

                    .saturationModifier(0.5F)

                    .build()));

    //Other

    public static final Foods.Ingridients.Other.Universal_Enzyme UNIVERSAL_ENZYME_ITEM = new Foods.Ingridients.Other.Universal_Enzyme(new Item.Settings().group(ITEM_GROUP)
            .maxCount(64)

            .food(new FoodComponent.Builder()
                    .hunger(0)

                    .saturationModifier(0F)

                    .statusEffect(new StatusEffectInstance(StatusEffect.byRawId(19),600), 0.90F)

                    .statusEffect(new StatusEffectInstance(StatusEffect.byRawId(10),600), 0.10F)

                    .build()));



    //Salads

    public static final Foods.Salads.Melon_Fruit_Bowl MELON_FRUIT_BOWL = new Foods.Salads.Melon_Fruit_Bowl(new Item.Settings().group(ITEM_GROUP)
            .maxCount(8)

            .food(new FoodComponent.Builder()
                    .hunger(2)

                    .saturationModifier(1F)

                    .statusEffect(new StatusEffectInstance(StatusEffect.byRawId(10),1200), 1F) //минута

                    .build()));

    public static final Foods.Salads.Herb_Salad HERB_SALAD = new Foods.Salads.Herb_Salad(new Item.Settings().group(ITEM_GROUP)
            .maxCount(16)

            .food(new FoodComponent.Builder()
                    .hunger(2)

                    .statusEffect(new StatusEffectInstance(StatusEffect.byRawId(10),600), 1F) //30c

                    .saturationModifier(0.1F)


                    .build()));

    public static final Foods.Salads.Aesir_Salad AESIR_SALAD = new Foods.Salads.Aesir_Salad(new Item.Settings().group(ITEM_GROUP)
            .maxCount(16)

            .food(new FoodComponent.Builder()
                    .hunger(2)

                    .statusEffect(new StatusEffectInstance(StatusEffect.byRawId(10),600), 1F) //30c

                    .statusEffect(new StatusEffectInstance(StatusEffect.byRawId(16),600), 1F) //30c

                    .saturationModifier(0.1F)


                    .build()));

    public static void register() {
        //BURGERS
        Registry.register(Registry.ITEM, new Identifier("ssfm", "ghost_burger"), GHOST_BURGER);
        Registry.register(Registry.ITEM, new Identifier("ssfm", "cheese_burger"), CHEESE_BURGER);
        Registry.register(Registry.ITEM, new Identifier("ssfm", "big_bite_burger"), BIG_BITE_BURGER);
        Registry.register(Registry.ITEM, new Identifier("ssfm", "super_bite_burger"), SUPER_BITE_BURGER);
        Registry.register(Registry.ITEM, new Identifier("ssfm", "redstone_burger"), REDSTONE_BURGER);
        Registry.register(Registry.ITEM, new Identifier("ssfm", "standart_burger"), STANDART_BURGER_ITEM);
        //INGRIDIENTS
        Registry.register(Registry.ITEM, new Identifier("ssfm", "bun_item"), BUN_ITEM);
        Registry.register(Registry.ITEM, new Identifier("ssfm", "raw_patty"), RAW_PATTY_ITEM);
        Registry.register(Registry.ITEM, new Identifier("ssfm", "fired_patty"), FIRED_PATTY_ITEM);
        //INGRIDIENTS_CHEESE
        Registry.register(Registry.ITEM, new Identifier("ssfm", "cheese_wedge"), CHEESE_WEDGE_ITEM);
        Registry.register(Registry.ITEM, new Identifier("ssfm", "cheese_wheel"), CHEESE_WHEEL_ITEM);
        //INGRIDIENTS_OTHER
        Registry.register(Registry.ITEM, new Identifier("ssfm", "universal_enzyme"), UNIVERSAL_ENZYME_ITEM);
        //SALADS
        Registry.register(Registry.ITEM,new Identifier("ssfm", "melon_fruit_bowl"), MELON_FRUIT_BOWL);
        Registry.register(Registry.ITEM,new Identifier("ssfm", "herb_salad"), HERB_SALAD);
        Registry.register(Registry.ITEM,new Identifier("ssfm", "aesir_salad"), AESIR_SALAD);
    }
}
