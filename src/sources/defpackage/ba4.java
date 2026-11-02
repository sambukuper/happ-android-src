package defpackage;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ba4 implements LineHeightSpan {
    public final float X;
    public final int Y;
    public final boolean Z;
    public final boolean f0;
    public final float g0;
    public final int h0;
    public int i0 = Integer.MIN_VALUE;
    public int j0 = Integer.MIN_VALUE;
    public int k0 = Integer.MIN_VALUE;
    public int l0 = Integer.MIN_VALUE;
    public int m0;
    public int n0;

    public ba4(float f, int i, boolean z, boolean z2, float f2, int i2) {
        this.X = f;
        this.Y = i;
        this.Z = z;
        this.f0 = z2;
        this.g0 = f2;
        this.h0 = i2;
        if ((0.0f > f2 || f2 > 1.0f) && f2 != -1.0f) {
            xc3.b("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        double dCeil;
        int i5 = fontMetricsInt.descent;
        int i6 = fontMetricsInt.ascent;
        if (i5 - i6 <= 0) {
            return;
        }
        boolean z = i == 0;
        boolean z2 = i2 == this.Y;
        int i7 = this.h0;
        boolean z3 = this.f0;
        boolean z4 = this.Z;
        if (z && z2 && z4 && z3 && i7 != 2) {
            return;
        }
        if (this.i0 == Integer.MIN_VALUE) {
            int i8 = i5 - i6;
            int iCeil = (int) Math.ceil(this.X);
            int i9 = iCeil - i8;
            if (i7 != 1 || i9 > 0) {
                float fAbs = this.g0;
                if (fAbs == -1.0f) {
                    fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                if (i9 <= 0) {
                    dCeil = Math.ceil(i9 * fAbs);
                } else {
                    dCeil = Math.ceil((1.0f - fAbs) * i9);
                }
                int i10 = (int) dCeil;
                int i11 = fontMetricsInt.descent;
                int i12 = i10 + i11;
                this.k0 = i12;
                int i13 = i12 - iCeil;
                this.j0 = i13;
                if (i7 == 0 || i9 >= 0) {
                    if (z4) {
                        i13 = fontMetricsInt.ascent;
                    }
                    this.i0 = i13;
                    if (z3) {
                        i12 = i11;
                    }
                    this.l0 = i12;
                    this.m0 = fontMetricsInt.ascent - i13;
                    this.n0 = i12 - i11;
                } else if (i7 == 2) {
                    int i14 = fontMetricsInt.ascent;
                    this.i0 = z4 ? Math.max(i14, i13) : Math.min(i14, i13);
                    int i15 = fontMetricsInt.descent;
                    int i16 = this.k0;
                    this.l0 = z3 ? Math.min(i15, i16) : Math.max(i15, i16);
                    this.m0 = 0;
                    this.n0 = 0;
                }
            } else {
                int i17 = fontMetricsInt.ascent;
                this.j0 = i17;
                int i18 = fontMetricsInt.descent;
                this.k0 = i18;
                this.i0 = i17;
                this.l0 = i18;
                this.m0 = 0;
                this.n0 = 0;
            }
        }
        fontMetricsInt.ascent = z ? this.i0 : this.j0;
        fontMetricsInt.descent = z2 ? this.l0 : this.k0;
    }
}
