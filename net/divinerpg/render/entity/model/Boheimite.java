package net.divinerpg.render.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Boheimite extends ModelBase
{
    //fields
    ModelRenderer spine1;
    ModelRenderer bodyp1;
    ModelRenderer rightarmp1;
    ModelRenderer leftarmp1;
    ModelRenderer rightlegp1;
    ModelRenderer leftlegp1;
    ModelRenderer head;
    ModelRenderer spine2;
    ModelRenderer spine3;
    ModelRenderer spine4;
    ModelRenderer spine5;
    ModelRenderer spine6;
    ModelRenderer spine7;
    ModelRenderer spine9;
    ModelRenderer spine8;
    ModelRenderer spine10;
    ModelRenderer bodyp2;
    ModelRenderer bodyp3;
    ModelRenderer bodyp4;
    ModelRenderer bodyp5;
    ModelRenderer leftarm;
    ModelRenderer rightarm;
    ModelRenderer leftarmp2;
    ModelRenderer rightarmp2;
    ModelRenderer leftarmp3;
    ModelRenderer leftarmp4;
    ModelRenderer rightarmp3;
    ModelRenderer rightarmp4;
    ModelRenderer rightarmp5;
    ModelRenderer rightarmp6;
    ModelRenderer leftarmp5;
    ModelRenderer leftarmp6;
    ModelRenderer leftleg;
    ModelRenderer rightleg;
    ModelRenderer rightlegp2;
    ModelRenderer leftlegp2;
    ModelRenderer leftarm7;
    ModelRenderer leftarm8;
    ModelRenderer rightarm7;
    ModelRenderer rightarm8;

    public Boheimite()
    {
        textureWidth = 64;
        textureHeight = 32;

        spine1 = new ModelRenderer(this, 45, 2);
        spine1.addBox(4F, -3F, -2F, 1, 2, 8);
        spine1.setRotationPoint(0F, 0F, 0F);
        spine1.setTextureSize(64, 32);
        spine1.mirror = true;
        setRotation(spine1, -0.2617994F, 0F, 0F);
        bodyp1 = new ModelRenderer(this, 16, 16);
        bodyp1.addBox(-4F, 0F, -2F, 5, 4, 4);
        bodyp1.setRotationPoint(4F, 4F, 0F);
        bodyp1.setTextureSize(64, 32);
        bodyp1.mirror = true;
        setRotation(bodyp1, 0F, 0F, 0F);
        bodyp1.mirror = false;
        rightarmp1 = new ModelRenderer(this, 32, 6);
        rightarmp1.addBox(1F, 10F, -17F, 1, 2, 7);
        rightarmp1.setRotationPoint(-9F, 2F, 0F);
        rightarmp1.setTextureSize(64, 32);
        rightarmp1.mirror = true;
        setRotation(rightarmp1, 0F, 0F, 0F);
        leftarmp1 = new ModelRenderer(this, 32, 6);
        leftarmp1.addBox(3F, 10F, -17F, 1, 2, 7);
        leftarmp1.setRotationPoint(9F, 2F, 0F);
        leftarmp1.setTextureSize(64, 32);
        leftarmp1.mirror = true;
        setRotation(leftarmp1, 0F, 0F, 0F);
        rightlegp1 = new ModelRenderer(this, 17, 26);
        rightlegp1.addBox(-5F, 1F, -1F, 3, 3, 2);
        rightlegp1.setRotationPoint(-2F, 12F, 0F);
        rightlegp1.setTextureSize(64, 32);
        rightlegp1.mirror = true;
        setRotation(rightlegp1, 0F, 0F, 0F);
        leftlegp1 = new ModelRenderer(this, 17, 26);
        leftlegp1.addBox(2F, 1F, -1F, 3, 3, 2);
        leftlegp1.setRotationPoint(2F, 12F, 0F);
        leftlegp1.setTextureSize(64, 32);
        leftlegp1.mirror = true;
        head = new ModelRenderer(this, 0, 0);
        head.addBox(-4F, -8F, -4F, 8, 8, 8);
        head.setRotationPoint(0F, 0F, 0F);
        head.setTextureSize(64, 32);
        head.mirror = true;
        setRotation(head, 0F, 0F, 0F);
        spine2 = new ModelRenderer(this, 45, 2);
        spine2.addBox(0F, -5F, 6F, 1, 2, 8);
        spine2.setRotationPoint(0F, 0F, 0F);
        spine2.setTextureSize(64, 32);
        spine2.mirror = true;
        setRotation(spine2, 1.22173F, 0F, 0F);
        spine3 = new ModelRenderer(this, 45, 2);
        spine3.addBox(4F, -6F, 0F, 1, 2, 8);
        spine3.setRotationPoint(0F, 0F, 0F);
        spine3.setTextureSize(64, 32);
        spine3.mirror = true;
        setRotation(spine3, 0.1745329F, 0F, 0F);
        spine4 = new ModelRenderer(this, 45, 2);
        spine4.addBox(-5F, -3F, -2F, 1, 2, 8);
        spine4.setRotationPoint(0F, 0F, 0F);
        spine4.setTextureSize(64, 32);
        spine4.mirror = true;
        setRotation(spine4, -0.2617994F, 0F, 0F);
        spine5 = new ModelRenderer(this, 45, 2);
        spine5.addBox(-5F, -6F, 0F, 1, 2, 8);
        spine5.setRotationPoint(0F, 0F, 0F);
        spine5.setTextureSize(64, 32);
        spine5.mirror = true;
        setRotation(spine5, 0.1745329F, 0F, 0F);
        spine6 = new ModelRenderer(this, 45, 2);
        spine6.addBox(-5F, -8F, 1F, 1, 2, 8);
        spine6.setRotationPoint(0F, 0F, 0F);
        spine6.setTextureSize(64, 32);
        spine6.mirror = true;
        setRotation(spine6, 0.6108652F, 0F, 0F);
        spine7 = new ModelRenderer(this, 45, 2);
        spine7.addBox(4F, -8F, 1F, 1, 2, 8);
        spine7.setRotationPoint(0F, 0F, 0F);
        spine7.setTextureSize(64, 32);
        spine7.mirror = true;
        setRotation(spine7, 0.6108652F, 0F, 0F);
        spine9 = new ModelRenderer(this, 45, 2);
        spine9.addBox(2F, -7F, 4F, 1, 2, 8);
        spine9.setRotationPoint(0F, 0F, 0F);
        spine9.setTextureSize(64, 32);
        spine9.mirror = true;
        setRotation(spine9, 0.9599311F, 0F, 0F);
        spine8 = new ModelRenderer(this, 45, 2);
        spine8.addBox(-3F, -7F, 4F, 1, 2, 8);
        spine8.setRotationPoint(0F, 0F, 0F);
        spine8.setTextureSize(64, 32);
        spine8.mirror = true;
        setRotation(spine8, 0.9599311F, 0F, 0F);
        spine10 = new ModelRenderer(this, 45, 2);
        spine10.addBox(-1F, -5F, 6F, 1, 2, 8);
        spine10.setRotationPoint(0F, 0F, 0F);
        spine10.setTextureSize(64, 32);
        spine10.mirror = true;
        setRotation(spine10, 1.22173F, 0F, 0F);
        bodyp2 = new ModelRenderer(this, 16, 16);
        bodyp2.addBox(-4F, 0F, -2F, 8, 4, 4);
        bodyp2.setRotationPoint(-4F, 0F, 0F);
        bodyp2.setTextureSize(64, 32);
        bodyp2.mirror = true;
        setRotation(bodyp2, 0F, 0F, 0F);
        bodyp2.mirror = false;
        bodyp3 = new ModelRenderer(this, 16, 16);
        bodyp3.addBox(-4F, 0F, -2F, 8, 4, 4);
        bodyp3.setRotationPoint(0F, 8F, 0F);
        bodyp3.setTextureSize(64, 32);
        bodyp3.mirror = true;
        setRotation(bodyp3, 0F, 0F, 0F);
        bodyp4 = new ModelRenderer(this, 16, 16);
        bodyp4.addBox(-4F, 0F, -2F, 5, 4, 4);
        bodyp4.setRotationPoint(-1F, 4F, 0F);
        bodyp4.setTextureSize(64, 32);
        bodyp4.mirror = true;
        setRotation(bodyp4, 0F, 0F, 0F);
        bodyp5 = new ModelRenderer(this, 16, 16);
        bodyp5.addBox(-4F, 0F, -2F, 8, 4, 4);
        bodyp5.setRotationPoint(4F, 0F, 0F);
        bodyp5.setTextureSize(64, 32);
        bodyp5.mirror = true;
        setRotation(bodyp5, 0F, 0F, 0F);
        leftarm = new ModelRenderer(this, 40, 16);
        leftarm.addBox(-1F, -2F, -2F, 4, 12, 4);
        leftarm.setRotationPoint(9F, 2F, 0F);
        leftarm.setTextureSize(64, 32);
        leftarm.mirror = true;
        setRotation(leftarm, 0F, 0F, 0F);
        rightarm = new ModelRenderer(this, 40, 16);
        rightarm.addBox(-3F, -2F, -2F, 4, 12, 4);
        rightarm.setRotationPoint(-9F, 2F, 0F);
        rightarm.setTextureSize(64, 32);
        rightarm.mirror = true;
        setRotation(rightarm, 0F, 0F, 0F);
        leftarmp2 = new ModelRenderer(this, 32, 6);
        leftarmp2.addBox(-2F, 10F, -17F, 1, 2, 7);
        leftarmp2.setRotationPoint(9F, 2F, 0F);
        leftarmp2.setTextureSize(64, 32);
        leftarmp2.mirror = true;
        setRotation(leftarmp2, 0F, 0F, 0F);
        rightarmp2 = new ModelRenderer(this, 32, 6);
        rightarmp2.addBox(-4F, 10F, -17F, 1, 2, 7);
        rightarmp2.setRotationPoint(-9F, 2F, 0F);
        rightarmp2.setTextureSize(64, 32);
        rightarmp2.mirror = true;
        setRotation(rightarmp2, 0F, 0F, 0F);
        leftarmp3 = new ModelRenderer(this, 32, 6);
        leftarmp3.addBox(3F, 8F, -3F, 1, 2, 7);
        leftarmp3.setRotationPoint(9F, 2F, 0F);
        leftarmp3.setTextureSize(64, 32);
        leftarmp3.mirror = true;
        setRotation(leftarmp3, 0F, 0F, 0F);
        leftarmp4 = new ModelRenderer(this, 32, 6);
        leftarmp4.addBox(-2F, 8F, -3F, 1, 2, 7);
        leftarmp4.setRotationPoint(9F, 2F, 0F);
        leftarmp4.setTextureSize(64, 32);
        leftarmp4.mirror = true;
        setRotation(leftarmp4, 0F, 0F, 0F);
        rightarmp3 = new ModelRenderer(this, 32, 6);
        rightarmp3.addBox(1F, 8F, -3F, 1, 2, 7);
        rightarmp3.setRotationPoint(-9F, 2F, 0F);
        rightarmp3.setTextureSize(64, 32);
        rightarmp3.mirror = true;
        setRotation(rightarmp3, 0F, 0F, 0F);
        rightarmp4 = new ModelRenderer(this, 32, 6);
        rightarmp4.addBox(-4F, 8F, -3F, 1, 2, 7);
        rightarmp4.setRotationPoint(-9F, 2F, 0F);
        rightarmp4.setTextureSize(64, 32);
        rightarmp4.mirror = true;
        setRotation(rightarmp4, 0F, 0F, 0F);
        rightarmp5 = new ModelRenderer(this, 32, 6);
        rightarmp5.addBox(-4F, 8F, -10F, 1, 3, 7);
        rightarmp5.setRotationPoint(-9F, 2F, 0F);
        rightarmp5.setTextureSize(64, 32);
        rightarmp5.mirror = true;
        setRotation(rightarmp5, 0F, 0F, 0F);
        rightarmp6 = new ModelRenderer(this, 32, 6);
        rightarmp6.addBox(1F, 8F, -10F, 1, 3, 7);
        rightarmp6.setRotationPoint(-9F, 2F, 0F);
        rightarmp6.setTextureSize(64, 32);
        rightarmp6.mirror = true;
        setRotation(rightarmp6, 0F, 0F, 0F);
        leftarmp5 = new ModelRenderer(this, 32, 6);
        leftarmp5.addBox(-2F, 8F, -10F, 1, 3, 7);
        leftarmp5.setRotationPoint(9F, 2F, 0F);
        leftarmp5.setTextureSize(64, 32);
        leftarmp5.mirror = true;
        setRotation(leftarmp5, 0F, 0F, 0F);
        leftarmp6 = new ModelRenderer(this, 32, 6);
        leftarmp6.addBox(3F, 8F, -10F, 1, 3, 7);
        leftarmp6.setRotationPoint(9F, 2F, 0F);
        leftarmp6.setTextureSize(64, 32);
        leftarmp6.mirror = true;
        setRotation(leftarmp6, 0F, 0F, 0F);
        leftleg = new ModelRenderer(this, 0, 16);
        leftleg.addBox(-2F, 0F, -2F, 4, 12, 4);
        leftleg.setRotationPoint(2F, 12F, 0F);
        leftleg.setTextureSize(64, 32);
        leftleg.mirror = true;
        setRotation(leftleg, 0F, 0F, 0F);
        rightleg = new ModelRenderer(this, 0, 16);
        rightleg.addBox(-2F, 0F, -2F, 4, 12, 4);
        rightleg.setRotationPoint(-2F, 12F, 0F);
        rightleg.setTextureSize(64, 32);
        rightleg.mirror = true;
        setRotation(rightleg, 0F, 0F, 0F);
        rightlegp2 = new ModelRenderer(this, 28, 26);
        rightlegp2.addBox(-5F, 6F, -1F, 3, 3, 2);
        rightlegp2.setRotationPoint(-2F, 12F, 0F);
        rightlegp2.setTextureSize(64, 32);
        rightlegp2.mirror = true;
        setRotation(rightlegp2, 0F, 0F, 0F);
        leftlegp2 = new ModelRenderer(this, 28, 26);
        leftlegp2.addBox(2F, 6F, -1F, 3, 3, 2);
        leftlegp2.setRotationPoint(2F, 12F, 0F);
        leftlegp2.setTextureSize(64, 32);
        leftlegp2.mirror = true;
        setRotation(leftlegp2, 0F, 0F, 0F);
        leftarm7 = new ModelRenderer(this, 32, 6);
        leftarm7.addBox(3F, 8F, -17F, 1, 2, 7);
        leftarm7.setRotationPoint(9F, 2F, 0F);
        leftarm7.setTextureSize(64, 32);
        leftarm7.mirror = true;
        setRotation(leftarm7, 0F, 0F, 0F);
        leftarm8 = new ModelRenderer(this, 32, 6);
        leftarm8.addBox(-2F, 8F, -17F, 1, 2, 7);
        leftarm8.setRotationPoint(9F, 2F, 0F);
        leftarm8.setTextureSize(64, 32);
        leftarm8.mirror = true;
        setRotation(leftarm8, 0F, 0F, 0F);
        rightarm7 = new ModelRenderer(this, 32, 6);
        rightarm7.addBox(1F, 8F, -17F, 1, 2, 7);
        rightarm7.setRotationPoint(-9F, 2F, 0F);
        rightarm7.setTextureSize(64, 32);
        rightarm7.mirror = true;
        setRotation(rightarm7, 0F, 0F, 0F);
        rightarm8 = new ModelRenderer(this, 32, 6);
        rightarm8.addBox(-4F, 8F, -17F, 1, 2, 7);
        rightarm8.setRotationPoint(-9F, 2F, 0F);
        rightarm8.setTextureSize(64, 32);
        rightarm8.mirror = true;
        setRotation(rightarm8, 0F, 0F, 0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5);
        spine1.render(f5);
        bodyp1.render(f5);
        rightarmp1.render(f5);
        leftarmp1.render(f5);
        rightlegp1.render(f5);
        leftlegp1.render(f5);
        head.render(f5);
        spine2.render(f5);
        spine3.render(f5);
        spine4.render(f5);
        spine5.render(f5);
        spine6.render(f5);
        spine7.render(f5);
        spine9.render(f5);
        spine8.render(f5);
        spine10.render(f5);
        bodyp2.render(f5);
        bodyp3.render(f5);
        bodyp4.render(f5);
        bodyp5.render(f5);
        leftarm.render(f5);
        rightarm.render(f5);
        leftarmp2.render(f5);
        rightarmp2.render(f5);
        leftarmp3.render(f5);
        leftarmp4.render(f5);
        rightarmp3.render(f5);
        rightarmp4.render(f5);
        rightarmp5.render(f5);
        rightarmp6.render(f5);
        leftarmp5.render(f5);
        leftarmp6.render(f5);
        leftleg.render(f5);
        rightleg.render(f5);
        rightlegp2.render(f5);
        leftlegp2.render(f5);
        leftarm7.render(f5);
        leftarm8.render(f5);
        rightarm7.render(f5);
        rightarm8.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
        this.leftleg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
        this.leftlegp1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;

        this.rightleg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
        this.rightlegp2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;

        this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
        this.rightarmp1.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
        this.rightarmp2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
        this.rightarmp3.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
        this.rightarmp4.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
        this.rightarmp5.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
        this.rightarmp6.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
        this.rightarm7.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
        this.rightarm8.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;

        this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
        this.leftarmp1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
        this.leftarmp2.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
        this.leftarmp3.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
        this.leftarmp4.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
        this.leftarmp5.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
        this.leftarmp6.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
        this.leftarm7.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
        this.leftarm8.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
    }

}
