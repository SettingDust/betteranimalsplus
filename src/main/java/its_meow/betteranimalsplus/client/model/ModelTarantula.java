package its_meow.betteranimalsplus.client.model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;

/**
 * tarantula - cybercat5555
 * Created using Tabula 5.1.0
 */
public class ModelTarantula extends ModelBetterAnimals {
    public ModelRenderer bodyBase;
    public ModelRenderer abdomen;
    public ModelRenderer thorax;
    public ModelRenderer abdomenHair01;
    public ModelRenderer abdomenHair02;
    public ModelRenderer head;
    public ModelRenderer lLeg01a;
    public ModelRenderer lLeg02a;
    public ModelRenderer lLeg03a;
    public ModelRenderer lLeg04a;
    public ModelRenderer rLeg01a;
    public ModelRenderer rLeg02a;
    public ModelRenderer rLeg03a;
    public ModelRenderer rLeg04a;
    public ModelRenderer lPedipalp01;
    public ModelRenderer rPedipalp01;
    public ModelRenderer lMandible;
    public ModelRenderer rMandible;
    public ModelRenderer lFang01;
    public ModelRenderer lFang02;
    public ModelRenderer rFang01;
    public ModelRenderer rFang02;
    public ModelRenderer lLeg01b;
    public ModelRenderer lLeg01c;
    public ModelRenderer lLeg01FurA;
    public ModelRenderer lLeg01d;
    public ModelRenderer lLeg01FurB;
    public ModelRenderer lLeg02b;
    public ModelRenderer lLeg02c;
    public ModelRenderer lLeg02FurA;
    public ModelRenderer lLeg02d;
    public ModelRenderer lLeg02FurB;
    public ModelRenderer lLeg03b;
    public ModelRenderer lLeg03c;
    public ModelRenderer lLeg03FurA;
    public ModelRenderer lLeg03d;
    public ModelRenderer lLeg03FurB;
    public ModelRenderer lLeg04b;
    public ModelRenderer lLeg04c;
    public ModelRenderer lLeg04FurA;
    public ModelRenderer lLeg04d;
    public ModelRenderer lLeg04FurB;
    public ModelRenderer rLeg01b;
    public ModelRenderer rLeg01c;
    public ModelRenderer rLeg01FurA;
    public ModelRenderer rLeg01d;
    public ModelRenderer rLeg01FurB;
    public ModelRenderer rLeg02b;
    public ModelRenderer rLeg02c;
    public ModelRenderer rLeg02FurA;
    public ModelRenderer rLeg02d;
    public ModelRenderer rLeg02FurB;
    public ModelRenderer rLeg03b;
    public ModelRenderer rLeg03c;
    public ModelRenderer rLeg03FurA;
    public ModelRenderer rLeg03d;
    public ModelRenderer rLeg03FurB;
    public ModelRenderer rLeg04b;
    public ModelRenderer rLeg04c;
    public ModelRenderer rLeg04FurA;
    public ModelRenderer rLeg04d;
    public ModelRenderer rLeg04FurB;
    public ModelRenderer lPedipalp02;
    public ModelRenderer rPedipalp02;

