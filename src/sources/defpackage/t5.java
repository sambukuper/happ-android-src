package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.Toolbar;
import java.util.Collection;
import java.util.Iterator;
import su.happ.proxyutility.ui.foundation.component.HappForwardField;
import su.happ.proxyutility.ui.foundation.component.HappInfoField;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class t5 implements ov8 {
    public final Object X;
    public final Object Y;
    public final Object Z;
    public final Object f0;
    public final Object g0;
    public final Object h0;
    public final Object i0;
    public final Object j0;
    public final Object k0;
    public final Object l0;
    public final Object m0;
    public final Object n0;
    public final Object o0;

    public t5(l91 l91Var, n91 n91Var, jq8 jq8Var) {
        this.X = jq8Var;
        this.Y = rs1.a(new o91(l91Var, n91Var, this, 1));
        this.Z = rs1.a(new o91(l91Var, n91Var, this, 2));
        this.f0 = rs1.a(new o91(l91Var, n91Var, this, 7));
        this.g0 = rs1.a(new o91(l91Var, n91Var, this, 8));
        this.h0 = rs1.a(new o91(l91Var, n91Var, this, 6));
        this.i0 = rs1.a(new o91(l91Var, n91Var, this, 9));
        this.j0 = rs1.a(new o91(l91Var, n91Var, this, 5));
        this.k0 = rs1.a(new o91(l91Var, n91Var, this, 11));
        this.l0 = rs1.a(new o91(l91Var, n91Var, this, 10));
        this.m0 = rs1.a(new o91(l91Var, n91Var, this, 4));
        this.n0 = rs1.a(new o91(l91Var, n91Var, this, 3));
        this.o0 = rs1.a(new o91(l91Var, n91Var, this, 0));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public Object a(f15 f15Var, ja jaVar, s51 s51Var) {
        ca caVar;
        gn2 gn2Var = (gn2) this.f0;
        nh5 nh5Var = (nh5) this.k0;
        if (s51Var instanceof ca) {
            caVar = (ca) s51Var;
            int i = caVar.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                caVar.h0 = i - Integer.MIN_VALUE;
            } else {
                caVar = new ca(this, s51Var);
            }
        } else {
            caVar = new ca(this, s51Var);
        }
        Object obj = caVar.f0;
        int i2 = caVar.h0;
        try {
            if (i2 == 0) {
                w39.n0(obj);
                lg3 lg3Var = (lg3) this.g0;
                q51 q51Var = null;
                da daVar = new da(this, jaVar, q51Var, (byte) 0);
                caVar.h0 = 1;
                lg3Var.getClass();
                Object objN = gv3.n(new kg3(f15Var, lg3Var, daVar, q51Var, (byte) 0), caVar);
                c71 c71Var = c71.X;
                if (objN == c71Var) {
                    return c71Var;
                }
            } else {
                if (i2 != 1) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w39.n0(obj);
            }
            Object objA = d().a(nh5Var.l());
            if (objA != null && Math.abs(nh5Var.l() - d().d(objA)) <= 0.5f && ((Boolean) gn2Var.B(objA)).booleanValue()) {
                g(objA);
            }
            return dn8.a;
        } catch (Throwable th) {
            Object objA2 = d().a(nh5Var.l());
            if (objA2 == null || Math.abs(nh5Var.l() - d().d(objA2)) > 0.5f || !((Boolean) gn2Var.B(objA2)).booleanValue()) {
                throw th;
            }
            g(objA2);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0027  */
    public Object b(Object obj, f15 f15Var, tn2 tn2Var, s51 s51Var) {
        ea eaVar;
        q51 q51Var;
        rh5 rh5Var = (rh5) this.m0;
        gn2 gn2Var = (gn2) this.f0;
        nh5 nh5Var = (nh5) this.k0;
        if (s51Var instanceof ea) {
            eaVar = (ea) s51Var;
            int i = eaVar.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                eaVar.h0 = i - Integer.MIN_VALUE;
            } else {
                eaVar = new ea(this, s51Var);
            }
        } else {
            eaVar = new ea(this, s51Var);
        }
        ea eaVar2 = eaVar;
        Object obj2 = eaVar2.f0;
        int i2 = eaVar2.h0;
        q51 q51Var2 = null;
        try {
            if (i2 == 0) {
                w39.n0(obj2);
                if (d().a.containsKey(obj)) {
                    lg3 lg3Var = (lg3) this.g0;
                    q51Var = null;
                    try {
                        ga gaVar = new ga(this, obj, tn2Var, q51Var, (byte) 0);
                        eaVar2.h0 = 1;
                        lg3Var.getClass();
                        q51Var = null;
                        Object objN = gv3.n(new kg3(f15Var, lg3Var, gaVar, q51Var2, (byte) 0), eaVar2);
                        c71 c71Var = c71.X;
                        if (objN == c71Var) {
                            return c71Var;
                        }
                    } catch (Throwable th) {
                        th = th;
                        rh5Var.setValue(q51Var);
                        Object objA = d().a(nh5Var.l());
                        if (objA != null && Math.abs(nh5Var.l() - d().d(objA)) <= 0.5f && ((Boolean) gn2Var.B(objA)).booleanValue()) {
                            g(objA);
                        }
                        throw th;
                    }
                } else {
                    g(obj);
                }
                return dn8.a;
            }
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(obj2);
            q51Var = null;
            rh5Var.setValue(q51Var);
            Object objA2 = d().a(nh5Var.l());
            if (objA2 != null && Math.abs(nh5Var.l() - d().d(objA2)) <= 0.5f && ((Boolean) gn2Var.B(objA2)).booleanValue()) {
                g(objA2);
            }
            return dn8.a;
        } catch (Throwable th2) {
            th = th2;
            q51Var = null;
        }
    }

    public Object c(float f, float f2, Object obj) {
        xo xoVar = (xo) this.X;
        lp4 lp4VarD = d();
        float fD = lp4VarD.d(obj);
        float fFloatValue = ((Number) ((dn2) this.Y).invoke()).floatValue();
        if (fD != f && !Float.isNaN(fD)) {
            if (fD < f) {
                if (f2 >= fFloatValue) {
                    Object objB = lp4VarD.b(f, true);
                    objB.getClass();
                    return objB;
                }
                Object objB2 = lp4VarD.b(f, true);
                objB2.getClass();
                if (f >= Math.abs(Math.abs(((Number) xoVar.B(Float.valueOf(Math.abs(lp4VarD.d(objB2) - fD)))).floatValue()) + fD)) {
                    return objB2;
                }
            } else {
                if (f2 <= (-fFloatValue)) {
                    Object objB3 = lp4VarD.b(f, false);
                    objB3.getClass();
                    return objB3;
                }
                Object objB4 = lp4VarD.b(f, false);
                objB4.getClass();
                float fAbs = Math.abs(fD - Math.abs(((Number) xoVar.B(Float.valueOf(Math.abs(fD - lp4VarD.d(objB4))))).floatValue()));
                if (f >= 0.0f ? f <= fAbs : Math.abs(f) >= fAbs) {
                    return objB4;
                }
            }
        }
        return obj;
    }

    public lp4 d() {
        return (lp4) ((rh5) this.n0).getValue();
    }

    public float e(float f) {
        Float fValueOf;
        nh5 nh5Var = (nh5) this.k0;
        float fL = (Float.isNaN(nh5Var.l()) ? 0.0f : nh5Var.l()) + f;
        float fC = d().c();
        Collection collectionValues = d().a.values();
        collectionValues.getClass();
        Iterator it = collectionValues.iterator();
        if (it.hasNext()) {
            float fFloatValue = ((Number) it.next()).floatValue();
            while (it.hasNext()) {
                fFloatValue = Math.max(fFloatValue, ((Number) it.next()).floatValue());
            }
            fValueOf = Float.valueOf(fFloatValue);
        } else {
            fValueOf = null;
        }
        return x97.m(fL, fC, fValueOf != null ? fValueOf.floatValue() : Float.NaN);
    }

    public float f() {
        nh5 nh5Var = (nh5) this.k0;
        if (!Float.isNaN(nh5Var.l())) {
            return nh5Var.l();
        }
        bt.i("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        return 0.0f;
    }

    public void g(Object obj) {
        ((rh5) this.i0).setValue(obj);
    }

    @Override // defpackage.ov8
    public View getRoot() {
        return (LinearLayout) this.X;
    }

    public t5(LinearLayout linearLayout, HappForwardField happForwardField, HappForwardField happForwardField2, HappForwardField happForwardField3, HappInfoField happInfoField, HappInfoField happInfoField2, HappInfoField happInfoField3, HappInfoField happInfoField4, HappInfoField happInfoField5, HappInfoField happInfoField6, HappInfoField happInfoField7, ScrollView scrollView, Toolbar toolbar) {
        this.X = linearLayout;
        this.Y = happForwardField;
        this.Z = happForwardField2;
        this.f0 = happForwardField3;
        this.g0 = happInfoField;
        this.h0 = happInfoField2;
        this.i0 = happInfoField3;
        this.j0 = happInfoField4;
        this.k0 = happInfoField5;
        this.l0 = happInfoField6;
        this.m0 = happInfoField7;
        this.n0 = scrollView;
        this.o0 = toolbar;
    }

    public t5(p87 p87Var, xo xoVar, dn2 dn2Var, hr5 hr5Var, gn2 gn2Var) {
        this.X = xoVar;
        this.Y = dn2Var;
        this.Z = hr5Var;
        this.f0 = gn2Var;
        this.g0 = new lg3();
        this.h0 = new dq(this);
        this.i0 = z51.H(p87Var);
        this.j0 = rd7.b(new aa(this, (byte) 0));
        rd7.b(new aa(this, (byte) 1));
        this.k0 = new nh5(Float.NaN);
        new rv(0);
        new yi1(kd7.h().g());
        this.l0 = new nh5(0.0f);
        this.m0 = z51.H(null);
        this.n0 = z51.H(new lp4(e02.X));
        this.o0 = new ha(this);
    }
}
