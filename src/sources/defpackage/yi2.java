package defpackage;

import su.happ.proxyutility.dto.MetaParams;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yi2 {
    public static final float[] a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static volatile ue7 b = new ue7(0);
    public static final Object[] c;

    static {
        Object[] objArr = new Object[0];
        c = objArr;
        synchronized (objArr) {
            b.d(115, new zi2(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            b.d(130, new zi2(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            b.d(150, new zi2(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            b.d(180, new zi2(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            b.d(MetaParams.MAX_LENGTH_VISIBLE_ANNOUNCE, new zi2(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((b.c(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        yc3.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static xi2 a(float f) {
        float fC;
        xi2 zi2Var;
        float[] fArr = a;
        if (f < 1.03f) {
            return null;
        }
        ue7 ue7Var = b;
        int i = (int) (f * 100.0f);
        ue7Var.getClass();
        xi2 xi2Var = (xi2) x97.t(ue7Var, i);
        if (xi2Var != null) {
            return xi2Var;
        }
        ue7 ue7Var2 = b;
        int iK = w45.k(ue7Var2.Z, i, ue7Var2.X);
        if (iK >= 0) {
            return (xi2) b.e(iK);
        }
        int i2 = -(iK + 1);
        int i3 = i2 - 1;
        if (i2 >= b.Z) {
            zi2 zi2Var2 = new zi2(new float[]{1.0f}, new float[]{f});
            b(f, zi2Var2);
            return zi2Var2;
        }
        if (i3 < 0) {
            zi2Var = new zi2(fArr, fArr);
            fC = 1.0f;
        } else {
            fC = b.c(i3) / 100.0f;
            zi2Var = (xi2) b.e(i3);
        }
        float fC2 = b.c(i2) / 100.0f;
        float fMax = (Math.max(0.0f, Math.min(1.0f, fC == fC2 ? 0.0f : (f - fC) / (fC2 - fC))) * 1.0f) + 0.0f;
        xi2 xi2Var2 = (xi2) b.e(i2);
        float[] fArr2 = new float[9];
        for (int i4 = 0; i4 < 9; i4++) {
            float f2 = fArr[i4];
            float fB = zi2Var.b(f2);
            fArr2[i4] = ((xi2Var2.b(f2) - fB) * fMax) + fB;
        }
        zi2 zi2Var3 = new zi2(fArr, fArr2);
        b(f, zi2Var3);
        return zi2Var3;
    }

    public static void b(float f, zi2 zi2Var) {
        synchronized (c) {
            ue7 ue7VarB = b.clone();
            ue7VarB.d((int) (f * 100.0f), zi2Var);
            b = ue7VarB;
        }
    }
}
