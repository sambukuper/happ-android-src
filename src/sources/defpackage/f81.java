package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class f81 {
    public final kd8 a;
    public final y78 b;
    public final mj0 c;
    public final b71 d;
    public og7 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public final CursorAnchorInfo.Builder j = new CursorAnchorInfo.Builder();
    public final float[] k = or4.a();
    public final Matrix l = new Matrix();

    public f81(kd8 kd8Var, y78 y78Var, mj0 mj0Var, b71 b71Var) {
        this.a = kd8Var;
        this.b = y78Var;
        this.c = mj0Var;
        this.d = b71Var;
    }

    public final CursorAnchorInfo a() {
        y24 y24Var;
        y24 y24VarB;
        x78 x78VarC;
        y78 y78Var = this.b;
        y24 y24VarE = y78Var.e();
        if (y24VarE != null) {
            if (!y24VarE.g()) {
                y24VarE = null;
            }
            if (y24VarE != null && (y24Var = (y24) y78Var.d.getValue()) != null) {
                if (!y24Var.g()) {
                    y24Var = null;
                }
                if (y24Var != null && (y24VarB = y78Var.b()) != null) {
                    if (!y24VarB.g()) {
                        y24VarB = null;
                    }
                    if (y24VarB != null && (x78VarC = y78Var.c()) != null) {
                        h48 h48VarD = this.a.d();
                        float[] fArr = this.k;
                        or4.d(fArr);
                        y24VarE.h(fArr);
                        Matrix matrix = this.l;
                        nr4.R(matrix, fArr);
                        s86 s86VarK = zc1.o0(y24Var).k(y24VarE.C(y24Var, 0L));
                        s86 s86VarK2 = zc1.o0(y24VarB).k(y24VarE.C(y24VarB, 0L));
                        long j = h48VarD.f0;
                        f88 f88Var = h48VarD.g0;
                        boolean z = this.f;
                        boolean z2 = this.g;
                        boolean z3 = this.h;
                        boolean z4 = this.i;
                        CursorAnchorInfo.Builder builder = this.j;
                        builder.reset();
                        builder.setMatrix(matrix);
                        int iD = f88.d(j);
                        builder.setSelectionRange(iD, f88.c(j));
                        lf6 lf6Var = lf6.Y;
                        if (z && iD >= 0) {
                            s86 s86VarC = x78VarC.c(iD);
                            float fM = x97.m(s86VarC.a, 0.0f, (int) (x78VarC.c >> 32));
                            boolean zI = oc.i(s86VarK, fM, s86VarC.b);
                            boolean zI2 = oc.i(s86VarK, fM, s86VarC.d);
                            boolean z5 = x78VarC.a(iD) == lf6Var;
                            int i = (zI || zI2) ? 1 : 0;
                            if (!zI || !zI2) {
                                i |= 2;
                            }
                            if (z5) {
                                i |= 4;
                            }
                            int i2 = i;
                            float f = s86VarC.b;
                            float f2 = s86VarC.d;
                            builder.setInsertionMarkerLocation(fM, f, f2, f2, i2);
                        }
                        if (z2) {
                            int iD2 = f88Var != null ? f88.d(f88Var.a) : -1;
                            int iC = f88Var != null ? f88.c(f88Var.a) : -1;
                            if (iD2 >= 0 && iD2 < iC) {
                                builder.setComposingText(iD2, h48VarD.Z.subSequence(iD2, iC));
                                float[] fArr2 = new float[(iC - iD2) * 4];
                                bz4 bz4Var = x78VarC.b;
                                long jC = ct7.c(iD2, iC);
                                bz4Var.j(f88.d(jC));
                                bz4Var.k(f88.c(jC));
                                ca6 ca6Var = new ca6();
                                ca6Var.X = 0;
                                oc.s(bz4Var.h, jC, new a70(jC, fArr2, ca6Var, new ba6()));
                                int i3 = iD2;
                                while (i3 < iC) {
                                    int i4 = (i3 - iD2) * 4;
                                    float f3 = fArr2[i4];
                                    float f4 = fArr2[i4 + 1];
                                    float f5 = fArr2[i4 + 2];
                                    float f6 = fArr2[i4 + 3];
                                    int i5 = iC;
                                    int i6 = (f3 < s86VarK.c ? 1 : 0) & (s86VarK.a < f5 ? 1 : 0) & (s86VarK.b < f6 ? 1 : 0) & (f4 < s86VarK.d ? 1 : 0);
                                    if (!oc.i(s86VarK, f3, f4) || !oc.i(s86VarK, f5, f6)) {
                                        i6 |= 2;
                                    }
                                    if (x78VarC.a(i3) == lf6Var) {
                                        i6 |= 4;
                                    }
                                    builder.addCharacterBounds(i3, f3, f4, f5, f6, i6);
                                    i3++;
                                    iC = i5;
                                }
                            }
                        }
                        int i7 = Build.VERSION.SDK_INT;
                        if (i7 >= 33 && z3) {
                            c4.C(builder, s86VarK2);
                        }
                        if (i7 >= 34 && z4) {
                            u3.a(builder, x78VarC, s86VarK);
                        }
                        return builder.build();
                    }
                }
            }
        }
        return null;
    }
}
