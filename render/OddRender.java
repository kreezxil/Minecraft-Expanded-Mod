package com.codycornell82.minecraftPlus.render;

import model.OddModel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

import com.codycornell82.minecraftPlus.MobHandler.Tusk;

public class OddRender extends RenderLiving {

	private static final ResourceLocation texture = new ResourceLocation("mp:"
			+ "textures/model/OddModel.png");

	protected OddModel modelEntity;

	public OddRender(ModelBase p_i1262_1_, float p_i1262_2_) {
		super(p_i1262_1_, p_i1262_2_);

		modelEntity = ((OddModel) mainModel);
	}

	public void renderRobot(Tusk entity, double x, double y, double z, float u,
			float v) {
		super.doRender(entity, x, y, z, u, v);
	}

	public void doRenderLiving(EntityLiving liveMob, double x, double y,
			double z, float u, float v) {
		renderRobot((Tusk) liveMob, x, y, z, u, v);
	}

	public void doRender(Entity entity, double x, double y, double z, float u,
			float v) {
		renderRobot((Tusk) entity, x, y, z, u, v);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity p_110775_1_) {

		return texture;
	}
}
