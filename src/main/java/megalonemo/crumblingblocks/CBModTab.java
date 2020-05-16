package megalonemo.crumblingblocks;

//import megalonemo.greygoo.init.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class CBModTab extends CreativeTabs {

	public CBModTab() {
		super("tabCBMod");
		// TODO Auto-generated constructor stub
	}

	@Override
	public ItemStack getTabIconItem() {
		// TODO Auto-generated method stub
		return new ItemStack(Blocks.GRAVEL);
	}

}
