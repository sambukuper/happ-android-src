package defpackage;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bz4 {
    public final y5 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final int f;
    public final ArrayList g;
    public final ArrayList h;

    public bz4(y5 y5Var, long j, int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int iG;
        int i5;
        this.a = y5Var;
        this.b = i;
        if (q31.j(j) != 0 || q31.i(j) != 0) {
            xc3.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) y5Var.h0;
        int size = arrayList2.size();
        float f = 0.0f;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i6 >= size) {
                i3 = 0;
                z = false;
                break;
            }
            ug5 ug5Var = (ug5) arrayList2.get(i6);
            kf kfVar = ug5Var.a;
            int iH = q31.h(j);
            if (q31.c(j)) {
                i4 = i6;
                iG = q31.g(j) - ((int) Math.ceil(f));
                if (iG < 0) {
                    iG = 0;
                }
            } else {
                i4 = i6;
                iG = q31.g(j);
            }
            i3 = 0;
            ff ffVar = new ff(kfVar, this.b - i7, i2, s31.b(0, iH, 0, iG, 5));
            float f2 = ffVar.f + f;
            v78 v78Var = ffVar.d;
            int i8 = i7 + v78Var.g;
            arrayList.add(new tg5(ffVar, ug5Var.b, ug5Var.c, i7, i8, f, f2));
            if (!v78Var.d) {
                if (i8 == this.b) {
                    i5 = i4;
                    if (i5 != i21.G((ArrayList) this.a.h0)) {
                    }
                } else {
                    i5 = i4;
                }
                i6 = i5 + 1;
                i7 = i8;
                f = f2;
            }
            z = true;
            i7 = i8;
            f = f2;
            break;
        }
        this.e = f;
        this.f = i7;
        this.c = z;
        this.h = arrayList;
        this.d = q31.h(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i9 = i3; i9 < size2; i9++) {
            tg5 tg5Var = (tg5) arrayList.get(i9);
            List list = tg5Var.a.g;
            ArrayList arrayList4 = new ArrayList(list.size());
            int size3 = list.size();
            for (int i10 = i3; i10 < size3; i10++) {
                s86 s86Var = (s86) list.get(i10);
                arrayList4.add(s86Var != null ? tg5Var.a(s86Var) : null);
            }
            bw0.d0(arrayList3, arrayList4);
        }
        if (arrayList3.size() < ((List) this.a.Z).size()) {
            int size4 = ((List) this.a.Z).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i11 = i3; i11 < size4; i11++) {
                arrayList5.add(null);
            }
            arrayList3 = wv0.H0(arrayList3, arrayList5);
        }
        this.g = arrayList3;
    }

    public static void h(bz4 bz4Var, sm0 sm0Var, long j, t67 t67Var, x38 x38Var, tv1 tv1Var) {
        sm0Var.g();
        ArrayList arrayList = bz4Var.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            tg5 tg5Var = (tg5) arrayList.get(i);
            tg5Var.a.e(sm0Var, j, t67Var, x38Var, tv1Var);
            sm0Var.n(0.0f, tg5Var.a.f);
        }
        sm0Var.p();
    }

    public static void i(bz4 bz4Var, sm0 sm0Var, d90 d90Var, float f, t67 t67Var, x38 x38Var, tv1 tv1Var) {
        sm0Var.g();
        ArrayList arrayList = bz4Var.h;
        if (arrayList.size() <= 1 || (d90Var instanceof fe7)) {
            os4.o(bz4Var, sm0Var, d90Var, f, t67Var, x38Var, tv1Var);
        } else {
            if (!(d90Var instanceof q67)) {
                b61.c();
                return;
            }
            int size = arrayList.size();
            float fMax = 0.0f;
            float f2 = 0.0f;
            for (int i = 0; i < size; i++) {
                ff ffVar = ((tg5) arrayList.get(i)).a;
                f2 += ffVar.f;
                fMax = Math.max(fMax, ffVar.c());
            }
            Shader shaderB = ((q67) d90Var).b((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
            Matrix matrix = new Matrix();
            shaderB.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ff ffVar2 = ((tg5) arrayList.get(i2)).a;
                ffVar2.f(sm0Var, new e90(shaderB), f, t67Var, x38Var, tv1Var);
                sm0Var.n(0.0f, ffVar2.f);
                matrix.setTranslate(0.0f, -ffVar2.f);
                shaderB.setLocalMatrix(matrix);
            }
        }
        sm0Var.p();
    }

    public final float a(int i) {
        l(i);
        ArrayList arrayList = this.h;
        tg5 tg5Var = (tg5) arrayList.get(oc.q(i, arrayList));
        ff ffVar = tg5Var.a;
        return ffVar.d.d(i - tg5Var.d) + tg5Var.f;
    }

    public final int b(int i, boolean z) {
        int iE;
        l(i);
        ArrayList arrayList = this.h;
        tg5 tg5Var = (tg5) arrayList.get(oc.q(i, arrayList));
        ff ffVar = tg5Var.a;
        int i2 = i - tg5Var.d;
        v78 v78Var = ffVar.d;
        if (z) {
            Layout layout = v78Var.f;
            ThreadLocal threadLocal = z78.a;
            if (layout.getEllipsisCount(i2) <= 0 || v78Var.b != TextUtils.TruncateAt.END) {
                y5 y5VarC = v78Var.c();
                Layout layout2 = (Layout) y5VarC.Y;
                iE = y5VarC.U(layout2.getLineEnd(i2), layout2.getLineStart(i2));
            } else {
                iE = layout.getEllipsisStart(i2) + layout.getLineStart(i2);
            }
        } else {
            iE = v78Var.e(i2);
        }
        return iE + tg5Var.b;
    }

    public final int c(int i) {
        int iP;
        int length = ((ql) this.a.Y).Y.length();
        ArrayList arrayList = this.h;
        if (i >= length) {
            iP = arrayList.size() - 1;
        } else {
            iP = i < 0 ? 0 : oc.p(i, arrayList);
        }
        tg5 tg5Var = (tg5) arrayList.get(iP);
        return tg5Var.a.d.f(tg5Var.d(i)) + tg5Var.d;
    }

    public final int d(float f) {
        int lineForVertical;
        ArrayList arrayList = this.h;
        tg5 tg5Var = (tg5) arrayList.get(oc.r(arrayList, f));
        int i = tg5Var.c - tg5Var.b;
        int i2 = tg5Var.d;
        if (i == 0) {
            return i2;
        }
        ff ffVar = tg5Var.a;
        float f2 = f - tg5Var.f;
        v78 v78Var = ffVar.d;
        int i3 = (int) (f2 - 0.0f);
        int i4 = v78Var.g;
        if (i4 <= 0) {
            lineForVertical = 0;
        } else {
            lineForVertical = v78Var.f.getLineForVertical(i3 - v78Var.h);
            int i5 = i4 - 1;
            if (lineForVertical > i5) {
                lineForVertical = i5;
            }
        }
        return lineForVertical + i2;
    }

    public final float e(int i) {
        l(i);
        ArrayList arrayList = this.h;
        tg5 tg5Var = (tg5) arrayList.get(oc.q(i, arrayList));
        ff ffVar = tg5Var.a;
        return ffVar.d.h(i - tg5Var.d) + tg5Var.f;
    }

    public final int f(long j) {
        int offsetForHorizontal;
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        ArrayList arrayList = this.h;
        tg5 tg5Var = (tg5) arrayList.get(oc.r(arrayList, fIntBitsToFloat));
        int i2 = tg5Var.c;
        int i3 = tg5Var.b;
        if (i2 - i3 == 0) {
            return i3;
        }
        ff ffVar = tg5Var.a;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat(i) - tg5Var.f;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
        v78 v78Var = ffVar.d;
        int iIntBitsToFloat = (int) (Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits)) - 0.0f);
        Layout layout = v78Var.f;
        int lineForVertical = layout.getLineForVertical(iIntBitsToFloat - v78Var.h);
        if (lineForVertical >= v78Var.g) {
            offsetForHorizontal = layout.getText().length();
        } else {
            offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, (v78Var.b(lineForVertical) * (-1.0f)) + Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)));
        }
        return offsetForHorizontal + i3;
    }

    public final long g(s86 s86Var, int i, em7 em7Var) {
        long jB;
        long j;
        float f = s86Var.b;
        ArrayList arrayList = this.h;
        int iR = oc.r(arrayList, f);
        float f2 = ((tg5) arrayList.get(iR)).g;
        float f3 = s86Var.d;
        if (f2 >= f3 || iR == arrayList.size() - 1) {
            tg5 tg5Var = (tg5) arrayList.get(iR);
            return tg5Var.b(tg5Var.a.b(tg5Var.c(s86Var), i, em7Var), true);
        }
        int iR2 = oc.r(arrayList, f3);
        long jB2 = f88.b;
        while (true) {
            jB = f88.b;
            if (!f88.a(jB2, jB) || iR > iR2) {
                break;
            }
            tg5 tg5Var2 = (tg5) arrayList.get(iR);
            jB2 = tg5Var2.b(tg5Var2.a.b(tg5Var2.c(s86Var), i, em7Var), true);
            iR++;
        }
        if (f88.a(jB2, jB)) {
            return jB;
        }
        while (true) {
            j = f88.b;
            if (!f88.a(jB, j) || iR > iR2) {
                break;
            }
            tg5 tg5Var3 = (tg5) arrayList.get(iR2);
            jB = tg5Var3.b(tg5Var3.a.b(tg5Var3.c(s86Var), i, em7Var), true);
            iR2--;
        }
        return f88.a(jB, j) ? jB2 : ct7.c((int) (jB2 >> 32), (int) (4294967295L & jB));
    }

    public final void j(int i) {
        ql qlVar = (ql) this.a.Y;
        if (i < 0 || i >= qlVar.Y.length()) {
            xc3.a("offset(" + i + ") is out of bounds [0, " + qlVar.Y.length() + ")");
        }
    }

    public final void k(int i) {
        ql qlVar = (ql) this.a.Y;
        if (i < 0 || i > qlVar.Y.length()) {
            xc3.a("offset(" + i + ") is out of bounds [0, " + qlVar.Y.length() + "]");
        }
    }

    public final void l(int i) {
        boolean z = false;
        int i2 = this.f;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            return;
        }
        xc3.a("lineIndex(" + i + ") is out of bounds [0, " + i2 + ")");
    }
}
