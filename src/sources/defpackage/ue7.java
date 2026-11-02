package defpackage;

import android.content.res.ColorStateList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ue7 implements Cloneable {
    public /* synthetic */ int[] X;
    public /* synthetic */ Object[] Y;
    public /* synthetic */ int Z;

    public ue7(int i) {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.X = new int[i5];
        this.Y = new Object[i5];
    }

    public final void a(int i, ColorStateList colorStateList) {
        int i2 = this.Z;
        if (i2 != 0 && i <= this.X[i2 - 1]) {
            d(i, colorStateList);
            return;
        }
        if (i2 >= this.X.length) {
            int i3 = (i2 + 1) * 4;
            for (int i4 = 4; i4 < 32; i4++) {
                int i5 = (1 << i4) - 12;
                if (i3 <= i5) {
                    i3 = i5;
                    break;
                }
            }
            int i6 = i3 / 4;
            this.X = Arrays.copyOf(this.X, i6);
            this.Y = Arrays.copyOf(this.Y, i6);
        }
        this.X[i2] = i;
        this.Y[i2] = colorStateList;
        this.Z = i2 + 1;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ue7 clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        ue7 ue7Var = (ue7) objClone;
        ue7Var.X = (int[]) this.X.clone();
        ue7Var.Y = (Object[]) this.Y.clone();
        return ue7Var;
    }

    public final int c(int i) {
        if (i >= this.Z || i < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.X[i];
    }

    public final void d(int i, Object obj) {
        int iK = w45.k(this.Z, i, this.X);
        if (iK >= 0) {
            this.Y[iK] = obj;
            return;
        }
        int i2 = ~iK;
        int i3 = this.Z;
        if (i2 < i3) {
            Object[] objArr = this.Y;
            if (objArr[i2] == x97.c) {
                this.X[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.X.length) {
            int i4 = (i3 + 1) * 4;
            for (int i5 = 4; i5 < 32; i5++) {
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
            }
            int i7 = i4 / 4;
            this.X = Arrays.copyOf(this.X, i7);
            this.Y = Arrays.copyOf(this.Y, i7);
        }
        int i8 = this.Z;
        if (i8 - i2 != 0) {
            int[] iArr = this.X;
            int i9 = i2 + 1;
            eu.e0(i9, i2, i8, iArr, iArr);
            Object[] objArr2 = this.Y;
            eu.g0(objArr2, objArr2, i9, i2, this.Z);
        }
        this.X[i2] = i;
        this.Y[i2] = obj;
        this.Z++;
    }

    public final Object e(int i) {
        if (i >= this.Z || i < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.Y[i];
    }

    public final String toString() {
        int i = this.Z;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = this.Z;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(c(i3));
            sb.append('=');
            Object objE = e(i3);
            if (objE != this) {
                sb.append(objE);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
