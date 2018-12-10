package its_meow.betteranimalsplus.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * headDeer - cybercat5555
 * Created using Tabula 5.1.0
 */
public class ModelDeerHead extends ModelBase {
    public ModelRenderer chest;
    public ModelRenderer neck;
    public ModelRenderer mane03;
    public ModelRenderer mane04;
    public ModelRenderer head;
    public ModelRenderer mane01;
    public ModelRenderer mane02;
    public ModelRenderer mane05;
    public ModelRenderer mane03_1;
    public ModelRenderer muzzle;
    public ModelRenderer lowerJaw;
    public ModelRenderer lEar;
    public ModelRenderer rEar;
    public ModelRenderer lAntler01;
    public ModelRenderer rAntler01;
    public ModelRenderer lAntler02;
    public ModelRenderer lAntler03;
    public ModelRenderer lAntlerExtra01;
    public ModelRenderer lAntler04;
    public ModelRenderer lAntler05;
    public ModelRenderer lAntler06;
    public ModelRenderer lAntler07;
    public ModelRenderer lAntler08;
    public ModelRenderer lAntlerExtra02;
    public ModelRenderer lAntlerExtra09;
    public ModelRenderer lAntlerExtra03;
    public ModelRenderer lAntlerExtra04;
    public ModelRenderer lAntlerExtra08;
    public ModelRenderer lAntlerExtra05;
    public ModelRenderer lAntlerExtra04_1;
    public ModelRenderer lAntlerExtra07;
    public ModelRenderer rAntler02;
    public ModelRenderer rAntler03;
    public ModelRenderer rAntlerExtra01;
    public ModelRenderer rAntler04;
    public ModelRenderer rAntler05;
    public ModelRenderer rAntler06;
    public ModelRenderer rAntler07;
    public ModelRenderer rAntler08;
    public ModelRenderer rAntlerExtra02;
    public ModelRenderer rAntlerExtra09;
    public ModelRenderer rAntlerExtra03;
    public ModelRenderer rAntlerExtra04;
    public ModelRenderer rAntlerExtra08;
    public ModelRenderer lAntlerExtra05_1;
    public ModelRenderer rAntlerExtra04_1;
    public ModelRenderer rAntlerExtra07;

