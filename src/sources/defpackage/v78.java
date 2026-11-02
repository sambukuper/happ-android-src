package defpackage;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.text.BreakIterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class v78 {
    public final TextPaint a;
    public final TextUtils.TruncateAt b;
    public final boolean c;
    public final boolean d;
    public nv0 e;
    public final Layout f;
    public final int g;
    public final int h;
    public final int i;
    public final float j;
    public final float k;
    public final Paint.FontMetricsInt l;
    public final int m;
    public final ba4[] n;
    public final Rect o = new Rect();
    public y5 p;

    /* JADX WARN: Code duplicated, block: B:122:0x0218  */
    /* JADX WARN: Code duplicated, block: B:123:0x021a  */
    /* JADX WARN: Code duplicated, block: B:125:0x021f  */
    /* JADX WARN: Code duplicated, block: B:126:0x0221  */
    /* JADX WARN: Code duplicated, block: B:51:0x010c  */
    /* JADX WARN: Code duplicated, block: B:73:0x015f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0176  */
    /* JADX WARN: Code duplicated, block: B:95:0x019f A[PHI: r14
  0x019f: PHI (r14v7 int) = (r14v6 int), (r14v9 int) binds: [B:100:0x01b1, B:93:0x0198] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r26v1, types: [boolean] */
    public v78(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, e34 e34Var) {
        int i9;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout layoutA;
        boolean z2;
        int i10;
        ba4[] ba4VarArr;
        int i11;
        int i12;
        int i13;
        long jA;
        int i14;
        long j;
        char c;
        int i15;
        long jA2;
        int i16;
        int i17;
        long jA3;
        ?? r13;
        boolean zR;
        int topPadding;
        boolean zQ;
        int i18;
        Paint.FontMetricsInt fontMetricsInt;
        boolean z3;
        ?? r15;
        int i19;
        this.a = textPaint;
        this.b = truncateAt;
        this.c = z;
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicB = z78.b(i2);
        Layout.Alignment alignment = p28.a;
        Layout.Alignment alignment2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Layout.Alignment.ALIGN_NORMAL : p28.b : p28.a : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z4 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, y20.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics metricsA = e34Var.a();
            double d = f;
            int iCeil = (int) Math.ceil(d);
            if (metricsA == null || e34Var.c() > f || z4) {
                i9 = i3;
                textDirectionHeuristic = textDirectionHeuristicB;
                layoutA = w45.A(charSequence, textPaint, iCeil, charSequence.length(), textDirectionHeuristic, alignment2, i9, truncateAt, (int) Math.ceil(d), i8, z, i4, i5, i6, i7);
                z2 = false;
            } else {
                if (iCeil < 0) {
                    xc3.a("negative width");
                }
                if (iCeil < 0) {
                    xc3.a("negative ellipsized width");
                }
                layoutA = Build.VERSION.SDK_INT >= 33 ? e70.b(charSequence, textPaint, iCeil, alignment2, metricsA, z, truncateAt, iCeil) : new BoringLayout(charSequence, textPaint, iCeil, alignment2, 1.0f, 0.0f, metricsA, z, truncateAt, iCeil);
                i9 = i3;
                textDirectionHeuristic = textDirectionHeuristicB;
                z2 = true;
            }
            this.f = layoutA;
            Trace.endSection();
            int iMin = Math.min(layoutA.getLineCount(), i9);
            this.g = iMin;
            int i20 = iMin - 1;
            this.d = iMin >= i9 && (layoutA.getEllipsisCount(i20) > 0 || layoutA.getLineEnd(i20) != charSequence.length());
            if (layoutA.getText() instanceof Spanned) {
                CharSequence text = layoutA.getText();
                text.getClass();
                if (vr3.G((Spanned) text, ba4.class) || layoutA.getText().length() <= 0) {
                    CharSequence text2 = layoutA.getText();
                    text2.getClass();
                    i10 = 0;
                    ba4VarArr = (ba4[]) ((Spanned) text2).getSpans(0, layoutA.getText().length(), ba4.class);
                } else {
                    ba4VarArr = null;
                    i10 = 0;
                }
            } else {
                ba4VarArr = null;
                i10 = 0;
            }
            this.n = ba4VarArr;
            if (ba4VarArr == null) {
                i11 = 2;
                i12 = i10;
            } else {
                ba4 ba4Var = ba4VarArr.length == 0 ? null : ba4VarArr[i10];
                if (ba4Var != null) {
                    if (ba4Var.Z) {
                        i11 = 2;
                        i19 = ba4Var.h0 == 2 ? 1 : i19;
                        i12 = i19;
                    } else {
                        i11 = 2;
                    }
                    i19 = i10;
                    i12 = i19;
                } else {
                    i11 = 2;
                    i12 = i10;
                }
            }
            if (ba4VarArr == null) {
                i13 = i10;
            } else {
                ba4 ba4Var2 = ba4VarArr.length == 0 ? null : ba4VarArr[i10];
                if (ba4Var2 != null && ba4Var2.f0 && ba4Var2.h0 == i11) {
                    i13 = 1;
                } else {
                    i13 = i10;
                }
            }
            if (i12 == 0 || i13 == 0) {
                jA = z78.b;
                if (z) {
                    i14 = 33;
                } else {
                    if (z2) {
                        BoringLayout boringLayout = (BoringLayout) layoutA;
                        i14 = 33;
                        if (Build.VERSION.SDK_INT >= 33) {
                            zQ = c4.q(boringLayout);
                        } else {
                            r13 = i10;
                        }
                    } else {
                        i14 = 33;
                        StaticLayout staticLayout = (StaticLayout) layoutA;
                        int i21 = Build.VERSION.SDK_INT;
                        if (i21 >= 33) {
                            zR = c4.r(staticLayout);
                        } else if (i21 >= 28) {
                            r13 = 1;
                        } else {
                            r13 = i10;
                        }
                    }
                    if (r13 == 0) {
                        r13 = zR;
                        TextPaint paint = layoutA.getPaint();
                        CharSequence text3 = layoutA.getText();
                        c = ' ';
                        Rect rectD = w39.D(paint, text3, layoutA.getLineStart(i10), layoutA.getLineEnd(i10));
                        int lineAscent = layoutA.getLineAscent(i10);
                        j = 4294967295L;
                        int i22 = rectD.top;
                        if (i22 < lineAscent) {
                            r13 = zQ;
                            topPadding = lineAscent - i22;
                        } else {
                            r13 = zQ;
                            topPadding = layoutA.getTopPadding();
                        }
                        i15 = 1;
                        rectD = iMin != 1 ? w39.D(paint, text3, layoutA.getLineStart(i20), layoutA.getLineEnd(i20)) : rectD;
                        int lineDescent = layoutA.getLineDescent(i20);
                        int i23 = rectD.bottom;
                        int bottomPadding = i23 > lineDescent ? i23 - lineDescent : layoutA.getBottomPadding();
                        jA2 = (topPadding == 0 && bottomPadding == 0) ? jA2 : z78.a(topPadding, bottomPadding);
                        if (i12 != 0) {
                            i16 = i10;
                        } else {
                            i16 = (int) (jA2 >> c);
                        }
                        if (i13 != 0) {
                            i17 = i10;
                        } else {
                            i17 = (int) (jA2 & j);
                        }
                        jA3 = z78.a(i16, i17);
                    }
                    jA2 = jA;
                    if (i12 != 0) {
                        i16 = i10;
                    } else {
                        i16 = (int) (jA2 >> c);
                    }
                    if (i13 != 0) {
                        i17 = i10;
                    } else {
                        i17 = (int) (jA2 & j);
                    }
                    jA3 = z78.a(i16, i17);
                }
                r13 = zR;
                r13 = zQ;
                c = ' ';
                j = 4294967295L;
                i15 = 1;
                jA2 = jA;
                if (i12 != 0) {
                    i16 = i10;
                } else {
                    i16 = (int) (jA2 >> c);
                }
                if (i13 != 0) {
                    i17 = i10;
                } else {
                    i17 = (int) (jA2 & j);
                }
                jA3 = z78.a(i16, i17);
            } else {
                jA3 = z78.b;
                jA = jA3;
                c = ' ';
                j = 4294967295L;
                i15 = 1;
                i14 = 33;
            }
            if (ba4VarArr != null) {
                int length2 = ba4VarArr.length;
                int iMax = i10;
                int iMax2 = iMax;
                for (int i24 = iMax2; i24 < length2; i24++) {
                    ba4 ba4Var3 = ba4VarArr[i24];
                    int i25 = ba4Var3.m0;
                    iMax = i25 < 0 ? Math.max(iMax, Math.abs(i25)) : iMax;
                    int i26 = ba4Var3.n0;
                    if (i26 < 0) {
                        iMax2 = Math.max(iMax, Math.abs(i26));
                    }
                }
                jA = (iMax == 0 && iMax2 == 0) ? z78.b : z78.a(iMax, iMax2);
            }
            this.h = Math.max((int) (jA3 >> c), (int) (jA >> c));
            this.i = Math.max((int) (jA3 & j), (int) (jA & j));
            TextPaint textPaint2 = this.a;
            ba4[] ba4VarArr2 = this.n;
            int i27 = this.g - i15;
            Layout layout = this.f;
            if (layout.getLineStart(i27) != layout.getLineEnd(i27) || ba4VarArr2 == null || ba4VarArr2.length == 0) {
                i18 = i10;
                fontMetricsInt = null;
            } else {
                SpannableString spannableString = new SpannableString("\u200b");
                ba4 ba4Var4 = (ba4) eu.r0(ba4VarArr2);
                int length3 = spannableString.length();
                if (i27 == 0 || !(z3 = ba4Var4.f0)) {
                    boolean z5 = ba4Var4.f0;
                    z3 = z5 ? 1 : 0;
                    r15 = z5;
                } else {
                    r15 = i10;
                }
                spannableString.setSpan(new ba4(ba4Var4.X, length3, r15, z3, ba4Var4.g0, ba4Var4.h0), i10, spannableString.length(), i14);
                i18 = i10;
                StaticLayout staticLayoutA = w45.A(spannableString, textPaint2, Integer.MAX_VALUE, spannableString.length(), textDirectionHeuristic, x24.a, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, this.c, 0, 0, 0, 0);
                fontMetricsInt = new Paint.FontMetricsInt();
                fontMetricsInt.ascent = staticLayoutA.getLineAscent(i18);
                fontMetricsInt.descent = staticLayoutA.getLineDescent(i18);
                fontMetricsInt.top = staticLayoutA.getLineTop(i18);
                fontMetricsInt.bottom = staticLayoutA.getLineBottom(i18);
            }
            this.m = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) g(i20)) : i18;
            this.l = fontMetricsInt;
            Layout layout2 = this.f;
            this.j = i21.A(layout2, i20, layout2.getPaint());
            Layout layout3 = this.f;
            this.k = i21.B(layout3, i20, layout3.getPaint());
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final int a() {
        boolean z = this.d;
        Layout layout = this.f;
        return (z ? layout.getLineBottom(this.g - 1) : layout.getHeight()) + this.h + this.i + this.m;
    }

    public final float b(int i) {
        if (i == this.g - 1) {
            return this.j + this.k;
        }
        return 0.0f;
    }

    public final y5 c() {
        y5 y5Var = this.p;
        if (y5Var != null) {
            return y5Var;
        }
        y5 y5Var2 = new y5(this.f);
        this.p = y5Var2;
        return y5Var2;
    }

    public final float d(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        int i2 = this.g;
        int i3 = i2 - 1;
        Layout layout = this.f;
        if (i != i3 || (fontMetricsInt = this.l) == null) {
            return this.h + layout.getLineBottom(i) + (i == i2 + (-1) ? this.i : 0);
        }
        return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
    }

    public final int e(int i) {
        ThreadLocal threadLocal = z78.a;
        Layout layout = this.f;
        return (layout.getEllipsisCount(i) <= 0 || this.b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
    }

    public final int f(int i) {
        int i2 = this.g;
        if (i2 <= 0) {
            return 0;
        }
        int lineForOffset = this.f.getLineForOffset(i);
        int i3 = i2 - 1;
        return lineForOffset > i3 ? i3 : lineForOffset;
    }

    public final float g(int i) {
        return d(i) - h(i);
    }

    public final float h(int i) {
        return this.f.getLineTop(i) + (i == 0 ? 0 : this.h);
    }

    public final float i(int i, boolean z) {
        return b(f(i)) + c().N(i, true, z);
    }

    public final float j(int i, boolean z) {
        return b(f(i)) + c().N(i, false, z);
    }

    public final nv0 k() {
        nv0 nv0Var = this.e;
        if (nv0Var != null) {
            return nv0Var;
        }
        Layout layout = this.f;
        CharSequence text = layout.getText();
        int length = layout.getText().length();
        Locale textLocale = this.a.getTextLocale();
        nv0 nv0Var2 = new nv0();
        nv0Var2.Z = text;
        if (text.length() < 0) {
            xc3.a("input start index is outside the CharSequence");
        }
        if (length < 0 || length > text.length()) {
            xc3.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(textLocale);
        nv0Var2.f0 = wordInstance;
        nv0Var2.X = Math.max(0, -50);
        nv0Var2.Y = Math.min(text.length(), length + 50);
        wordInstance.setText(new cq0(text, length));
        this.e = nv0Var2;
        return nv0Var2;
    }
}