    public ModelTarantula() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.abdomenHair01 = new ModelRenderer(this, 0, 55);
        this.abdomenHair01.setRotationPoint(0.0F, -2.1F, 1.5F);
        this.abdomenHair01.addBox(-3.5F, -1.0F, 0.0F, 7, 2, 5, 0.0F);
        this.setRotateAngle(this.abdomenHair01, 0.36425021489121656F, 0.0F, 0.0F);
        this.lLeg01d = new ModelRenderer(this, 49, 38);
        this.lLeg01d.setRotationPoint(6.7F, 0.0F, 0.0F);
        this.lLeg01d.addBox(-0.3F, -0.5F, -0.5F, 5, 1, 1, 0.0F);
        this.setRotateAngle(this.lLeg01d, 0.0F, 0.136659280431156F, 0.36425021489121656F);
        this.rLeg02d = new ModelRenderer(this, 49, 38);
        this.rLeg02d.mirror = true;
        this.rLeg02d.setRotationPoint(-6.7F, 0.0F, 0.0F);
        this.rLeg02d.addBox(-4.7F, -0.5F, -0.5F, 5, 1, 1, 0.0F);
        this.setRotateAngle(this.rLeg02d, 0.0F, -0.091106186954104F, -0.36425021489121656F);
        this.abdomenHair02 = new ModelRenderer(this, 25, 55);
        this.abdomenHair02.setRotationPoint(0.0F, -2.0F, 5.0F);
        this.abdomenHair02.addBox(-4.0F, -1.0F, 0.0F, 8, 2, 7, 0.0F);
        this.setRotateAngle(this.abdomenHair02, 0.31869712141416456F, 0.0F, 0.0F);
        this.rLeg03FurB = new ModelRenderer(this, 16, 49);
        this.rLeg03FurB.mirror = true;
        this.rLeg03FurB.setRotationPoint(1.0F, -0.3F, 0.2F);
        this.rLeg03FurB.addBox(-4.0F, -0.7F, -1.5F, 4, 2, 3, 0.0F);
        this.setRotateAngle(this.rLeg03FurB, 0.22759093446006054F, 0.0F, 0.4553564018453205F);
        this.lLeg02FurA = new ModelRenderer(this, 16, 36);
        this.lLeg02FurA.setRotationPoint(2.6F, -0.2F, 0.2F);
        this.lLeg02FurA.addBox(0.0F, -0.7F, -1.5F, 4, 2, 3, 0.0F);
        this.setRotateAngle(this.lLeg02FurA, 0.22759093446006054F, 0.0F, -0.36425021489121656F);
        this.rLeg01FurA = new ModelRenderer(this, 0, 36);
        this.rLeg01FurA.mirror = true;
        this.rLeg01FurA.setRotationPoint(-2.6F, -0.2F, 0.2F);
        this.rLeg01FurA.addBox(-4.0F, -0.7F, -1.5F, 4, 2, 3, 0.0F);
        this.setRotateAngle(this.rLeg01FurA, 0.22759093446006054F, 0.0F, 0.36425021489121656F);
        this.rLeg03a = new ModelRenderer(this, 41, 42);
        this.rLeg03a.mirror = true;
        this.rLeg03a.setRotationPoint(-3.0F, 1.0F, -3.3F);
        this.rLeg03a.addBox(-1.0F, -6.0F, -1.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(this.rLeg03a, -0.22759093446006054F, 0.0F, -0.7285004297824331F);
        this.bodyBase = new ModelRenderer(this, 25, 0);
        this.bodyBase.setRotationPoint(0.0F, 14.7F, 3.0F);
        this.bodyBase.addBox(-2.0F, -1.5F, 0.0F, 4, 3, 1, 0.0F);
        this.rLeg02FurA = new ModelRenderer(this, 16, 36);
        this.rLeg02FurA.mirror = true;
        this.rLeg02FurA.setRotationPoint(-2.6F, -0.2F, 0.2F);
        this.rLeg02FurA.addBox(-4.0F, -0.7F, -1.5F, 4, 2, 3, 0.0F);
        this.setRotateAngle(this.rLeg02FurA, 0.22759093446006054F, 0.0F, 0.36425021489121656F);
        this.rLeg03FurA = new ModelRenderer(this, 0, 49);
        this.rLeg03FurA.mirror = true;
        this.rLeg03FurA.setRotationPoint(-2.6F, -0.2F, 0.2F);
        this.rLeg03FurA.addBox(-4.0F, -0.7F, -1.5F, 4, 2, 3, 0.0F);
        this.setRotateAngle(this.rLeg03FurA, 0.0F, 0.0F, 0.36425021489121656F);
        this.rLeg01FurB = new ModelRenderer(this, 0, 42);
        this.rLeg01FurB.mirror = true;
        this.rLeg01FurB.setRotationPoint(-1.0F, -0.3F, 0.2F);
        this.rLeg01FurB.addBox(-4.0F, -0.7F, -1.5F, 4, 2, 3, 0.0F);
        this.setRotateAngle(this.rLeg01FurB, 0.0F, 0.0F, 0.4553564018453205F);
        this.lLeg01FurA = new ModelRenderer(this, 0, 36);
        this.lLeg01FurA.setRotationPoint(2.6F, -0.2F, -0.3F);
        this.lLeg01FurA.addBox(0.0F, -0.7F, -1.5F, 4, 2, 3, 0.0F);
        this.setRotateAngle(this.lLeg01FurA, 0.22759093446006054F, 0.0F, -0.36425021489121656F);
        this.lLeg01a = new ModelRenderer(this, 41, 42);
        this.lLeg01a.setRotationPoint(2.5F, 1.0F, -6.3F);
        this.lLeg01a.addBox(-1.0F, -6.0F, -1.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(this.lLeg01a, 0.40980330836826856F, 0.0F, 0.7285004297824331F);
        this.lLeg03FurB = new ModelRenderer(this, 16, 49);
        this.lLeg03FurB.setRotationPoint(1.0F, -0.3F, 0.2F);
        this.lLeg03FurB.addBox(0.0F, -0.7F, -1.5F, 4, 2, 3, 0.0F);
        this.setRotateAngle(this.lLeg03FurB, 0.0F, 0.0F, -0.4553564018453205F);
        this.rPedipalp01 = new ModelRenderer(this, 29, 12);
        this.rPedipalp01.mirror = true;
        this.rPedipalp01.setRotationPoint(-3.8F, 1.3F, -7.6F);
        this.rPedipalp01.addBox(-1.0F, -1.0F, -5.0F, 2, 2, 5, 0.0F);
        this.setRotateAngle(this.rPedipalp01, -0.136659280431156F, 0.31869712141416456F, 0.0F);
        this.lLeg03FurA = new ModelRenderer(this, 0, 49);
        this.lLeg03FurA.setRotationPoint(2.6F, -0.2F, 0.2F);
        this.lLeg03FurA.addBox(0.0F, -0.7F, -1.5F, 4, 2, 3, 0.0F);
        this.setRotateAngle(this.lLeg03FurA, 0.22759093446006054F, 0.0F, -0.36425021489121656F);
        this.rLeg02a = new ModelRenderer(this, 41, 42);
        this.rLeg02a.mirror = true;
        this.rLeg02a.setRotationPoint(-3.0F, 1.0F, -4.6F);
        this.rLeg02a.addBox(-1.0F, -6.0F, -1.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(this.rLeg02a, 0.22759093446006054F, 0.0F, -0.7285004297824331F);
        this.lLeg04FurA = new ModelRenderer(this, 0, 36);
        this.lLeg04FurA.setRotationPoint(2.6F, -0.2F, 0.2F);
        this.lLeg04FurA.addBox(0.0F, -0.7F, -1.5F, 4, 2, 3, 0.0F);
        this.setRotateAngle(this.lLeg04FurA, 0.22759093446006054F, 0.0F, -0.36425021489121656F);
        this.lLeg03d = new ModelRenderer(this, 49, 38);
        this.lLeg03d.setRotationPoint(6.7F, 0.0F, 0.0F);
        this.lLeg03d.addBox(-0.3F, -0.5F, -0.5F, 5, 1, 1, 0.0F);
        this.setRotateAngle(this.lLeg03d, 0.0F, 0.0F, 0.36425021489121656F);
        this.rLeg03d = new ModelRenderer(this, 49, 38);
        this.rLeg03d.mirror = true;
        this.rLeg03d.setRotationPoint(-6.7F, 0.0F, 0.0F);
        this.rLeg03d.addBox(-4.7F, -0.5F, -0.5F, 5, 1, 1, 0.0F);
        this.setRotateAngle(this.rLeg03d, 0.0F, 0.0F, -0.36425021489121656F);
        this.rLeg03b = new ModelRenderer(this, 42, 26);
        this.rLeg03b.mirror = true;
        this.rLeg03b.setRotationPoint(-0.3F, -5.6F, 0.0F);
        this.rLeg03b.addBox(-8.5F, -1.0F, -1.0F, 9, 2, 2, 0.0F);
        this.setRotateAngle(this.rLeg03b, 0.136659280431156F, 0.136659280431156F, 0.36425021489121656F);
        this.rLeg01a = new ModelRenderer(this, 41, 42);
        this.rLeg01a.mirror = true;
        this.rLeg01a.setRotationPoint(-2.5F, 1.0F, -6.3F);
        this.rLeg01a.addBox(-1.0F, -6.0F, -1.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(this.rLeg01a, 0.40980330836826856F, 0.0F, -0.7285004297824331F);
        this.lLeg03a = new ModelRenderer(this, 41, 42);
        this.lLeg03a.setRotationPoint(3.0F, 1.0F, -3.3F);
        this.lLeg03a.addBox(-1.0F, -6.0F, -1.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(this.lLeg03a, -0.22759093446006054F, 0.0F, 0.7285004297824331F);
        this.lLeg02d = new ModelRenderer(this, 49, 38);
        this.lLeg02d.setRotationPoint(6.7F, 0.0F, 0.0F);
        this.lLeg02d.addBox(-0.3F, -0.5F, -0.5F, 5, 1, 1, 0.0F);
        this.setRotateAngle(this.lLeg02d, 0.0F, 0.091106186954104F, 0.36425021489121656F);
        this.lLeg02FurB = new ModelRenderer(this, 16, 42);
        this.lLeg02FurB.setRotationPoint(1.0F, -0.3F, 0.2F);
        this.lLeg02FurB.addBox(0.0F, -0.7F, -1.5F, 4, 2, 3, 0.0F);
        this.setRotateAngle(this.lLeg02FurB, 0.0F, 0.0F, -0.4553564018453205F);
        this.rLeg04d = new ModelRenderer(this, 49, 38);
        this.rLeg04d.mirror = true;
        this.rLeg04d.setRotationPoint(-6.7F, 0.0F, 0.0F);
        this.rLeg04d.addBox(-4.7F, -0.5F, -0.5F, 5, 1, 1, 0.0F);
        this.setRotateAngle(this.rLeg04d, 0.0F, 0.0F, -0.36425021489121656F);
        this.lLeg04c = new ModelRenderer(this, 43, 32);
        this.lLeg04c.setRotationPoint(7.7F, -0.2F, 0.0F);
        this.lLeg04c.addBox(0.0F, -1.0F, -1.0F, 7, 2, 2, 0.0F);
        this.setRotateAngle(this.lLeg04c, 0.0F, -0.091106186954104F, 0.7740535232594852F);
        this.rLeg02c = new ModelRenderer(this, 43, 32);
        this.rLeg02c.mirror = true;
        this.rLeg02c.setRotationPoint(-7.7F, -0.3F, 0.0F);
        this.rLeg02c.addBox(-7.0F, -1.0F, -1.0F, 7, 2, 2, 0.0F);
        this.setRotateAngle(this.rLeg02c, 0.0F, 0.0F, -0.7740535232594852F);
        this.rLeg02b = new ModelRenderer(this, 42, 26);
        this.rLeg02b.mirror = true;
        this.rLeg02b.setRotationPoint(-0.3F, -5.6F, 0.0F);
        this.rLeg02b.addBox(-8.5F, -1.0F, -1.0F, 9, 2, 2, 0.0F);
        this.setRotateAngle(this.rLeg02b, -0.045553093477052F, -0.045553093477052F, 0.4553564018453205F);
        this.lLeg01b = new ModelRenderer(this, 42, 26);
        this.lLeg01b.setRotationPoint(0.3F, -5.6F, 0.0F);
        this.lLeg01b.addBox(-0.5F, -1.0F, -1.0F, 9, 2, 2, 0.0F);
        this.setRotateAngle(this.lLeg01b, -0.045553093477052F, 0.40980330836826856F, -0.4553564018453205F);
        this.lLeg02b = new ModelRenderer(this, 42, 26);
        this.lLeg02b.setRotationPoint(0.3F, -5.6F, 0.0F);
        this.lLeg02b.addBox(-0.5F, -1.0F, -1.0F, 9, 2, 2, 0.0F);
        this.setRotateAngle(this.lLeg02b, -0.045553093477052F, 0.045553093477052F, -0.4553564018453205F);
        this.lPedipalp02 = new ModelRenderer(this, 29, 12);
        this.lPedipalp02.setRotationPoint(0.0F, -0.4F, -4.2F);
        this.lPedipalp02.addBox(-0.99F, -1.0F, -5.0F, 2, 2, 5, 0.0F);
        this.setRotateAngle(this.lPedipalp02, 1.0016444577195458F, 0.0F, 0.0F);
        this.lLeg03c = new ModelRenderer(this, 43, 32);
        this.lLeg03c.setRotationPoint(7.8F, -0.2F, 0.0F);
        this.lLeg03c.addBox(0.0F, -1.0F, -1.0F, 7, 2, 2, 0.0F);
        this.setRotateAngle(this.lLeg03c, 0.0F, 0.0F, 0.5918411493512771F);
        this.lLeg01c = new ModelRenderer(this, 43, 32);
        this.lLeg01c.setRotationPoint(7.7F, -0.2F, 0.0F);
        this.lLeg01c.addBox(0.0F, -1.0F, -1.0F, 7, 2, 2, 0.0F);
        this.setRotateAngle(this.lLeg01c, 0.0F, 0.0F, 0.7740535232594852F);
        this.rFang01 = new ModelRenderer(this, 49, 19);
        this.rFang01.mirror = true;
        this.rFang01.setRotationPoint(0.0F, 2.1F, -1.2F);
        this.rFang01.addBox(-0.5F, -0.5F, -0.3F, 1, 1, 3, 0.0F);
        this.setRotateAngle(this.rFang01, -0.27314402793711257F, 0.0F, 0.0F);
        this.rFang02 = new ModelRenderer(this, 58, 20);
        this.rFang02.mirror = true;
        this.rFang02.setRotationPoint(0.0F, -0.1F, 2.4F);
        this.rFang02.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(this.rFang02, 0.31869712141416456F, 0.31869712141416456F, -0.7740535232594852F);
        this.rLeg02FurB = new ModelRenderer(this, 16, 42);
        this.rLeg02FurB.mirror = true;
        this.rLeg02FurB.setRotationPoint(-1.0F, -0.3F, 0.2F);
        this.rLeg02FurB.addBox(-4.0F, -0.7F, -1.5F, 4, 2, 3, 0.0F);
        this.setRotateAngle(this.rLeg02FurB, 0.0F, 0.0F, 0.4553564018453205F);
        this.head = new ModelRenderer(this, 36, 0);
        this.head.setRotationPoint(0.0F, -0.1F, -7.2F);
        this.head.addBox(-3.5F, -3.0F, -3.0F, 7, 5, 6, 0.0F);
        this.rLeg04c = new ModelRenderer(this, 43, 32);
        this.rLeg04c.mirror = true;
        this.rLeg04c.setRotationPoint(-7.7F, -0.2F, 0.0F);
        this.rLeg04c.addBox(-7.0F, -1.0F, -1.0F, 7, 2, 2, 0.0F);
        this.setRotateAngle(this.rLeg04c, 0.0F, 0.091106186954104F, -0.7740535232594852F);
        this.rLeg01c = new ModelRenderer(this, 43, 32);
        this.rLeg01c.mirror = true;
        this.rLeg01c.setRotationPoint(-7.7F, -0.2F, 0.0F);
        this.rLeg01c.addBox(-7.0F, -1.0F, -1.0F, 7, 2, 2, 0.0F);
        this.setRotateAngle(this.rLeg01c, 0.0F, 0.0F, -0.7740535232594852F);
        this.lMandible = new ModelRenderer(this, 50, 12);
        this.lMandible.setRotationPoint(1.8F, 1.8F, -2.6F);
        this.lMandible.addBox(-1.5F, -1.5F, -1.9F, 3, 4, 2, 0.0F);
        this.setRotateAngle(this.lMandible, 0.27314402793711257F, 0.0F, 0.0F);
        this.rLeg04a = new ModelRenderer(this, 41, 42);
        this.rLeg04a.mirror = true;
        this.rLeg04a.setRotationPoint(-2.5F, 1.0F, -1.5F);
        this.rLeg04a.addBox(-1.0F, -6.0F, -1.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(this.rLeg04a, -0.40980330836826856F, 0.0F, -0.7285004297824331F);
        this.lLeg04d = new ModelRenderer(this, 49, 38);
        this.lLeg04d.setRotationPoint(6.7F, 0.0F, 0.0F);
        this.lLeg04d.addBox(-0.3F, -0.5F, -0.5F, 5, 1, 1, 0.0F);
        this.setRotateAngle(this.lLeg04d, 0.0F, 0.0F, 0.36425021489121656F);
        this.lLeg04FurB = new ModelRenderer(this, 0, 42);
        this.lLeg04FurB.setRotationPoint(1.0F, -0.3F, 0.2F);
        this.lLeg04FurB.addBox(0.0F, -0.7F, -1.5F, 4, 2, 3, 0.0F);
        this.setRotateAngle(this.lLeg04FurB, 0.0F, 0.0F, -0.4553564018453205F);
        this.lFang01 = new ModelRenderer(this, 49, 19);
        this.lFang01.setRotationPoint(0.0F, 2.1F, -1.2F);
        this.lFang01.addBox(-0.5F, -0.5F, -0.3F, 1, 1, 3, 0.0F);
        this.setRotateAngle(this.lFang01, -0.27314402793711257F, 0.0F, 0.0F);
        this.rLeg04b = new ModelRenderer(this, 42, 26);
        this.rLeg04b.mirror = true;
        this.rLeg04b.setRotationPoint(-0.3F, -5.6F, 0.0F);
        this.rLeg04b.addBox(-8.5F, -1.0F, -1.0F, 9, 2, 2, 0.0F);
        this.setRotateAngle(this.rLeg04b, 0.136659280431156F, 0.36425021489121656F, 0.5462880558742251F);
        this.rLeg01d = new ModelRenderer(this, 49, 38);
        this.rLeg01d.mirror = true;
        this.rLeg01d.setRotationPoint(-6.7F, 0.0F, 0.0F);
        this.rLeg01d.addBox(-4.7F, -0.5F, -0.5F, 5, 1, 1, 0.0F);
        this.setRotateAngle(this.rLeg01d, 0.0F, -0.136659280431156F, -0.36425021489121656F);
        this.lLeg02a = new ModelRenderer(this, 41, 42);
        this.lLeg02a.setRotationPoint(3.0F, 1.0F, -4.6F);
        this.lLeg02a.addBox(-1.0F, -6.0F, -1.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(this.lLeg02a, 0.22759093446006054F, 0.0F, 0.7285004297824331F);
        this.lLeg01FurB = new ModelRenderer(this, 0, 42);
        this.lLeg01FurB.setRotationPoint(1.0F, -0.3F, 0.2F);
        this.lLeg01FurB.addBox(0.0F, -0.7F, -1.5F, 4, 2, 3, 0.0F);
        this.setRotateAngle(this.lLeg01FurB, 0.0F, 0.0F, -0.4553564018453205F);
        this.lLeg04b = new ModelRenderer(this, 42, 26);
        this.lLeg04b.setRotationPoint(0.3F, -5.6F, 0.0F);
        this.lLeg04b.addBox(-0.5F, -1.0F, -1.0F, 9, 2, 2, 0.0F);
        this.setRotateAngle(this.lLeg04b, 0.136659280431156F, -0.36425021489121656F, -0.5462880558742251F);
        this.rLeg04FurB = new ModelRenderer(this, 0, 42);
        this.rLeg04FurB.mirror = true;
        this.rLeg04FurB.setRotationPoint(-1.0F, -0.3F, 0.2F);
        this.rLeg04FurB.addBox(-4.0F, -0.7F, -1.5F, 4, 2, 3, 0.0F);
        this.setRotateAngle(this.rLeg04FurB, 0.0F, 0.0F, 0.4553564018453205F);
        this.lLeg04a = new ModelRenderer(this, 41, 42);
        this.lLeg04a.setRotationPoint(2.5F, 1.0F, -1.5F);
        this.lLeg04a.addBox(-1.0F, -6.0F, -1.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(this.lLeg04a, -0.40980330836826856F, 0.0F, 0.7285004297824331F);
        this.rLeg03c = new ModelRenderer(this, 43, 32);
        this.rLeg03c.mirror = true;
        this.rLeg03c.setRotationPoint(-7.8F, -0.2F, 0.0F);
        this.rLeg03c.addBox(-7.0F, -1.0F, -1.0F, 7, 2, 2, 0.0F);
        this.setRotateAngle(this.rLeg03c, 0.0F, 0.0F, -0.5918411493512771F);
        this.lLeg02c = new ModelRenderer(this, 43, 32);
        this.lLeg02c.setRotationPoint(7.7F, -0.3F, 0.0F);
        this.lLeg02c.addBox(0.0F, -1.0F, -1.0F, 7, 2, 2, 0.0F);
        this.setRotateAngle(this.lLeg02c, 0.0F, 0.0F, 0.7740535232594852F);
        this.rPedipalp02 = new ModelRenderer(this, 29, 12);
        this.rPedipalp02.mirror = true;
        this.rPedipalp02.setRotationPoint(0.0F, -0.4F, -4.2F);
        this.rPedipalp02.addBox(-1.01F, -1.0F, -5.0F, 2, 2, 5, 0.0F);
        this.setRotateAngle(this.rPedipalp02, 1.0016444577195458F, 0.0F, 0.0F);
        this.abdomen = new ModelRenderer(this, 0, 19);
        this.abdomen.setRotationPoint(0.0F, -0.3F, 0.6F);
        this.abdomen.addBox(-4.5F, -3.0F, 0.0F, 9, 6, 10, 0.0F);
        this.setRotateAngle(this.abdomen, -0.18203784098300857F, 0.0F, 0.0F);
        this.thorax = new ModelRenderer(this, 0, 0);
        this.thorax.setRotationPoint(0.0F, 0.4F, 0.0F);
        this.thorax.addBox(-4.0F, -2.0F, -8.0F, 8, 4, 8, 0.0F);
        this.lLeg03b = new ModelRenderer(this, 42, 26);
        this.lLeg03b.setRotationPoint(0.3F, -5.6F, 0.0F);
        this.lLeg03b.addBox(-0.5F, -1.0F, -1.0F, 9, 2, 2, 0.0F);
        this.setRotateAngle(this.lLeg03b, 0.136659280431156F, -0.136659280431156F, -0.36425021489121656F);
        this.rLeg04FurA = new ModelRenderer(this, 0, 36);
        this.rLeg04FurA.mirror = true;
        this.rLeg04FurA.setRotationPoint(-2.6F, -0.2F, 0.2F);
        this.rLeg04FurA.addBox(-4.0F, -0.7F, -1.5F, 4, 2, 3, 0.0F);
        this.setRotateAngle(this.rLeg04FurA, 0.22759093446006054F, 0.0F, 0.36425021489121656F);
        this.rMandible = new ModelRenderer(this, 50, 12);
        this.rMandible.mirror = true;
        this.rMandible.setRotationPoint(-1.8F, 1.8F, -2.6F);
        this.rMandible.addBox(-1.5F, -1.5F, -1.9F, 3, 4, 2, 0.0F);
        this.setRotateAngle(this.rMandible, 0.27314402793711257F, 0.0F, 0.0F);
        this.lPedipalp01 = new ModelRenderer(this, 29, 12);
        this.lPedipalp01.setRotationPoint(3.8F, 1.3F, -7.6F);
        this.lPedipalp01.addBox(-1.0F, -1.0F, -5.0F, 2, 2, 5, 0.0F);
        this.setRotateAngle(this.lPedipalp01, -0.136659280431156F, -0.31869712141416456F, 0.0F);
        this.lFang02 = new ModelRenderer(this, 58, 20);
        this.lFang02.setRotationPoint(0.0F, -0.1F, 2.4F);
        this.lFang02.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(this.lFang02, 0.31869712141416456F, -0.31869712141416456F, 0.7740535232594852F);
        this.rLeg01b = new ModelRenderer(this, 42, 26);
        this.rLeg01b.mirror = true;
        this.rLeg01b.setRotationPoint(-0.3F, -5.6F, 0.0F);
        this.rLeg01b.addBox(-8.5F, -1.0F, -1.0F, 9, 2, 2, 0.0F);
        this.setRotateAngle(this.rLeg01b, -0.045553093477052F, -0.40980330836826856F, 0.6373942428283291F);
        this.abdomen.addChild(this.abdomenHair01);
        this.lLeg01c.addChild(this.lLeg01d);
        this.rLeg02c.addChild(this.rLeg02d);
        this.abdomen.addChild(this.abdomenHair02);
        this.rLeg03c.addChild(this.rLeg03FurB);
        this.lLeg02b.addChild(this.lLeg02FurA);
        this.rLeg01b.addChild(this.rLeg01FurA);
        this.thorax.addChild(this.rLeg03a);
        this.rLeg02b.addChild(this.rLeg02FurA);
        this.rLeg03b.addChild(this.rLeg03FurA);
        this.rLeg01c.addChild(this.rLeg01FurB);
        this.lLeg01b.addChild(this.lLeg01FurA);
        this.thorax.addChild(this.lLeg01a);
        this.lLeg03c.addChild(this.lLeg03FurB);
        this.thorax.addChild(this.rPedipalp01);
        this.lLeg03b.addChild(this.lLeg03FurA);
        this.thorax.addChild(this.rLeg02a);
        this.lLeg04b.addChild(this.lLeg04FurA);
        this.lLeg03c.addChild(this.lLeg03d);
        this.rLeg03c.addChild(this.rLeg03d);
        this.rLeg03a.addChild(this.rLeg03b);
        this.thorax.addChild(this.rLeg01a);
        this.thorax.addChild(this.lLeg03a);
        this.lLeg02c.addChild(this.lLeg02d);
        this.lLeg02c.addChild(this.lLeg02FurB);
        this.rLeg04c.addChild(this.rLeg04d);
        this.lLeg04b.addChild(this.lLeg04c);
        this.rLeg02b.addChild(this.rLeg02c);
        this.rLeg02a.addChild(this.rLeg02b);
        this.lLeg01a.addChild(this.lLeg01b);
        this.lLeg02a.addChild(this.lLeg02b);
        this.lPedipalp01.addChild(this.lPedipalp02);
        this.lLeg03b.addChild(this.lLeg03c);
        this.lLeg01b.addChild(this.lLeg01c);
        this.rMandible.addChild(this.rFang01);
        this.rFang01.addChild(this.rFang02);
        this.rLeg02c.addChild(this.rLeg02FurB);
        this.thorax.addChild(this.head);
        this.rLeg04b.addChild(this.rLeg04c);
        this.rLeg01b.addChild(this.rLeg01c);
        this.head.addChild(this.lMandible);
        this.thorax.addChild(this.rLeg04a);
        this.lLeg04c.addChild(this.lLeg04d);
        this.lLeg04c.addChild(this.lLeg04FurB);
        this.lMandible.addChild(this.lFang01);
        this.rLeg04a.addChild(this.rLeg04b);
        this.rLeg01c.addChild(this.rLeg01d);
        this.thorax.addChild(this.lLeg02a);
        this.lLeg01c.addChild(this.lLeg01FurB);
        this.lLeg04a.addChild(this.lLeg04b);
        this.rLeg04c.addChild(this.rLeg04FurB);
        this.thorax.addChild(this.lLeg04a);
        this.rLeg03b.addChild(this.rLeg03c);
        this.lLeg02b.addChild(this.lLeg02c);
        this.rPedipalp01.addChild(this.rPedipalp02);
        this.bodyBase.addChild(this.abdomen);
        this.bodyBase.addChild(this.thorax);
        this.lLeg03a.addChild(this.lLeg03b);
        this.rLeg04b.addChild(this.rLeg04FurA);
        this.head.addChild(this.rMandible);
        this.thorax.addChild(this.lPedipalp01);
        this.lFang01.addChild(this.lFang02);
        this.rLeg01a.addChild(this.rLeg01b);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.bodyBase.render(f5);
    }

    /**
     * Sets the model's various rotation angles. For bipeds, par1 and par2 are used
     * for animating the movement of arms
     * and legs, where par1 represents the time(so that arms and legs swing back and
     * forth) and par2 represents how
     * "far" arms and legs can swing at most.
     */
    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entity) {
        if (entity instanceof EntityLivingBase) {
            EntityLivingBase living = (EntityLivingBase) entity;
            float newLimbSwing = limbSwing + ModelBetterAnimals.getSwingProgressPrev(living);

            this.head.rotateAngleY = ModelBetterAnimals.getHeadYaw(living) * 0.017453292F;
            this.head.rotateAngleX = (float) Math.toRadians(ModelBetterAnimals.getHeadPitch(living)) * 0.017453292F;

            this.rLeg01a.rotateAngleZ = -((float) Math.PI / 4F);
            this.lLeg01a.rotateAngleZ = ((float) Math.PI / 4F);

            this.rLeg02a.rotateAngleZ = -0.78119464F;
            this.lLeg02a.rotateAngleZ = 0.78119464F;

            this.rLeg03a.rotateAngleZ = -0.78119464F;
            this.lLeg03a.rotateAngleZ = 0.78119464F;

            this.rLeg04a.rotateAngleZ = -((float) Math.PI / 4F) - 0.3F;
            this.rLeg04a.rotateAngleX = -((float) Math.PI / 4F) + 0.3F;

            this.lLeg04a.rotateAngleZ = ((float) Math.PI / 4F) + 0.3F;
            this.lLeg04a.rotateAngleX = ((float) Math.PI / 4F) - 1.3F;

            this.rLeg01a.rotateAngleY = ((float) Math.PI / 16F);
            this.lLeg01a.rotateAngleY = -((float) Math.PI / 16F);

            this.rLeg02a.rotateAngleY = 0.1926991F;
            this.lLeg02a.rotateAngleY = -0.1926991F;

            this.rLeg03a.rotateAngleY = 0.1926991F;
            this.lLeg03a.rotateAngleY = -0.1926991F;

            this.rLeg04a.rotateAngleY = -((float) Math.PI / 12F) + 0.4F;
            this.lLeg04a.rotateAngleY = ((float) Math.PI / 12F) - 0.4F;

            float f3 = -(MathHelper.cos(newLimbSwing * 0.6662F * 2.0F + 0.0F) * 0.4F) * limbSwingAmount;
            float f4 = -(MathHelper.cos(newLimbSwing * 0.6662F * 2.0F + (float) Math.PI) * 0.4F) * limbSwingAmount;
            float f5 = -(MathHelper.cos(newLimbSwing * 0.6662F * 2.0F + ((float) Math.PI / 2F)) * 0.4F) * limbSwingAmount;
            float f6 = -(MathHelper.cos(newLimbSwing * 0.6662F * 2.0F + ((float) Math.PI * 3F / 2F)) * 0.4F) * limbSwingAmount;
            float f7 = Math.abs(MathHelper.sin(newLimbSwing * 0.6662F + 0.0F) * 0.4F) * limbSwingAmount;
            float f8 = Math.abs(MathHelper.sin(newLimbSwing * 0.6662F + (float) Math.PI) * 0.4F) * limbSwingAmount;
            float f9 = Math.abs(MathHelper.sin(newLimbSwing * 0.6662F + ((float) Math.PI / 2F)) * 0.4F) * limbSwingAmount;
            float f10 = Math.abs(MathHelper.sin(newLimbSwing * 0.6662F + ((float) Math.PI * 3F / 2F)) * 0.4F) * limbSwingAmount;

            this.rLeg01a.rotateAngleY += f3;
            this.lLeg01a.rotateAngleY += -f3;
            this.rLeg02a.rotateAngleY += f4;
            this.lLeg02a.rotateAngleY += -f4;
            this.rLeg03a.rotateAngleY += f5;
            this.lLeg03a.rotateAngleY += -f5;
            this.rLeg04a.rotateAngleY += f6;
            this.lLeg04a.rotateAngleY += -f6;
            this.rLeg01a.rotateAngleZ += f7;
            this.lLeg01a.rotateAngleZ += -f7;
            this.rLeg02a.rotateAngleZ += f8;
            this.lLeg02a.rotateAngleZ += -f8;
            this.rLeg03a.rotateAngleZ += f9;
            this.lLeg03a.rotateAngleZ += -f9;
            this.rLeg04a.rotateAngleZ += f10;
            this.lLeg04a.rotateAngleZ += -f10;
            this.rLeg04a.rotateAngleZ += f10;
            this.lLeg04a.rotateAngleZ += -f10;
        }
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    @Override
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
