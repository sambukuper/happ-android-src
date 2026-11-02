package defpackage;

import android.graphics.Typeface;
import android.os.LocaleList;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.ScaleXSpan;
import io.sentry.c2;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kf implements vg5 {
    public final String X;
    public final o88 Y;
    public final List Z;
    public final List f0;
    public final fi2 g0;
    public final fi1 h0;
    public final ph i0;
    public final CharSequence j0;
    public final e34 k0;
    public zv7 l0;
    public final boolean m0;
    public final int n0;
    public final int o0;

    /* JADX WARN: Code duplicated, block: B:15:0x0071  */
    /* JADX WARN: Code duplicated, block: B:18:0x0076  */
    /* JADX WARN: Code duplicated, block: B:241:0x0485  */
    /* JADX WARN: Code duplicated, block: B:247:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:253:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:254:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:256:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:257:0x04de  */
    /* JADX WARN: Code duplicated, block: B:260:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:261:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:263:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:264:0x0505  */
    /* JADX WARN: Code duplicated, block: B:268:0x0532  */
    /* JADX WARN: Code duplicated, block: B:270:0x053e  */
    /* JADX WARN: Code duplicated, block: B:279:0x0554  */
    /* JADX WARN: Code duplicated, block: B:292:0x056f  */
    /* JADX WARN: Code duplicated, block: B:295:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:297:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:300:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:302:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:304:0x05f0 A[LOOP:8: B:303:0x05ee->B:304:0x05f0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:307:0x0606  */
    /* JADX WARN: Code duplicated, block: B:309:0x060b  */
    /* JADX WARN: Code duplicated, block: B:311:0x0612  */
    /* JADX WARN: Code duplicated, block: B:313:0x0616  */
    /* JADX WARN: Code duplicated, block: B:314:0x061d  */
    /* JADX WARN: Code duplicated, block: B:316:0x0625  */
    /* JADX WARN: Code duplicated, block: B:327:0x065d  */
    /* JADX WARN: Code duplicated, block: B:332:0x067a  */
    /* JADX WARN: Code duplicated, block: B:334:0x0686  */
    /* JADX WARN: Code duplicated, block: B:341:0x069a  */
    /* JADX WARN: Code duplicated, block: B:395:0x07c9  */
    /* JADX WARN: Code duplicated, block: B:397:0x07d0  */
    /* JADX WARN: Code duplicated, block: B:399:0x07de  */
    /* JADX WARN: Code duplicated, block: B:406:0x07f2  */
    /* JADX WARN: Code duplicated, block: B:420:0x0841  */
    /* JADX WARN: Code duplicated, block: B:422:0x0852  */
    /* JADX WARN: Code duplicated, block: B:423:0x0856  */
    /* JADX WARN: Code duplicated, block: B:425:0x0861  */
    /* JADX WARN: Code duplicated, block: B:428:0x086b A[LOOP:6: B:427:0x0869->B:428:0x086b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:431:0x087c  */
    /* JADX WARN: Code duplicated, block: B:433:0x0887  */
    /* JADX WARN: Code duplicated, block: B:435:0x0894 A[LOOP:7: B:434:0x0892->B:435:0x0894, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:438:0x08a1  */
    /* JADX WARN: Code duplicated, block: B:440:0x08a5  */
    /* JADX WARN: Code duplicated, block: B:443:0x08b5  */
    /* JADX WARN: Code duplicated, block: B:455:0x0557 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:433:0x0887, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kf] */
    public kf(String str, o88 o88Var, List list, List list2, fi2 fi2Var, fi1 fi1Var, boolean z) throws Throwable {
        boolean zBooleanValue;
        Locale locale;
        int i;
        Object obj;
        jf jfVar;
        Typeface typeface;
        CharSequence charSequence;
        int i2;
        i78 i78Var;
        ArrayList arrayList;
        int size;
        int i3;
        gi2 gi2Var;
        qe7 qe7Var;
        o90 o90Var;
        int size2;
        int i4;
        int[] iArr;
        int size3;
        int i5;
        int i6;
        int i7;
        int i8;
        int size4;
        qe7 qe7VarC;
        int i9;
        ArrayList arrayList2;
        qe7 qe7Var2;
        int i10;
        int i11;
        int i12;
        int size5;
        int i13;
        boolean z2;
        i78 i78Var2;
        int size6;
        int i14;
        kf kfVar;
        int i15;
        pl plVar;
        long j;
        long jB;
        int size7;
        int i16;
        pl plVar2;
        ml mlVar;
        int i17;
        int i18;
        int i19;
        pl plVar3;
        Object obj2;
        int i20;
        int i21;
        pl plVar4;
        Object obj3;
        qe7 qe7Var3;
        long j2;
        long j3;
        int i22;
        long jB2;
        float fC;
        long jB3;
        float fC2;
        fp5 fp5Var;
        CharSequence charSequence2;
        fp5 fp5Var2;
        ?? obj4 = new Object();
        obj4.X = str;
        obj4.Y = o88Var;
        obj4.Z = list;
        obj4.f0 = list2;
        obj4.g0 = fi2Var;
        obj4.h0 = fi1Var;
        float density = fi1Var.getDensity();
        ph phVar = new ph(1);
        ((TextPaint) phVar).density = density;
        phVar.b = x38.b;
        phVar.c = (byte) 3;
        phVar.d = t67.d;
        obj4.i0 = phVar;
        boolean zW = z39.w(o88Var);
        qe7 qe7Var4 = o88Var.a;
        xg5 xg5Var = o88Var.b;
        byte b = 0;
        if (zW) {
            wl6 wl6Var = dz1.a;
            wl6 wl6Var2 = dz1.a;
            lh7 lh7VarO = (lh7) wl6Var2.Y;
            if (lh7VarO == null) {
                if (yy1.d()) {
                    lh7VarO = wl6Var2.O();
                    wl6Var2.Y = lh7VarO;
                } else {
                    lh7VarO = yn0.c;
                }
            }
            zBooleanValue = ((Boolean) lh7VarO.getValue()).booleanValue();
        } else {
            zBooleanValue = false;
        }
        obj4.m0 = zBooleanValue;
        int i23 = xg5Var.b;
        ge4 ge4Var = qe7Var4.k;
        if (i23 == 4) {
            i = 2;
        } else if (i23 == 5) {
            i = 3;
        } else if (i23 == 1) {
            i = 0;
        } else if (i23 == 2) {
            i = 1;
        } else {
            if (i23 != 3 && i23 != 0) {
                bt.i("Invalid TextDirection.");
                throw null;
            }
            int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale((ge4Var == null || (locale = ((ce4) ge4Var.X.get(0)).a) == null) ? Locale.getDefault() : locale);
            if (layoutDirectionFromLocale == 0 || layoutDirectionFromLocale != 1) {
                i = 2;
            } else {
                i = 3;
            }
        }
        obj4.n0 = i;
        obj4.o0 = -1;
        jf jfVar2 = new jf(obj4, b);
        e88 e88Var = xg5Var.i;
        e88Var = e88Var == null ? e88.c : e88Var;
        phVar.setFlags(e88Var.b ? phVar.getFlags() | 128 : phVar.getFlags() & (-129));
        int i24 = e88Var.a;
        if (i24 == 1) {
            phVar.setFlags(phVar.getFlags() | 64);
            phVar.setHinting(0);
        } else if (i24 == 2) {
            phVar.getFlags();
            phVar.setHinting(1);
        } else if (i24 == 3) {
            phVar.getFlags();
            phVar.setHinting(0);
        } else {
            phVar.getFlags();
        }
        int size8 = list.size();
        int i25 = 0;
        while (true) {
            if (i25 >= size8) {
                obj = null;
                break;
            }
            obj = list.get(i25);
            if (((pl) obj).a instanceof qe7) {
                break;
            } else {
                i25++;
            }
        }
        boolean z3 = obj != null;
        long j4 = qe7Var4.b;
        dj2 dj2Var = qe7Var4.c;
        bj2 bj2Var = qe7Var4.d;
        String str2 = qe7Var4.g;
        ge4 ge4Var2 = qe7Var4.k;
        f78 f78Var = qe7Var4.a;
        g78 g78Var = qe7Var4.j;
        long j5 = qe7Var4.h;
        long jB4 = v88.b(j4);
        boolean z4 = z3;
        if (w88.a(jB4, 4294967296L)) {
            phVar.setTextSize(fi1Var.G0(j4));
        } else if (w88.a(jB4, 8589934592L)) {
            phVar.setTextSize(v88.c(j4) * phVar.getTextSize());
        }
        gi2 gi2Var2 = qe7Var4.f;
        if (gi2Var2 == null && bj2Var == null && dj2Var == null) {
            jfVar = jfVar2;
        } else {
            dj2 dj2Var2 = dj2Var == null ? dj2.g0 : dj2Var;
            int i26 = bj2Var != null ? bj2Var.a : 0;
            cj2 cj2Var = qe7Var4.e;
            int i27 = cj2Var != null ? cj2Var.a : 65535;
            jfVar = jfVar2;
            kf kfVar2 = (kf) jfVar.Y;
            rj8 rj8VarB = ((hi2) kfVar2.g0).b(gi2Var2, dj2Var2, i26, i27);
            if (rj8VarB instanceof rj8) {
                Object obj5 = rj8VarB.X;
                obj5.getClass();
                typeface = (Typeface) obj5;
            } else {
                zv7 zv7Var = new zv7(rj8VarB, kfVar2.l0);
                kfVar2.l0 = zv7Var;
                Object obj6 = zv7Var.Z;
                obj6.getClass();
                typeface = (Typeface) obj6;
            }
            phVar.setTypeface(typeface);
        }
        if (ge4Var2 != null) {
            ge4 ge4Var3 = ge4.Z;
            if (!ge4Var2.equals(uo5.a.l())) {
                ArrayList arrayList3 = new ArrayList(xv0.Z(ge4Var2, 10));
                Iterator it = ge4Var2.X.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((ce4) it.next()).a);
                }
                Locale[] localeArr = (Locale[]) arrayList3.toArray(new Locale[0]);
                phVar.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
            }
        }
        if (str2 != null && !str2.equals(_UrlKt.FRAGMENT_ENCODE_SET)) {
            phVar.setFontFeatureSettings(str2);
        }
        if (g78Var != null && !g78Var.equals(g78.c)) {
            phVar.setTextScaleX(phVar.getTextScaleX() * g78Var.a);
            phVar.setTextSkewX(phVar.getTextSkewX() + g78Var.b);
        }
        phVar.d(f78Var.b());
        phVar.c(f78Var.c(), 9205357640488583168L, f78Var.a());
        phVar.f(qe7Var4.n);
        phVar.g(qe7Var4.m);
        phVar.e(qe7Var4.p);
        if (w88.a(v88.b(j5), 4294967296L) && v88.c(j5) != 0.0f) {
            float textScaleX = phVar.getTextScaleX() * phVar.getTextSize();
            float fG0 = fi1Var.G0(j5);
            if (textScaleX != 0.0f) {
                phVar.setLetterSpacing(fG0 / textScaleX);
            }
        } else if (w88.a(v88.b(j5), 8589934592L)) {
            phVar.setLetterSpacing(v88.c(j5));
        }
        long j6 = qe7Var4.l;
        x20 x20Var = qe7Var4.i;
        boolean z5 = z4 && w88.a(v88.b(j5), 4294967296L) && v88.c(j5) != 0.0f;
        long j7 = dw0.g;
        boolean z6 = (tk8.a(j6, j7) || tk8.a(j6, dw0.f)) ? false : true;
        boolean z7 = (x20Var == null || Float.compare(x20Var.a, 0.0f) == 0) ? false : true;
        qe7 qe7Var5 = (z5 || z6 || z7) ? new qe7(0L, 0L, (dj2) null, (bj2) null, (cj2) null, (gi2) null, (String) null, z5 ? j5 : v88.c, z7 ? x20Var : null, (g78) null, (ge4) null, z6 ? j6 : j7, (x38) null, (t67) null, 63103) : null;
        List list3 = obj4.Z;
        if (qe7Var5 != null) {
            int size9 = list3.size() + 1;
            ArrayList arrayList4 = new ArrayList(size9);
            int i28 = 0;
            while (i28 < size9) {
                arrayList4.add(i28 == 0 ? new pl(0, obj4.X.length(), qe7Var5) : (pl) obj4.Z.get(i28 - 1));
                i28++;
            }
            list3 = arrayList4;
        }
        String str3 = obj4.X;
        float textSize = obj4.i0.getTextSize();
        o88 o88Var2 = obj4.Y;
        List list4 = obj4.f0;
        fi1 fi1Var2 = obj4.h0;
        boolean z8 = obj4.m0;
        String str4 = obj4.X;
        if (obj4.o0 == -1) {
            obj4.o0 = (str4.length() > 512 || fm7.e0(str4, '\n')) ? 1 : 0;
        }
        gf gfVar = hf.a;
        if (z8 && yy1.d()) {
            up5 up5Var = o88Var2.c;
            nz1 nz1Var = (up5Var == null || (fp5Var2 = up5Var.b) == null) ? null : new nz1(fp5Var2.b);
            CharSequence charSequenceG = yy1.a().g(0, str3.length(), (nz1Var != null && nz1Var.a == 2) ? 1 : 0, str3);
            charSequenceG.getClass();
            charSequence = charSequenceG;
        } else {
            charSequence = str3;
        }
        if (!list3.isEmpty() || !list4.isEmpty() || !dh3.f(o88Var2.b.d, i78.c) || (o88Var2.b.c & 1095216660480L) != 0) {
            kfVar = obj4;
            charSequence2 = charSequence;
            Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
            qe7 qe7Var6 = o88Var2.a;
            xg5 xg5Var2 = o88Var2.b;
            if (dh3.f(qe7Var6.m, x38.c)) {
                spannableString.setSpan(hf.a, 0, str3.length(), 33);
            }
            up5 up5Var2 = o88Var2.c;
            if (((up5Var2 == null || (fp5Var = up5Var2.b) == null) ? false : fp5Var.a) && xg5Var2.f == null) {
                float fH = dh3.H(xg5Var2.c, textSize, fi1Var2);
                if (!Float.isNaN(fH)) {
                    spannableString.setSpan(new w94(fH), 0, spannableString.length(), 33);
                }
            } else {
                aa4 aa4Var = xg5Var2.f;
                aa4Var = aa4Var == null ? aa4.d : aa4Var;
                float fH2 = dh3.H(xg5Var2.c, textSize, fi1Var2);
                if (!Float.isNaN(fH2)) {
                    int length = (spannableString.length() == 0 || fm7.p0(spannableString) == '\n') ? spannableString.length() + 1 : spannableString.length();
                    int i29 = aa4Var.b;
                    i2 = 0;
                    spannableString.setSpan(new ba4(fH2, length, (i29 & 1) > 0, (i29 & 16) > 0, aa4Var.a, aa4Var.c), 0, spannableString.length(), 33);
                }
                i78Var = xg5Var2.d;
                if (i78Var != null) {
                    j2 = i78Var.a;
                    j3 = i78Var.b;
                    i22 = i2;
                    if ((v88.a(j2, eu7.g(i22)) || !v88.a(j3, eu7.g(i22))) && (j2 & 1095216660480L) != 0 && (j3 & 1095216660480L) != 0) {
                        jB2 = v88.b(j2);
                        if (w88.a(jB2, 4294967296L)) {
                            fC = fi1Var2.G0(j2);
                        } else if (w88.a(jB2, 8589934592L)) {
                            fC = v88.c(j2) * textSize;
                        } else {
                            fC = 0.0f;
                        }
                        jB3 = v88.b(j3);
                        if (w88.a(jB3, 4294967296L)) {
                            fC2 = fi1Var2.G0(j3);
                        } else if (w88.a(jB3, 8589934592L)) {
                            fC2 = v88.c(j3) * textSize;
                        } else {
                            fC2 = 0.0f;
                        }
                        spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fC), (int) Math.ceil(fC2)), 0, spannableString.length(), 33);
                    }
                }
                arrayList = new ArrayList(list3.size());
                size = list3.size();
                for (i3 = 0; i3 < size; i3++) {
                    plVar4 = (pl) list3.get(i3);
                    obj3 = plVar4.a;
                    if (obj3 instanceof qe7) {
                        qe7Var3 = (qe7) obj3;
                        if (qe7Var3.f == null || qe7Var3.d != null || qe7Var3.c != null || ((qe7) obj3).e != null) {
                            arrayList.add(plVar4);
                        }
                    }
                }
                gi2Var = qe7Var6.f;
                if (gi2Var != null && qe7Var6.d == null && qe7Var6.c == null && qe7Var6.e == null) {
                    qe7Var = null;
                } else {
                    qe7Var = new qe7(0L, 0L, qe7Var6.c, qe7Var6.d, qe7Var6.e, gi2Var, (String) null, 0L, (x20) null, (g78) null, (ge4) null, 0L, (x38) null, (t67) null, 65475);
                }
                o90Var = new o90((Object) spannableString, (Object) jfVar, (byte) 14);
                if (arrayList.size() <= 1) {
                    size2 = arrayList.size();
                    i4 = size2 * 2;
                    iArr = new int[i4];
                    size3 = arrayList.size();
                    for (i5 = 0; i5 < size3; i5++) {
                        pl plVar5 = (pl) arrayList.get(i5);
                        iArr[i5] = plVar5.b;
                        iArr[i5 + size2] = plVar5.c;
                    }
                    if (i4 > 1) {
                        Arrays.sort(iArr);
                    }
                    if (i4 != 0) {
                        em7.g("Array is empty.");
                        throw null;
                    }
                    i6 = iArr[0];
                    i7 = 0;
                    while (i7 < i4) {
                        i8 = iArr[i7];
                        if (i8 == i6) {
                            arrayList2 = arrayList;
                            qe7Var2 = qe7Var;
                            i10 = i7;
                        } else {
                            size4 = arrayList.size();
                            qe7VarC = qe7Var;
                            i9 = 0;
                            while (i9 < size4) {
                                ArrayList arrayList5 = arrayList;
                                pl plVar6 = (pl) arrayList.get(i9);
                                qe7 qe7Var7 = qe7Var;
                                i11 = plVar6.b;
                                int i30 = i7;
                                i12 = plVar6.c;
                                if (i11 == i12 && rl.b(i6, i8, i11, i12)) {
                                    qe7 qe7Var8 = (qe7) plVar6.a;
                                    qe7VarC = qe7VarC != null ? qe7VarC.c(qe7Var8) : qe7Var8;
                                }
                                i9++;
                                arrayList = arrayList5;
                                qe7Var = qe7Var7;
                                i7 = i30;
                            }
                            arrayList2 = arrayList;
                            qe7Var2 = qe7Var;
                            i10 = i7;
                            if (qe7VarC != null) {
                                o90Var.x(qe7VarC, Integer.valueOf(i6), Integer.valueOf(i8));
                            }
                            i6 = i8;
                        }
                        i7 = i10 + 1;
                        arrayList = arrayList2;
                        qe7Var = qe7Var2;
                    }
                } else if (!arrayList.isEmpty()) {
                    qe7 qe7Var9 = (qe7) ((pl) arrayList.get(0)).a;
                    o90Var.x(qe7Var != null ? qe7Var.c(qe7Var9) : qe7Var9, Integer.valueOf(((pl) arrayList.get(0)).b), Integer.valueOf(((pl) arrayList.get(0)).c));
                }
                size5 = list3.size();
                i13 = 0;
                z2 = false;
                while (i13 < size5) {
                    plVar3 = (pl) list3.get(i13);
                    obj2 = plVar3.a;
                    if (obj2 instanceof qe7) {
                        i20 = plVar3.b;
                        int i31 = plVar3.c;
                        if (i20 >= 0 || i20 >= spannableString.length() || i31 <= i20 || i31 > spannableString.length()) {
                            size5 = size5;
                            z2 = z2;
                        } else {
                            qe7 qe7Var10 = (qe7) obj2;
                            long j8 = qe7Var10.h;
                            x20 x20Var2 = qe7Var10.i;
                            f78 f78Var2 = qe7Var10.a;
                            if (x20Var2 != null) {
                                spannableString.setSpan(new y20(x20Var2.a, (byte) 0), i20, i31, 33);
                            }
                            dh3.J(spannableString, f78Var2.b(), i20, i31);
                            d90 d90VarC = f78Var2.c();
                            float fA = f78Var2.a();
                            if (d90VarC != null) {
                                if (d90VarC instanceof fe7) {
                                    dh3.J(spannableString, ((fe7) d90VarC).a, i20, i31);
                                } else {
                                    spannableString.setSpan(new r67((q67) d90VarC, fA), i20, i31, 33);
                                }
                            }
                            x38 x38Var = qe7Var10.m;
                            if (x38Var != null) {
                                int i32 = x38Var.a;
                                y38 y38Var = new y38((i32 | 1) == i32, (i32 | 2) == i32);
                                i21 = 33;
                                spannableString.setSpan(y38Var, i20, i31, 33);
                            } else {
                                i21 = 33;
                            }
                            xg5Var2 = xg5Var2;
                            dh3.K(spannableString, qe7Var10.b, fi1Var2, i20, i31);
                            String str5 = qe7Var10.g;
                            if (str5 != null) {
                                spannableString.setSpan(new ji2(str5, (byte) 0), i20, i31, i21);
                            }
                            g78 g78Var2 = qe7Var10.j;
                            if (g78Var2 != null) {
                                spannableString.setSpan(new ScaleXSpan(g78Var2.a), i20, i31, i21);
                                spannableString.setSpan(new y20(g78Var2.b, (byte) 1), i20, i31, i21);
                            }
                            dh3.L(spannableString, qe7Var10.k, i20, i31);
                            long j9 = qe7Var10.l;
                            if (j9 != 16) {
                                spannableString.setSpan(new BackgroundColorSpan(z51.U(j9)), i20, i31, i21);
                            }
                            t67 t67Var = qe7Var10.n;
                            if (t67Var != null) {
                                long j10 = t67Var.b;
                                int iU = z51.U(t67Var.a);
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
                                float f = t67Var.c;
                                w67 w67Var = new w67(fIntBitsToFloat, fIntBitsToFloat2, f == 0.0f ? Float.MIN_VALUE : f, iU);
                                i21 = 33;
                                spannableString.setSpan(w67Var, i20, i31, 33);
                            }
                            tv1 tv1Var = qe7Var10.p;
                            if (tv1Var != null) {
                                spannableString.setSpan(new uv1(tv1Var), i20, i31, i21);
                            }
                            z2 = (w88.a(v88.b(j8), 4294967296L) || w88.a(v88.b(j8), 8589934592L)) ? true : z2;
                        }
                        z2 = z2;
                    } else {
                        size5 = size5;
                        z2 = z2;
                        z2 = z2;
                    }
                    i13++;
                    size5 = size5;
                }
                if (z2) {
                    size7 = list3.size();
                    i16 = 0;
                    while (i16 < size7) {
                        plVar2 = (pl) list3.get(i16);
                        mlVar = (ml) plVar2.a;
                        if (mlVar instanceof qe7) {
                            i19 = plVar2.b;
                            int i33 = plVar2.c;
                            if (i19 >= 0 || i19 >= spannableString.length() || i33 <= i19 || i33 > spannableString.length()) {
                                i17 = size7;
                                i18 = i16;
                            } else {
                                long j11 = ((qe7) mlVar).h;
                                long jB5 = v88.b(j11);
                                i17 = size7;
                                i18 = i16;
                                Object k84Var = w88.a(jB5, 4294967296L) ? new k84(fi1Var2.G0(j11)) : w88.a(jB5, 8589934592L) ? new j84(v88.c(j11)) : null;
                                if (k84Var != null) {
                                    spannableString.setSpan(k84Var, i19, i33, 33);
                                }
                            }
                        } else {
                            i17 = size7;
                            i18 = i16;
                        }
                        i16 = i18 + 1;
                        size7 = i17;
                    }
                }
                i78Var2 = xg5Var2.d;
                if (i78Var2 != null) {
                    j = i78Var2.a;
                    jB = v88.b(j);
                    if (w88.a(jB, 4294967296L)) {
                        fi1Var2.G0(j);
                    } else if (w88.a(jB, 8589934592L)) {
                        v88.c(j);
                    }
                }
                size6 = list3.size();
                for (i14 = 0; i14 < size6; i14++) {
                    Object obj7 = ((pl) list3.get(i14)).a;
                }
                if (list4.size() > 0) {
                    plVar = (pl) list4.get(0);
                    if (plVar.a == null) {
                        c2.m();
                        throw null;
                    }
                    for (Object obj8 : spannableString.getSpans(plVar.b, plVar.c, pj8.class)) {
                        spannableString.removeSpan((pj8) obj8);
                    }
                    throw null;
                }
                kfVar = this;
                charSequence2 = spannableString;
            }
            i2 = 0;
            i78Var = xg5Var2.d;
            if (i78Var != null) {
                j2 = i78Var.a;
                j3 = i78Var.b;
                i22 = i2;
                if (v88.a(j2, eu7.g(i22))) {
                    jB2 = v88.b(j2);
                    if (w88.a(jB2, 4294967296L)) {
                        fC = fi1Var2.G0(j2);
                    } else if (w88.a(jB2, 8589934592L)) {
                        fC = v88.c(j2) * textSize;
                    } else {
                        fC = 0.0f;
                    }
                    jB3 = v88.b(j3);
                    if (w88.a(jB3, 4294967296L)) {
                        fC2 = fi1Var2.G0(j3);
                    } else if (w88.a(jB3, 8589934592L)) {
                        fC2 = v88.c(j3) * textSize;
                    } else {
                        fC2 = 0.0f;
                    }
                    spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fC), (int) Math.ceil(fC2)), 0, spannableString.length(), 33);
                } else {
                    jB2 = v88.b(j2);
                    if (w88.a(jB2, 4294967296L)) {
                        fC = fi1Var2.G0(j2);
                    } else if (w88.a(jB2, 8589934592L)) {
                        fC = v88.c(j2) * textSize;
                    } else {
                        fC = 0.0f;
                    }
                    jB3 = v88.b(j3);
                    if (w88.a(jB3, 4294967296L)) {
                        fC2 = fi1Var2.G0(j3);
                    } else if (w88.a(jB3, 8589934592L)) {
                        fC2 = v88.c(j3) * textSize;
                    } else {
                        fC2 = 0.0f;
                    }
                    spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fC), (int) Math.ceil(fC2)), 0, spannableString.length(), 33);
                }
            }
            arrayList = new ArrayList(list3.size());
            size = list3.size();
            while (i3 < size) {
                plVar4 = (pl) list3.get(i3);
                obj3 = plVar4.a;
                if (obj3 instanceof qe7) {
                    qe7Var3 = (qe7) obj3;
                    if (qe7Var3.f == null) {
                        arrayList.add(plVar4);
                    } else {
                        arrayList.add(plVar4);
                    }
                }
            }
            gi2Var = qe7Var6.f;
            if (gi2Var != null) {
                qe7Var = new qe7(0L, 0L, qe7Var6.c, qe7Var6.d, qe7Var6.e, gi2Var, (String) null, 0L, (x20) null, (g78) null, (ge4) null, 0L, (x38) null, (t67) null, 65475);
            } else {
                qe7Var = new qe7(0L, 0L, qe7Var6.c, qe7Var6.d, qe7Var6.e, gi2Var, (String) null, 0L, (x20) null, (g78) null, (ge4) null, 0L, (x38) null, (t67) null, 65475);
            }
            o90Var = new o90((Object) spannableString, (Object) jfVar, (byte) 14);
            if (arrayList.size() <= 1) {
                size2 = arrayList.size();
                i4 = size2 * 2;
                iArr = new int[i4];
                size3 = arrayList.size();
                while (i5 < size3) {
                    pl plVar7 = (pl) arrayList.get(i5);
                    iArr[i5] = plVar7.b;
                    iArr[i5 + size2] = plVar7.c;
                }
                if (i4 > 1) {
                    Arrays.sort(iArr);
                }
                if (i4 != 0) {
                    em7.g("Array is empty.");
                    throw null;
                }
                i6 = iArr[0];
                i7 = 0;
                while (i7 < i4) {
                    i8 = iArr[i7];
                    if (i8 == i6) {
                        arrayList2 = arrayList;
                        qe7Var2 = qe7Var;
                        i10 = i7;
                    } else {
                        size4 = arrayList.size();
                        qe7VarC = qe7Var;
                        i9 = 0;
                        while (i9 < size4) {
                            ArrayList arrayList6 = arrayList;
                            pl plVar8 = (pl) arrayList.get(i9);
                            qe7 qe7Var11 = qe7Var;
                            i11 = plVar8.b;
                            int i34 = i7;
                            i12 = plVar8.c;
                            if (i11 == i12) {
                            }
                            i9++;
                            arrayList = arrayList6;
                            qe7Var = qe7Var11;
                            i7 = i34;
                        }
                        arrayList2 = arrayList;
                        qe7Var2 = qe7Var;
                        i10 = i7;
                        if (qe7VarC != null) {
                            o90Var.x(qe7VarC, Integer.valueOf(i6), Integer.valueOf(i8));
                        }
                        i6 = i8;
                    }
                    i7 = i10 + 1;
                    arrayList = arrayList2;
                    qe7Var = qe7Var2;
                }
            } else if (!arrayList.isEmpty()) {
                qe7 qe7Var12 = (qe7) ((pl) arrayList.get(0)).a;
                o90Var.x(qe7Var != null ? qe7Var.c(qe7Var12) : qe7Var12, Integer.valueOf(((pl) arrayList.get(0)).b), Integer.valueOf(((pl) arrayList.get(0)).c));
            }
            size5 = list3.size();
            i13 = 0;
            z2 = false;
            while (i13 < size5) {
                plVar3 = (pl) list3.get(i13);
                obj2 = plVar3.a;
                if (obj2 instanceof qe7) {
                    i20 = plVar3.b;
                    int i35 = plVar3.c;
                    if (i20 >= 0) {
                        size5 = size5;
                        z2 = z2;
                        z2 = z2;
                    } else {
                        size5 = size5;
                        z2 = z2;
                        z2 = z2;
                    }
                } else {
                    size5 = size5;
                    z2 = z2;
                    z2 = z2;
                }
                i13++;
                size5 = size5;
            }
            if (z2) {
                size7 = list3.size();
                i16 = 0;
                while (i16 < size7) {
                    plVar2 = (pl) list3.get(i16);
                    mlVar = (ml) plVar2.a;
                    if (mlVar instanceof qe7) {
                        i19 = plVar2.b;
                        int i36 = plVar2.c;
                        if (i19 >= 0) {
                            i17 = size7;
                            i18 = i16;
                        } else {
                            i17 = size7;
                            i18 = i16;
                        }
                    } else {
                        i17 = size7;
                        i18 = i16;
                    }
                    i16 = i18 + 1;
                    size7 = i17;
                }
            }
            i78Var2 = xg5Var2.d;
            if (i78Var2 != null) {
                j = i78Var2.a;
                jB = v88.b(j);
                if (w88.a(jB, 4294967296L)) {
                    fi1Var2.G0(j);
                } else if (w88.a(jB, 8589934592L)) {
                    v88.c(j);
                }
            }
            size6 = list3.size();
            while (i14 < size6) {
                Object obj9 = ((pl) list3.get(i14)).a;
            }
            if (list4.size() > 0) {
                plVar = (pl) list4.get(0);
                if (plVar.a == null) {
                    c2.m();
                    throw null;
                }
                while (i15 < r1) {
                    spannableString.removeSpan((pj8) obj8);
                }
                throw null;
            }
            kfVar = this;
            charSequence2 = spannableString;
        }
        kfVar = obj4;
        charSequence2 = charSequence;
        kfVar.j0 = charSequence2;
        kfVar.k0 = new e34(charSequence2, kfVar.i0, kfVar.n0);
    }

    @Override // defpackage.vg5
    public final boolean b() {
        zv7 zv7Var = this.l0;
        if (zv7Var != null ? zv7Var.p() : false) {
            return true;
        }
        if (!this.m0 && z39.w(this.Y)) {
            wl6 wl6Var = dz1.a;
            wl6 wl6Var2 = dz1.a;
            lh7 lh7VarO = (lh7) wl6Var2.Y;
            if (lh7VarO == null) {
                if (yy1.d()) {
                    lh7VarO = wl6Var2.O();
                    wl6Var2.Y = lh7VarO;
                } else {
                    lh7VarO = yn0.c;
                }
            }
            if (((Boolean) lh7VarO.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.vg5
    public final float h() {
        e34 e34Var = this.k0;
        float f = e34Var.e;
        TextPaint textPaint = e34Var.b;
        if (!Float.isNaN(f)) {
            return e34Var.e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = e34Var.a;
        lineInstance.setText(new cq0(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, wl7.c);
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new kf3(i, next, 1));
            } else {
                kf3 kf3Var = (kf3) priorityQueue.peek();
                if (kf3Var != null && kf3Var.Y - kf3Var.X < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new kf3(i, next, 1));
                }
            }
            i = next;
        }
        float desiredWidth = 0.0f;
        if (!priorityQueue.isEmpty()) {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                bt.n();
                return 0.0f;
            }
            kf3 kf3Var2 = (kf3) it.next();
            desiredWidth = Layout.getDesiredWidth(e34Var.b(), kf3Var2.X, kf3Var2.Y, textPaint);
            while (it.hasNext()) {
                kf3 kf3Var3 = (kf3) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(e34Var.b(), kf3Var3.X, kf3Var3.Y, textPaint));
            }
        }
        e34Var.e = desiredWidth;
        return desiredWidth;
    }

    @Override // defpackage.vg5
    public final float l() {
        return this.k0.c();
    }
}
