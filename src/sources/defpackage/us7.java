package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.os.UserManager;
import android.text.Layout;
import android.view.View;
import androidx.compose.foundation.layout.b;
import java.text.Bidi;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public abstract class us7 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(is7 is7Var, gn2 gn2Var, kx4 kx4Var, lp2 lp2Var, int i) {
        int i2;
        is7Var.getClass();
        gn2Var.getClass();
        lp2Var.X(-2121754941);
        if ((i & 6) == 0) {
            i2 = (lp2Var.f(is7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= lp2Var.h(gn2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= lp2Var.f(kx4Var) ? 256 : 128;
        }
        int i3 = i2;
        if (lp2Var.N(i3 & 1, (i3 & 147) != 146)) {
            ci8.a(kx4Var, vj8.j0(y46.sub_properties_auto_update_title, lp2Var), jm4.U(-274165937, new zv2(is7Var, gn2Var, b.a, z68.A0(String.valueOf(is7Var.c), lp2Var, 2), z68.A0(String.valueOf(is7Var.d), lp2Var, 2), (byte) 3), lp2Var), lp2Var, ((i3 >> 6) & 14) | 384, 0);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new g8(is7Var, gn2Var, kx4Var, i, (byte) 18);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final d94 b(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(v36.view_tree_lifecycle_owner);
            d94 d94Var = tag instanceof d94 ? (d94) tag : null;
            if (d94Var != null) {
                return d94Var;
            }
            Object objD = ts7.d(view);
            view = objD instanceof View ? (View) objD : null;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final float c(int i, int i2, float[] fArr) {
        return fArr[((i - i2) * 2) + 1];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:144:0x025e A[EDGE_INSN: B:144:0x025e->B:171:0x02ba BREAK  A[LOOP:5: B:154:0x027a->B:206:0x027a]] */
    /* JADX WARN: Code duplicated, block: B:86:0x01a6  */
    public static final int d(v78 v78Var, Layout layout, y5 y5Var, int i, RectF rectF, oz6 oz6Var, b1 b1Var, boolean z) {
        b34[] b34VarArr;
        b34[] b34VarArr2;
        int i2;
        int iF;
        int i3;
        int i4;
        int iE;
        Bidi bidiCreateLineBidi;
        float fA;
        float fA2;
        float fA3;
        int lineTop = layout.getLineTop(i);
        int lineBottom = layout.getLineBottom(i);
        int lineStart = layout.getLineStart(i);
        int lineEnd = layout.getLineEnd(i);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i5 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i5];
        Layout layout2 = v78Var.f;
        int lineStart2 = layout2.getLineStart(i);
        int iE2 = v78Var.e(i);
        if (i5 < (iE2 - lineStart2) * 2) {
            xc3.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        u03 u03Var = new u03(v78Var);
        boolean z2 = false;
        boolean z3 = layout2.getParagraphDirection(i) == 1;
        int i6 = 0;
        while (lineStart2 < iE2) {
            boolean zIsRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z3 && !zIsRtlCharAt) {
                fA = u03Var.a(lineStart2, z2, z2, true);
                fA3 = u03Var.a(lineStart2 + 1, true, true, true);
            } else if (z3 && zIsRtlCharAt) {
                fA3 = u03Var.a(lineStart2, false, false, false);
                fA = u03Var.a(lineStart2 + 1, true, true, false);
            } else {
                if (zIsRtlCharAt) {
                    fA2 = u03Var.a(lineStart2, false, false, true);
                    fA = u03Var.a(lineStart2 + 1, true, true, true);
                } else {
                    fA = u03Var.a(lineStart2, false, false, false);
                    fA2 = u03Var.a(lineStart2 + 1, true, true, false);
                }
                fA3 = fA2;
            }
            fArr[i6] = fA;
            fArr[i6 + 1] = fA3;
            i6 += 2;
            lineStart2++;
            z3 = z3;
            z2 = false;
        }
        Layout layout3 = (Layout) y5Var.Y;
        int lineStart3 = layout3.getLineStart(i);
        int lineEnd2 = layout3.getLineEnd(i);
        int iP = y5Var.P(lineStart3, false);
        int iQ = y5Var.Q(iP);
        int i7 = lineStart3 - iQ;
        int i8 = lineEnd2 - iQ;
        Bidi bidiS = y5Var.s(iP);
        if (bidiS == null || (bidiCreateLineBidi = bidiS.createLineBidi(i7, i8)) == null) {
            b34VarArr = new b34[]{new b34(lineStart3, lineEnd2, layout3.isRtlCharAt(lineStart3))};
        } else {
            int runCount = bidiCreateLineBidi.getRunCount();
            b34VarArr = new b34[runCount];
            int i9 = 0;
            while (i9 < runCount) {
                int i10 = runCount;
                b34VarArr[i9] = new b34(bidiCreateLineBidi.getRunStart(i9) + lineStart3, bidiCreateLineBidi.getRunLimit(i9) + lineStart3, bidiCreateLineBidi.getRunLevel(i9) % 2 == 1);
                i9++;
                runCount = i10;
            }
        }
        kf3 kf3Var = z ? new kf3(0, b34VarArr.length - 1, 1) : new if3(b34VarArr.length - 1, 0, -1);
        int i11 = ((if3) kf3Var).X;
        int i12 = ((if3) kf3Var).Y;
        int i13 = ((if3) kf3Var).Z;
        if ((i13 <= 0 || i11 > i12) && (i13 >= 0 || i12 > i11)) {
            return -1;
        }
        while (true) {
            b34 b34Var = b34VarArr[i11];
            boolean z4 = b34Var.c;
            int iA = b34Var.a;
            int iC = b34Var.b;
            float f = z4 ? fArr[((iC - 1) - lineStart) * 2] : fArr[(iA - lineStart) * 2];
            float fC = z4 ? c(iA, lineStart, fArr) : c(iC - 1, lineStart, fArr);
            float f2 = rectF.left;
            int i14 = i13;
            if (!z) {
                b34VarArr2 = b34VarArr;
                if (fC < f2) {
                    iC = -1;
                    break;
                }
                float f3 = rectF.right;
                if (f <= f3) {
                    if ((z4 || f3 < fC) && (!z4 || f2 > f)) {
                        int i15 = iC;
                        int i16 = iA;
                        while (i15 - i16 > 1) {
                            int i17 = (i15 + i16) / 2;
                            float f4 = fArr[(i17 - lineStart) * 2];
                            int i18 = i15;
                            if ((z4 || f4 <= rectF.right) && (!z4 || f4 >= rectF.left)) {
                                i15 = i18;
                                i16 = i17;
                            } else {
                                i15 = i17;
                            }
                        }
                        i2 = z4 ? i15 : i16;
                    } else {
                        i2 = iC - 1;
                    }
                    int iE3 = oz6Var.e(i2 + 1);
                    if (iE3 == -1 || (iF = oz6Var.f(iE3)) <= iA) {
                        iC = -1;
                        break;
                    }
                    if (iE3 < iA) {
                        iE3 = iA;
                    }
                    if (iF <= iC) {
                        iC = iF;
                    }
                    RectF rectF2 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                    int iE4 = iE3;
                    while (true) {
                        rectF2.left = z4 ? fArr[((iC - 1) - lineStart) * 2] : fArr[(iE4 - lineStart) * 2];
                        rectF2.right = z4 ? c(iE4, lineStart, fArr) : c(iC - 1, lineStart, fArr);
                        if (((Boolean) b1Var.K(rectF2, rectF)).booleanValue()) {
                            break;
                        }
                        iC = oz6Var.c(iC);
                        if (iC == -1 || iC <= iA) {
                            iC = -1;
                            break;
                        }
                        iE4 = oz6Var.e(iC);
                        if (iE4 < iA) {
                            iE4 = iA;
                        }
                    }
                } else {
                    iC = -1;
                    break;
                }
                iA = iC;
            } else {
                if (fC < f2) {
                    b34VarArr2 = b34VarArr;
                    iA = -1;
                    break;
                }
                float f5 = rectF.right;
                if (f <= f5) {
                    if ((z4 || f2 > f) && (!z4 || f5 < fC)) {
                        int i19 = iC;
                        int i20 = iA;
                        while (true) {
                            i3 = i19;
                            if (i19 - i20 <= 1) {
                                break;
                            }
                            int i21 = (i3 + i20) / 2;
                            float f6 = fArr[(i21 - lineStart) * 2];
                            if ((z4 || f6 <= rectF.left) && (!z4 || f6 >= rectF.right)) {
                                i19 = i3;
                                i20 = i21;
                            } else {
                                i19 = i21;
                            }
                        }
                        i4 = z4 ? i3 : i20;
                    } else {
                        i4 = iA;
                    }
                    int iF2 = oz6Var.f(i4);
                    if (iF2 != -1 && (iE = oz6Var.e(iF2)) < iC) {
                        if (iE >= iA) {
                            iA = iE;
                        }
                        if (iF2 > iC) {
                            iF2 = iC;
                        }
                        b34VarArr2 = b34VarArr;
                        RectF rectF3 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                        int iF3 = iF2;
                        while (true) {
                            rectF3.left = z4 ? fArr[((iF3 - 1) - lineStart) * 2] : fArr[(iA - lineStart) * 2];
                            rectF3.right = z4 ? c(iA, lineStart, fArr) : c(iF3 - 1, lineStart, fArr);
                            if (((Boolean) b1Var.K(rectF3, rectF)).booleanValue()) {
                                break;
                            }
                            iA = oz6Var.a(iA);
                            if (iA != -1 && iA < iC) {
                                iF3 = oz6Var.f(iA);
                                if (iF3 > iC) {
                                    iF3 = iC;
                                }
                            }
                        }
                    } else {
                        b34VarArr2 = b34VarArr;
                    }
                    iA = -1;
                    break;
                } else {
                    b34VarArr2 = b34VarArr;
                    iA = -1;
                    break;
                }
            }
            if (iA >= 0) {
                return iA;
            }
            if (i11 == i12) {
                return -1;
            }
            i11 += i14;
            i13 = i14;
            b34VarArr = b34VarArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int e(int i, int i2) {
        return (i >> i2) & 31;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object[] f(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        eu.i0(objArr, objArr2, 0, i, 6);
        eu.g0(objArr, objArr2, i + 2, i, objArr.length);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean g(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object[] h(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        eu.i0(objArr, objArr2, 0, i, 6);
        eu.g0(objArr, objArr2, i, i + 2, objArr.length);
        return objArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object[] i(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        eu.i0(objArr, objArr2, 0, i, 6);
        eu.g0(objArr, objArr2, i, i + 1, objArr.length);
        return objArr2;
    }
}
