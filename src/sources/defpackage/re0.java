package defpackage;

import android.content.Context;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class re0 implements mg0 {
    public final s98 a;
    public final zf0 b;
    public final hg0 c;
    public final s16 d;
    public final yr2 e;
    public final Object f;
    public final LinkedHashSet g;

    public re0(s98 s98Var, zf0 zf0Var, hg0 hg0Var, s16 s16Var, yr2 yr2Var, Context context) {
        s98Var.getClass();
        zf0Var.getClass();
        hg0Var.getClass();
        s16Var.getClass();
        this.a = s98Var;
        this.b = zf0Var;
        this.c = hg0Var;
        this.d = s16Var;
        this.e = yr2Var;
        this.f = new Object();
        this.g = new LinkedHashSet();
    }

    /* JADX WARN: Code duplicated, block: B:57:0x011b  */
    /* JADX WARN: Code duplicated, block: B:58:0x0124  */
    /* JADX WARN: Code duplicated, block: B:60:0x0127  */
    /* JADX WARN: Code duplicated, block: B:63:0x0137  */
    /* JADX WARN: Code duplicated, block: B:65:0x0149  */
    /* JADX WARN: Code duplicated, block: B:66:0x014c  */
    /* JADX WARN: Code duplicated, block: B:71:0x015f  */
    /* JADX WARN: Code duplicated, block: B:72:0x016b  */
    /* JADX WARN: Code duplicated, block: B:74:0x016e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0178  */
    /* JADX WARN: Code duplicated, block: B:78:0x014f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x0131 A[SYNTHETIC] */
    public final Object a(hi0 hi0Var, s51 s51Var) {
        qe0 qe0Var;
        hi0 hi0Var2;
        wh0 wh0Var;
        SessionConfiguration sessionConfiguration;
        OutputConfiguration outputConfiguration;
        dg0 dg0Var;
        CaptureRequest.Builder builderA;
        Integer num;
        Object key;
        Object value;
        CaptureRequest.Key key2;
        hi0 hi0Var3 = hi0Var;
        if (s51Var instanceof qe0) {
            qe0Var = (qe0) s51Var;
            int i = qe0Var.k0;
            if ((i & Integer.MIN_VALUE) != 0) {
                qe0Var.k0 = i - Integer.MIN_VALUE;
            } else {
                qe0Var = new qe0(this, s51Var);
            }
        } else {
            qe0Var = new qe0(this, s51Var);
        }
        Object objA = qe0Var.i0;
        int i2 = qe0Var.k0;
        zf0 zf0Var = this.b;
        int i3 = 1;
        c71 c71Var = c71.X;
        if (i2 == 0) {
            w39.n0(objA);
            if (Build.VERSION.SDK_INT < 35) {
                return new o11(0);
            }
            String str = hi0Var3.a;
            qe0Var.f0 = hi0Var3;
            qe0Var.k0 = 1;
            objA = zf0Var.a(str, qe0Var);
            if (objA != c71Var) {
            }
            return c71Var;
        }
        if (i2 == 1) {
            hi0Var3 = qe0Var.f0;
            w39.n0(objA);
        } else {
            if (i2 != 2) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sessionConfiguration = (SessionConfiguration) qe0Var.h0;
            wh0Var = qe0Var.g0;
            hi0Var2 = qe0Var.f0;
            w39.n0(objA);
        }
        dg0Var = (dg0) objA;
        if (dg0Var != null) {
            builderA = ((cg0) dg0Var).a(hi0Var2.f);
        } else {
            builderA = null;
        }
        if (builderA != null) {
            for (Map.Entry entry : hi0Var2.g.entrySet()) {
                key = entry.getKey();
                value = entry.getValue();
                if (key instanceof CaptureRequest.Key) {
                    key2 = (CaptureRequest.Key) key;
                } else {
                    key2 = null;
                }
                if (key2 != null) {
                    builderA.set(key2, value);
                }
            }
            CaptureRequest captureRequestBuild = builderA.build();
            captureRequestBuild.getClass();
            en.Z(sessionConfiguration, captureRequestBuild);
        }
        if (wh0Var != null) {
            num = new Integer(wh0Var.a(sessionConfiguration).Y);
        } else {
            num = null;
        }
        return num != null ? new o11(num.intValue()) : new o11(0);
        wh0 wh0Var2 = (wh0) objA;
        int i4 = hi0Var3.h;
        String str2 = hi0Var3.a;
        if (i4 == 0) {
            i3 = 0;
        } else if (i4 != 1) {
            if (i4 == 2) {
                wl7.g0(i4);
                return new o11(0);
            }
            i3 = i4;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = hi0Var3.b.iterator();
        while (it.hasNext()) {
            for (ze5 ze5Var : ((el0) it.next()).a) {
                int i5 = ze5Var.b;
                String str3 = ze5Var.c;
                af afVarF = be.f(null, Integer.valueOf(i5), lh4.q0, ze5Var.d, ze5Var.e, ze5Var.f, ze5Var.h, ze5Var.a, false, 0, !(str3 == null ? false : str3.equals(str2)) ? str3 : null, 1536);
                if (afVarF != null && (outputConfiguration = (OutputConfiguration) afVarF.C0(yb6.a.b(OutputConfiguration.class))) != null) {
                    linkedHashSet.add(outputConfiguration);
                }
            }
        }
        SessionConfiguration sessionConfigurationB = mn.b(i3, wv0.Y0(linkedHashSet));
        qe0Var.f0 = hi0Var3;
        qe0Var.g0 = wh0Var2;
        qe0Var.h0 = sessionConfigurationB;
        qe0Var.k0 = 2;
        Object objB = zf0Var.b(str2, qe0Var);
        if (objB != c71Var) {
            hi0Var2 = hi0Var3;
            wh0Var = wh0Var2;
            objA = objB;
            sessionConfiguration = sessionConfigurationB;
            dg0Var = (dg0) objA;
            if (dg0Var != null) {
                builderA = ((cg0) dg0Var).a(hi0Var2.f);
            } else {
                builderA = null;
            }
            if (builderA != null) {
                while (r3.hasNext()) {
                    key = entry.getKey();
                    value = entry.getValue();
                    if (key instanceof CaptureRequest.Key) {
                        key2 = (CaptureRequest.Key) key;
                    } else {
                        key2 = null;
                    }
                    if (key2 != null) {
                        builderA.set(key2, value);
                    }
                }
                CaptureRequest captureRequestBuild2 = builderA.build();
                captureRequestBuild2.getClass();
                en.Z(sessionConfiguration, captureRequestBuild2);
            }
            if (wh0Var != null) {
                num = new Integer(wh0Var.a(sessionConfiguration).Y);
            } else {
                num = null;
            }
            if (num != null) {
            }
        }
        return c71Var;
    }
}