    public ModelDeerHead() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.rAntlerExtra03 = new ModelRenderer(this, 94, 40);
        this.rAntlerExtra03.mirror = true;
        this.rAntlerExtra03.setRotationPoint(0.0F, -1.8F, 0.0F);
        this.rAntlerExtra03.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(rAntlerExtra03, 0.22759093446006054F, 0.0F, 0.0F);
        this.lAntler01 = new ModelRenderer(this, 104, 40);
        this.lAntler01.setRotationPoint(1.7F, 0.4F, -3.7F);
        this.lAntler01.addBox(-0.5F, -3.5F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(lAntler01, 0.36425021489121656F, 0.0F, 0.18203784098300857F);
        this.rAntler02 = new ModelRenderer(this, 104, 40);
        this.rAntler02.mirror = true;
        this.rAntler02.setRotationPoint(0.0F, -3.7F, -0.1F);
        this.rAntler02.addBox(-0.5F, -1.5F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(rAntler02, 0.136659280431156F, 0.18203784098300857F, 0.0F);
        this.chest = new ModelRenderer(this, 0, 0);
        this.chest.setRotationPoint(0.0F, 23.9F, 0F);
        this.chest.addBox(-3.5F, -3.0F, -5.0F, 7, 6, 5, 0.0F);
        this.mane05 = new ModelRenderer(this, 0, 58);
        this.mane05.setRotationPoint(0.0F, -1.5F, -3.7F);
        this.mane05.addBox(-2.0F, -1.0F, 0.0F, 4, 1, 5, 0.0F);
        this.setRotateAngle(mane05, 0.8651597102135892F, 0.0F, 0.0F);
        this.lEar = new ModelRenderer(this, 0, 13);
        this.lEar.setRotationPoint(2.3F, -1.0F, -3.0F);
        this.lEar.addBox(-1.0F, -0.7F, -3.1F, 2, 1, 3, 0.0F);
        this.setRotateAngle(lEar, 0.27314402793711257F, -0.8651597102135892F, 0.0F);
        this.head = new ModelRenderer(this, 88, 14);
        this.head.setRotationPoint(0.0F, 1.1F, -5.0F);
        this.head.addBox(-2.5F, -3.0F, -4.0F, 5, 7, 4, 0.0F);
        this.setRotateAngle(head, -0.5235987755982988F, 0.0F, 0.0F);
        this.mane03_1 = new ModelRenderer(this, 20, 58);
        this.mane03_1.setRotationPoint(0.0F, -1.9F, -2.0F);
        this.mane03_1.addBox(-2.5F, -1.0F, 0.0F, 5, 1, 5, 0.0F);
        this.setRotateAngle(mane03_1, 0.8196066167365371F, 0.0F, 0.0F);
        this.lAntler05 = new ModelRenderer(this, 104, 40);
        this.lAntler05.setRotationPoint(0.0F, 1.8F, 0.0F);
        this.lAntler05.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(lAntler05, 0.4553564018453205F, 0.0F, 0.18203784098300857F);
        this.rAntlerExtra04 = new ModelRenderer(this, 94, 40);
        this.rAntlerExtra04.mirror = true;
        this.rAntlerExtra04.setRotationPoint(0.0F, -1.8F, 0.0F);
        this.rAntlerExtra04.addBox(-0.5F, -0.6F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(rAntlerExtra04, 0.045553093477052F, 0.136659280431156F, 0.0F);
        this.neck = new ModelRenderer(this, 88, 0);
        this.neck.setRotationPoint(0.0F, 0.3F, -4.0F);
        this.neck.addBox(-2.5F, -2.5F, -6.0F, 5, 5, 6, 0.0F);
        this.setRotateAngle(neck, -0.6981317007977318F, 0.0F, 0.0F);
        this.rEar = new ModelRenderer(this, 0, 13);
        this.rEar.mirror = true;
        this.rEar.setRotationPoint(-2.3F, -1.0F, -3.0F);
        this.rEar.addBox(-1.0F, -0.7F, -3.1F, 2, 1, 3, 0.0F);
        this.setRotateAngle(rEar, 0.27314402793711257F, 0.8651597102135892F, 0.0F);
        this.lAntler03 = new ModelRenderer(this, 104, 40);
        this.lAntler03.setRotationPoint(-0.1F, -1.1F, 0.1F);
        this.lAntler03.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(lAntler03, -0.7740535232594852F, -0.31869712141416456F, 0.0F);
        this.lAntlerExtra03 = new ModelRenderer(this, 94, 40);
        this.lAntlerExtra03.setRotationPoint(0.0F, -1.8F, 0.0F);
        this.lAntlerExtra03.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(lAntlerExtra03, 0.22759093446006054F, 0.0F, 0.0F);
        this.muzzle = new ModelRenderer(this, 88, 27);
        this.muzzle.setRotationPoint(0.0F, 3.7F, -2.2F);
        this.muzzle.addBox(-2.0F, 0.0F, -1.0F, 4, 3, 2, 0.0F);
        this.setRotateAngle(muzzle, 0.18203784098300857F, 0.0F, 0.0F);
        this.lAntlerExtra01 = new ModelRenderer(this, 94, 40);
        this.lAntlerExtra01.setRotationPoint(-0.1F, -1.4F, 0.0F);
        this.lAntlerExtra01.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(lAntlerExtra01, 0.22759093446006054F, -0.091106186954104F, 0.22759093446006054F);
        this.lowerJaw = new ModelRenderer(this, 102, 28);
        this.lowerJaw.setRotationPoint(0.0F, 3.4F, -0.8F);
        this.lowerJaw.addBox(-2.0F, 0.0F, -0.5F, 4, 3, 1, 0.0F);
        this.rAntler01 = new ModelRenderer(this, 104, 40);
        this.rAntler01.mirror = true;
        this.rAntler01.setRotationPoint(-1.7F, 0.4F, -3.7F);
        this.rAntler01.addBox(-0.5F, -3.5F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(rAntler01, 0.36425021489121656F, 0.0F, -0.18203784098300857F);
        this.lAntlerExtra02 = new ModelRenderer(this, 94, 40);
        this.lAntlerExtra02.setRotationPoint(0.0F, -2.9F, 0.0F);
        this.lAntlerExtra02.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(lAntlerExtra02, 0.18203784098300857F, -0.091106186954104F, 0.0F);
        this.lAntlerExtra04 = new ModelRenderer(this, 94, 40);
        this.lAntlerExtra04.setRotationPoint(0.0F, -1.8F, 0.0F);
        this.lAntlerExtra04.addBox(-0.5F, -0.6F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(lAntlerExtra04, 0.045553093477052F, -0.136659280431156F, 0.0F);
        this.lAntler04 = new ModelRenderer(this, 104, 40);
        this.lAntler04.setRotationPoint(0.0F, -0.3F, -1.6F);
        this.lAntler04.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(lAntler04, -0.5918411493512771F, -0.22759093446006054F, 0.0F);
        this.rAntler06 = new ModelRenderer(this, 104, 40);
        this.rAntler06.mirror = true;
        this.rAntler06.setRotationPoint(0.0F, 2.8F, 0.0F);
        this.rAntler06.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(rAntler06, 0.36425021489121656F, 0.0F, -0.18203784098300857F);
        this.mane03 = new ModelRenderer(this, 46, 50);
        this.mane03.setRotationPoint(0.0F, 1.8F, -5.2F);
        this.mane03.addBox(-3.0F, 0.0F, 0.0F, 6, 1, 6, 0.0F);
        this.setRotateAngle(mane03, -1.48352986419518F, 0.0F, 0.0F);
        this.lAntlerExtra05_1 = new ModelRenderer(this, 94, 40);
        this.lAntlerExtra05_1.mirror = true;
        this.lAntlerExtra05_1.setRotationPoint(0.0F, 0.0F, -2.8F);
        this.lAntlerExtra05_1.addBox(-0.5F, -0.6F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(lAntlerExtra05_1, 0.091106186954104F, 0.0F, 0.0F);
        this.lAntlerExtra05 = new ModelRenderer(this, 94, 40);
        this.lAntlerExtra05.setRotationPoint(0.0F, 0.0F, -2.8F);
        this.lAntlerExtra05.addBox(-0.5F, -0.6F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(lAntlerExtra05, 0.091106186954104F, 0.0F, 0.0F);
        this.rAntlerExtra02 = new ModelRenderer(this, 94, 40);
        this.rAntlerExtra02.mirror = true;
        this.rAntlerExtra02.setRotationPoint(0.0F, -2.9F, 0.0F);
        this.rAntlerExtra02.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(rAntlerExtra02, 0.18203784098300857F, 0.091106186954104F, 0.0F);
        this.rAntlerExtra09 = new ModelRenderer(this, 94, 40);
        this.rAntlerExtra09.mirror = true;
        this.rAntlerExtra09.setRotationPoint(-0.9F, 4.4F, -1.1F);
        this.rAntlerExtra09.addBox(-0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(rAntlerExtra09, -0.27314402793711257F, 0.0F, 0.0F);
        this.lAntler06 = new ModelRenderer(this, 104, 40);
        this.lAntler06.setRotationPoint(0.0F, 2.8F, 0.0F);
        this.lAntler06.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(lAntler06, 0.36425021489121656F, 0.0F, 0.18203784098300857F);
        this.lAntler02 = new ModelRenderer(this, 104, 40);
        this.lAntler02.setRotationPoint(0.0F, -3.7F, -0.1F);
        this.lAntler02.addBox(-0.5F, -1.5F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(lAntler02, 0.091106186954104F, -0.18203784098300857F, 0.0F);
        this.rAntler08 = new ModelRenderer(this, 114, 41);
        this.rAntler08.mirror = true;
        this.rAntler08.setRotationPoint(0.0F, 3.6F, 0.4F);
        this.rAntler08.addBox(0.2F, -1.8F, -1.3F, 0, 3, 1, 0.0F);
        this.setRotateAngle(rAntler08, 0.27314402793711257F, 0.0F, -0.136659280431156F);
        this.rAntlerExtra08 = new ModelRenderer(this, 94, 40);
        this.rAntlerExtra08.mirror = true;
        this.rAntlerExtra08.setRotationPoint(0.0F, -2.7F, 0.0F);
        this.rAntlerExtra08.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(rAntlerExtra08, 0.27314402793711257F, 0.0F, 0.0F);
        this.mane01 = new ModelRenderer(this, 0, 50);
        this.mane01.setRotationPoint(0.0F, 1.6F, -4.4F);
        this.mane01.addBox(-2.0F, 0.0F, 0.0F, 4, 1, 5, 0.0F);
        this.setRotateAngle(mane01, -0.7853981633974483F, 0.0F, 0.0F);
        this.lAntler07 = new ModelRenderer(this, 114, 35);
        this.lAntler07.setRotationPoint(0.0F, 0.4F, 0.6F);
        this.lAntler07.addBox(0.0F, -2.0F, -2.3F, 0, 4, 2, 0.0F);
        this.setRotateAngle(lAntler07, -0.18203784098300857F, 0.0F, 0.0F);
        this.rAntler05 = new ModelRenderer(this, 104, 40);
        this.rAntler05.mirror = true;
        this.rAntler05.setRotationPoint(0.0F, 1.8F, 0.0F);
        this.rAntler05.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(rAntler05, 0.4553564018453205F, 0.0F, -0.18203784098300857F);
        this.mane02 = new ModelRenderer(this, 20, 50);
        this.mane02.setRotationPoint(0.0F, 1.4F, -3.4F);
        this.mane02.addBox(-2.5F, 0.0F, 0.0F, 5, 1, 6, 0.0F);
        this.setRotateAngle(mane02, -0.6981317007977318F, 0.0F, 0.0F);
        this.rAntler03 = new ModelRenderer(this, 104, 40);
        this.rAntler03.mirror = true;
        this.rAntler03.setRotationPoint(0.1F, -1.1F, 0.1F);
        this.rAntler03.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(rAntler03, -0.7740535232594852F, 0.31869712141416456F, 0.0F);
        this.lAntlerExtra08 = new ModelRenderer(this, 94, 40);
        this.lAntlerExtra08.setRotationPoint(0.0F, -2.7F, 0.0F);
        this.lAntlerExtra08.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(lAntlerExtra08, 0.27314402793711257F, 0.0F, 0.0F);
        this.rAntler04 = new ModelRenderer(this, 104, 40);
        this.rAntler04.mirror = true;
        this.rAntler04.setRotationPoint(0.0F, -0.3F, -1.6F);
        this.rAntler04.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(rAntler04, -0.5918411493512771F, 0.22759093446006054F, 0.0F);
        this.lAntlerExtra07 = new ModelRenderer(this, 83, 43);
        this.lAntlerExtra07.setRotationPoint(0.0F, 0.0F, -2.8F);
        this.lAntlerExtra07.addBox(0.0F, -0.6F, -2.5F, 0, 1, 3, 0.0F);
        this.setRotateAngle(lAntlerExtra07, 0.091106186954104F, 0.0F, 0.0F);
        this.lAntlerExtra04_1 = new ModelRenderer(this, 83, 37);
        this.lAntlerExtra04_1.setRotationPoint(0.0F, -1.0F, -0.6F);
        this.lAntlerExtra04_1.addBox(0.0F, -1.6F, -3.0F, 0, 2, 3, 0.0F);
        this.setRotateAngle(lAntlerExtra04_1, 0.045553093477052F, 0.0F, 0.0F);
        this.lAntler08 = new ModelRenderer(this, 114, 41);
        this.lAntler08.setRotationPoint(0.0F, 3.6F, 0.4F);
        this.lAntler08.addBox(-0.2F, -1.8F, -1.3F, 0, 3, 1, 0.0F);
        this.setRotateAngle(lAntler08, 0.27314402793711257F, 0.0F, 0.136659280431156F);
        this.rAntlerExtra07 = new ModelRenderer(this, 83, 43);
        this.rAntlerExtra07.mirror = true;
        this.rAntlerExtra07.setRotationPoint(0.0F, 0.0F, -2.8F);
        this.rAntlerExtra07.addBox(0.0F, -0.6F, -2.5F, 0, 1, 3, 0.0F);
        this.setRotateAngle(rAntlerExtra07, 0.091106186954104F, 0.0F, 0.0F);
        this.lAntlerExtra09 = new ModelRenderer(this, 94, 40);
        this.lAntlerExtra09.setRotationPoint(0.9F, 4.4F, -1.1F);
        this.lAntlerExtra09.addBox(-0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(lAntlerExtra09, -0.27314402793711257F, 0.0F, 0.0F);
        this.mane04 = new ModelRenderer(this, 72, 50);
        this.mane04.setRotationPoint(0.0F, 1.8F, -3.0F);
        this.mane04.addBox(-3.0F, -1.0F, 0.0F, 6, 2, 6, 0.0F);
        this.setRotateAngle(mane04, -1.5707963267948966F, 0.0F, 0.0F);
        this.rAntlerExtra04_1 = new ModelRenderer(this, 83, 37);
        this.rAntlerExtra04_1.mirror = true;
        this.rAntlerExtra04_1.setRotationPoint(0.0F, -1.0F, -0.6F);
        this.rAntlerExtra04_1.addBox(0.0F, -1.6F, -3.0F, 0, 2, 3, 0.0F);
        this.setRotateAngle(rAntlerExtra04_1, 0.045553093477052F, 0.0F, 0.0F);
        this.rAntler07 = new ModelRenderer(this, 114, 35);
        this.rAntler07.mirror = true;
        this.rAntler07.setRotationPoint(0.0F, 0.4F, 0.6F);
        this.rAntler07.addBox(0.0F, -2.0F, -2.3F, 0, 4, 2, 0.0F);
        this.setRotateAngle(rAntler07, -0.18203784098300857F, 0.0F, 0.0F);
        this.rAntlerExtra01 = new ModelRenderer(this, 94, 40);
        this.rAntlerExtra01.mirror = true;
        this.rAntlerExtra01.setRotationPoint(0.1F, -1.4F, 0.0F);
        this.rAntlerExtra01.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(rAntlerExtra01, 0.22759093446006054F, 0.091106186954104F, -0.22759093446006054F);
        this.rAntlerExtra02.addChild(this.rAntlerExtra03);
        this.head.addChild(this.lAntler01);
        this.rAntler01.addChild(this.rAntler02);
        this.neck.addChild(this.mane05);
        this.head.addChild(this.lEar);
        this.neck.addChild(this.head);
        this.neck.addChild(this.mane03_1);
        this.lAntler04.addChild(this.lAntler05);
        this.rAntlerExtra02.addChild(this.rAntlerExtra04);
        this.chest.addChild(this.neck);
        this.head.addChild(this.rEar);
        this.lAntler02.addChild(this.lAntler03);
        this.lAntlerExtra02.addChild(this.lAntlerExtra03);
        this.head.addChild(this.muzzle);
        this.lAntler02.addChild(this.lAntlerExtra01);
        this.head.addChild(this.lowerJaw);
        this.head.addChild(this.rAntler01);
        this.lAntlerExtra01.addChild(this.lAntlerExtra02);
        this.lAntlerExtra02.addChild(this.lAntlerExtra04);
        this.lAntler03.addChild(this.lAntler04);
        this.rAntler05.addChild(this.rAntler06);
        this.chest.addChild(this.mane03);
        this.rAntlerExtra04.addChild(this.lAntlerExtra05_1);
        this.lAntlerExtra04.addChild(this.lAntlerExtra05);
        this.rAntlerExtra01.addChild(this.rAntlerExtra02);
        this.rAntlerExtra01.addChild(this.rAntlerExtra09);
        this.lAntler05.addChild(this.lAntler06);
        this.lAntler01.addChild(this.lAntler02);
        this.rAntler05.addChild(this.rAntler08);
        this.rAntlerExtra03.addChild(this.rAntlerExtra08);
        this.neck.addChild(this.mane01);
        this.lAntler05.addChild(this.lAntler07);
        this.rAntler04.addChild(this.rAntler05);
        this.neck.addChild(this.mane02);
        this.rAntler02.addChild(this.rAntler03);
        this.lAntlerExtra03.addChild(this.lAntlerExtra08);
        this.rAntler03.addChild(this.rAntler04);
        this.lAntlerExtra04_1.addChild(this.lAntlerExtra07);
        this.lAntlerExtra04.addChild(this.lAntlerExtra04_1);
        this.lAntler05.addChild(this.lAntler08);
        this.rAntlerExtra04_1.addChild(this.rAntlerExtra07);
        this.lAntlerExtra01.addChild(this.lAntlerExtra09);
        this.chest.addChild(this.mane04);
        this.rAntlerExtra04.addChild(this.rAntlerExtra04_1);
        this.rAntler05.addChild(this.rAntler07);
        this.rAntler02.addChild(this.rAntlerExtra01);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.chest.render(f5);
        this.chest.rotateAngleY = (float) Math.toRadians(f);
        this.chest.rotateAngleX = (float) Math.toRadians(f1);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}