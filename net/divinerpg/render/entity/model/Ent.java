package net.divinerpg.render.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Ent extends ModelBase
{
    //fields
    ModelRenderer horn1;
    ModelRenderer Part1;
    ModelRenderer rightarm1;
    ModelRenderer leftarm1;
    ModelRenderer rightleg1;
    ModelRenderer leftleg1;
    ModelRenderer leftleg2;
    ModelRenderer rightleg2;
    ModelRenderer leftleg3;
    ModelRenderer rightleg3;
    ModelRenderer Part2;
    ModelRenderer Part3;
    ModelRenderer Part4;
    ModelRenderer Part5;
    ModelRenderer Part6;
    ModelRenderer Part7;
    ModelRenderer Part8;
    ModelRenderer Part9;
    ModelRenderer Part10;
    ModelRenderer leftarm2;
    ModelRenderer rightarm2;
    ModelRenderer rightarm3;
    ModelRenderer leftarm3;
    ModelRenderer Part11;
    ModelRenderer Part12;
    ModelRenderer Part13;
    ModelRenderer Part14;
    ModelRenderer Part15;
    ModelRenderer Part16;
    ModelRenderer Part17;
    ModelRenderer Part18;
    ModelRenderer Part19;
    ModelRenderer Part20;
    ModelRenderer Part21;
    ModelRenderer Part22;
    ModelRenderer head;
    ModelRenderer horn2;

    public Ent()
    {
        textureWidth = 256;
        textureHeight = 32;

        horn1 = new ModelRenderer(this, 68, 0);
        horn1.addBox(4F, -8F, -11F, 2, 3, 12);
        horn1.setRotationPoint(0F, -36F, -2F);
        horn1.setTextureSize(256, 32);
        horn1.mirror = true;
        setRotation(horn1, -0.4363323F, 0F, 0F);
        Part1 = new ModelRenderer(this, 67, 12);
        Part1.addBox(-4F, 0F, -2F, 16, 12, 4);
        Part1.setRotationPoint(-4F, -27F, 8F);
        Part1.setTextureSize(256, 32);
        Part1.mirror = true;
        setRotation(Part1, 0.1745329F, 0F, 0F);
        rightarm1 = new ModelRenderer(this, 159, 0);
        rightarm1.addBox(-2F, 8F, 1F, 8, 12, 10);
        rightarm1.setRotationPoint(-16F, -30F, 2F);
        rightarm1.setTextureSize(256, 32);
        rightarm1.mirror = true;
        setRotation(rightarm1, -0.6905433F, 0F, 0.1745329F);
        leftarm1 = new ModelRenderer(this, 159, 0);
        leftarm1.addBox(-6F, 8F, 1F, 8, 12, 10);
        leftarm1.setRotationPoint(16F, -30F, 2F);
        leftarm1.setTextureSize(256, 32);
        leftarm1.mirror = true;
        setRotation(leftarm1, -0.6905433F, 0F, -0.1745329F);
        rightleg1 = new ModelRenderer(this, 159, 0);
        rightleg1.addBox(-10F, 2F, 3F, 12, 12, 10);
        rightleg1.setRotationPoint(-12F, -1F, -4F);
        rightleg1.setTextureSize(256, 32);
        rightleg1.mirror = true;
        setRotation(rightleg1, -0.3490659F, 0.3490659F, 0F);
        leftleg1 = new ModelRenderer(this, 159, 0);
        leftleg1.addBox(-2F, 2F, 3F, 12, 12, 10);
        leftleg1.setRotationPoint(12F, -1F, -4F);
        leftleg1.setTextureSize(256, 32);
        leftleg1.mirror = true;
        setRotation(leftleg1, -0.3490659F, -0.3490659F, 0F);
        leftleg2 = new ModelRenderer(this, 209, 0);
        leftleg2.addBox(-4F, -13F, 2F, 10, 12, 10);
        leftleg2.setRotationPoint(12F, 5F, -4F);
        leftleg2.setTextureSize(256, 32);
        leftleg2.mirror = true;
        setRotation(leftleg2, -0.1745329F, -0.3490659F, 0F);
        rightleg2 = new ModelRenderer(this, 209, 0);
        rightleg2.addBox(-6F, -13F, 2F, 10, 12, 10);
        rightleg2.setRotationPoint(-12F, 5F, -4F);
        rightleg2.setTextureSize(256, 32);
        rightleg2.mirror = true;
        setRotation(rightleg2, -0.1745329F, 0.3490659F, 0F);
        leftleg3 = new ModelRenderer(this, 209, 0);
        leftleg3.addBox(-1F, 7F, -2F, 10, 12, 10);
        leftleg3.setRotationPoint(12F, 5F, -4F);
        leftleg3.setTextureSize(256, 32);
        leftleg3.mirror = true;
        setRotation(leftleg3, 0F, 0F, 0F);
        rightleg3 = new ModelRenderer(this, 209, 0);
        rightleg3.addBox(-9F, 7F, -2F, 10, 12, 10);
        rightleg3.setRotationPoint(-12F, 5F, -4F);
        rightleg3.setTextureSize(256, 32);
        rightleg3.mirror = true;
        setRotation(rightleg3, 0F, 0F, 0F);
        Part2 = new ModelRenderer(this, 67, 0);
        Part2.addBox(-4F, 0F, -2F, 16, 12, 4);
        Part2.setRotationPoint(-4F, -27F, 0F);
        Part2.setTextureSize(256, 32);
        Part2.mirror = true;
        setRotation(Part2, 0.1745329F, 0F, 0F);
        Part3 = new ModelRenderer(this, 67, 4);
        Part3.addBox(-4F, 0F, -2F, 16, 12, 4);
        Part3.setRotationPoint(-4F, -27F, 12F);
        Part3.setTextureSize(256, 32);
        Part3.mirror = true;
        setRotation(Part3, 0.1745329F, 0F, 0F);
        Part4 = new ModelRenderer(this, 67, 8);
        Part4.addBox(-4F, 0F, -2F, 16, 12, 4);
        Part4.setRotationPoint(-4F, -27F, 4F);
        Part4.setTextureSize(256, 32);
        Part4.mirror = true;
        setRotation(Part4, 0.1745329F, 0F, 0F);
        Part5 = new ModelRenderer(this, 67, 12);
        Part5.addBox(-4F, 0F, -2F, 18, 12, 4);
        Part5.setRotationPoint(-5F, -37F, 5F);
        Part5.setTextureSize(256, 32);
        Part5.mirror = true;
        setRotation(Part5, 0.3490659F, 0F, 0F);
        Part6 = new ModelRenderer(this, 67, 8);
        Part6.addBox(-4F, 0F, -2F, 18, 12, 4);
        Part6.setRotationPoint(-5F, -37F, 1F);
        Part6.setTextureSize(256, 32);
        Part6.mirror = true;
        setRotation(Part6, 0.3490659F, 0F, 0F);
        Part7 = new ModelRenderer(this, 67, 8);
        Part7.addBox(-4F, 0F, -2F, 18, 12, 4);
        Part7.setRotationPoint(-5F, -17F, 4F);
        Part7.setTextureSize(256, 32);
        Part7.mirror = true;
        setRotation(Part7, 0F, 0F, 0F);
        Part8 = new ModelRenderer(this, 67, 0);
        Part8.addBox(-4F, 0F, -2F, 18, 12, 4);
        Part8.setRotationPoint(-5F, -17F, 0F);
        Part8.setTextureSize(256, 32);
        Part8.mirror = true;
        setRotation(Part8, 0F, 0F, 0F);
        Part9 = new ModelRenderer(this, 67, 12);
        Part9.addBox(-4F, 0F, -2F, 18, 12, 4);
        Part9.setRotationPoint(-5F, -17F, 8F);
        Part9.setTextureSize(256, 32);
        Part9.mirror = true;
        setRotation(Part9, 0F, 0F, 0F);
        Part10 = new ModelRenderer(this, 67, 4);
        Part10.addBox(-4F, 0F, -2F, 18, 12, 4);
        Part10.setRotationPoint(-5F, -17F, 12F);
        Part10.setTextureSize(256, 32);
        Part10.mirror = true;
        setRotation(Part10, 0F, 0F, 0F);
        leftarm2 = new ModelRenderer(this, 209, 0);
        leftarm2.addBox(-7F, 14F, 2F, 10, 12, 10);
        leftarm2.setRotationPoint(16F, -30F, 2F);
        leftarm2.setTextureSize(256, 32);
        leftarm2.mirror = true;
        setRotation(leftarm2, -0.8650762F, 0F, -0.1745329F);
        rightarm2 = new ModelRenderer(this, 209, 0);
        rightarm2.addBox(-3F, 14F, 2F, 10, 12, 10);
        rightarm2.setRotationPoint(-16F, -30F, 2F);
        rightarm2.setTextureSize(256, 32);
        rightarm2.mirror = true;
        setRotation(rightarm2, -0.8650762F, 0F, 0.1745329F);
        rightarm3 = new ModelRenderer(this, 209, 0);
        rightarm3.addBox(-3F, -2F, -2F, 10, 12, 10);
        rightarm3.setRotationPoint(-16F, -30F, 2F);
        rightarm3.setTextureSize(256, 32);
        rightarm3.mirror = true;
        setRotation(rightarm3, -0.3414775F, 0F, 0.1745329F);
        leftarm3 = new ModelRenderer(this, 209, 0);
        leftarm3.addBox(-7F, -2F, -2F, 10, 12, 10);
        leftarm3.setRotationPoint(16F, -30F, 2F);
        leftarm3.setTextureSize(256, 32);
        leftarm3.mirror = true;
        setRotation(leftarm3, -0.3414775F, 0F, -0.1745329F);
        Part11 = new ModelRenderer(this, 67, 0);
        Part11.addBox(-4F, 0F, -2F, 18, 12, 4);
        Part11.setRotationPoint(-5F, -37F, -3F);
        Part11.setTextureSize(256, 32);
        Part11.mirror = true;
        setRotation(Part11, 0.3490659F, 0F, 0F);
        Part12 = new ModelRenderer(this, 67, 4);
        Part12.addBox(-4F, 0F, -2F, 18, 12, 4);
        Part12.setRotationPoint(-5F, -37F, 9F);
        Part12.setTextureSize(256, 32);
        Part12.mirror = true;
        setRotation(Part12, 0.3490659F, 0F, 0F);
        Part13 = new ModelRenderer(this, 33, 4);
        Part13.addBox(0F, -20F, -5F, 8, 7, 9);
        Part13.setRotationPoint(0F, -30F, 9F);
        Part13.setTextureSize(256, 32);
        Part13.mirror = true;
        setRotation(Part13, -0.9893642F, 0.3346075F, -0.0371786F);
        Part14 = new ModelRenderer(this, 113, 4);
        Part14.addBox(2F, -14F, -3F, 4, 12, 4);
        Part14.setRotationPoint(0F, -30F, 9F);
        Part14.setTextureSize(256, 32);
        Part14.mirror = true;
        setRotation(Part14, -0.9893642F, 0.3346075F, -0.0371786F);
        Part15 = new ModelRenderer(this, 33, 4);
        Part15.addBox(-6F, -10F, 0F, 8, 7, 9);
        Part15.setRotationPoint(0F, -37F, 9F);
        Part15.setTextureSize(256, 32);
        Part15.mirror = true;
        setRotation(Part15, -0.2086133F, 0F, 0F);
        Part16 = new ModelRenderer(this, 113, 4);
        Part16.addBox(-4F, -4F, 2F, 4, 12, 4);
        Part16.setRotationPoint(0F, -37F, 9F);
        Part16.setTextureSize(256, 32);
        Part16.mirror = true;
        setRotation(Part16, -0.2086133F, 0F, 0F);
        Part17 = new ModelRenderer(this, 33, 4);
        Part17.addBox(-5F, -15F, 5F, 8, 7, 9);
        Part17.setRotationPoint(0F, -30F, 9F);
        Part17.setTextureSize(256, 32);
        Part17.mirror = true;
        setRotation(Part17, -0.8406497F, 0F, 0F);
        Part18 = new ModelRenderer(this, 113, 4);
        Part18.addBox(-3F, -9F, 7F, 4, 12, 4);
        Part18.setRotationPoint(0F, -30F, 9F);
        Part18.setTextureSize(256, 32);
        Part18.mirror = true;
        setRotation(Part18, -0.8406497F, 0F, 0F);
        Part19 = new ModelRenderer(this, 33, 4);
        Part19.addBox(-5F, -12F, 12F, 8, 7, 9);
        Part19.setRotationPoint(0F, -30F, 9F);
        Part19.setTextureSize(256, 32);
        Part19.mirror = true;
        setRotation(Part19, -1.138079F, -0.5576792F, 0F);
        Part20 = new ModelRenderer(this, 113, 4);
        Part20.addBox(-3F, -6F, 14F, 4, 12, 4);
        Part20.setRotationPoint(0F, -30F, 9F);
        Part20.setTextureSize(256, 32);
        Part20.mirror = true;
        setRotation(Part20, -1.138079F, -0.5576792F, 0F);
        Part21 = new ModelRenderer(this, 33, 4);
        Part21.addBox(-5F, -14F, 10F, 8, 7, 9);
        Part21.setRotationPoint(0F, -30F, 9F);
        Part21.setTextureSize(256, 32);
        Part21.mirror = true;
        setRotation(Part21, -1.138079F, 0.5948578F, -0.0371786F);
        Part22 = new ModelRenderer(this, 113, 4);
        Part22.addBox(-3F, -8F, 12F, 4, 12, 4);
        Part22.setRotationPoint(0F, -30F, 9F);
        Part22.setTextureSize(256, 32);
        Part22.mirror = true;
        setRotation(Part22, -1.138079F, 0.5948578F, -0.0371786F);
        head = new ModelRenderer(this, 0, 0);
        head.addBox(-4F, -8F, -4F, 8, 8, 8);
        head.setRotationPoint(0F, -36F, -2F);
        head.setTextureSize(256, 32);
        head.mirror = true;
        setRotation(head, 0F, 0F, 0F);
        horn2 = new ModelRenderer(this, 68, 0);
        horn2.addBox(-6F, -8F, -11F, 2, 3, 12);
        horn2.setRotationPoint(0F, -36F, -2F);
        horn2.setTextureSize(256, 32);
        horn2.mirror = true;
        setRotation(horn2, -0.4363323F, 0F, 0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5);
        horn1.render(f5);
        Part1.render(f5);
        rightarm1.render(f5);
        leftarm1.render(f5);
        rightleg1.render(f5);
        leftleg1.render(f5);
        leftleg2.render(f5);
        rightleg2.render(f5);
        leftleg3.render(f5);
        rightleg3.render(f5);
        Part2.render(f5);
        Part3.render(f5);
        Part4.render(f5);
        Part5.render(f5);
        Part6.render(f5);
        Part7.render(f5);
        Part8.render(f5);
        Part9.render(f5);
        Part10.render(f5);
        leftarm2.render(f5);
        rightarm2.render(f5);
        rightarm3.render(f5);
        leftarm3.render(f5);
        Part11.render(f5);
        Part12.render(f5);
        Part13.render(f5);
        Part14.render(f5);
        Part15.render(f5);
        Part16.render(f5);
        Part17.render(f5);
        Part18.render(f5);
        Part19.render(f5);
        Part20.render(f5);
        Part21.render(f5);
        Part22.render(f5);
        head.render(f5);
        horn2.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
        this.leftleg1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1 + -0.3490659F;
        this.leftleg2.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1 + -0.1745329F;
        this.leftleg3.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;

        this.rightleg1.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1 + -0.3490659F;
        this.rightleg2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1 + -0.1745329F;
        this.rightleg3.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;

        this.rightarm1.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F + -0.6905433F;
        this.rightarm2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F +  -0.8650762F;
        this.rightarm3.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F + -0.3414775F;

        this.leftarm1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F + -0.6905433F;
        this.leftarm2.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F +  -0.8650762F;
        this.leftarm3.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F + -0.3414775F;
    }

}
