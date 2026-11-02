package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.VirtualLayout;
import androidx.constraintlayout.widget.b;
import defpackage.a66;
import defpackage.av2;
import defpackage.d30;
import defpackage.e30;
import defpackage.m31;
import defpackage.n31;
import defpackage.u21;
import defpackage.we2;
import defpackage.ye2;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class Flow extends VirtualLayout {
    public ye2 o0;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public final void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        ye2 ye2Var = new ye2();
        ye2Var.s0 = 0;
        ye2Var.t0 = 0;
        ye2Var.u0 = 0;
        ye2Var.v0 = 0;
        ye2Var.w0 = 0;
        ye2Var.x0 = 0;
        ye2Var.y0 = false;
        ye2Var.z0 = 0;
        ye2Var.A0 = 0;
        ye2Var.B0 = new d30();
        ye2Var.C0 = null;
        ye2Var.D0 = -1;
        ye2Var.E0 = -1;
        ye2Var.F0 = -1;
        ye2Var.G0 = -1;
        ye2Var.H0 = -1;
        ye2Var.I0 = -1;
        ye2Var.J0 = 0.5f;
        ye2Var.K0 = 0.5f;
        ye2Var.L0 = 0.5f;
        ye2Var.M0 = 0.5f;
        ye2Var.N0 = 0.5f;
        ye2Var.O0 = 0.5f;
        ye2Var.P0 = 0;
        ye2Var.Q0 = 0;
        ye2Var.R0 = 2;
        ye2Var.S0 = 2;
        ye2Var.T0 = 0;
        ye2Var.U0 = -1;
        ye2Var.V0 = 0;
        ye2Var.W0 = new ArrayList();
        ye2Var.X0 = null;
        ye2Var.Y0 = null;
        ye2Var.Z0 = null;
        ye2Var.b1 = 0;
        this.o0 = ye2Var;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, a66.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == a66.ConstraintLayout_Layout_android_orientation) {
                    this.o0.V0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == a66.ConstraintLayout_Layout_android_padding) {
                    ye2 ye2Var2 = this.o0;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    ye2Var2.s0 = dimensionPixelSize;
                    ye2Var2.t0 = dimensionPixelSize;
                    ye2Var2.u0 = dimensionPixelSize;
                    ye2Var2.v0 = dimensionPixelSize;
                } else if (index == a66.ConstraintLayout_Layout_android_paddingStart) {
                    ye2 ye2Var3 = this.o0;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    ye2Var3.u0 = dimensionPixelSize2;
                    ye2Var3.w0 = dimensionPixelSize2;
                    ye2Var3.x0 = dimensionPixelSize2;
                } else if (index == a66.ConstraintLayout_Layout_android_paddingEnd) {
                    this.o0.v0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == a66.ConstraintLayout_Layout_android_paddingLeft) {
                    this.o0.w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == a66.ConstraintLayout_Layout_android_paddingTop) {
                    this.o0.s0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == a66.ConstraintLayout_Layout_android_paddingRight) {
                    this.o0.x0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == a66.ConstraintLayout_Layout_android_paddingBottom) {
                    this.o0.t0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == a66.ConstraintLayout_Layout_flow_wrapMode) {
                    this.o0.T0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == a66.ConstraintLayout_Layout_flow_horizontalStyle) {
                    this.o0.D0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == a66.ConstraintLayout_Layout_flow_verticalStyle) {
                    this.o0.E0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == a66.ConstraintLayout_Layout_flow_firstHorizontalStyle) {
                    this.o0.F0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == a66.ConstraintLayout_Layout_flow_lastHorizontalStyle) {
                    this.o0.H0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == a66.ConstraintLayout_Layout_flow_firstVerticalStyle) {
                    this.o0.G0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == a66.ConstraintLayout_Layout_flow_lastVerticalStyle) {
                    this.o0.I0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == a66.ConstraintLayout_Layout_flow_horizontalBias) {
                    this.o0.J0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == a66.ConstraintLayout_Layout_flow_firstHorizontalBias) {
                    this.o0.L0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == a66.ConstraintLayout_Layout_flow_lastHorizontalBias) {
                    this.o0.N0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == a66.ConstraintLayout_Layout_flow_firstVerticalBias) {
                    this.o0.M0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == a66.ConstraintLayout_Layout_flow_lastVerticalBias) {
                    this.o0.O0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == a66.ConstraintLayout_Layout_flow_verticalBias) {
                    this.o0.K0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == a66.ConstraintLayout_Layout_flow_horizontalAlign) {
                    this.o0.R0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == a66.ConstraintLayout_Layout_flow_verticalAlign) {
                    this.o0.S0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == a66.ConstraintLayout_Layout_flow_horizontalGap) {
                    this.o0.P0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == a66.ConstraintLayout_Layout_flow_verticalGap) {
                    this.o0.Q0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == a66.ConstraintLayout_Layout_flow_maxElementsWrap) {
                    this.o0.U0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.i0 = this.o0;
        i();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void h(m31 m31Var, boolean z) {
        ye2 ye2Var = this.o0;
        int i = ye2Var.u0;
        if (i > 0 || ye2Var.v0 > 0) {
            if (z) {
                ye2Var.w0 = ye2Var.v0;
                ye2Var.x0 = i;
            } else {
                ye2Var.w0 = i;
                ye2Var.x0 = ye2Var.v0;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:109:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:111:0x0206  */
    /* JADX WARN: Code duplicated, block: B:114:0x021b  */
    /* JADX WARN: Code duplicated, block: B:116:0x0223  */
    /* JADX WARN: Code duplicated, block: B:118:0x0234  */
    /* JADX WARN: Code duplicated, block: B:134:0x0257  */
    /* JADX WARN: Code duplicated, block: B:136:0x0270  */
    /* JADX WARN: Code duplicated, block: B:138:0x0274  */
    /* JADX WARN: Code duplicated, block: B:147:0x029d  */
    /* JADX WARN: Code duplicated, block: B:152:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:154:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:155:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:159:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:161:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:163:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:164:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:167:0x0318  */
    /* JADX WARN: Code duplicated, block: B:169:0x0321  */
    /* JADX WARN: Code duplicated, block: B:171:0x0325  */
    /* JADX WARN: Code duplicated, block: B:172:0x0336  */
    /* JADX WARN: Code duplicated, block: B:175:0x0358  */
    /* JADX WARN: Code duplicated, block: B:180:0x036f  */
    /* JADX WARN: Code duplicated, block: B:182:0x0385 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:183:0x0387  */
    /* JADX WARN: Code duplicated, block: B:185:0x038c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:186:0x038e  */
    /* JADX WARN: Code duplicated, block: B:190:0x0396  */
    /* JADX WARN: Code duplicated, block: B:193:0x039e  */
    /* JADX WARN: Code duplicated, block: B:196:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:197:0x03a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:198:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:200:0x03af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:201:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:205:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:208:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:214:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:223:0x03e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:224:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:225:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:230:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:239:0x0414  */
    /* JADX WARN: Code duplicated, block: B:242:0x041b  */
    /* JADX WARN: Code duplicated, block: B:244:0x041e  */
    /* JADX WARN: Code duplicated, block: B:246:0x0424  */
    /* JADX WARN: Code duplicated, block: B:257:0x0440  */
    /* JADX WARN: Code duplicated, block: B:262:0x0454  */
    /* JADX WARN: Code duplicated, block: B:267:0x0462  */
    /* JADX WARN: Code duplicated, block: B:269:0x0468 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:270:0x046a  */
    /* JADX WARN: Code duplicated, block: B:275:0x047a  */
    /* JADX WARN: Code duplicated, block: B:277:0x0480 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:278:0x0482  */
    /* JADX WARN: Code duplicated, block: B:291:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:294:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:296:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:298:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:300:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:317:0x051c  */
    /* JADX WARN: Code duplicated, block: B:319:0x0531 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:320:0x0533  */
    /* JADX WARN: Code duplicated, block: B:322:0x0541  */
    /* JADX WARN: Code duplicated, block: B:324:0x0546  */
    /* JADX WARN: Code duplicated, block: B:326:0x0554  */
    /* JADX WARN: Code duplicated, block: B:343:0x0577  */
    /* JADX WARN: Code duplicated, block: B:345:0x058e  */
    /* JADX WARN: Code duplicated, block: B:347:0x0592  */
    /* JADX WARN: Code duplicated, block: B:355:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:360:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:362:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:363:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:367:0x05f6  */
    /* JADX WARN: Code duplicated, block: B:369:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:371:0x0602  */
    /* JADX WARN: Code duplicated, block: B:372:0x0613  */
    /* JADX WARN: Code duplicated, block: B:375:0x0635  */
    /* JADX WARN: Code duplicated, block: B:377:0x063e  */
    /* JADX WARN: Code duplicated, block: B:379:0x0642  */
    /* JADX WARN: Code duplicated, block: B:380:0x0653  */
    /* JADX WARN: Code duplicated, block: B:383:0x0675  */
    /* JADX WARN: Code duplicated, block: B:387:0x068b  */
    /* JADX WARN: Code duplicated, block: B:390:0x06a1  */
    /* JADX WARN: Code duplicated, block: B:392:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:393:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:396:0x06fc A[LOOP:18: B:395:0x06fa->B:396:0x06fc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:401:0x0726 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:402:0x0728  */
    /* JADX WARN: Code duplicated, block: B:403:0x072d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:404:0x072f  */
    /* JADX WARN: Code duplicated, block: B:405:0x0731  */
    /* JADX WARN: Code duplicated, block: B:407:0x0734  */
    /* JADX WARN: Code duplicated, block: B:408:0x0737 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:409:0x0739  */
    /* JADX WARN: Code duplicated, block: B:410:0x0740 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:411:0x0742  */
    /* JADX WARN: Code duplicated, block: B:412:0x0744  */
    /* JADX WARN: Code duplicated, block: B:415:0x0753  */
    /* JADX WARN: Code duplicated, block: B:416:0x0755  */
    /* JADX WARN: Code duplicated, block: B:426:0x010c A[EDGE_INSN: B:426:0x010c->B:61:0x010c BREAK  A[LOOP:1: B:55:0x00f5->B:60:0x0107], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:428:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:431:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:445:0x03a4 A[EDGE_INSN: B:445:0x03a4->B:195:0x03a4 BREAK  A[LOOP:7: B:184:0x038a->B:194:0x03a1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:447:0x03a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:448:0x04a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00db  */
    /* JADX WARN: Code duplicated, block: B:454:0x0497 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:470:0x0473 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:473:0x048b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:475:0x03c7 A[EDGE_INSN: B:475:0x03c7->B:210:0x03c7 BREAK  A[LOOP:13: B:199:0x03ad->B:209:0x03c4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:477:0x03c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:59:0x0105  */
    /* JADX WARN: Code duplicated, block: B:62:0x010e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0117  */
    /* JADX WARN: Code duplicated, block: B:67:0x0125  */
    /* JADX WARN: Code duplicated, block: B:70:0x0132  */
    /* JADX WARN: Code duplicated, block: B:73:0x013d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0140  */
    /* JADX WARN: Code duplicated, block: B:77:0x0143  */
    /* JADX WARN: Code duplicated, block: B:79:0x0146  */
    /* JADX WARN: Code duplicated, block: B:82:0x0157  */
    /* JADX WARN: Code duplicated, block: B:84:0x015c  */
    /* JADX WARN: Code duplicated, block: B:85:0x016c  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:91:0x01be  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.constraintlayout.widget.VirtualLayout
    public final void j(ye2 ye2Var, int i, int i2) {
        u21 u21Var;
        u21 u21Var2;
        u21 u21Var3;
        ArrayList arrayList;
        int i3;
        int i4;
        int i5;
        int[] iArr;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        m31[] m31VarArr;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        m31[] m31VarArr2;
        int i16;
        m31[] m31VarArr3;
        int i17;
        int i18;
        int[] iArr2;
        int i19;
        int i20;
        we2 we2Var;
        int i21;
        char c;
        char c2;
        int i22;
        int i23;
        int iMin;
        boolean z;
        int i24;
        m31[] m31VarArr4;
        int i25;
        we2 we2Var2;
        int i26;
        int i27;
        int i28;
        m31 m31Var;
        int iT;
        boolean z2;
        int i29;
        int size;
        boolean z3;
        int i30;
        int i31;
        int i32;
        int i33;
        u21 u21Var4;
        u21 u21Var5;
        u21 u21Var6;
        u21 u21Var7;
        int i34;
        int iMax;
        int i35;
        we2 we2Var3;
        int iD;
        int iC;
        int i36;
        we2 we2Var4;
        int i37;
        int i38;
        m31 m31Var2;
        int iU;
        boolean z4;
        int i39;
        m31[] m31VarArr5;
        int i40;
        int i41;
        int iCeil;
        int iCeil2;
        int i42;
        int i43;
        int i44;
        m31 m31Var3;
        int iT2;
        boolean z5;
        m31[] m31VarArr6;
        Object obj;
        m31[] m31VarArr7;
        int i45;
        int i46;
        int iU2;
        int i47;
        int iT3;
        m31 m31Var4;
        m31 m31Var5;
        int i48;
        int i49;
        m31 m31Var6;
        m31 m31Var7;
        m31 m31Var8;
        int i50;
        int i51;
        m31 m31Var9;
        int iU3;
        int i52;
        int i53;
        m31[] m31VarArr8;
        we2 we2Var5;
        char c3;
        int i54;
        int i55;
        int i56;
        int i57;
        int i58;
        m31 m31Var10;
        int iT4;
        int i59;
        boolean z6;
        int i60;
        int size2;
        boolean z7;
        int i61;
        int i62;
        int i63;
        int i64;
        u21 u21Var8;
        u21 u21Var9;
        u21 u21Var10;
        u21 u21Var11;
        int i65;
        int iMax2;
        int i66;
        we2 we2Var6;
        int iD2;
        int iC2;
        int i67;
        we2 we2Var7;
        int i68;
        int i69;
        int i70;
        m31 m31Var11;
        int iU4;
        int i71;
        int i72;
        boolean z8;
        int i73;
        int i74;
        int i75;
        int i76;
        int i77;
        m31 m31Var12;
        m31[] m31VarArr9;
        u21 u21Var12;
        u21 u21Var13;
        u21 u21Var14;
        ArrayList arrayList2;
        e30 e30Var;
        int mode = View.MeasureSpec.getMode(i);
        int size3 = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size4 = View.MeasureSpec.getSize(i2);
        if (ye2Var == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        int[] iArr3 = ye2Var.p0;
        u21 u21Var15 = ye2Var.J;
        u21 u21Var16 = ye2Var.I;
        u21 u21Var17 = ye2Var.K;
        u21 u21Var18 = ye2Var.L;
        ArrayList arrayList3 = ye2Var.W0;
        if (ye2Var.r0 > 0) {
            d30 d30Var = ye2Var.B0;
            n31 n31Var = ye2Var.T;
            e30 e30Var2 = n31Var != null ? n31Var.u0 : null;
            if (e30Var2 == null) {
                ye2Var.z0 = 0;
                ye2Var.A0 = 0;
                ye2Var.y0 = false;
            } else {
                int i78 = 0;
                while (i78 < ye2Var.r0) {
                    m31 m31Var13 = ye2Var.q0[i78];
                    if (m31Var13 == null) {
                        u21Var12 = u21Var16;
                    } else {
                        u21Var12 = u21Var16;
                        if (!(m31Var13 instanceof av2)) {
                            u21Var13 = u21Var17;
                            int iJ = m31Var13.j(0);
                            u21Var14 = u21Var18;
                            int iJ2 = m31Var13.j(1);
                            arrayList2 = arrayList3;
                            if (iJ == 3) {
                                e30Var = e30Var2;
                                if (m31Var13.r == 1 || iJ2 != 3 || m31Var13.s == 1) {
                                }
                            } else {
                                e30Var = e30Var2;
                            }
                            if (iJ == 3) {
                                iJ = 2;
                            }
                            if (iJ2 == 3) {
                                iJ2 = 2;
                            }
                            d30Var.a = iJ;
                            d30Var.b = iJ2;
                            d30Var.c = m31Var13.q();
                            d30Var.d = m31Var13.k();
                            ((b) e30Var).b(m31Var13, d30Var);
                            m31Var13.O(d30Var.e);
                            m31Var13.L(d30Var.f);
                            m31Var13.I(d30Var.g);
                        }
                        i78++;
                        u21Var16 = u21Var12;
                        u21Var17 = u21Var13;
                        u21Var18 = u21Var14;
                        arrayList3 = arrayList2;
                        e30Var2 = e30Var;
                    }
                    u21Var13 = u21Var17;
                    u21Var14 = u21Var18;
                    arrayList2 = arrayList3;
                    e30Var = e30Var2;
                    i78++;
                    u21Var16 = u21Var12;
                    u21Var17 = u21Var13;
                    u21Var18 = u21Var14;
                    arrayList3 = arrayList2;
                    e30Var2 = e30Var;
                }
                u21Var = u21Var16;
                u21Var2 = u21Var17;
                u21Var3 = u21Var18;
                arrayList = arrayList3;
                i3 = ye2Var.w0;
                int i79 = ye2Var.x0;
                i4 = ye2Var.s0;
                i5 = ye2Var.t0;
                iArr = new int[2];
                i6 = (size3 - i3) - i79;
                i7 = ye2Var.V0;
                if (i7 == 1) {
                    i6 = (size4 - i4) - i5;
                }
                i8 = i6;
                i9 = ye2Var.D0;
                i10 = i79;
                if (i7 == 0) {
                    if (i9 == -1) {
                        ye2Var.D0 = 0;
                    }
                    if (ye2Var.E0 == -1) {
                        ye2Var.E0 = 0;
                    }
                } else {
                    if (i9 == -1) {
                        ye2Var.D0 = 0;
                    }
                    if (ye2Var.E0 == -1) {
                        ye2Var.E0 = 0;
                    }
                }
                m31VarArr = ye2Var.q0;
                i11 = 0;
                i12 = 0;
                while (true) {
                    i13 = ye2Var.r0;
                    i14 = i4;
                    if (i11 < i13) {
                        break;
                    }
                    if (ye2Var.q0[i11].g0 == 8) {
                        i12++;
                    }
                    i11++;
                    i4 = i14;
                }
                if (i12 > 0) {
                    m31VarArr2 = new m31[i13 - i12];
                    i76 = 0;
                    i77 = 0;
                    while (i76 < ye2Var.r0) {
                        m31Var12 = ye2Var.q0[i76];
                        m31VarArr9 = m31VarArr2;
                        if (m31Var12.g0 != 8) {
                            m31VarArr9[i77] = m31Var12;
                            i77++;
                        }
                        i76++;
                        m31VarArr2 = m31VarArr9;
                    }
                    i15 = i77;
                } else {
                    i15 = i13;
                    m31VarArr2 = m31VarArr;
                }
                ye2Var.a1 = m31VarArr2;
                ye2Var.b1 = i15;
                i16 = ye2Var.T0;
                if (i16 != 0) {
                    m31VarArr3 = m31VarArr2;
                    i17 = i15;
                    i18 = i5;
                    iArr2 = iArr;
                    i19 = size4;
                    i3 = i3;
                    i10 = i10;
                    i14 = i14;
                    i20 = ye2Var.V0;
                    if (i17 == 0) {
                        if (arrayList.size() == 0) {
                            we2Var = new we2(ye2Var, i20, ye2Var.I, ye2Var.J, ye2Var.K, ye2Var.L, i8);
                            arrayList.add(we2Var);
                        } else {
                            we2 we2Var8 = (we2) arrayList.get(0);
                            we2Var8.c = 0;
                            we2Var8.b = null;
                            we2Var8.l = 0;
                            we2Var8.m = 0;
                            we2Var8.n = 0;
                            we2Var8.o = 0;
                            we2Var8.p = 0;
                            we2Var8.f(i20, ye2Var.I, ye2Var.J, ye2Var.K, ye2Var.L, ye2Var.w0, ye2Var.s0, ye2Var.x0, ye2Var.t0, i8);
                            we2Var = we2Var8;
                        }
                        for (i21 = 0; i21 < i17; i21++) {
                            we2Var.a(m31VarArr3[i21]);
                        }
                        c = 0;
                        iArr2[0] = we2Var.d();
                        c2 = 1;
                        iArr2[1] = we2Var.c();
                    }
                    i22 = iArr2[c] + i3 + i10;
                    i23 = iArr2[c2] + i14 + i18;
                    if (mode != 1073741824) {
                        if (mode == Integer.MIN_VALUE) {
                            size3 = Math.min(i22, size3);
                        } else if (mode == 0) {
                            size3 = i22;
                        } else {
                            size3 = 0;
                        }
                    }
                    if (mode2 == 1073741824) {
                        iMin = i19;
                    } else if (mode2 == Integer.MIN_VALUE) {
                        iMin = Math.min(i23, i19);
                    } else if (mode2 == 0) {
                        iMin = i23;
                    } else {
                        iMin = 0;
                    }
                    ye2Var.z0 = size3;
                    ye2Var.A0 = iMin;
                    ye2Var.O(size3);
                    ye2Var.L(iMin);
                    if (ye2Var.r0 > 0) {
                        z = c2;
                    } else {
                        z = 0;
                    }
                    ye2Var.y0 = z;
                } else if (i16 != 1) {
                    if (i16 != 2) {
                        m31VarArr5 = m31VarArr2;
                        i40 = i15;
                        i18 = i5;
                        iArr2 = iArr;
                        i19 = size4;
                        i3 = i3;
                        i10 = i10;
                        i14 = i14;
                        i41 = ye2Var.V0;
                        iCeil = ye2Var.U0;
                        if (i41 == 0) {
                            if (iCeil <= 0) {
                                i51 = 0;
                                iCeil2 = 0;
                                for (i50 = 0; i50 < i40; i50++) {
                                    if (i50 > 0) {
                                        i51 += ye2Var.P0;
                                    }
                                    m31Var9 = m31VarArr5[i50];
                                    if (m31Var9 != null) {
                                        iU3 = ye2Var.U(m31Var9, i8) + i51;
                                        if (iU3 > i8) {
                                            break;
                                        }
                                        iCeil2++;
                                        i51 = iU3;
                                    }
                                }
                            } else {
                                iCeil2 = iCeil;
                            }
                            iCeil = 0;
                        } else {
                            if (iCeil <= 0) {
                                i43 = 0;
                                i44 = 0;
                                for (i42 = 0; i42 < i40; i42++) {
                                    if (i42 > 0) {
                                        i43 += ye2Var.Q0;
                                    }
                                    m31Var3 = m31VarArr5[i42];
                                    if (m31Var3 != null) {
                                        iT2 = ye2Var.T(m31Var3, i8) + i43;
                                        if (iT2 > i8) {
                                            break;
                                        }
                                        i44++;
                                        i43 = iT2;
                                    }
                                }
                                iCeil = i44;
                            }
                            iCeil2 = 0;
                        }
                        if (ye2Var.Z0 == null) {
                            ye2Var.Z0 = new int[2];
                        }
                        z5 = (iCeil != 0 && i41 == 1) || (iCeil2 == 0 && i41 == 0);
                        while (!z5) {
                            if (i41 == 0) {
                                iCeil = (int) Math.ceil(i40 / iCeil2);
                            } else {
                                iCeil2 = (int) Math.ceil(i40 / iCeil);
                            }
                            m31VarArr6 = ye2Var.Y0;
                            if (m31VarArr6 != null || m31VarArr6.length < iCeil2) {
                                obj = null;
                                ye2Var.Y0 = new m31[iCeil2];
                            } else {
                                obj = null;
                                Arrays.fill(m31VarArr6, (Object) null);
                            }
                            m31VarArr7 = ye2Var.X0;
                            if (m31VarArr7 != null || m31VarArr7.length < iCeil) {
                                ye2Var.X0 = new m31[iCeil];
                            } else {
                                Arrays.fill(m31VarArr7, obj);
                            }
                            for (i45 = 0; i45 < iCeil2; i45++) {
                                for (i48 = 0; i48 < iCeil; i48++) {
                                    i49 = (i48 * iCeil2) + i45;
                                    if (i41 == 1) {
                                        i49 = (i45 * iCeil) + i48;
                                    }
                                    if (i49 < m31VarArr5.length && (m31Var6 = m31VarArr5[i49]) != null) {
                                        int iU5 = ye2Var.U(m31Var6, i8);
                                        m31Var7 = ye2Var.Y0[i45];
                                        if (m31Var7 != null || m31Var7.q() < iU5) {
                                            ye2Var.Y0[i45] = m31Var6;
                                        }
                                        int iT5 = ye2Var.T(m31Var6, i8);
                                        m31Var8 = ye2Var.X0[i48];
                                        if (m31Var8 != null || m31Var8.k() < iT5) {
                                            ye2Var.X0[i48] = m31Var6;
                                        }
                                    }
                                }
                            }
                            iU2 = 0;
                            for (i46 = 0; i46 < iCeil2; i46++) {
                                m31Var5 = ye2Var.Y0[i46];
                                if (m31Var5 == null) {
                                    if (i46 > 0) {
                                        iU2 += ye2Var.P0;
                                    }
                                    iU2 = ye2Var.U(m31Var5, i8) + iU2;
                                }
                            }
                            iT3 = 0;
                            for (i47 = 0; i47 < iCeil; i47++) {
                                m31Var4 = ye2Var.X0[i47];
                                if (m31Var4 == null) {
                                    if (i47 > 0) {
                                        iT3 += ye2Var.Q0;
                                    }
                                    iT3 = ye2Var.T(m31Var4, i8) + iT3;
                                }
                            }
                            iArr2[0] = iU2;
                            iArr2[1] = iT3;
                            if (i41 == 0) {
                                if (iU2 > i8 || iCeil2 <= 1) {
                                    z5 = true;
                                } else {
                                    iCeil2--;
                                }
                            } else if (iT3 > i8 || iCeil <= 1) {
                                z5 = true;
                            } else {
                                iCeil--;
                            }
                        }
                        int[] iArr4 = ye2Var.Z0;
                        iArr4[0] = iCeil2;
                        iArr4[1] = iCeil;
                        c2 = 1;
                    } else if (i16 != 3) {
                        i18 = i5;
                        iArr2 = iArr;
                        i19 = size4;
                        i3 = i3;
                        i10 = i10;
                        i14 = i14;
                    } else {
                        i52 = i15;
                        i53 = ye2Var.V0;
                        if (i52 == 0) {
                            i18 = i5;
                            iArr2 = iArr;
                            i19 = size4;
                            c3 = 1;
                        } else {
                            arrayList.clear();
                            m31VarArr8 = m31VarArr2;
                            i18 = i5;
                            iArr2 = iArr;
                            c3 = 1;
                            we2Var5 = new we2(ye2Var, i53, ye2Var.I, ye2Var.J, ye2Var.K, ye2Var.L, i8);
                            arrayList.add(we2Var5);
                            if (i53 == 0) {
                                i68 = 0;
                                i69 = 0;
                                i58 = 0;
                                i70 = 0;
                                while (i68 < i52) {
                                    i69++;
                                    m31Var11 = m31VarArr8[i68];
                                    iU4 = ye2Var.U(m31Var11, i8);
                                    i71 = i53;
                                    i72 = i68;
                                    if (m31Var11.p0[0] == 3) {
                                        i58++;
                                    }
                                    int i80 = i58;
                                    z8 = (i70 != i8 || (ye2Var.P0 + i70) + iU4 > i8) && we2Var5.b != null;
                                    if (!z8 && i72 > 0 && (i75 = ye2Var.U0) > 0 && i69 > i75) {
                                        z8 = true;
                                    }
                                    if (z8) {
                                        i73 = size4;
                                        i53 = i71;
                                        i74 = i72;
                                        we2Var5 = new we2(ye2Var, i53, ye2Var.I, ye2Var.J, ye2Var.K, ye2Var.L, i8);
                                        we2Var5.n = i74;
                                        arrayList.add(we2Var5);
                                        i69 = 1;
                                    } else {
                                        i73 = size4;
                                        i53 = i71;
                                        i74 = i72;
                                        if (i74 > 0) {
                                            i70 = ye2Var.P0 + iU4 + i70;
                                        }
                                        we2Var5.a(m31Var11);
                                        i68 = i74 + 1;
                                        i58 = i80;
                                        size4 = i73;
                                    }
                                    i70 = iU4;
                                    we2Var5.a(m31Var11);
                                    i68 = i74 + 1;
                                    i58 = i80;
                                    size4 = i73;
                                }
                                i19 = size4;
                            } else {
                                i19 = size4;
                                i54 = 0;
                                i55 = 0;
                                i56 = 0;
                                i57 = 0;
                                while (i54 < i52) {
                                    i55++;
                                    m31Var10 = m31VarArr8[i54];
                                    iT4 = ye2Var.T(m31Var10, i8);
                                    i59 = i53;
                                    if (m31Var10.p0[1] == 3) {
                                        i56++;
                                    }
                                    int i81 = i56;
                                    z6 = (i57 != i8 || (ye2Var.Q0 + i57) + iT4 > i8) && we2Var5.b != null;
                                    if (!z6 && i54 > 0 && (i60 = ye2Var.U0) > 0 && i55 > i60) {
                                        z6 = true;
                                    }
                                    if (z6) {
                                        i53 = i59;
                                        we2Var5 = new we2(ye2Var, i53, ye2Var.I, ye2Var.J, ye2Var.K, ye2Var.L, i8);
                                        we2Var5.n = i54;
                                        arrayList.add(we2Var5);
                                        i55 = 1;
                                    } else {
                                        i53 = i59;
                                        if (i54 > 0) {
                                            i57 = ye2Var.Q0 + iT4 + i57;
                                        }
                                        we2Var5.a(m31Var10);
                                        i54++;
                                        i56 = i81;
                                    }
                                    i57 = iT4;
                                    we2Var5.a(m31Var10);
                                    i54++;
                                    i56 = i81;
                                }
                                i58 = i56;
                            }
                            size2 = arrayList.size();
                            int i82 = ye2Var.w0;
                            int i83 = ye2Var.s0;
                            int i84 = ye2Var.x0;
                            int i85 = ye2Var.t0;
                            if (iArr3[0] != 2 || iArr3[1] == 2) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            if (i58 > 0 && z7) {
                                for (i67 = 0; i67 < size2; i67++) {
                                    we2Var7 = (we2) arrayList.get(i67);
                                    if (i53 == 0) {
                                        we2Var7.e(i8 - we2Var7.d());
                                    } else {
                                        we2Var7.e(i8 - we2Var7.c());
                                    }
                                }
                            }
                            i61 = i82;
                            i62 = i83;
                            i63 = i84;
                            i64 = i85;
                            u21Var8 = u21Var;
                            u21Var9 = u21Var2;
                            u21Var10 = u21Var3;
                            u21Var11 = u21Var15;
                            iMax2 = 0;
                            i66 = 0;
                            for (i65 = 0; i65 < size2; i65++) {
                                we2Var6 = (we2) arrayList.get(i65);
                                if (i53 == 0) {
                                    if (i65 < size2 - 1) {
                                        u21Var10 = ((we2) arrayList.get(i65 + 1)).b.J;
                                        i64 = 0;
                                    } else {
                                        i64 = ye2Var.t0;
                                        u21Var10 = u21Var3;
                                    }
                                    u21 u21Var19 = we2Var6.b.L;
                                    we2Var6.f(i53, u21Var8, u21Var11, u21Var9, u21Var10, i61, i62, i63, i64, i8);
                                    iMax2 = Math.max(iMax2, we2Var6.d());
                                    iC2 = we2Var6.c() + i66;
                                    if (i65 > 0) {
                                        iC2 += ye2Var.Q0;
                                    }
                                    i66 = iC2;
                                    u21Var11 = u21Var19;
                                    i62 = 0;
                                } else {
                                    if (i65 < size2 - 1) {
                                        u21Var9 = ((we2) arrayList.get(i65 + 1)).b.I;
                                        i63 = 0;
                                    } else {
                                        i63 = ye2Var.x0;
                                        u21Var9 = u21Var2;
                                    }
                                    u21 u21Var20 = we2Var6.b.K;
                                    we2Var6.f(i53, u21Var8, u21Var11, u21Var9, u21Var10, i61, i62, i63, i64, i8);
                                    iD2 = we2Var6.d() + iMax2;
                                    int iMax3 = Math.max(i66, we2Var6.c());
                                    if (i65 > 0) {
                                        iD2 += ye2Var.P0;
                                    }
                                    i66 = iMax3;
                                    iMax2 = iD2;
                                    u21Var8 = u21Var20;
                                    i61 = 0;
                                }
                            }
                            iArr2[0] = iMax2;
                            iArr2[1] = i66;
                        }
                        c2 = c3;
                    }
                    c = 0;
                    i22 = iArr2[c] + i3 + i10;
                    i23 = iArr2[c2] + i14 + i18;
                    if (mode != 1073741824) {
                        if (mode == Integer.MIN_VALUE) {
                            size3 = Math.min(i22, size3);
                        } else if (mode == 0) {
                            size3 = i22;
                        } else {
                            size3 = 0;
                        }
                    }
                    if (mode2 == 1073741824) {
                        iMin = i19;
                    } else if (mode2 == Integer.MIN_VALUE) {
                        iMin = Math.min(i23, i19);
                    } else if (mode2 == 0) {
                        iMin = i23;
                    } else {
                        iMin = 0;
                    }
                    ye2Var.z0 = size3;
                    ye2Var.A0 = iMin;
                    ye2Var.O(size3);
                    ye2Var.L(iMin);
                    if (ye2Var.r0 > 0) {
                        z = c2;
                    } else {
                        z = 0;
                    }
                    ye2Var.y0 = z;
                } else {
                    i18 = i5;
                    iArr2 = iArr;
                    i19 = size4;
                    i3 = i3;
                    i10 = i10;
                    i14 = i14;
                    i24 = i15;
                    m31VarArr4 = m31VarArr2;
                    i25 = ye2Var.V0;
                    if (i24 != 0) {
                        arrayList.clear();
                        we2Var2 = new we2(ye2Var, i25, ye2Var.I, ye2Var.J, ye2Var.K, ye2Var.L, i8);
                        arrayList.add(we2Var2);
                        if (i25 == 0) {
                            i37 = 0;
                            i27 = 0;
                            i38 = 0;
                            while (i37 < i24) {
                                m31Var2 = m31VarArr4[i37];
                                iU = ye2Var.U(m31Var2, i8);
                                if (m31Var2.p0[0] == 3) {
                                    i27++;
                                }
                                int i86 = i27;
                                z4 = (i38 != i8 || (ye2Var.P0 + i38) + iU > i8) && we2Var2.b != null;
                                if (!z4 && i37 > 0 && (i39 = ye2Var.U0) > 0 && i37 % i39 == 0) {
                                    z4 = true;
                                }
                                if (z4) {
                                    we2Var2 = new we2(ye2Var, i25, ye2Var.I, ye2Var.J, ye2Var.K, ye2Var.L, i8);
                                    we2Var2.n = i37;
                                    arrayList.add(we2Var2);
                                } else {
                                    if (i37 > 0) {
                                        i38 = ye2Var.P0 + iU + i38;
                                    }
                                    we2Var2.a(m31Var2);
                                    i37++;
                                    i27 = i86;
                                }
                                i38 = iU;
                                we2Var2.a(m31Var2);
                                i37++;
                                i27 = i86;
                            }
                        } else {
                            i26 = 0;
                            i27 = 0;
                            i28 = 0;
                            while (i26 < i24) {
                                m31Var = m31VarArr4[i26];
                                iT = ye2Var.T(m31Var, i8);
                                if (m31Var.p0[1] == 3) {
                                    i27++;
                                }
                                int i87 = i27;
                                z2 = (i28 != i8 || (ye2Var.Q0 + i28) + iT > i8) && we2Var2.b != null;
                                if (!z2 && i26 > 0 && (i29 = ye2Var.U0) > 0 && i26 % i29 == 0) {
                                    z2 = true;
                                }
                                if (z2) {
                                    we2Var2 = new we2(ye2Var, i25, ye2Var.I, ye2Var.J, ye2Var.K, ye2Var.L, i8);
                                    we2Var2.n = i26;
                                    arrayList.add(we2Var2);
                                } else {
                                    if (i26 > 0) {
                                        i28 = ye2Var.Q0 + iT + i28;
                                    }
                                    we2Var2.a(m31Var);
                                    i26++;
                                    i27 = i87;
                                }
                                i28 = iT;
                                we2Var2.a(m31Var);
                                i26++;
                                i27 = i87;
                            }
                        }
                        size = arrayList.size();
                        int i88 = ye2Var.w0;
                        int i89 = ye2Var.s0;
                        int i90 = ye2Var.x0;
                        int i91 = ye2Var.t0;
                        if (iArr3[0] != 2 || iArr3[1] == 2) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (i27 > 0 && z3) {
                            for (i36 = 0; i36 < size; i36++) {
                                we2Var4 = (we2) arrayList.get(i36);
                                if (i25 == 0) {
                                    we2Var4.e(i8 - we2Var4.d());
                                } else {
                                    we2Var4.e(i8 - we2Var4.c());
                                }
                            }
                        }
                        i30 = i88;
                        i31 = i89;
                        i32 = i90;
                        i33 = i91;
                        u21Var4 = u21Var;
                        u21Var5 = u21Var2;
                        u21Var6 = u21Var3;
                        u21Var7 = u21Var15;
                        iMax = 0;
                        i35 = 0;
                        for (i34 = 0; i34 < size; i34++) {
                            we2Var3 = (we2) arrayList.get(i34);
                            if (i25 == 0) {
                                if (i34 < size - 1) {
                                    u21Var6 = ((we2) arrayList.get(i34 + 1)).b.J;
                                    i33 = 0;
                                } else {
                                    i33 = ye2Var.t0;
                                    u21Var6 = u21Var3;
                                }
                                u21 u21Var21 = we2Var3.b.L;
                                we2Var3.f(i25, u21Var4, u21Var7, u21Var5, u21Var6, i30, i31, i32, i33, i8);
                                iMax = Math.max(iMax, we2Var3.d());
                                iC = we2Var3.c() + i35;
                                if (i34 > 0) {
                                    iC += ye2Var.Q0;
                                }
                                i35 = iC;
                                u21Var7 = u21Var21;
                                i31 = 0;
                            } else {
                                if (i34 < size - 1) {
                                    u21Var5 = ((we2) arrayList.get(i34 + 1)).b.I;
                                    i32 = 0;
                                } else {
                                    i32 = ye2Var.x0;
                                    u21Var5 = u21Var2;
                                }
                                u21 u21Var22 = we2Var3.b.K;
                                we2Var3.f(i25, u21Var4, u21Var7, u21Var5, u21Var6, i30, i31, i32, i33, i8);
                                iD = we2Var3.d() + iMax;
                                int iMax4 = Math.max(i35, we2Var3.c());
                                if (i34 > 0) {
                                    iD += ye2Var.P0;
                                }
                                i35 = iMax4;
                                iMax = iD;
                                u21Var4 = u21Var22;
                                i30 = 0;
                            }
                        }
                        iArr2[0] = iMax;
                        iArr2[1] = i35;
                    }
                }
                c2 = 1;
                c = 0;
                i22 = iArr2[c] + i3 + i10;
                i23 = iArr2[c2] + i14 + i18;
                if (mode != 1073741824) {
                    if (mode == Integer.MIN_VALUE) {
                        size3 = Math.min(i22, size3);
                    } else if (mode == 0) {
                        size3 = i22;
                    } else {
                        size3 = 0;
                    }
                }
                if (mode2 == 1073741824) {
                    iMin = i19;
                } else if (mode2 == Integer.MIN_VALUE) {
                    iMin = Math.min(i23, i19);
                } else if (mode2 == 0) {
                    iMin = i23;
                } else {
                    iMin = 0;
                }
                ye2Var.z0 = size3;
                ye2Var.A0 = iMin;
                ye2Var.O(size3);
                ye2Var.L(iMin);
                if (ye2Var.r0 > 0) {
                    z = c2;
                } else {
                    z = 0;
                }
                ye2Var.y0 = z;
            }
        } else {
            u21Var = u21Var16;
            u21Var2 = u21Var17;
            u21Var3 = u21Var18;
            arrayList = arrayList3;
            i3 = ye2Var.w0;
            int i710 = ye2Var.x0;
            i4 = ye2Var.s0;
            i5 = ye2Var.t0;
            iArr = new int[2];
            i6 = (size3 - i3) - i710;
            i7 = ye2Var.V0;
            if (i7 == 1) {
                i6 = (size4 - i4) - i5;
            }
            i8 = i6;
            i9 = ye2Var.D0;
            i10 = i710;
            if (i7 == 0) {
                if (i9 == -1) {
                    ye2Var.D0 = 0;
                }
                if (ye2Var.E0 == -1) {
                    ye2Var.E0 = 0;
                }
            } else {
                if (i9 == -1) {
                    ye2Var.D0 = 0;
                }
                if (ye2Var.E0 == -1) {
                    ye2Var.E0 = 0;
                }
            }
            m31VarArr = ye2Var.q0;
            i11 = 0;
            i12 = 0;
            while (true) {
                i13 = ye2Var.r0;
                i14 = i4;
                if (i11 < i13) {
                    break;
                    break;
                }
                if (ye2Var.q0[i11].g0 == 8) {
                    i12++;
                }
                i11++;
                i4 = i14;
            }
            if (i12 > 0) {
                m31VarArr2 = new m31[i13 - i12];
                i76 = 0;
                i77 = 0;
                while (i76 < ye2Var.r0) {
                    m31Var12 = ye2Var.q0[i76];
                    m31VarArr9 = m31VarArr2;
                    if (m31Var12.g0 != 8) {
                        m31VarArr9[i77] = m31Var12;
                        i77++;
                    }
                    i76++;
                    m31VarArr2 = m31VarArr9;
                }
                i15 = i77;
            } else {
                i15 = i13;
                m31VarArr2 = m31VarArr;
            }
            ye2Var.a1 = m31VarArr2;
            ye2Var.b1 = i15;
            i16 = ye2Var.T0;
            if (i16 != 0) {
                m31VarArr3 = m31VarArr2;
                i17 = i15;
                i18 = i5;
                iArr2 = iArr;
                i19 = size4;
                i3 = i3;
                i10 = i10;
                i14 = i14;
                i20 = ye2Var.V0;
                if (i17 == 0) {
                    if (arrayList.size() == 0) {
                        we2Var = new we2(ye2Var, i20, ye2Var.I, ye2Var.J, ye2Var.K, ye2Var.L, i8);
                        arrayList.add(we2Var);
                    } else {
                        we2 we2Var9 = (we2) arrayList.get(0);
                        we2Var9.c = 0;
                        we2Var9.b = null;
                        we2Var9.l = 0;
                        we2Var9.m = 0;
                        we2Var9.n = 0;
                        we2Var9.o = 0;
                        we2Var9.p = 0;
                        we2Var9.f(i20, ye2Var.I, ye2Var.J, ye2Var.K, ye2Var.L, ye2Var.w0, ye2Var.s0, ye2Var.x0, ye2Var.t0, i8);
                        we2Var = we2Var9;
                    }
                    while (i21 < i17) {
                        we2Var.a(m31VarArr3[i21]);
                    }
                    c = 0;
                    iArr2[0] = we2Var.d();
                    c2 = 1;
                    iArr2[1] = we2Var.c();
                }
                i22 = iArr2[c] + i3 + i10;
                i23 = iArr2[c2] + i14 + i18;
                if (mode != 1073741824) {
                    if (mode == Integer.MIN_VALUE) {
                        size3 = Math.min(i22, size3);
                    } else if (mode == 0) {
                        size3 = i22;
                    } else {
                        size3 = 0;
                    }
                }
                if (mode2 == 1073741824) {
                    iMin = i19;
                } else if (mode2 == Integer.MIN_VALUE) {
                    iMin = Math.min(i23, i19);
                } else if (mode2 == 0) {
                    iMin = i23;
                } else {
                    iMin = 0;
                }
                ye2Var.z0 = size3;
                ye2Var.A0 = iMin;
                ye2Var.O(size3);
                ye2Var.L(iMin);
                if (ye2Var.r0 > 0) {
                    z = c2;
                } else {
                    z = 0;
                }
                ye2Var.y0 = z;
            } else if (i16 != 1) {
                if (i16 != 2) {
                    m31VarArr5 = m31VarArr2;
                    i40 = i15;
                    i18 = i5;
                    iArr2 = iArr;
                    i19 = size4;
                    i3 = i3;
                    i10 = i10;
                    i14 = i14;
                    i41 = ye2Var.V0;
                    iCeil = ye2Var.U0;
                    if (i41 == 0) {
                        if (iCeil <= 0) {
                            i51 = 0;
                            iCeil2 = 0;
                            while (i50 < i40) {
                                if (i50 > 0) {
                                    i51 += ye2Var.P0;
                                }
                                m31Var9 = m31VarArr5[i50];
                                if (m31Var9 != null) {
                                    iU3 = ye2Var.U(m31Var9, i8) + i51;
                                    if (iU3 > i8) {
                                        break;
                                        break;
                                    } else {
                                        iCeil2++;
                                        i51 = iU3;
                                    }
                                }
                            }
                        } else {
                            iCeil2 = iCeil;
                        }
                        iCeil = 0;
                    } else {
                        if (iCeil <= 0) {
                            i43 = 0;
                            i44 = 0;
                            while (i42 < i40) {
                                if (i42 > 0) {
                                    i43 += ye2Var.Q0;
                                }
                                m31Var3 = m31VarArr5[i42];
                                if (m31Var3 != null) {
                                    iT2 = ye2Var.T(m31Var3, i8) + i43;
                                    if (iT2 > i8) {
                                        break;
                                        break;
                                    } else {
                                        i44++;
                                        i43 = iT2;
                                    }
                                }
                            }
                            iCeil = i44;
                        }
                        iCeil2 = 0;
                    }
                    if (ye2Var.Z0 == null) {
                        ye2Var.Z0 = new int[2];
                    }
                    if (iCeil != 0) {
                    }
                    while (!z5) {
                        if (i41 == 0) {
                            iCeil = (int) Math.ceil(i40 / iCeil2);
                        } else {
                            iCeil2 = (int) Math.ceil(i40 / iCeil);
                        }
                        m31VarArr6 = ye2Var.Y0;
                        if (m31VarArr6 != null) {
                            obj = null;
                            ye2Var.Y0 = new m31[iCeil2];
                        } else {
                            obj = null;
                            ye2Var.Y0 = new m31[iCeil2];
                        }
                        m31VarArr7 = ye2Var.X0;
                        if (m31VarArr7 != null) {
                            ye2Var.X0 = new m31[iCeil];
                        } else {
                            ye2Var.X0 = new m31[iCeil];
                        }
                        while (i45 < iCeil2) {
                            while (i48 < iCeil) {
                                i49 = (i48 * iCeil2) + i45;
                                if (i41 == 1) {
                                    i49 = (i45 * iCeil) + i48;
                                }
                                if (i49 < m31VarArr5.length) {
                                    int iU6 = ye2Var.U(m31Var6, i8);
                                    m31Var7 = ye2Var.Y0[i45];
                                    if (m31Var7 != null) {
                                        ye2Var.Y0[i45] = m31Var6;
                                    } else {
                                        ye2Var.Y0[i45] = m31Var6;
                                    }
                                    int iT6 = ye2Var.T(m31Var6, i8);
                                    m31Var8 = ye2Var.X0[i48];
                                    if (m31Var8 != null) {
                                        ye2Var.X0[i48] = m31Var6;
                                    } else {
                                        ye2Var.X0[i48] = m31Var6;
                                    }
                                }
                            }
                        }
                        iU2 = 0;
                        while (i46 < iCeil2) {
                            m31Var5 = ye2Var.Y0[i46];
                            if (m31Var5 == null) {
                                if (i46 > 0) {
                                    iU2 += ye2Var.P0;
                                }
                                iU2 = ye2Var.U(m31Var5, i8) + iU2;
                            }
                        }
                        iT3 = 0;
                        while (i47 < iCeil) {
                            m31Var4 = ye2Var.X0[i47];
                            if (m31Var4 == null) {
                                if (i47 > 0) {
                                    iT3 += ye2Var.Q0;
                                }
                                iT3 = ye2Var.T(m31Var4, i8) + iT3;
                            }
                        }
                        iArr2[0] = iU2;
                        iArr2[1] = iT3;
                        if (i41 == 0) {
                            if (iU2 > i8) {
                            }
                            z5 = true;
                        } else {
                            if (iT3 > i8) {
                            }
                            z5 = true;
                        }
                    }
                    int[] iArr5 = ye2Var.Z0;
                    iArr5[0] = iCeil2;
                    iArr5[1] = iCeil;
                    c2 = 1;
                } else if (i16 != 3) {
                    i18 = i5;
                    iArr2 = iArr;
                    i19 = size4;
                    i3 = i3;
                    i10 = i10;
                    i14 = i14;
                } else {
                    i52 = i15;
                    i53 = ye2Var.V0;
                    if (i52 == 0) {
                        i18 = i5;
                        iArr2 = iArr;
                        i19 = size4;
                        c3 = 1;
                    } else {
                        arrayList.clear();
                        m31VarArr8 = m31VarArr2;
                        i18 = i5;
                        iArr2 = iArr;
                        c3 = 1;
                        we2Var5 = new we2(ye2Var, i53, ye2Var.I, ye2Var.J, ye2Var.K, ye2Var.L, i8);
                        arrayList.add(we2Var5);
                        if (i53 == 0) {
                            i68 = 0;
                            i69 = 0;
                            i58 = 0;
                            i70 = 0;
                            while (i68 < i52) {
                                i69++;
                                m31Var11 = m31VarArr8[i68];
                                iU4 = ye2Var.U(m31Var11, i8);
                                i71 = i53;
                                i72 = i68;
                                if (m31Var11.p0[0] == 3) {
                                    i58++;
                                }
                                int i810 = i58;
                                if (i70 != i8) {
                                }
                                if (!z8) {
                                    z8 = true;
                                }
                                if (z8) {
                                    i73 = size4;
                                    i53 = i71;
                                    i74 = i72;
                                    we2Var5 = new we2(ye2Var, i53, ye2Var.I, ye2Var.J, ye2Var.K, ye2Var.L, i8);
                                    we2Var5.n = i74;
                                    arrayList.add(we2Var5);
                                    i69 = 1;
                                } else {
                                    i73 = size4;
                                    i53 = i71;
                                    i74 = i72;
                                    if (i74 > 0) {
                                        i70 = ye2Var.P0 + iU4 + i70;
                                    }
                                    we2Var5.a(m31Var11);
                                    i68 = i74 + 1;
                                    i58 = i810;
                                    size4 = i73;
                                }
                                i70 = iU4;
                                we2Var5.a(m31Var11);
                                i68 = i74 + 1;
                                i58 = i810;
                                size4 = i73;
                            }
                            i19 = size4;
                        } else {
                            i19 = size4;
                            i54 = 0;
                            i55 = 0;
                            i56 = 0;
                            i57 = 0;
                            while (i54 < i52) {
                                i55++;
                                m31Var10 = m31VarArr8[i54];
                                iT4 = ye2Var.T(m31Var10, i8);
                                i59 = i53;
                                if (m31Var10.p0[1] == 3) {
                                    i56++;
                                }
                                int i811 = i56;
                                if (i57 != i8) {
                                }
                                if (!z6) {
                                    z6 = true;
                                }
                                if (z6) {
                                    i53 = i59;
                                    we2Var5 = new we2(ye2Var, i53, ye2Var.I, ye2Var.J, ye2Var.K, ye2Var.L, i8);
                                    we2Var5.n = i54;
                                    arrayList.add(we2Var5);
                                    i55 = 1;
                                } else {
                                    i53 = i59;
                                    if (i54 > 0) {
                                        i57 = ye2Var.Q0 + iT4 + i57;
                                    }
                                    we2Var5.a(m31Var10);
                                    i54++;
                                    i56 = i811;
                                }
                                i57 = iT4;
                                we2Var5.a(m31Var10);
                                i54++;
                                i56 = i811;
                            }
                            i58 = i56;
                        }
                        size2 = arrayList.size();
                        int i812 = ye2Var.w0;
                        int i813 = ye2Var.s0;
                        int i814 = ye2Var.x0;
                        int i815 = ye2Var.t0;
                        if (iArr3[0] != 2) {
                            z7 = true;
                        } else {
                            z7 = true;
                        }
                        if (i58 > 0) {
                            while (i67 < size2) {
                                we2Var7 = (we2) arrayList.get(i67);
                                if (i53 == 0) {
                                    we2Var7.e(i8 - we2Var7.d());
                                } else {
                                    we2Var7.e(i8 - we2Var7.c());
                                }
                            }
                        }
                        i61 = i812;
                        i62 = i813;
                        i63 = i814;
                        i64 = i815;
                        u21Var8 = u21Var;
                        u21Var9 = u21Var2;
                        u21Var10 = u21Var3;
                        u21Var11 = u21Var15;
                        iMax2 = 0;
                        i66 = 0;
                        while (i65 < size2) {
                            we2Var6 = (we2) arrayList.get(i65);
                            if (i53 == 0) {
                                if (i65 < size2 - 1) {
                                    u21Var10 = ((we2) arrayList.get(i65 + 1)).b.J;
                                    i64 = 0;
                                } else {
                                    i64 = ye2Var.t0;
                                    u21Var10 = u21Var3;
                                }
                                u21 u21Var110 = we2Var6.b.L;
                                we2Var6.f(i53, u21Var8, u21Var11, u21Var9, u21Var10, i61, i62, i63, i64, i8);
                                iMax2 = Math.max(iMax2, we2Var6.d());
                                iC2 = we2Var6.c() + i66;
                                if (i65 > 0) {
                                    iC2 += ye2Var.Q0;
                                }
                                i66 = iC2;
                                u21Var11 = u21Var110;
                                i62 = 0;
                            } else {
                                if (i65 < size2 - 1) {
                                    u21Var9 = ((we2) arrayList.get(i65 + 1)).b.I;
                                    i63 = 0;
                                } else {
                                    i63 = ye2Var.x0;
                                    u21Var9 = u21Var2;
                                }
                                u21 u21Var23 = we2Var6.b.K;
                                we2Var6.f(i53, u21Var8, u21Var11, u21Var9, u21Var10, i61, i62, i63, i64, i8);
                                iD2 = we2Var6.d() + iMax2;
                                int iMax5 = Math.max(i66, we2Var6.c());
                                if (i65 > 0) {
                                    iD2 += ye2Var.P0;
                                }
                                i66 = iMax5;
                                iMax2 = iD2;
                                u21Var8 = u21Var23;
                                i61 = 0;
                            }
                        }
                        iArr2[0] = iMax2;
                        iArr2[1] = i66;
                    }
                    c2 = c3;
                }
                c = 0;
                i22 = iArr2[c] + i3 + i10;
                i23 = iArr2[c2] + i14 + i18;
                if (mode != 1073741824) {
                    if (mode == Integer.MIN_VALUE) {
                        size3 = Math.min(i22, size3);
                    } else if (mode == 0) {
                        size3 = i22;
                    } else {
                        size3 = 0;
                    }
                }
                if (mode2 == 1073741824) {
                    iMin = i19;
                } else if (mode2 == Integer.MIN_VALUE) {
                    iMin = Math.min(i23, i19);
                } else if (mode2 == 0) {
                    iMin = i23;
                } else {
                    iMin = 0;
                }
                ye2Var.z0 = size3;
                ye2Var.A0 = iMin;
                ye2Var.O(size3);
                ye2Var.L(iMin);
                if (ye2Var.r0 > 0) {
                    z = c2;
                } else {
                    z = 0;
                }
                ye2Var.y0 = z;
            } else {
                i18 = i5;
                iArr2 = iArr;
                i19 = size4;
                i3 = i3;
                i10 = i10;
                i14 = i14;
                i24 = i15;
                m31VarArr4 = m31VarArr2;
                i25 = ye2Var.V0;
                if (i24 != 0) {
                    arrayList.clear();
                    we2Var2 = new we2(ye2Var, i25, ye2Var.I, ye2Var.J, ye2Var.K, ye2Var.L, i8);
                    arrayList.add(we2Var2);
                    if (i25 == 0) {
                        i37 = 0;
                        i27 = 0;
                        i38 = 0;
                        while (i37 < i24) {
                            m31Var2 = m31VarArr4[i37];
                            iU = ye2Var.U(m31Var2, i8);
                            if (m31Var2.p0[0] == 3) {
                                i27++;
                            }
                            int i816 = i27;
                            if (i38 != i8) {
                            }
                            if (!z4) {
                                z4 = true;
                            }
                            if (z4) {
                                we2Var2 = new we2(ye2Var, i25, ye2Var.I, ye2Var.J, ye2Var.K, ye2Var.L, i8);
                                we2Var2.n = i37;
                                arrayList.add(we2Var2);
                            } else {
                                if (i37 > 0) {
                                    i38 = ye2Var.P0 + iU + i38;
                                }
                                we2Var2.a(m31Var2);
                                i37++;
                                i27 = i816;
                            }
                            i38 = iU;
                            we2Var2.a(m31Var2);
                            i37++;
                            i27 = i816;
                        }
                    } else {
                        i26 = 0;
                        i27 = 0;
                        i28 = 0;
                        while (i26 < i24) {
                            m31Var = m31VarArr4[i26];
                            iT = ye2Var.T(m31Var, i8);
                            if (m31Var.p0[1] == 3) {
                                i27++;
                            }
                            int i817 = i27;
                            if (i28 != i8) {
                            }
                            if (!z2) {
                                z2 = true;
                            }
                            if (z2) {
                                we2Var2 = new we2(ye2Var, i25, ye2Var.I, ye2Var.J, ye2Var.K, ye2Var.L, i8);
                                we2Var2.n = i26;
                                arrayList.add(we2Var2);
                            } else {
                                if (i26 > 0) {
                                    i28 = ye2Var.Q0 + iT + i28;
                                }
                                we2Var2.a(m31Var);
                                i26++;
                                i27 = i817;
                            }
                            i28 = iT;
                            we2Var2.a(m31Var);
                            i26++;
                            i27 = i817;
                        }
                    }
                    size = arrayList.size();
                    int i818 = ye2Var.w0;
                    int i819 = ye2Var.s0;
                    int i92 = ye2Var.x0;
                    int i93 = ye2Var.t0;
                    if (iArr3[0] != 2) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (i27 > 0) {
                        while (i36 < size) {
                            we2Var4 = (we2) arrayList.get(i36);
                            if (i25 == 0) {
                                we2Var4.e(i8 - we2Var4.d());
                            } else {
                                we2Var4.e(i8 - we2Var4.c());
                            }
                        }
                    }
                    i30 = i818;
                    i31 = i819;
                    i32 = i92;
                    i33 = i93;
                    u21Var4 = u21Var;
                    u21Var5 = u21Var2;
                    u21Var6 = u21Var3;
                    u21Var7 = u21Var15;
                    iMax = 0;
                    i35 = 0;
                    while (i34 < size) {
                        we2Var3 = (we2) arrayList.get(i34);
                        if (i25 == 0) {
                            if (i34 < size - 1) {
                                u21Var6 = ((we2) arrayList.get(i34 + 1)).b.J;
                                i33 = 0;
                            } else {
                                i33 = ye2Var.t0;
                                u21Var6 = u21Var3;
                            }
                            u21 u21Var24 = we2Var3.b.L;
                            we2Var3.f(i25, u21Var4, u21Var7, u21Var5, u21Var6, i30, i31, i32, i33, i8);
                            iMax = Math.max(iMax, we2Var3.d());
                            iC = we2Var3.c() + i35;
                            if (i34 > 0) {
                                iC += ye2Var.Q0;
                            }
                            i35 = iC;
                            u21Var7 = u21Var24;
                            i31 = 0;
                        } else {
                            if (i34 < size - 1) {
                                u21Var5 = ((we2) arrayList.get(i34 + 1)).b.I;
                                i32 = 0;
                            } else {
                                i32 = ye2Var.x0;
                                u21Var5 = u21Var2;
                            }
                            u21 u21Var25 = we2Var3.b.K;
                            we2Var3.f(i25, u21Var4, u21Var7, u21Var5, u21Var6, i30, i31, i32, i33, i8);
                            iD = we2Var3.d() + iMax;
                            int iMax6 = Math.max(i35, we2Var3.c());
                            if (i34 > 0) {
                                iD += ye2Var.P0;
                            }
                            i35 = iMax6;
                            iMax = iD;
                            u21Var4 = u21Var25;
                            i30 = 0;
                        }
                    }
                    iArr2[0] = iMax;
                    iArr2[1] = i35;
                }
            }
            c2 = 1;
            c = 0;
            i22 = iArr2[c] + i3 + i10;
            i23 = iArr2[c2] + i14 + i18;
            if (mode != 1073741824) {
                if (mode == Integer.MIN_VALUE) {
                    size3 = Math.min(i22, size3);
                } else if (mode == 0) {
                    size3 = i22;
                } else {
                    size3 = 0;
                }
            }
            if (mode2 == 1073741824) {
                iMin = i19;
            } else if (mode2 == Integer.MIN_VALUE) {
                iMin = Math.min(i23, i19);
            } else if (mode2 == 0) {
                iMin = i23;
            } else {
                iMin = 0;
            }
            ye2Var.z0 = size3;
            ye2Var.A0 = iMin;
            ye2Var.O(size3);
            ye2Var.L(iMin);
            if (ye2Var.r0 > 0) {
                z = c2;
            } else {
                z = 0;
            }
            ye2Var.y0 = z;
        }
        setMeasuredDimension(ye2Var.z0, ye2Var.A0);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onMeasure(int i, int i2) {
        j(this.o0, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.o0.L0 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.o0.F0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.o0.M0 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.o0.G0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.o0.R0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.o0.J0 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.o0.P0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.o0.D0 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.o0.N0 = f;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.o0.H0 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.o0.O0 = f;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.o0.I0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.o0.U0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.o0.V0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        ye2 ye2Var = this.o0;
        ye2Var.s0 = i;
        ye2Var.t0 = i;
        ye2Var.u0 = i;
        ye2Var.v0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.o0.t0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.o0.w0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.o0.x0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.o0.s0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.o0.S0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.o0.K0 = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.o0.Q0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.o0.E0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.o0.T0 = i;
        requestLayout();
    }
}
