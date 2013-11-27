package net.divinerpg.render.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Dreamwrecker extends ModelBase
{
    //fields
    ModelRenderer head;
    ModelRenderer bodyt1;
    ModelRenderer rightarmb;
    ModelRenderer leftarmb;
    ModelRenderer rightlegb;
    ModelRenderer leftlegb;
    ModelRenderer bodyt2;
    ModelRenderer rightlegt;
    ModelRenderer leftlegt;
    ModelRenderer body1;
    ModelRenderer body2;
    ModelRenderer bodyb1;
    ModelRenderer bodyb2;
    ModelRenderer rightarmt;
    ModelRenderer leftarmt;
    ModelRenderer rightarmspike1;
    ModelRenderer leftarmspike1;
    ModelRenderer body3;
    ModelRenderer seg1;
    ModelRenderer seg2;
    ModelRenderer seg3;
    ModelRenderer seg4;
    ModelRenderer seg5;
    ModelRenderer seg6;
    ModelRenderer seg7;
    ModelRenderer seg8;
    ModelRenderer seg9;
    ModelRenderer seg10;
    ModelRenderer seg11;
    ModelRenderer seg12;
    ModelRenderer seg13;
    ModelRenderer leftarmm;
    ModelRenderer rightarmm;
    ModelRenderer leftarmspike2;
    ModelRenderer rightarmspike2;
    ModelRenderer leftarmspike3;
    ModelRenderer rightarmspike3;
    ModelRenderer rightarmspike4;
    ModelRenderer leftarmspike4;
    ModelRenderer seg14;
    ModelRenderer seg15;
    ModelRenderer seg16;
    ModelRenderer seg17;
    ModelRenderer seg18;

    public Dreamwrecker()
    {
        textureWidth = 64;
        textureHeight = 32;

        head = new ModelRenderer(this, 0, 0);
        head.addBox(-4F, -8F, -4F, 8, 8, 8);
        head.setRotationPoint(0F, -41F, -3F);
        head.setTextureSize(64, 32);
        head.mirror = true;
        setRotation(head, 0F, 0F, 0F);
        bodyt1 = new ModelRenderer(this, 16, 18);
        bodyt1.addBox(-4F, 0F, -2F, 8, 6, 4);
        bodyt1.setRotationPoint(4F, -30F, 0F);
        bodyt1.setTextureSize(64, 32);
        bodyt1.mirror = true;
        setRotation(bodyt1, 0F, 0F, 0F);
        rightarmb = new ModelRenderer(this, 48, 8);
        rightarmb.addBox(-3F, 18F, -2F, 4, 4, 4);
        rightarmb.setRotationPoint(-9F, -26F, 0F);
        rightarmb.setTextureSize(64, 32);
        rightarmb.mirror = true;
        setRotation(rightarmb, 0F, 0F, 0F);
        leftarmb = new ModelRenderer(this, 48, 8);
        leftarmb.addBox(-1F, 18F, -2F, 4, 4, 4);
        leftarmb.setRotationPoint(9F, -26F, 0F);
        leftarmb.setTextureSize(64, 32);
        leftarmb.mirror = true;
        setRotation(leftarmb, 0F, 0F, 0F);
        rightlegb = new ModelRenderer(this, 0, 17);
        rightlegb.addBox(-2F, 8F, -2F, 4, 10, 4);
        rightlegb.setRotationPoint(-3F, 6F, 0F);
        rightlegb.setTextureSize(64, 32);
        rightlegb.mirror = true;
        setRotation(rightlegb, 0F, 0F, 0F);
        leftlegb = new ModelRenderer(this, 0, 17);
        leftlegb.addBox(-2F, 8F, -2F, 4, 10, 4);
        leftlegb.setRotationPoint(3F, 6F, 0F);
        leftlegb.setTextureSize(64, 32);
        leftlegb.mirror = true;
        setRotation(leftlegb, 0F, 0F, 0F);
        bodyt2 = new ModelRenderer(this, 16, 18);
        bodyt2.addBox(-4F, 0F, -2F, 8, 6, 4);
        bodyt2.setRotationPoint(-4F, -30F, 0F);
        bodyt2.setTextureSize(64, 32);
        bodyt2.mirror = true;
        setRotation(bodyt2, 0F, 0F, 0F);
        rightlegt = new ModelRenderer(this, 0, 16);
        rightlegt.addBox(-2F, 0F, -2F, 4, 8, 4);
        rightlegt.setRotationPoint(-3F, 6F, 0F);
        rightlegt.setTextureSize(64, 32);
        rightlegt.mirror = true;
        setRotation(rightlegt, 0F, 0F, 0F);
        leftlegt = new ModelRenderer(this, 0, 16);
        leftlegt.addBox(-2F, 0F, -2F, 4, 8, 4);
        leftlegt.setRotationPoint(3F, 6F, 0F);
        leftlegt.setTextureSize(64, 32);
        leftlegt.mirror = true;
        setRotation(leftlegt, 0F, 0F, 0F);
        body1 = new ModelRenderer(this, 16, 18);
        body1.addBox(-4F, 0F, -2F, 6, 8, 4);
        body1.setRotationPoint(1F, -8F, 0F);
        body1.setTextureSize(64, 32);
        body1.mirror = true;
        setRotation(body1, 0F, 0F, 0F);
        body2 = new ModelRenderer(this, 16, 18);
        body2.addBox(-4F, 0F, -2F, 6, 8, 4);
        body2.setRotationPoint(1F, -16F, 0F);
        body2.setTextureSize(64, 32);
        body2.mirror = true;
        setRotation(body2, 0F, 0F, 0F);
        bodyb1 = new ModelRenderer(this, 16, 18);
        bodyb1.addBox(-4F, 0F, -2F, 7, 6, 4);
        bodyb1.setRotationPoint(4F, 0F, 0F);
        bodyb1.setTextureSize(64, 32);
        bodyb1.mirror = true;
        setRotation(bodyb1, 0F, 0F, 0F);
        bodyb2 = new ModelRenderer(this, 16, 18);
        bodyb2.addBox(-4F, 0F, -2F, 7, 6, 4);
        bodyb2.setRotationPoint(-3F, 0F, 0F);
        bodyb2.setTextureSize(64, 32);
        bodyb2.mirror = true;
        setRotation(bodyb2, 0F, 0F, 0F);
        rightarmt = new ModelRenderer(this, 40, 16);
        rightarmt.addBox(-3F, -2F, -2F, 4, 12, 4);
        rightarmt.setRotationPoint(-9F, -26F, 0F);
        rightarmt.setTextureSize(64, 32);
        rightarmt.mirror = true;
        setRotation(rightarmt, 0F, 0F, 0F);
        leftarmt = new ModelRenderer(this, 40, 16);
        leftarmt.addBox(-1F, -2F, -2F, 4, 12, 4);
        leftarmt.setRotationPoint(9F, -26F, 0F);
        leftarmt.setTextureSize(64, 32);
        leftarmt.mirror = true;
        setRotation(leftarmt, 0F, 0F, 0F);
        rightarmspike1 = new ModelRenderer(this, 0, 17);
        rightarmspike1.addBox(1F, 21F, 0F, 1, 1, 11);
        rightarmspike1.setRotationPoint(-9F, -26F, 0F);
        rightarmspike1.setTextureSize(64, 32);
        rightarmspike1.mirror = true;
        setRotation(rightarmspike1, 0F, 0F, 0F);
        leftarmspike1 = new ModelRenderer(this, 0, 17);
        leftarmspike1.addBox(3F, 21F, 0F, 1, 1, 11);
        leftarmspike1.setRotationPoint(9F, -26F, 0F);
        leftarmspike1.setTextureSize(64, 32);
        leftarmspike1.mirror = true;
        setRotation(leftarmspike1, 0F, 0F, 0F);
        body3 = new ModelRenderer(this, 16, 18);
        body3.addBox(-4F, 0F, -2F, 6, 8, 4);
        body3.setRotationPoint(1F, -24F, 0F);
        body3.setTextureSize(64, 32);
        body3.mirror = true;
        setRotation(body3, 0F, 0F, 0F);
        seg1 = new ModelRenderer(this, 16, 18);
        seg1.addBox(-4F, -8F, 2F, 6, 5, 4);
        seg1.setRotationPoint(1F, -20F, 1F);
        seg1.setTextureSize(64, 32);
        seg1.mirror = true;
        setRotation(seg1, 0F, 0F, 0F);
        seg2 = new ModelRenderer(this, 16, 18);
        seg2.addBox(-4F, -8F, 1F, 6, 5, 4);
        seg2.setRotationPoint(1F, -35F, 0F);
        seg2.setTextureSize(64, 32);
        seg2.mirror = true;
        setRotation(seg2, 0.5235988F, 0F, 0F);
        seg3 = new ModelRenderer(this, 16, 18);
        seg3.addBox(-4F, -3F, 2F, 6, 5, 4);
        seg3.setRotationPoint(1F, -35F, 0F);
        seg3.setTextureSize(64, 32);
        seg3.mirror = true;
        setRotation(seg3, 0.3490659F, 0F, 0F);
        seg4 = new ModelRenderer(this, 16, 18);
        seg4.addBox(-4F, 2F, 2F, 6, 5, 4);
        seg4.setRotationPoint(1F, -35F, 0F);
        seg4.setTextureSize(64, 32);
        seg4.mirror = true;
        setRotation(seg4, 0.1745329F, 0F, 0F);
        seg5 = new ModelRenderer(this, 16, 18);
        seg5.addBox(-4F, -8F, 1F, 6, 5, 4);
        seg5.setRotationPoint(1F, -15F, 1F);
        seg5.setTextureSize(64, 32);
        seg5.mirror = true;
        setRotation(seg5, -0.1745329F, 0F, 0F);
        seg6 = new ModelRenderer(this, 16, 18);
        seg6.addBox(-4F, -3F, 1F, 6, 5, 4);
        seg6.setRotationPoint(1F, -15F, 1F);
        seg6.setTextureSize(64, 32);
        seg6.mirror = true;
        setRotation(seg6, -0.3490659F, 0F, 0F);
        seg7 = new ModelRenderer(this, 42, 2);
        seg7.addBox(-5F, -9F, 6F, 3, 2, 4);
        seg7.setRotationPoint(9F, -33F, 0F);
        seg7.setTextureSize(64, 32);
        seg7.mirror = true;
        setRotation(seg7, 1.047198F, 0F, 0F);
        seg8 = new ModelRenderer(this, 16, 18);
        seg8.addBox(-4F, 2F, 1F, 6, 1, 4);
        seg8.setRotationPoint(1F, -15F, 1F);
        seg8.setTextureSize(64, 32);
        seg8.mirror = true;
        setRotation(seg8, -0.5235988F, 0F, 0F);
        seg9 = new ModelRenderer(this, 36, 0);
        seg9.addBox(-5F, 2F, 0F, 8, 2, 6);
        seg9.setRotationPoint(1F, -15F, 1F);
        seg9.setTextureSize(64, 32);
        seg9.mirror = true;
        setRotation(seg9, -0.6981317F, 0F, 0F);
        seg10 = new ModelRenderer(this, 36, 0);
        seg10.addBox(-5F, -4F, 0F, 8, 2, 6);
        seg10.setRotationPoint(1F, -15F, 1F);
        seg10.setTextureSize(64, 32);
        seg10.mirror = true;
        setRotation(seg10, -0.3490659F, 0F, 0F);
        seg11 = new ModelRenderer(this, 36, 0);
        seg11.addBox(-5F, -9F, 0F, 8, 2, 6);
        seg11.setRotationPoint(1F, -15F, 1F);
        seg11.setTextureSize(64, 32);
        seg11.mirror = true;
        setRotation(seg11, -0.1745329F, 0F, 0F);
        seg12 = new ModelRenderer(this, 36, 0);
        seg12.addBox(-5F, -9F, 0F, 8, 2, 6);
        seg12.setRotationPoint(1F, -20F, 2F);
        seg12.setTextureSize(64, 32);
        seg12.mirror = true;
        setRotation(seg12, 0F, 0F, 0F);
        seg13 = new ModelRenderer(this, 36, 0);
        seg13.addBox(-5F, -9F, 0F, 8, 2, 6);
        seg13.setRotationPoint(1F, -26F, 3F);
        seg13.setTextureSize(64, 32);
        seg13.mirror = true;
        setRotation(seg13, 0.1745329F, 0F, 0F);
        leftarmm = new ModelRenderer(this, 40, 20);
        leftarmm.addBox(-1F, 10F, -2F, 4, 8, 4);
        leftarmm.setRotationPoint(9F, -26F, 0F);
        leftarmm.setTextureSize(64, 32);
        leftarmm.mirror = true;
        setRotation(leftarmm, 0F, 0F, 0F);
        rightarmm = new ModelRenderer(this, 40, 20);
        rightarmm.addBox(-3F, 10F, -2F, 4, 8, 4);
        rightarmm.setRotationPoint(-9F, -26F, 0F);
        rightarmm.setTextureSize(64, 32);
        rightarmm.mirror = true;
        setRotation(rightarmm, 0F, 0F, 0F);
        leftarmspike2 = new ModelRenderer(this, 0, 17);
        leftarmspike2.addBox(3F, 21F, -11F, 1, 1, 11);
        leftarmspike2.setRotationPoint(9F, -26F, 0F);
        leftarmspike2.setTextureSize(64, 32);
        leftarmspike2.mirror = true;
        setRotation(leftarmspike2, 0F, 0F, 0F);
        rightarmspike2 = new ModelRenderer(this, 0, 17);
        rightarmspike2.addBox(1F, 21F, -11F, 1, 1, 11);
        rightarmspike2.setRotationPoint(-9F, -26F, 0F);
        rightarmspike2.setTextureSize(64, 32);
        rightarmspike2.mirror = true;
        setRotation(rightarmspike2, 0F, 0F, 0F);
        leftarmspike3 = new ModelRenderer(this, 0, 17);
        leftarmspike3.addBox(-2F, 21F, 0F, 1, 1, 11);
        leftarmspike3.setRotationPoint(9F, -26F, 0F);
        leftarmspike3.setTextureSize(64, 32);
        leftarmspike3.mirror = true;
        setRotation(leftarmspike3, 0F, 0F, 0F);
        rightarmspike3 = new ModelRenderer(this, 0, 17);
        rightarmspike3.addBox(-4F, 21F, 0F, 1, 1, 11);
        rightarmspike3.setRotationPoint(-9F, -26F, 0F);
        rightarmspike3.setTextureSize(64, 32);
        rightarmspike3.mirror = true;
        setRotation(rightarmspike3, 0F, 0F, 0F);
        rightarmspike4 = new ModelRenderer(this, 0, 17);
        rightarmspike4.addBox(-4F, 21F, -11F, 1, 1, 11);
        rightarmspike4.setRotationPoint(-9F, -26F, 0F);
        rightarmspike4.setTextureSize(64, 32);
        rightarmspike4.mirror = true;
        setRotation(rightarmspike4, 0F, 0F, 0F);
        leftarmspike4 = new ModelRenderer(this, 0, 17);
        leftarmspike4.addBox(-2F, 21F, -11F, 1, 1, 11);
        leftarmspike4.setRotationPoint(9F, -26F, 0F);
        leftarmspike4.setTextureSize(64, 32);
        leftarmspike4.mirror = true;
        setRotation(leftarmspike4, 0F, 0F, 0F);
        seg14 = new ModelRenderer(this, 36, 0);
        seg14.addBox(-5F, 0F, 0F, 8, 2, 6);
        seg14.setRotationPoint(1F, -15F, 1F);
        seg14.setTextureSize(64, 32);
        seg14.mirror = true;
        setRotation(seg14, -0.5235988F, 0F, 0F);
        seg15 = new ModelRenderer(this, 36, 0);
        seg15.addBox(-5F, -9F, 0F, 8, 2, 6);
        seg15.setRotationPoint(1F, -31F, 2F);
        seg15.setTextureSize(64, 32);
        seg15.mirror = true;
        setRotation(seg15, 0.3490659F, 0F, 0F);
        seg16 = new ModelRenderer(this, 42, 2);
        seg16.addBox(-5F, -9F, 6F, 3, 2, 4);
        seg16.setRotationPoint(-2F, -33F, 0F);
        seg16.setTextureSize(64, 32);
        seg16.mirror = true;
        setRotation(seg16, 1.047198F, 0F, 0F);
        seg17 = new ModelRenderer(this, 36, 0);
        seg17.addBox(-5F, -9F, 0F, 2, 2, 6);
        seg17.setRotationPoint(9F, -33F, 0F);
        seg17.setTextureSize(64, 32);
        seg17.mirror = true;
        setRotation(seg17, 1.047198F, 0F, 0F);
        seg18 = new ModelRenderer(this, 36, 0);
        seg18.addBox(-5F, -9F, 0F, 2, 2, 6);
        seg18.setRotationPoint(-1F, -33F, 0F);
        seg18.setTextureSize(64, 32);
        seg18.mirror = true;
        setRotation(seg18, 1.047198F, 0F, 0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5);
        head.render(f5);
        bodyt1.render(f5);
        rightarmb.render(f5);
        leftarmb.render(f5);
        rightlegb.render(f5);
        leftlegb.render(f5);
        bodyt2.render(f5);
        rightlegt.render(f5);
        leftlegt.render(f5);
        body1.render(f5);
        body2.render(f5);
        bodyb1.render(f5);
        bodyb2.render(f5);
        rightarmt.render(f5);
        leftarmt.render(f5);
        rightarmspike1.render(f5);
        leftarmspike1.render(f5);
        body3.render(f5);
        seg1.render(f5);
        seg2.render(f5);
        seg3.render(f5);
        seg4.render(f5);
        seg5.render(f5);
        seg6.render(f5);
        seg7.render(f5);
        seg8.render(f5);
        seg9.render(f5);
        seg10.render(f5);
        seg11.render(f5);
        seg12.render(f5);
        seg13.render(f5);
        leftarmm.render(f5);
        rightarmm.render(f5);
        leftarmspike2.render(f5);
        rightarmspike2.render(f5);
        leftarmspike3.render(f5);
        rightarmspike3.render(f5);
        rightarmspike4.render(f5);
        leftarmspike4.render(f5);
        seg14.render(f5);
        seg15.render(f5);
        seg16.render(f5);
        seg17.render(f5);
        seg18.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
        this.leftlegt.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
        this.leftlegb.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;

        this.rightlegt.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
        this.rightlegb.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;

        this.rightarmt.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
        this.rightarmm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
        this.rightarmb.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
        this.rightarmspike1.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
        this.rightarmspike2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
        this.rightarmspike3.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
        this.rightarmspike4.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;

        this.leftarmt.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
        this.leftarmm.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
        this.leftarmb.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
        this.leftarmspike1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
        this.leftarmspike2.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
        this.leftarmspike3.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
        this.leftarmspike4.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
    }

}
