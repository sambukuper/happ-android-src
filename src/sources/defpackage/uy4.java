package defpackage;

import android.os.Build;
import android.view.ViewConfiguration;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class uy4 extends w55 {
    public final yr2 f;
    public final x90 g;
    public og7 h;

    public uy4(sy6 sy6Var, yr2 yr2Var, yy0 yy0Var, fi1 fi1Var) {
        super(sy6Var, yy0Var, fi1Var);
        this.f = yr2Var;
        this.g = gv3.b(Integer.MAX_VALUE, null, null, 6);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object e(uy4 uy4Var, ea6 ea6Var, ba6 ba6Var, sy6 sy6Var, ea6 ea6Var2, long j, s51 s51Var) {
        ty4 ty4Var;
        ba6 ba6Var2;
        sy6 sy6Var2;
        ea6 ea6Var3;
        boolean z;
        if (s51Var instanceof ty4) {
            ty4Var = (ty4) s51Var;
            int i = ty4Var.l0;
            if ((i & Integer.MIN_VALUE) != 0) {
                ty4Var.l0 = i - Integer.MIN_VALUE;
            } else {
                ty4Var = new ty4(s51Var);
            }
        } else {
            ty4Var = new ty4(s51Var);
        }
        Object objX = ty4Var.k0;
        int i2 = ty4Var.l0;
        q51 q51Var = null;
        if (i2 == 0) {
            w39.n0(objX);
            if (j < 0) {
                return Boolean.FALSE;
            }
            r5 r5Var = new r5((Object) uy4Var, q51Var, (byte) 23);
            ty4Var.f0 = uy4Var;
            ty4Var.g0 = ea6Var;
            ty4Var.h0 = ba6Var;
            ty4Var.i0 = sy6Var;
            ty4Var.j0 = ea6Var2;
            ty4Var.l0 = 1;
            objX = a28.x(j, r5Var, ty4Var);
            c71 c71Var = c71.X;
            if (objX == c71Var) {
                return c71Var;
            }
            ba6Var2 = ba6Var;
            sy6Var2 = sy6Var;
            ea6Var3 = ea6Var2;
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ea6 ea6Var4 = ty4Var.j0;
            sy6 sy6Var3 = ty4Var.i0;
            ba6Var2 = ty4Var.h0;
            ea6 ea6Var5 = ty4Var.g0;
            uy4 uy4Var2 = ty4Var.f0;
            w39.n0(objX);
            ea6Var3 = ea6Var4;
            sy6Var2 = sy6Var3;
            ea6Var = ea6Var5;
            uy4Var = uy4Var2;
        }
        qy4 qy4Var = (qy4) objX;
        if (qy4Var != null) {
            boolean z2 = ((qy4) ea6Var.X).c;
            long j2 = qy4Var.a;
            ea6Var.X = new qy4(j2, qy4Var.b, z2);
            ba6Var2.X = sy6Var2.j(sy6Var2.f(j2));
            ea6Var3.X = z68.b(0.0f, 0.0f, 30);
            mj0 mj0Var = uy4Var.e;
            long j3 = qy4Var.b;
            long j4 = qy4Var.a;
            ((vu8) mj0Var.Y).a(Float.intBitsToFloat((int) (j4 >> 32)), j3);
            ((vu8) mj0Var.Z).a(Float.intBitsToFloat((int) (j4 & 4294967295L)), j3);
            z = !w79.G(ba6Var2.X);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static qy4 g(x90 x90Var) {
        qy4 qy4Var = null;
        v27 v27VarP = jm4.P(new d(new py4(x90Var, (byte) 0), null));
        while (v27VarP.hasNext()) {
            qy4 qy4VarA = (qy4) v27VarP.next();
            if (qy4Var != null) {
                qy4VarA = qy4Var.a(qy4VarA);
            }
            qy4Var = qy4VarA;
        }
        return qy4Var;
    }

    public final float c(ry6 ry6Var, float f) {
        sy6 sy6Var = this.a;
        long jI = sy6Var.i(sy6Var.e(f));
        sy6 sy6Var2 = ry6Var.a;
        return sy6Var.h(sy6Var.f(sy6Var2.d(sy6Var2.k, jI, 1)));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object d(sy6 sy6Var, qy4 qy4Var, float f, float f2, s51 s51Var) {
        ry4 ry4Var;
        dn8 dn8Var;
        ea6 ea6Var;
        Object obj;
        ba6 ba6Var;
        float f3;
        sy6 sy6Var2;
        if (s51Var instanceof ry4) {
            ry4Var = (ry4) s51Var;
            int i = ry4Var.k0;
            if ((i & Integer.MIN_VALUE) != 0) {
                ry4Var.k0 = i - Integer.MIN_VALUE;
            } else {
                ry4Var = new ry4(this, s51Var);
            }
        } else {
            ry4Var = new ry4(this, s51Var);
        }
        ry4 ry4Var2 = ry4Var;
        Object obj2 = ry4Var2.i0;
        int i2 = ry4Var2.k0;
        mj0 mj0Var = this.e;
        dn8 dn8Var2 = dn8.a;
        Object obj3 = c71.X;
        if (i2 == 0) {
            w39.n0(obj2);
            ea6 ea6Var2 = new ea6();
            ea6Var2.X = qy4Var;
            dn8Var = dn8Var2;
            long j = qy4Var.b;
            long j2 = qy4Var.a;
            ((vu8) mj0Var.Y).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
            ((vu8) mj0Var.Z).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
            qy4 qy4VarG = g(this.g);
            if (qy4VarG != null) {
                long j3 = qy4VarG.b;
                long j4 = qy4VarG.a;
                ((vu8) mj0Var.Y).a(Float.intBitsToFloat((int) (j4 >> 32)), j3);
                ((vu8) mj0Var.Z).a(Float.intBitsToFloat((int) (j4 & 4294967295L)), j3);
                ea6Var = ea6Var2;
                ea6Var.X = ((qy4) ea6Var.X).a(qy4VarG);
            } else {
                ea6Var = ea6Var2;
            }
            ba6 ba6Var2 = new ba6();
            float fH = sy6Var.h(sy6Var.f(((qy4) ea6Var.X).a));
            ba6Var2.X = fH;
            if (!w79.G(fH)) {
                ea6 ea6Var3 = new ea6();
                ea6Var3.X = z68.b(0.0f, 0.0f, 30);
                obj = obj3;
                rn2 sy4Var = new sy4(ba6Var2, ea6Var3, ea6Var, f, this, f2, sy6Var, null);
                ry4Var2.f0 = sy6Var;
                ry4Var2.g0 = ba6Var2;
                ry4Var2.h0 = f2;
                ry4Var2.k0 = 1;
                if (b(sy4Var, ry4Var2) != obj) {
                    ba6Var = ba6Var2;
                    f3 = f2;
                    sy6Var2 = sy6Var;
                }
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                w39.n0(obj2);
                return dn8Var2;
            }
            bt.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        f3 = ry4Var2.h0;
        ba6Var = ry4Var2.g0;
        sy6Var2 = ry4Var2.f0;
        w39.n0(obj2);
        obj = obj3;
        dn8Var = dn8Var2;
        long jA = a38.a(((vu8) mj0Var.Y).c(Float.MAX_VALUE), ((vu8) mj0Var.Z).c(Float.MAX_VALUE));
        if (jA == 0) {
            float fE = sy6Var2.e(Math.signum(ba6Var.X)) * Math.min(Math.abs(ba6Var.X) / 100.0f, f3) * 1000.0f;
            if (fE == 0.0f) {
                jA = 0;
            } else {
                jA = sy6Var2.d == sd5.Y ? a38.a(fE, 0.0f) : a38.a(0.0f, fE);
            }
        }
        tu8 tu8Var = new tu8(jA);
        ry4Var2.f0 = null;
        ry4Var2.g0 = null;
        ry4Var2.k0 = 2;
        return this.b.K(tu8Var, ry4Var2) == obj ? obj : dn8Var;
    }

    public final boolean f(aq5 aq5Var) {
        long j;
        fi1 fi1Var = this.c;
        ViewConfiguration viewConfiguration = (ViewConfiguration) this.f.Y;
        int i = Build.VERSION.SDK_INT;
        float f = -(i > 26 ? gw8.d(viewConfiguration) : fi1Var.h0(64.0f));
        float f2 = -(i > 26 ? gw8.a(viewConfiguration) : fi1Var.h0(64.0f));
        List list = aq5Var.a;
        z85 z85Var = new z85(0L);
        int size = list.size();
        boolean zM = false;
        int i2 = 0;
        while (true) {
            j = z85Var.a;
            if (i2 >= size) {
                break;
            }
            z85Var = new z85(z85.f(j, ((hq5) list.get(i2)).j));
            i2++;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) * f2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) * f)) & 4294967295L);
        sy6 sy6Var = this.a;
        float fJ = sy6Var.j(sy6Var.f(jFloatToRawIntBits));
        if (fJ != 0.0f) {
            ny6 ny6Var = sy6Var.a;
            zM = fJ > 0.0f ? ny6Var.m() : ny6Var.j();
        }
        if (zM) {
            return !(this.g.b(new qy4(jFloatToRawIntBits, ((hq5) wv0.r0(aq5Var.a)).b, false)) instanceof tp0);
        }
        return this.d;
    }
}
