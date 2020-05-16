package megalonemo.crumblingblocks.items;

import megalonemo.crumblingblocks.CBMod;
import megalonemo.crumblingblocks.CBModTab;
import megalonemo.crumblingblocks.IHasModel;
import megalonemo.crumblingblocks.init.ModItems;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
    public ItemBase(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CBMod.CREATIVE_TAB);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        CBMod.proxy.registerItemRenderer(this,0,"inventory");
    }
}
