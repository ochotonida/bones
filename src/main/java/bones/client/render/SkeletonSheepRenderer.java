package bones.client.render;

import bones.Bones;
import bones.client.render.layer.SkeletonSheepFleshLayer;
import bones.client.render.model.SkeletonSheepModel;
import bones.common.entity.SkeletonSheepEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class SkeletonSheepRenderer extends MobRenderer<SkeletonSheepEntity, SkeletonSheepModel> {

    private static final ResourceLocation TEXTURES = new ResourceLocation(Bones.MODID, "textures/entity/skeleton_sheep/skeleton_sheep.png");

    public SkeletonSheepRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new SkeletonSheepModel(), 0.7F);
        addLayer(new SkeletonSheepFleshLayer(this));
    }

    @Override
    public ResourceLocation getEntityTexture(SkeletonSheepEntity entity) {
        return TEXTURES;
    }
}
