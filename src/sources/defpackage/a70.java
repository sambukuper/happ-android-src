package defpackage;

import android.text.Layout;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a70 implements gn2 {
    public final /* synthetic */ byte X = 1;
    public final /* synthetic */ long Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Serializable f0;
    public final /* synthetic */ Object g0;

    public /* synthetic */ a70(long j, float[] fArr, ca6 ca6Var, ba6 ba6Var) {
        this.Y = j;
        this.Z = fArr;
        this.f0 = ca6Var;
        this.g0 = ba6Var;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        long j;
        dn8 dn8Var;
        float[] fArr;
        int i;
        float fA;
        float fA2;
        byte b = this.X;
        dn8 dn8Var2 = dn8.a;
        Object obj2 = this.g0;
        Serializable serializable = this.f0;
        Object obj3 = this.Z;
        switch (b) {
            case 0:
                s86 s86Var = (s86) obj3;
                ea6 ea6Var = (ea6) serializable;
                long j2 = this.Y;
                g60 g60Var = (g60) obj2;
                p34 p34Var = (p34) obj;
                p34Var.a();
                float f = s86Var.a;
                float f2 = s86Var.b;
                um0 um0Var = p34Var.X;
                ((wl6) um0Var.Y.Y).V(f, f2);
                try {
                    sv1.D(p34Var, (je) ea6Var.X, j2, 0L, 0.0f, g60Var, 0, 890);
                    return dn8Var2;
                } finally {
                    ((wl6) um0Var.Y.Y).V(-f, -f2);
                }
            default:
                float[] fArr2 = (float[]) obj3;
                ca6 ca6Var = (ca6) serializable;
                ba6 ba6Var = (ba6) obj2;
                tg5 tg5Var = (tg5) obj;
                int i2 = tg5Var.b;
                ff ffVar = tg5Var.a;
                int iC = tg5Var.c;
                long j3 = this.Y;
                int iD = i2 > f88.d(j3) ? tg5Var.b : f88.d(j3);
                if (iC >= f88.c(j3)) {
                    iC = f88.c(j3);
                }
                long jC = ct7.c(tg5Var.d(iD), tg5Var.d(iC));
                int i3 = ca6Var.X;
                v78 v78Var = ffVar.d;
                int iD2 = f88.d(jC);
                int iC2 = f88.c(jC);
                Layout layout = v78Var.f;
                int length = layout.getText().length();
                if (iD2 < 0) {
                    xc3.a("startOffset must be > 0");
                }
                if (iD2 >= length) {
                    xc3.a("startOffset must be less than text length");
                }
                if (iC2 <= iD2) {
                    xc3.a("endOffset must be greater than startOffset");
                }
                if (iC2 > length) {
                    xc3.a("endOffset must be smaller or equal to text length");
                }
                if (fArr2.length - i3 < (iC2 - iD2) * 4) {
                    xc3.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int iF = v78Var.f(iD2);
                int iF2 = v78Var.f(iC2 - 1);
                u03 u03Var = new u03(v78Var);
                if (iF <= iF2) {
                    while (true) {
                        int lineStart = layout.getLineStart(iF);
                        j = jC;
                        int iE = v78Var.e(iF);
                        int iMax = Math.max(iD2, lineStart);
                        int iMin = Math.min(iC2, iE);
                        float fH = v78Var.h(iF);
                        float fD = v78Var.d(iF);
                        dn8Var = dn8Var2;
                        fArr = fArr2;
                        boolean z = false;
                        boolean z2 = layout.getParagraphDirection(iF) == 1;
                        int i4 = i3;
                        int i5 = iMax;
                        while (i5 < iMin) {
                            boolean zIsRtlCharAt = layout.isRtlCharAt(i5);
                            if (!z2 || zIsRtlCharAt) {
                                if (z2 && zIsRtlCharAt) {
                                    z = false;
                                    float fA3 = u03Var.a(i5, false, false, false);
                                    i = iMin;
                                    fA = u03Var.a(i5 + 1, true, true, false);
                                    fA2 = fA3;
                                } else {
                                    i = iMin;
                                    z = false;
                                    if (z2 || !zIsRtlCharAt) {
                                        fA = u03Var.a(i5, false, false, false);
                                        fA2 = u03Var.a(i5 + 1, true, true, false);
                                    } else {
                                        fA2 = u03Var.a(i5, false, false, true);
                                        fA = u03Var.a(i5 + 1, true, true, true);
                                    }
                                }
                                fArr[i4] = fA;
                                fArr[i4 + 1] = fH;
                                fArr[i4 + 2] = fA2;
                                fArr[i4 + 3] = fD;
                                i4 += 4;
                                i5++;
                                iMin = i;
                            } else {
                                fA = u03Var.a(i5, z, z, true);
                                i = iMin;
                                fA2 = u03Var.a(i5 + 1, true, true, true);
                            }
                            z = false;
                            fArr[i4] = fA;
                            fArr[i4 + 1] = fH;
                            fArr[i4 + 2] = fA2;
                            fArr[i4 + 3] = fD;
                            i4 += 4;
                            i5++;
                            iMin = i;
                        }
                        if (iF != iF2) {
                            iF++;
                            jC = j;
                            i3 = i4;
                            dn8Var2 = dn8Var;
                            fArr2 = fArr;
                        }
                    }
                } else {
                    j = jC;
                    dn8Var = dn8Var2;
                    fArr = fArr2;
                }
                int iC3 = ((f88.c(j) - f88.d(j)) * 4) + ca6Var.X;
                for (int i6 = ca6Var.X; i6 < iC3; i6 += 4) {
                    int i7 = i6 + 1;
                    float f3 = fArr[i7];
                    float f4 = ba6Var.X;
                    fArr[i7] = f3 + f4;
                    int i8 = i6 + 3;
                    fArr[i8] = fArr[i8] + f4;
                }
                ca6Var.X = iC3;
                ba6Var.X += ffVar.f;
                return dn8Var;
        }
    }

    public /* synthetic */ a70(s86 s86Var, ea6 ea6Var, long j, g60 g60Var) {
        this.Z = s86Var;
        this.f0 = ea6Var;
        this.Y = j;
        this.g0 = g60Var;
    }
}
