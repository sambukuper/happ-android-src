package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ff {
    public final kf a;
    public final int b;
    public final long c;
    public final v78 d;
    public final CharSequence e;
    public final float f;
    public final List g;

    /* JADX WARN: Code duplicated, block: B:104:0x0159  */
    /* JADX WARN: Code duplicated, block: B:135:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:138:0x0218  */
    /* JADX WARN: Code duplicated, block: B:139:0x021b  */
    /* JADX WARN: Code duplicated, block: B:141:0x0235  */
    /* JADX WARN: Code duplicated, block: B:143:0x024f  */
    /* JADX WARN: Code duplicated, block: B:145:0x0253 A[LOOP:1: B:144:0x0251->B:145:0x0253, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:148:0x027c  */
    /* JADX WARN: Code duplicated, block: B:149:0x0280  */
    /* JADX WARN: Code duplicated, block: B:151:0x0298  */
    /* JADX WARN: Code duplicated, block: B:153:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:154:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:160:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:163:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:164:0x02db  */
    /* JADX WARN: Code duplicated, block: B:187:0x032d  */
    /* JADX WARN: Code duplicated, block: B:66:0x00da  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ed  */
    /* JADX WARN: Instruction removed from duplicated block: B:143:0x024f, please report this as an issue */
    public ff(kf kfVar, int i, int i2, long j) throws Throwable {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        TextUtils.TruncateAt truncateAt;
        char c;
        TextUtils.TruncateAt truncateAt2;
        v78 v78VarA;
        int i9;
        ff ffVar;
        int i10;
        Layout layout;
        Spanned spanned;
        r67[] r67VarArr;
        CharSequence charSequence;
        Spanned spanned2;
        Object[] spans;
        ArrayList arrayList;
        int length;
        int i11;
        List list;
        int spanEnd;
        int iF;
        boolean z;
        boolean z2;
        boolean z3;
        int i12;
        int i13;
        CharSequence charSequence2 = kfVar.j0;
        this.a = kfVar;
        this.b = i;
        this.c = j;
        if (q31.i(j) != 0 || q31.j(j) != 0) {
            xc3.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i < 1) {
            xc3.a("maxLines should be greater than 0");
        }
        o88 o88Var = kfVar.Y;
        if (i2 == 2) {
            i3 = 0;
            if (!v88.a(o88Var.a.h, eu7.g(0)) && !v88.a(o88Var.a.h, v88.c) && (i13 = o88Var.b.a) != 0 && i13 != 5 && i13 != 4 && charSequence2.length() != 0) {
                Spannable spannableString = charSequence2 instanceof Spannable ? (Spannable) charSequence2 : null;
                spannableString = spannableString == null ? new SpannableString(charSequence2) : spannableString;
                if (!vr3.G(spannableString, jb3.class)) {
                    spannableString.setSpan(new jb3(), spannableString.length() - 1, spannableString.length() - 1, 33);
                }
                charSequence2 = spannableString;
            }
        } else {
            i3 = 0;
        }
        CharSequence charSequence3 = charSequence2;
        this.e = charSequence3;
        xg5 xg5Var = o88Var.b;
        qe7 qe7Var = o88Var.a;
        int i14 = xg5Var.a;
        int i15 = i14 == 1 ? 3 : i14 == 2 ? 4 : i14 == 3 ? 2 : (i14 != 5 && i14 == 6) ? 1 : i3;
        int i16 = i14 == 4 ? 1 : i3;
        Throwable th = null;
        int i17 = xg5Var.h == 2 ? Build.VERSION.SDK_INT <= 32 ? 2 : 4 : i3;
        int i18 = xg5Var.g;
        int i19 = i18 & 255;
        if (i19 == 1) {
            i4 = i3;
        } else if (i19 == 2) {
            i4 = 1;
        } else if (i19 == 3) {
            i4 = 2;
        } else {
            i4 = i3;
        }
        int i20 = (i18 >> 8) & 255;
        if (i20 == 1) {
            i5 = i3;
        } else if (i20 == 2) {
            i5 = 1;
        } else if (i20 == 3) {
            i5 = 2;
        } else if (i20 == 4) {
            i5 = 3;
        } else {
            i5 = i3;
        }
        int i21 = (i18 >> 16) & 255;
        if (i21 == 1) {
            i7 = i3;
            i6 = 2;
        } else {
            i6 = 2;
            i7 = i21 == 2 ? 1 : i3;
        }
        if (i2 != i6) {
            if (i2 == 5) {
                truncateAt2 = TextUtils.TruncateAt.MIDDLE;
            } else if (i2 == 4) {
                i8 = i17;
                truncateAt = TextUtils.TruncateAt.START;
                c = ' ';
            } else {
                i8 = i17;
                qe7Var = qe7Var;
                truncateAt = null;
                c = ' ';
            }
            v78VarA = a(i15, i16, truncateAt, i, i8, i4, i5, i7, charSequence3);
            Layout layout2 = v78VarA.f;
            if (Build.VERSION.SDK_INT < 35 || kfVar.i0.getLetterSpacing() == 0.0f || (!(i2 == 4 || i2 == 5) || layout2.getEllipsisCount(0) <= 0)) {
                i9 = 2;
                ffVar = this;
                i10 = i;
            } else {
                int ellipsisStart = layout2.getEllipsisStart(0);
                int ellipsisCount = layout2.getEllipsisCount(0) + ellipsisStart;
                i9 = 2;
                CharSequence[] charSequenceArr = {charSequence3.subSequence(0, ellipsisStart), "…", charSequence3.subSequence(ellipsisCount, charSequence3.length())};
                ffVar = this;
                i10 = i;
                v78VarA = ffVar.a(i15, i16, truncateAt, i10, i8, i4, i5, i7, TextUtils.concat(charSequenceArr));
            }
            int i22 = v78VarA.g;
            if (i2 == i9 || v78VarA.a() <= q31.g(j) || i10 <= 1) {
                ffVar.d = v78VarA;
            } else {
                int iG = q31.g(j);
                for (int i23 = 0; i23 < i22; i23++) {
                    if (v78VarA.d(i23) > iG) {
                        i22 = i23;
                        break;
                    }
                }
                if (i22 >= 0 && i22 != ffVar.b) {
                    v78VarA = ffVar.a(i15, i16, truncateAt, i22 < 1 ? 1 : i22, i8, i4, i5, i7, ffVar.e);
                }
                ffVar.d = v78VarA;
            }
            ffVar.f = v78VarA.a();
            qe7 qe7Var2 = qe7Var;
            ffVar.a.i0.c(qe7Var2.a.c(), (((long) Float.floatToRawIntBits(ffVar.f)) & 4294967295L) | (((long) Float.floatToRawIntBits(ffVar.c())) << c), qe7Var2.a.a());
            layout = v78VarA.f;
            if (layout.getText() instanceof Spanned) {
                CharSequence text = layout.getText();
                text.getClass();
                spanned = (Spanned) text;
                if (spanned.nextSpanTransition(-1, spanned.length(), r67.class) != spanned.length()) {
                    CharSequence text2 = layout.getText();
                    text2.getClass();
                    r67VarArr = (r67[]) ((Spanned) text2).getSpans(0, layout.getText().length(), r67.class);
                } else {
                    r67VarArr = null;
                }
            } else {
                r67VarArr = null;
            }
            if (r67VarArr != null) {
                for (r67 r67Var : r67VarArr) {
                    r67Var.Z.setValue(new ua7((((long) Float.floatToRawIntBits(ffVar.f)) & 4294967295L) | (((long) Float.floatToRawIntBits(ffVar.c())) << c)));
                }
            }
            charSequence = ffVar.e;
            if (charSequence instanceof Spanned) {
                spanned2 = (Spanned) charSequence;
                spans = spanned2.getSpans(0, charSequence.length(), io5.class);
                arrayList = new ArrayList(spans.length);
                length = spans.length;
                i11 = 0;
                while (i11 < length) {
                    io5 io5Var = (io5) spans[i11];
                    int spanStart = spanned2.getSpanStart(io5Var);
                    spanEnd = spanned2.getSpanEnd(io5Var);
                    iF = ffVar.d.f(spanStart);
                    if (iF >= ffVar.b) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (ffVar.d.f.getEllipsisCount(iF) > 0 || spanEnd <= ffVar.d.f.getEllipsisStart(iF) + ffVar.d.f.getLineStart(iF)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (spanEnd > ffVar.d.e(iF)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z2 && !z3) {
                        if (!z) {
                            boolean z4 = ffVar.d.f.getParagraphDirection(iF) == 1;
                            boolean zIsRtlCharAt = ffVar.d.f.isRtlCharAt(spanStart);
                            if (z4 && !zIsRtlCharAt) {
                                ffVar.d.i(spanStart, false);
                                io5Var.b();
                                throw th;
                            }
                            if (z4 && zIsRtlCharAt) {
                                ffVar.d.j(spanStart, false);
                                io5Var.b();
                                throw th;
                            }
                            v78 v78Var = ffVar.d;
                            if (zIsRtlCharAt) {
                                v78Var.i(spanStart, false);
                                io5Var.b();
                                throw th;
                            }
                            v78Var.j(spanStart, false);
                            io5Var.b();
                            throw th;
                        }
                    }
                    arrayList.add(th);
                    i11++;
                    th = th;
                }
                list = arrayList;
            } else {
                list = d02.X;
            }
            ffVar.g = list;
        }
        truncateAt2 = TextUtils.TruncateAt.END;
        i8 = i17;
        truncateAt = truncateAt2;
        c = ' ';
        v78VarA = a(i15, i16, truncateAt, i, i8, i4, i5, i7, charSequence3);
        Layout layout3 = v78VarA.f;
        if (Build.VERSION.SDK_INT < 35) {
            i9 = 2;
            ffVar = this;
            i10 = i;
        } else {
            i9 = 2;
            ffVar = this;
            i10 = i;
        }
        int i24 = v78VarA.g;
        if (i2 == i9) {
            ffVar.d = v78VarA;
        } else {
            ffVar.d = v78VarA;
        }
        ffVar.f = v78VarA.a();
        qe7 qe7Var3 = qe7Var;
        ffVar.a.i0.c(qe7Var3.a.c(), (((long) Float.floatToRawIntBits(ffVar.f)) & 4294967295L) | (((long) Float.floatToRawIntBits(ffVar.c())) << c), qe7Var3.a.a());
        layout = v78VarA.f;
        if (layout.getText() instanceof Spanned) {
            r67VarArr = null;
        } else {
            CharSequence text3 = layout.getText();
            text3.getClass();
            spanned = (Spanned) text3;
            if (spanned.nextSpanTransition(-1, spanned.length(), r67.class) != spanned.length()) {
                CharSequence text4 = layout.getText();
                text4.getClass();
                r67VarArr = (r67[]) ((Spanned) text4).getSpans(0, layout.getText().length(), r67.class);
            } else {
                r67VarArr = null;
            }
        }
        if (r67VarArr != null) {
            while (i12 < r2) {
                r67Var.Z.setValue(new ua7((((long) Float.floatToRawIntBits(ffVar.f)) & 4294967295L) | (((long) Float.floatToRawIntBits(ffVar.c())) << c)));
            }
        }
        charSequence = ffVar.e;
        if (charSequence instanceof Spanned) {
            list = d02.X;
        } else {
            spanned2 = (Spanned) charSequence;
            spans = spanned2.getSpans(0, charSequence.length(), io5.class);
            arrayList = new ArrayList(spans.length);
            length = spans.length;
            i11 = 0;
            while (i11 < length) {
                io5 io5Var2 = (io5) spans[i11];
                int spanStart2 = spanned2.getSpanStart(io5Var2);
                spanEnd = spanned2.getSpanEnd(io5Var2);
                iF = ffVar.d.f(spanStart2);
                if (iF >= ffVar.b) {
                    z = true;
                } else {
                    z = false;
                }
                if (ffVar.d.f.getEllipsisCount(iF) > 0) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (spanEnd > ffVar.d.e(iF)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z2) {
                }
                arrayList.add(th);
                i11++;
                th = th;
            }
            list = arrayList;
        }
        ffVar.g = list;
    }

    public final v78 a(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        fp5 fp5Var;
        float fC = c();
        kf kfVar = this.a;
        ph phVar = kfVar.i0;
        int i8 = kfVar.n0;
        e34 e34Var = kfVar.k0;
        o88 o88Var = kfVar.Y;
        gf gfVar = hf.a;
        up5 up5Var = o88Var.c;
        return new v78(charSequence, fC, phVar, i, truncateAt, i8, (up5Var == null || (fp5Var = up5Var.b) == null) ? false : fp5Var.a, i3, i5, i6, i7, i4, i2, e34Var);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a7  */
    public final long b(s86 s86Var, int i, em7 em7Var) {
        oz6 tt2Var;
        int i2;
        int[] iArrL;
        RectF rectFT = pu.T(s86Var);
        int i3 = (i != 0 && i == 1) ? 1 : 0;
        b1 b1Var = new b1(em7Var, (byte) 2);
        v78 v78Var = this.d;
        Layout layout = v78Var.f;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            iArrL = u3.l(v78Var, rectFT, i3, b1Var);
        } else {
            y5 y5VarC = v78Var.c();
            if (i3 == 1) {
                tt2Var = new xd6(layout.getText(), v78Var.k(), (byte) 27);
            } else {
                CharSequence text = layout.getText();
                tt2Var = i4 >= 29 ? new tt2(text, v78Var.a) : new ut2(text);
            }
            oz6 oz6Var = tt2Var;
            int lineForVertical = layout.getLineForVertical((int) rectFT.top);
            if (rectFT.top <= v78Var.d(lineForVertical) || (lineForVertical = lineForVertical + 1) < v78Var.g) {
                int i5 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) rectFT.bottom);
                if (lineForVertical2 != 0 || rectFT.bottom >= v78Var.h(0)) {
                    int iD = us7.d(v78Var, layout, y5VarC, i5, rectFT, oz6Var, b1Var, true);
                    while (true) {
                        i2 = i5;
                        if (iD != -1 || i2 >= lineForVertical2) {
                            break;
                        }
                        i5 = i2 + 1;
                        iD = us7.d(v78Var, layout, y5VarC, i5, rectFT, oz6Var, b1Var, true);
                    }
                    if (iD == -1) {
                        iArrL = null;
                    } else {
                        int i6 = lineForVertical2;
                        int iD2 = us7.d(v78Var, layout, y5VarC, i6, rectFT, oz6Var, b1Var, false);
                        while (iD2 == -1 && i2 < i6) {
                            i6--;
                            iD2 = us7.d(v78Var, layout, y5VarC, i6, rectFT, oz6Var, b1Var, false);
                        }
                        if (iD2 == -1) {
                            iArrL = null;
                        } else {
                            iArrL = new int[]{oz6Var.e(iD + 1), oz6Var.f(iD2 - 1)};
                        }
                    }
                } else {
                    iArrL = null;
                }
            } else {
                iArrL = null;
            }
        }
        return iArrL == null ? f88.b : ct7.c(iArrL[0], iArrL[1]);
    }

    public final float c() {
        return q31.h(this.c);
    }

    public final void d(sm0 sm0Var) {
        Canvas canvasB = fb.b(sm0Var);
        v78 v78Var = this.d;
        if (v78Var.d) {
            canvasB.save();
            canvasB.clipRect(0.0f, 0.0f, c(), this.f);
        }
        int i = v78Var.h;
        if (canvasB.getClipBounds(v78Var.o)) {
            if (i != 0) {
                canvasB.translate(0.0f, i);
            }
            ThreadLocal threadLocal = z78.a;
            Object q28Var = threadLocal.get();
            if (q28Var == null) {
                q28Var = new q28();
                threadLocal.set(q28Var);
            }
            q28 q28Var2 = (q28) q28Var;
            q28Var2.a = canvasB;
            try {
                v78Var.f.draw(q28Var2);
                q28Var2.a = null;
                if (i != 0) {
                    canvasB.translate(0.0f, (-1.0f) * i);
                }
            } catch (Throwable th) {
                q28Var2.a = null;
                throw th;
            }
        }
        if (v78Var.d) {
            canvasB.restore();
        }
    }

    public final void e(sm0 sm0Var, long j, t67 t67Var, x38 x38Var, tv1 tv1Var) {
        ph phVar = this.a.i0;
        byte b = phVar.c;
        phVar.d(j);
        phVar.f(t67Var);
        phVar.g(x38Var);
        phVar.e(tv1Var);
        phVar.b(3);
        new d0(1, this, ff.class, "paint", "paint(Landroidx/compose/ui/graphics/Canvas;)V", 0, (byte) 2).B(sm0Var);
        phVar.b(b);
    }

    public final void f(sm0 sm0Var, d90 d90Var, float f, t67 t67Var, x38 x38Var, tv1 tv1Var) {
        ph phVar = this.a.i0;
        byte b = phVar.c;
        phVar.c(d90Var, (((long) Float.floatToRawIntBits(c())) << 32) | (((long) Float.floatToRawIntBits(this.f)) & 4294967295L), f);
        phVar.f(t67Var);
        phVar.g(x38Var);
        phVar.e(tv1Var);
        phVar.b(3);
        new d0(1, this, ff.class, "paint", "paint(Landroidx/compose/ui/graphics/Canvas;)V", 0, (byte) 3).B(sm0Var);
        phVar.b(b);
    }
}
