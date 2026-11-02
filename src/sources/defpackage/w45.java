package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import io.sentry.c2;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import okhttp3.dnsoverhttps.DnsOverHttps;
import okhttp3.internal.http2.Http2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w45 {
    public static final y2 a = new y2((byte) 25);
    public static final int[] b = new int[0];
    public static final long[] c = new long[0];
    public static final Object[] d = new Object[0];
    public static final h09 e = new h09(0.31006f, 0.31616f);
    public static final h09 f = new h09(0.34567f, 0.3585f);
    public static final h09 g = new h09(0.32168f, 0.33767f);
    public static final h09 h = new h09(0.31271f, 0.32902f);
    public static final float[] i = {0.964212f, 1.0f, 0.825188f};
    public static final StackTraceElement[] j = new StackTraceElement[0];
    public static final d77 k = d77.g0;
    public static final float l = 8.0f;
    public static final float m = 24.0f;
    public static g73 n;

    public static StaticLayout A(CharSequence charSequence, TextPaint textPaint, int i2, int i3, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i4, TextUtils.TruncateAt truncateAt, int i5, int i6, boolean z, int i7, int i8, int i9, int i10) {
        if (i3 < 0) {
            xc3.a("invalid start value");
        }
        int length = charSequence.length();
        if (i3 < 0 || i3 > length) {
            xc3.a("invalid end value");
        }
        if (i4 < 0) {
            xc3.a("invalid maxLines value");
        }
        if (i2 < 0) {
            xc3.a("invalid width value");
        }
        if (i5 < 0) {
            xc3.a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, i3, textPaint, i2);
        builderObtain.setTextDirection(textDirectionHeuristic);
        builderObtain.setAlignment(alignment);
        builderObtain.setMaxLines(i4);
        builderObtain.setEllipsize(truncateAt);
        builderObtain.setEllipsizedWidth(i5);
        builderObtain.setLineSpacing(0.0f, 1.0f);
        builderObtain.setIncludePad(z);
        builderObtain.setBreakStrategy(i7);
        builderObtain.setHyphenationFrequency(i10);
        builderObtain.setIndents(null, null);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            ue3.a0(builderObtain, i6);
        }
        if (i11 >= 28) {
            en.a0(builderObtain);
        }
        if (i11 >= 33) {
            c4.D(builderObtain, i8, i9);
        }
        if (i11 >= 35) {
            nn.a(builderObtain);
        }
        return builderObtain.build();
    }

    public static final zx B(CaptureRequest.Key key) {
        key.getClass();
        return new zx("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final hi2 C(Context context) {
        be beVar = new be(0 == true ? 1 : 0);
        context.getApplicationContext();
        return new hi2(beVar, new ce(Build.VERSION.SDK_INT >= 31 ? ej2.a.a(context) : 0));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    public static final je D(jc0 jc0Var, float f2) {
        int iCeil = ((int) Math.ceil(f2)) * 2;
        je jeVarD = z51.m;
        eb ebVarA = z51.n;
        um0 um0Var = z51.o;
        if (jeVarD == null || ebVarA == null) {
            jeVarD = mb6.d(iCeil, iCeil, 1);
            z51.m = jeVarD;
            ebVarA = fb.a(jeVarD);
            z51.n = ebVarA;
        } else {
            Bitmap bitmap = jeVarD.a;
            if (iCeil > bitmap.getWidth() || iCeil > bitmap.getHeight()) {
                jeVarD = mb6.d(iCeil, iCeil, 1);
                z51.m = jeVarD;
                ebVarA = fb.a(jeVarD);
                z51.n = ebVarA;
            }
        }
        je jeVar = jeVarD;
        eb ebVar = ebVarA;
        if (um0Var == null) {
            um0Var = new um0();
            z51.o = um0Var;
        }
        um0 um0Var2 = um0Var;
        tm0 tm0Var = um0Var2.X;
        z24 layoutDirection = jc0Var.X.getLayoutDirection();
        Bitmap bitmap2 = jeVar.a;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(bitmap2.getWidth())) << 32) | (((long) Float.floatToRawIntBits(bitmap2.getHeight())) & 4294967295L);
        fi1 fi1Var = tm0Var.a;
        z24 z24Var = tm0Var.b;
        sm0 sm0Var = tm0Var.c;
        long j2 = tm0Var.d;
        tm0Var.a = jc0Var;
        tm0Var.b = layoutDirection;
        tm0Var.c = ebVar;
        tm0Var.d = jFloatToRawIntBits;
        ebVar.g();
        sv1.k0(um0Var2, dw0.b, 0L, um0Var2.e(), 0.0f, 58);
        sv1.k0(um0Var2, z51.e(4278190080L), 0L, (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), 0.0f, 120);
        sv1.o0(um0Var2, z51.e(4278190080L), f2, (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), null, 120);
        ebVar.p();
        tm0Var.a = fi1Var;
        tm0Var.b = z24Var;
        tm0Var.c = sm0Var;
        tm0Var.d = j2;
        return jeVar;
    }

    public static u1 E(lv3 lv3Var, List list, int i2) {
        int i3 = i2 & 1;
        d02 d02Var = d02.X;
        if (i3 != 0) {
            list = d02Var;
        }
        lv3Var.getClass();
        if (!q08.a) {
            zu3 zu3Var = lv3Var instanceof zu3 ? (zu3) lv3Var : null;
            List listO = zu3Var != null ? yn0.o(zu3Var) : null;
            if (listO == null) {
                listO = d02Var;
            }
            o(listO.size(), list.size());
        }
        return G(lv3Var, list, false, d02Var, 8);
    }

    public static final u1 F(lv3 lv3Var, List list, boolean z, List list2, zu3 zu3Var) {
        ot0 ot0VarH0;
        wg7 wg7Var;
        lv3Var.getClass();
        list.getClass();
        list2.getClass();
        if (!q08.a) {
            return new s97(lv3Var, list, z, new qc3(list2), null, false, false, false, zu3Var, null);
        }
        if (lv3Var instanceof ev3) {
            ot0VarH0 = ((ev3) lv3Var).h0();
            if (zu3Var != null) {
                fk2 fk2Var = (fk2) ll3.k.get(bl1.f(ot0VarH0));
                if (fk2Var == null) {
                    c2.j("Given class ", ot0VarH0, " is not a read-only collection");
                    return null;
                }
                ot0VarH0 = el1.e(ot0VarH0).j(fk2Var);
            }
        } else {
            if (!(lv3Var instanceof rw3)) {
                StringBuilder sb = new StringBuilder("Cannot create type for an unsupported classifier: ");
                sb.append(lv3Var);
                Class<?> cls = lv3Var.getClass();
                sb.append(" (");
                sb.append(cls);
                sb.append(')');
                throw new p14(sb.toString());
            }
            rw3 rw3Var = (rw3) lv3Var;
            hi8 hi8Var = rw3Var.h0;
            if (hi8Var == null) {
                b61.o(rw3Var, "Descriptor-less type parameter: ");
                return null;
            }
            ot0VarH0 = hi8Var;
        }
        o(ot0VarH0.l().g().size(), list.size());
        lh8 lh8VarL = ot0VarH0.l();
        lh8VarL.getClass();
        List listG = lh8VarL.g();
        listG.getClass();
        ch8.Y.getClass();
        ch8 ch8Var = ch8.Z;
        ArrayList arrayList = new ArrayList(xv0.Z(list, 10));
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                i21.X();
                throw null;
            }
            uw3 uw3Var = (uw3) obj;
            kk1 kk1Var = (kk1) uw3Var.b;
            t14 t14Var = kk1Var != null ? kk1Var.Y : null;
            yw3 yw3Var = uw3Var.a;
            int i4 = yw3Var == null ? -1 : vu3.a[yw3Var.ordinal()];
            if (i4 == -1) {
                Object obj2 = listG.get(i2);
                obj2.getClass();
                wg7Var = new wg7((hi8) obj2);
            } else if (i4 == 1) {
                t14Var.getClass();
                wg7Var = new wg7(t14Var, rt8.INVARIANT);
            } else if (i4 == 2) {
                t14Var.getClass();
                wg7Var = new wg7(t14Var, rt8.IN_VARIANCE);
            } else {
                if (i4 != 3) {
                    b61.c();
                    return null;
                }
                t14Var.getClass();
                wg7Var = new wg7(t14Var, rt8.OUT_VARIANCE);
            }
            arrayList.add(wg7Var);
            i2 = i3;
        }
        return new kk1(dh3.N(ch8Var, lh8VarL, arrayList, z), null, false);
    }

    public static /* synthetic */ u1 G(lv3 lv3Var, List list, boolean z, List list2, int i2) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            list2 = d02.X;
        }
        return F(lv3Var, list, z, list2, null);
    }

    /* JADX WARN: Code duplicated, block: B:271:0x0607  */
    /* JADX WARN: Code duplicated, block: B:273:0x060c  */
    /* JADX WARN: Code duplicated, block: B:276:0x0626  */
    /* JADX WARN: Code duplicated, block: B:279:0x062c  */
    /* JADX WARN: Code duplicated, block: B:281:0x0636  */
    /* JADX WARN: Code duplicated, block: B:290:0x0658  */
    /* JADX WARN: Code duplicated, block: B:292:0x065b  */
    /* JADX WARN: Code duplicated, block: B:294:0x0663  */
    /* JADX WARN: Code duplicated, block: B:324:0x06ab  */
    /* JADX WARN: Code duplicated, block: B:327:0x06b3 A[LOOP:29: B:323:0x06a9->B:327:0x06b3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:329:0x06b9  */
    /* JADX WARN: Code duplicated, block: B:333:0x06c1  */
    /* JADX WARN: Code duplicated, block: B:335:0x06c8  */
    /* JADX WARN: Code duplicated, block: B:362:0x0717  */
    /* JADX WARN: Code duplicated, block: B:373:0x0749  */
    /* JADX WARN: Code duplicated, block: B:375:0x074e  */
    /* JADX WARN: Code duplicated, block: B:377:0x0755  */
    /* JADX WARN: Code duplicated, block: B:382:0x0772  */
    /* JADX WARN: Code duplicated, block: B:387:0x07ad  */
    /* JADX WARN: Code duplicated, block: B:389:0x07b1  */
    /* JADX WARN: Code duplicated, block: B:391:0x07b8  */
    /* JADX WARN: Code duplicated, block: B:472:0x0774 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:476:0x0646 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:489:0x06b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:490:0x06bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:494:0x0757 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:498:0x07bb A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v44 */
    /* JADX WARN: Type inference failed for: r11v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v6, types: [u50] */
    /* JADX WARN: Type inference failed for: r5v7, types: [u50] */
    public static w50 H(String str, HashMap map) throws s59 {
        Charset charsetForName;
        int i2;
        int i3;
        gx4 gx4Var;
        av8 av8VarC;
        ?? r5;
        av8 av8Var;
        hq0 hq0Var;
        ?? r6;
        int i4;
        int i5;
        int i6;
        int iMin;
        int i7;
        int i8;
        w50 w50Var;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        byte[][] bArr;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int iAbs;
        byte[] bArr2;
        int i21;
        int i22;
        byte[] bArr3;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        byte[] bArr4;
        byte b2;
        int i31;
        int i32;
        byte[] bArr5;
        char c2;
        if (str.isEmpty()) {
            bt.q("Found empty contents");
            return null;
        }
        r02 r02Var = r02.X;
        int i33 = 1;
        int iF = map.containsKey(r02Var) ? p61.F(map.get(r02Var).toString()) : 1;
        r02 r02Var2 = r02.Z;
        int i34 = 4;
        int i35 = map.containsKey(r02Var2) ? Integer.parseInt(map.get(r02Var2).toString()) : 4;
        Charset charset = t02.b;
        r02 r02Var3 = r02.i0;
        int i36 = 0;
        boolean z = map.containsKey(r02Var3) && Boolean.parseBoolean(map.get(r02Var3).toString());
        r02 r02Var4 = r02.h0;
        boolean z2 = map.containsKey(r02Var4) && Boolean.parseBoolean(map.get(r02Var4).toString());
        r02 r02Var5 = r02.Y;
        boolean zContainsKey = map.containsKey(r02Var5);
        if (zContainsKey) {
            try {
                charsetForName = Charset.forName(map.get(r02Var5).toString());
            } catch (UnsupportedCharsetException unused) {
                charsetForName = charset;
            }
        } else {
            charsetForName = charset;
        }
        int i37 = 8;
        if (z2) {
            if (charsetForName.equals(charset)) {
                charsetForName = null;
            }
            m70 m70Var = new m70(str, charsetForName, z, iF);
            int i38 = m70Var.b;
            av8[] av8VarArr = {m70.f(1), m70.f(2), m70.f(3)};
            f63[] f63VarArr = {m70Var.e(av8VarArr[0]), m70Var.e(av8VarArr[1]), m70Var.e(av8VarArr[2])};
            int i39 = 0;
            int i40 = -1;
            int i41 = Integer.MAX_VALUE;
            for (int i42 = 3; i39 < i42; i42 = 3) {
                f63 f63Var = f63VarArr[i39];
                int i43 = i33;
                int iR = f63Var.r((av8) f63Var.Z);
                if (t02.c(iR, av8VarArr[i39], i38) && iR < i41) {
                    i41 = iR;
                    i40 = i39;
                }
                i39++;
                i33 = i43;
            }
            i2 = i33;
            if (i40 < 0) {
                throw new s59("Data too big for any version");
            }
            f63 f63Var2 = f63VarArr[i40];
            u50 u50Var = new u50();
            for (wv4 wv4Var : (ArrayList) f63Var2.Y) {
                int i44 = wv4Var.c;
                f63 f63Var3 = wv4Var.e;
                m70 m70Var2 = (m70) f63Var3.f0;
                gx4 gx4Var2 = wv4Var.a;
                int i45 = i36;
                u50Var.b(gx4Var2.Y, 4);
                int i46 = wv4Var.d;
                if (i46 > 0) {
                    u50Var.b(wv4Var.a(), gx4Var2.a((av8) f63Var3.Z));
                }
                if (gx4Var2 == gx4.ECI) {
                    u50Var.b(((hq0) hq0.f0.get(((wx1) m70Var2.e).a[i44].charset().name())).X[i45], 8);
                } else if (i46 > 0) {
                    String str2 = (String) m70Var2.d;
                    int i47 = wv4Var.b;
                    t02.a(str2.substring(i47, i46 + i47), gx4Var2, u50Var, ((wx1) m70Var2.e).a[i44].charset());
                }
                i36 = i45;
            }
            i3 = i36;
            av8Var = (av8) f63Var2.Z;
            r5 = u50Var;
        } else {
            i2 = 1;
            i3 = 0;
            Charset charset2 = am7.b;
            gx4 gx4Var3 = gx4.BYTE;
            if (charset2 == null || !charset2.equals(charsetForName) || !t02.b(str)) {
                boolean z3 = false;
                boolean z4 = false;
                int i48 = 0;
                while (true) {
                    if (i48 < str.length()) {
                        char cCharAt = str.charAt(i48);
                        if (cCharAt >= '0' && cCharAt <= '9') {
                            z4 = true;
                        } else if ((cCharAt < '`' ? t02.a[cCharAt] : -1) != -1) {
                            z3 = true;
                        }
                        i48++;
                        z3 = z3;
                        z4 = z4;
                    } else {
                        if (z3) {
                            gx4Var = gx4.ALPHANUMERIC;
                            break;
                        }
                        if (z4) {
                            gx4Var = gx4.NUMERIC;
                            break;
                        }
                    }
                    gx4Var = gx4Var3;
                    break;
                }
            }
            gx4Var = gx4.KANJI;
            u50 u50Var2 = new u50();
            if (gx4Var == gx4Var3 && zContainsKey && (hq0Var = (hq0) hq0.f0.get(charsetForName.name())) != null) {
                u50Var2.b(7, 4);
                u50Var2.b(hq0Var.X[0], 8);
            }
            if (z) {
                u50Var2.b(5, 4);
            }
            u50Var2.b(gx4Var.Y, 4);
            u50 u50Var3 = new u50();
            t02.a(str, gx4Var, u50Var3, charsetForName);
            r02 r02Var6 = r02.f0;
            if (map.containsKey(r02Var6)) {
                av8 av8VarC2 = av8.c(Integer.parseInt(map.get(r02Var6).toString()));
                if (!t02.c(gx4Var.a(av8VarC2) + u50Var2.Y + u50Var3.Y, av8VarC2, iF)) {
                    throw new s59("Data too big for requested version");
                }
                av8VarC = av8VarC2;
            } else {
                int iA = gx4Var.a(av8.c(1)) + u50Var2.Y + u50Var3.Y;
                int i49 = 1;
                while (true) {
                    if (i49 > 40) {
                        throw new s59("Data too big");
                    }
                    av8 av8VarC3 = av8.c(i49);
                    if (t02.c(iA, av8VarC3, iF)) {
                        int iA2 = gx4Var.a(av8VarC3) + u50Var2.Y + u50Var3.Y;
                        int i50 = 1;
                        while (true) {
                            if (i50 > 40) {
                                throw new s59("Data too big");
                            }
                            av8VarC = av8.c(i50);
                            if (t02.c(iA2, av8VarC, iF)) {
                                break;
                            }
                            i50++;
                            i34 = i34;
                            i37 = 8;
                        }
                    } else {
                        i49++;
                        i34 = i34;
                        i37 = 8;
                    }
                }
            }
            u50 u50Var4 = new u50();
            int i51 = u50Var2.Y;
            u50Var4.c(i51);
            for (int i52 = 0; i52 < i51; i52++) {
                u50Var4.a(u50Var2.d(i52));
            }
            int iE = gx4Var == gx4Var3 ? u50Var3.e() : str.length();
            int iA3 = gx4Var.a(av8VarC);
            int i53 = 1 << iA3;
            if (iE >= i53) {
                StringBuilder sb = new StringBuilder();
                sb.append(iE);
                sb.append(" is bigger than ");
                sb.append(i53 - 1);
                throw new s59(sb.toString());
            }
            u50Var4.b(iE, iA3);
            int i54 = u50Var3.Y;
            u50Var4.c(u50Var4.Y + i54);
            for (int i55 = 0; i55 < i54; i55++) {
                u50Var4.a(u50Var3.d(i55));
            }
            r5 = u50Var4;
            av8Var = av8VarC;
        }
        j70 j70Var = av8Var.c[p61.B(iF)];
        int i56 = av8Var.d;
        byte b3 = j70Var.X;
        zu8[] zu8VarArr = (zu8[]) j70Var.Y;
        int length = zu8VarArr.length;
        int i57 = i3;
        int i58 = i57;
        while (i57 < length) {
            i58 += zu8VarArr[i57].a;
            i57++;
        }
        int i59 = i56 - (i58 * b3);
        int i60 = i59 * 8;
        if (r5.Y > i60) {
            throw new s59("data bits cannot fit in the QR Code" + r5.Y + " > " + i60);
        }
        for (int i61 = i3; i61 < i34 && r5.Y < i60; i61++) {
            r5.a(i3);
        }
        ?? r11 = i3;
        int i62 = r5.Y & 7;
        if (i62 > 0) {
            while (i62 < i37) {
                r5.a(r11);
                i62++;
                r11 = 0;
            }
        }
        int iE2 = i59 - r5.e();
        for (int i63 = 0; i63 < iE2; i63++) {
            r5.b((i63 & 1) == 0 ? 236 : 17, i37);
        }
        if (r5.Y != i60) {
            throw new s59("Bits size does not equal capacity");
        }
        int i64 = 0;
        for (zu8 zu8Var : zu8VarArr) {
            i64 += zu8Var.a;
        }
        if (r5.e() != i59) {
            throw new s59("Number of bits and data bytes does not match");
        }
        ArrayList arrayList = new ArrayList(i64);
        int iMax = 0;
        int i65 = 0;
        int i66 = 0;
        int iMax2 = 0;
        while (i65 < i64) {
            int i67 = i2;
            int[] iArr = new int[i67];
            int[] iArr2 = new int[i67];
            if (i65 >= i64) {
                r6 = r5;
                throw new s59("Block ID too large");
            }
            int i68 = i56 % i64;
            int i69 = i35;
            int i70 = i64 - i68;
            int i71 = i56 / i64;
            int i72 = i59 / i64;
            int i73 = i72 + 1;
            int i74 = i71 - i72;
            int i75 = (i71 + 1) - i73;
            if (i74 != i75) {
                r6 = r5;
                throw new s59("EC bytes mismatch");
            }
            if (i64 != i70 + i68) {
                r6 = r5;
                throw new s59("RS blocks mismatch");
            }
            if (i56 != ((i73 + i75) * i68) + ((i72 + i74) * i70)) {
                r6 = r5;
                throw new s59("Total bytes mismatch");
            }
            if (i65 < i70) {
                c2 = 0;
                iArr[0] = i72;
                iArr2[0] = i74;
            } else {
                c2 = 0;
                iArr[0] = i73;
                iArr2[0] = i75;
            }
            int i76 = iArr[c2];
            byte[] bArr6 = new byte[i76];
            int i77 = i66 * 8;
            int i78 = i65;
            int i79 = 0;
            while (i79 < i76) {
                int i80 = i79;
                int i81 = i64;
                int[] iArr3 = iArr2;
                int i82 = 0;
                for (int i83 = 0; i83 < 8; i83++) {
                    if (r6.d(i77)) {
                        i82 |= 1 << (7 - i83);
                    }
                    i77++;
                }
                bArr6[i80] = (byte) i82;
                i79 = i80 + 1;
                i64 = i81;
                iArr2 = iArr3;
            }
            int i84 = i64;
            int i85 = iArr2[0];
            int i86 = i76 + i85;
            int[] iArr4 = new int[i86];
            int i87 = 0;
            while (i87 < i76) {
                iArr4[i87] = bArr6[i87] & 255;
                i87++;
                i86 = i86;
            }
            int i88 = i86;
            jq2 jq2Var = jq2.h;
            ArrayList arrayList2 = new ArrayList();
            ?? r27 = r6;
            int i89 = iF;
            arrayList2.add(new kq2(jq2Var, new int[]{1}));
            if (i85 == 0) {
                bt.q("No error correction bytes");
                return null;
            }
            int i90 = i88 - i85;
            if (i90 <= 0) {
                bt.q("No data bytes provided");
                return null;
            }
            if (i85 >= arrayList2.size()) {
                kq2 kq2Var = (kq2) oi0.h(1, arrayList2);
                int size = arrayList2.size();
                kq2 kq2VarG = kq2Var;
                while (size <= i85) {
                    int i91 = size;
                    kq2VarG = kq2VarG.g(new kq2(jq2Var, new int[]{1, jq2Var.a[(i91 - 1) + (jq2Var.g ? 1 : 0)]}));
                    arrayList2.add(kq2VarG);
                    size = i91 + 1;
                    i56 = i56;
                    av8Var = av8Var;
                }
            }
            av8 av8Var2 = av8Var;
            int i92 = i56;
            kq2 kq2Var2 = (kq2) arrayList2.get(i85);
            int[] iArr5 = new int[i90];
            System.arraycopy(iArr4, 0, iArr5, 0, i90);
            if (i90 == 0) {
                kp5.e();
                return null;
            }
            if (i90 > 1 && iArr5[0] == 0) {
                int i93 = 1;
                while (i93 < i90 && iArr5[i93] == 0) {
                    i93++;
                }
                if (i93 == i90) {
                    iArr5 = new int[]{0};
                } else {
                    int i94 = i90 - i93;
                    int[] iArr6 = new int[i94];
                    System.arraycopy(iArr5, i93, iArr6, 0, i94);
                    iArr5 = iArr6;
                }
            }
            if (i85 < 0) {
                kp5.e();
                return null;
            }
            int length2 = iArr5.length;
            int[] iArr7 = new int[length2 + i85];
            int i95 = 0;
            while (i95 < length2) {
                iArr7[i95] = jq2Var.c(iArr5[i95], 1);
                i95++;
                iArr5 = iArr5;
            }
            kq2 kq2Var3 = new kq2(jq2Var, iArr7);
            if (!jq2Var.equals(kq2Var2.a)) {
                bt.q("GenericGFPolys do not have same GenericGF field");
                return null;
            }
            if (kq2Var2.e()) {
                bt.q("Divide by 0");
                return null;
            }
            kq2 kq2VarA = jq2Var.c;
            int iB = jq2Var.b(kq2Var2.c(kq2Var2.d()));
            while (kq2Var3.d() >= kq2Var2.d() && !kq2Var3.e()) {
                int iD = kq2Var3.d() - kq2Var2.d();
                int iC = jq2Var.c(kq2Var3.c(kq2Var3.d()), iB);
                int i96 = iB;
                kq2 kq2VarH = kq2Var2.h(iD, iC);
                kq2VarA = kq2VarA.a(jq2Var.a(iD, iC));
                kq2Var3 = kq2Var3.a(kq2VarH);
                iB = i96;
            }
            int[] iArr8 = new kq2[]{kq2VarA, kq2Var3}[1].b;
            int length3 = i85 - iArr8.length;
            for (int i97 = 0; i97 < length3; i97++) {
                iArr4[i90 + i97] = 0;
            }
            System.arraycopy(iArr8, 0, iArr4, i90 + length3, iArr8.length);
            byte[] bArr7 = new byte[i85];
            for (int i98 = 0; i98 < i85; i98++) {
                bArr7[i98] = (byte) iArr4[i76 + i98];
            }
            arrayList.add(new k60(bArr6, bArr7));
            iMax2 = Math.max(iMax2, i76);
            iMax = Math.max(iMax, i85);
            i66 += iArr[0];
            i65 = i78 + 1;
            i35 = i69;
            i64 = i84;
            r6 = r27;
            i56 = i92;
            iF = i89;
            av8Var = av8Var2;
            i2 = 1;
        }
        r6 = r5;
        av8 av8Var3 = av8Var;
        int i99 = iF;
        int i100 = i35;
        int i101 = i56;
        if (i59 != i66) {
            throw new s59("Data bytes does not match offset");
        }
        u50 u50Var5 = new u50();
        for (int i102 = 0; i102 < iMax2; i102++) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] bArr8 = ((k60) it.next()).a;
                if (i102 < bArr8.length) {
                    u50Var5.b(bArr8[i102], 8);
                }
            }
        }
        for (int i103 = 0; i103 < iMax; i103++) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byte[] bArr9 = ((k60) it2.next()).b;
                if (i103 < bArr9.length) {
                    u50Var5.b(bArr9[i103], 8);
                }
            }
        }
        if (i101 != u50Var5.e()) {
            StringBuilder sbL = ie2.l("Interleaving error: ", i101, " and ");
            sbL.append(u50Var5.e());
            sbL.append(" differ.");
            throw new s59(sbL.toString());
        }
        int i104 = (av8Var3.a * 4) + 17;
        cb0 cb0Var = new cb0(i104, i104, (byte) 0);
        int i105 = cb0Var.Z;
        int i106 = cb0Var.Y;
        r02 r02Var7 = r02.g0;
        if (map.containsKey(r02Var7)) {
            i5 = Integer.parseInt(map.get(r02Var7).toString());
            i4 = 8;
            if (i5 < 0 || i5 >= 8) {
            }
            i6 = -1;
            if (i5 == -1) {
                i12 = Integer.MAX_VALUE;
                i13 = 0;
                while (i13 < i4) {
                    int i107 = i99;
                    i21.k(u50Var5, i107, av8Var3, i13, cb0Var);
                    i14 = 0;
                    int iG = pu.g(cb0Var, false) + pu.g(cb0Var, true);
                    bArr = (byte[][]) cb0Var.f0;
                    i15 = 0;
                    int i108 = 0;
                    while (i15 < i105 - 1) {
                        bArr4 = bArr[i15];
                        while (i14 < i106 - 1) {
                            b2 = bArr4[i14];
                            i31 = i14 + 1;
                            i32 = i14;
                            if (b2 == bArr4[i31]) {
                                bArr5 = bArr[i15 + 1];
                                if (b2 != bArr5[i32] && b2 == bArr5[i31]) {
                                    i108++;
                                }
                            }
                            i14 = i31;
                        }
                        i15++;
                        i14 = 0;
                    }
                    i16 = (i108 * 3) + iG;
                    i17 = 0;
                    i18 = 0;
                    while (i17 < i105) {
                        i22 = 0;
                        while (i22 < i106) {
                            bArr3 = bArr[i17];
                            i23 = i22 + 6;
                            int i109 = i18;
                            if (i23 < i106) {
                                i24 = i16;
                                byte b4 = 1;
                                if (bArr3[i22] != 1 && bArr3[i22 + 1] == 0 && bArr3[i22 + 2] == 1 && bArr3[i22 + 3] == 1 && bArr3[i22 + 4] == 1 && bArr3[i22 + 5] == 0 && bArr3[i23] == 1) {
                                    int i110 = i22 - 4;
                                    if (i110 < 0 || bArr3.length < i22) {
                                        i28 = i22 + 7;
                                        i29 = i22 + 11;
                                        if (i28 >= 0 && bArr3.length >= i29) {
                                            while (true) {
                                                if (i28 < i29) {
                                                    i30 = i28;
                                                    if (bArr3[i28] == 1) {
                                                        i28 = i30 + 1;
                                                    }
                                                } else {
                                                    i18 = i109 + 1;
                                                }
                                            }
                                        }
                                    } else {
                                        while (true) {
                                            if (i110 < i22) {
                                                if (bArr3[i110] == b4) {
                                                    i28 = i22 + 7;
                                                    i29 = i22 + 11;
                                                    if (i28 >= 0) {
                                                        while (true) {
                                                            if (i28 < i29) {
                                                                i30 = i28;
                                                                if (bArr3[i28] == 1) {
                                                                    i28 = i30 + 1;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    i110++;
                                                    b4 = 1;
                                                }
                                            }
                                            i18 = i109 + 1;
                                        }
                                    }
                                }
                                i25 = i17 + 6;
                                if (i25 < i105) {
                                    byte b5 = 1;
                                    if (bArr[i17][i22] != 1 && bArr[i17 + 1][i22] == 0 && bArr[i17 + 2][i22] == 1 && bArr[i17 + 3][i22] == 1 && bArr[i17 + 4][i22] == 1 && bArr[i17 + 5][i22] == 0 && bArr[i25][i22] == 1) {
                                        int i111 = i17 - 4;
                                        if (i111 < 0 || bArr.length < i17) {
                                            i27 = i17 + 7;
                                            int i112 = i17 + 11;
                                            if (i27 >= 0 || bArr.length < i112) {
                                                i26 = i17;
                                            } else {
                                                while (true) {
                                                    if (i27 < i112) {
                                                        i26 = i17;
                                                        if (bArr[i27][i22] != 1) {
                                                            i27++;
                                                            i17 = i26;
                                                        }
                                                    } else {
                                                        i26 = i17;
                                                        i18++;
                                                    }
                                                }
                                            }
                                        } else {
                                            while (true) {
                                                if (i111 < i17) {
                                                    if (bArr[i111][i22] == b5) {
                                                        i27 = i17 + 7;
                                                        int i113 = i17 + 11;
                                                        if (i27 >= 0) {
                                                            i26 = i17;
                                                        } else {
                                                            i26 = i17;
                                                        }
                                                    } else {
                                                        i111++;
                                                        b5 = 1;
                                                    }
                                                }
                                                i26 = i17;
                                                i18++;
                                            }
                                        }
                                    } else {
                                        i26 = i17;
                                    }
                                } else {
                                    i26 = i17;
                                }
                                i22++;
                                i16 = i24;
                                i17 = i26;
                            } else {
                                i24 = i16;
                            }
                            i18 = i109;
                            i25 = i17 + 6;
                            if (i25 < i105) {
                                byte b6 = 1;
                                if (bArr[i17][i22] != 1) {
                                    i26 = i17;
                                } else {
                                    i26 = i17;
                                }
                            } else {
                                i26 = i17;
                            }
                            i22++;
                            i16 = i24;
                            i17 = i26;
                        }
                        i17++;
                    }
                    int i114 = (i18 * 40) + i16;
                    i19 = 0;
                    i20 = 0;
                    while (i19 < i105) {
                        bArr2 = bArr[i19];
                        i21 = 0;
                        while (i21 < i106) {
                            int i115 = i19;
                            if (bArr2[i21] == 1) {
                                i20++;
                            }
                            i21++;
                            i19 = i115;
                        }
                        i19++;
                    }
                    int i116 = i105 * i106;
                    iAbs = (((Math.abs((i20 * 2) - i116) * 10) / i116) * 10) + i114;
                    if (iAbs < i12) {
                        i12 = iAbs;
                        i6 = i13;
                    }
                    i13++;
                    i99 = i107;
                    i4 = 8;
                }
                i5 = i6;
            }
            i21.k(u50Var5, i99, av8Var3, i5, cb0Var);
            int i117 = i100 * 2;
            int i118 = i106 + i117;
            int i119 = i117 + i105;
            int iMax3 = Math.max(800, i118);
            int iMax4 = Math.max(800, i119);
            iMin = Math.min(iMax3 / i118, iMax4 / i119);
            i7 = (iMax3 - (i106 * iMin)) / 2;
            i8 = (iMax4 - (i105 * iMin)) / 2;
            w50Var = new w50(iMax3, iMax4);
            i9 = 0;
            while (i9 < i105) {
                i10 = i7;
                i11 = 0;
                while (i11 < i106) {
                    if (cb0Var.e(i11, i9) == 1) {
                        w50Var.c(i10, i8, iMin, iMin);
                    }
                    i11++;
                    i10 += iMin;
                }
                i9++;
                i8 += iMin;
            }
            return w50Var;
        }
        i4 = 8;
        i5 = -1;
        i6 = -1;
        if (i5 == -1) {
            i12 = Integer.MAX_VALUE;
            i13 = 0;
            while (i13 < i4) {
                int i1010 = i99;
                i21.k(u50Var5, i1010, av8Var3, i13, cb0Var);
                i14 = 0;
                int iG2 = pu.g(cb0Var, false) + pu.g(cb0Var, true);
                bArr = (byte[][]) cb0Var.f0;
                i15 = 0;
                int i1011 = 0;
                while (i15 < i105 - 1) {
                    bArr4 = bArr[i15];
                    while (i14 < i106 - 1) {
                        b2 = bArr4[i14];
                        i31 = i14 + 1;
                        i32 = i14;
                        if (b2 == bArr4[i31]) {
                            bArr5 = bArr[i15 + 1];
                            if (b2 != bArr5[i32]) {
                            }
                        }
                        i14 = i31;
                    }
                    i15++;
                    i14 = 0;
                }
                i16 = (i1011 * 3) + iG2;
                i17 = 0;
                i18 = 0;
                while (i17 < i105) {
                    i22 = 0;
                    while (i22 < i106) {
                        bArr3 = bArr[i17];
                        i23 = i22 + 6;
                        int i1012 = i18;
                        if (i23 < i106) {
                            i24 = i16;
                            byte b7 = 1;
                            if (bArr3[i22] != 1) {
                            }
                            i25 = i17 + 6;
                            if (i25 < i105) {
                                byte b8 = 1;
                                if (bArr[i17][i22] != 1) {
                                    i26 = i17;
                                } else {
                                    i26 = i17;
                                }
                            } else {
                                i26 = i17;
                            }
                            i22++;
                            i16 = i24;
                            i17 = i26;
                        } else {
                            i24 = i16;
                        }
                        i18 = i1012;
                        i25 = i17 + 6;
                        if (i25 < i105) {
                            byte b9 = 1;
                            if (bArr[i17][i22] != 1) {
                                i26 = i17;
                            } else {
                                i26 = i17;
                            }
                        } else {
                            i26 = i17;
                        }
                        i22++;
                        i16 = i24;
                        i17 = i26;
                    }
                    i17++;
                }
                int i1110 = (i18 * 40) + i16;
                i19 = 0;
                i20 = 0;
                while (i19 < i105) {
                    bArr2 = bArr[i19];
                    i21 = 0;
                    while (i21 < i106) {
                        int i1111 = i19;
                        if (bArr2[i21] == 1) {
                            i20++;
                        }
                        i21++;
                        i19 = i1111;
                    }
                    i19++;
                }
                int i1112 = i105 * i106;
                iAbs = (((Math.abs((i20 * 2) - i1112) * 10) / i1112) * 10) + i1110;
                if (iAbs < i12) {
                    i12 = iAbs;
                    i6 = i13;
                }
                i13++;
                i99 = i1010;
                i4 = 8;
            }
            i5 = i6;
        }
        i21.k(u50Var5, i99, av8Var3, i5, cb0Var);
        int i1113 = i100 * 2;
        int i1114 = i106 + i1113;
        int i1115 = i1113 + i105;
        int iMax5 = Math.max(800, i1114);
        int iMax6 = Math.max(800, i1115);
        iMin = Math.min(iMax5 / i1114, iMax6 / i1115);
        i7 = (iMax5 - (i106 * iMin)) / 2;
        i8 = (iMax6 - (i105 * iMin)) / 2;
        w50Var = new w50(iMax5, iMax6);
        i9 = 0;
        while (i9 < i105) {
            i10 = i7;
            i11 = 0;
            while (i11 < i106) {
                if (cb0Var.e(i11, i9) == 1) {
                    w50Var.c(i10, i8, iMin, iMin);
                }
                i11++;
                i10 += iMin;
            }
            i9++;
            i8 += iMin;
        }
        return w50Var;
    }

    public static final long I(float f2, int i2, long j2, boolean z) {
        int iH = ((z || i2 == 2 || i2 == 4 || i2 == 5) && q31.d(j2)) ? q31.h(j2) : Integer.MAX_VALUE;
        if (q31.j(j2) != iH) {
            iH = x97.n(z38.a(f2), q31.j(j2), iH);
        }
        return z68.B(0, iH, 0, q31.g(j2));
    }

    public static final g73 J() {
        g73 g73Var = n;
        if (g73Var != null) {
            return g73Var;
        }
        f73 f73Var = new f73("Filled.ChevronRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = gu8.a;
        fe7 fe7Var = new fe7(dw0.b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new vi5(10.0f, 6.0f));
        arrayList.add(new ui5(8.59f, 7.41f));
        arrayList.add(new ui5(13.17f, 12.0f));
        arrayList.add(new cj5(-4.58f, 4.59f));
        arrayList.add(new ui5(10.0f, 18.0f));
        arrayList.add(new cj5(6.0f, -6.0f));
        arrayList.add(ri5.c);
        f73.a(f73Var, arrayList, fe7Var);
        g73 g73VarB = f73Var.b();
        n = g73VarB;
        return g73VarB;
    }

    public static final float K(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    public static qb6 L(wb4 wb4Var, boolean z, boolean z2, Boolean bool, boolean z3, y45 y45Var, hv4 hv4Var) {
        st3 st3Var;
        qb6 qb6Var;
        c06 c06Var;
        ey5 ey5Var;
        wb4Var.getClass();
        ke7 ke7Var = (ke7) wb4Var.d;
        hv4Var.getClass();
        ey5 ey5Var2 = ey5.INTERFACE;
        if (z) {
            if (bool == null) {
                b61.e(41, wb4Var, "isConst should not be null for property (container=");
                return null;
            }
            if (wb4Var instanceof c06) {
                c06 c06Var2 = (c06) wb4Var;
                if (c06Var2.h == ey5Var2) {
                    return w51.A(y45Var, c06Var2.g.d(v15.e("DefaultImpls")), hv4Var);
                }
            }
            if (bool.booleanValue() && (wb4Var instanceof d06)) {
                st3 st3Var2 = ke7Var instanceof st3 ? (st3) ke7Var : null;
                zs3 zs3Var = st3Var2 != null ? st3Var2.Y : null;
                if (zs3Var != null) {
                    String str = zs3Var.a;
                    if (str == null) {
                        zs3.a(10);
                        throw null;
                    }
                    String strReplace = str.replace('/', '.');
                    strReplace.getClass();
                    fk2 fk2Var = new fk2(strReplace);
                    fk2 fk2VarB = fk2Var.b();
                    v15 v15VarG = fk2Var.a.g();
                    fk2 fk2Var2 = fk2.c;
                    gk2 gk2Var = wl7.h0(v15VarG).a;
                    gk2Var.c();
                    String strX = mm7.X(gk2Var.a, '.', '$');
                    if (!fk2VarB.a.c()) {
                        strX = fk2VarB + '.' + strX;
                    }
                    vk1 vk1VarC = y45Var.C(strX);
                    if (vk1VarC != null) {
                        return (qb6) vk1VarC.Y;
                    }
                    return null;
                }
            }
        }
        if (z2 && (wb4Var instanceof c06)) {
            c06 c06Var3 = (c06) wb4Var;
            if (c06Var3.h == ey5.COMPANION_OBJECT && (c06Var = c06Var3.f) != null && ((ey5Var = c06Var.h) == ey5.CLASS || ey5Var == ey5.ENUM_CLASS || (z3 && (ey5Var == ey5Var2 || ey5Var == ey5.ANNOTATION_CLASS)))) {
                ke7 ke7Var2 = (ke7) c06Var.d;
                l04 l04Var = ke7Var2 instanceof l04 ? (l04) ke7Var2 : null;
                if (l04Var != null) {
                    return l04Var.X;
                }
            } else if (wb4Var instanceof d06) {
                st3Var = (st3) ke7Var;
                qb6Var = st3Var.Z;
                if (qb6Var == null) {
                    return w51.A(y45Var, st3Var.a(), hv4Var);
                }
                return qb6Var;
            }
        } else if ((wb4Var instanceof d06) && (ke7Var instanceof st3)) {
            st3Var = (st3) ke7Var;
            qb6Var = st3Var.Z;
            if (qb6Var == null) {
                return w51.A(y45Var, st3Var.a(), hv4Var);
            }
            return qb6Var;
        }
        return null;
    }

    public static final void M(lp2 lp2Var, rn2 rn2Var) {
        rn2Var.getClass();
        ci8.i(2, rn2Var);
        rn2Var.K(lp2Var, 1);
    }

    public static final boolean N(long j2) {
        return (j2 & 2) != 0;
    }

    public static final boolean O(long j2) {
        return (j2 & 1) != 0;
    }

    public static final kx4 P(lp2 lp2Var, kx4 kx4Var) {
        if (kx4Var.g(new h80((byte) 7))) {
            return kx4Var;
        }
        lp2Var.R(1219399079, 0, null, null);
        kx4 kx4Var2 = (kx4) kx4Var.d(new b1(lp2Var, (byte) 4), hx4.X);
        lp2Var.p(false);
        return kx4Var2;
    }

    public static final kx4 Q(lp2 lp2Var, kx4 kx4Var) {
        lp2Var.W(439770924);
        kx4 kx4VarP = P(lp2Var, kx4Var);
        lp2Var.p(false);
        return kx4VarP;
    }

    public static final void S(wc5 wc5Var, int i2, Object obj) {
        wc5Var.p0[(wc5Var.q0 - wc5Var.l0[wc5Var.m0 - 1].c) + i2] = obj;
    }

    public static final void T(wc5 wc5Var, int i2, Object obj, int i3, Object obj2) {
        int i4 = wc5Var.q0 - wc5Var.l0[wc5Var.m0 - 1].c;
        Object[] objArr = wc5Var.p0;
        objArr[i2 + i4] = obj;
        objArr[i4 + i3] = obj2;
    }

    public static Set U(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        setSingleton.getClass();
        return setSingleton;
    }

    public static final LinkedHashMap V(l11 l11Var) {
        Object objD;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (zx zxVar : l11Var.b()) {
            Object obj = zxVar.c;
            CaptureRequest.Key key = obj instanceof CaptureRequest.Key ? (CaptureRequest.Key) obj : null;
            if (key != null && (objD = l11Var.d(zxVar)) != null) {
                linkedHashMap.put(key, objD);
            }
        }
        return linkedHashMap;
    }

    public static final CharSequence W(CharSequence charSequence) {
        if (charSequence.length() <= 5000) {
            return charSequence;
        }
        return (Character.isHighSurrogate(charSequence.charAt(4999)) && Character.isLowSurrogate(charSequence.charAt(5000))) ? fm7.P0(charSequence, 4999) : fm7.P0(charSequence, 5000);
    }

    public static final void a(v30 v30Var, q8 q8Var, zy0 zy0Var, lp2 lp2Var, int i2) {
        int i3;
        lp2Var.X(-1090171650);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? lp2Var.f(v30Var) : lp2Var.h(v30Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= lp2Var.f(q8Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= lp2Var.h(zy0Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        boolean z = true;
        if (lp2Var.N(i3 & 1, (i3 & 147) != 146)) {
            boolean z2 = (i3 & 112) == 32;
            if ((i3 & 14) != 4 && ((i3 & 8) == 0 || !lp2Var.f(v30Var))) {
                z = false;
            }
            boolean z3 = z2 | z;
            Object objK = lp2Var.K();
            if (z3 || objK == zz0.a) {
                objK = new fv2(q8Var, v30Var);
                lp2Var.g0(objK);
            }
            bg.a((fv2) objK, null, new or5(false, kz6.X, false, 0), zy0Var, lp2Var, ((i3 << 3) & 7168) | 384, 2);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new g8((Object) v30Var, (Object) q8Var, (Object) zy0Var, i2, (byte) 1);
        }
    }

    public static final void b(final String str, final String str2, final gn2 gn2Var, final kx4 kx4Var, final y68 y68Var, final String str3, boolean z, final wx3 wx3Var, final de3 de3Var, lp2 lp2Var, final int i2, final int i3) {
        int i4;
        boolean z2;
        int i5;
        lp2 lp2Var2;
        str.getClass();
        str2.getClass();
        gn2Var.getClass();
        lp2Var.X(-403193559);
        if ((i2 & 6) == 0) {
            i4 = i2 | (lp2Var.f(str) ? 4 : 2);
        } else {
            i4 = i2;
        }
        int i6 = i4 | (lp2Var.f(str2) ? 32 : 16) | (lp2Var.h(gn2Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (lp2Var.f(y68Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (lp2Var.f(str3) ? 131072 : DnsOverHttps.MAX_RESPONSE_SIZE);
        int i7 = i3 & 64;
        if (i7 != 0) {
            i5 = i6 | 1572864;
            z2 = z;
        } else {
            z2 = z;
            i5 = i6 | (lp2Var.g(z2) ? 1048576 : 524288);
        }
        if (lp2Var.N(i5 & 1, (38347923 & i5) != 38347922)) {
            lp2Var.S();
            if ((i2 & 1) != 0 && !lp2Var.x()) {
                lp2Var.Q();
            } else if (i7 != 0) {
                z2 = true;
            }
            boolean z3 = z2;
            lp2Var.q();
            tw0 tw0VarA = rw0.a(ht.c, pz2.q0, lp2Var, 0);
            int iHashCode = Long.hashCode(lp2Var.T);
            kl5 kl5VarL = lp2Var.l();
            kx4 kx4VarQ = Q(lp2Var, kx4Var);
            uz0.j.getClass();
            lp2Var.Z();
            if (lp2Var.S) {
                lp2Var.k();
            } else {
                lp2Var.j0();
            }
            dx0 dx0Var = pz2.B0;
            pn7.m(dx0Var, lp2Var, tw0VarA);
            dx0 dx0Var2 = pz2.A0;
            pn7.m(dx0Var2, lp2Var, kl5VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            dx0 dx0Var3 = pz2.C0;
            pn7.m(dx0Var3, lp2Var, numValueOf);
            pn7.l(lp2Var);
            dx0 dx0Var4 = pz2.z0;
            pn7.m(dx0Var4, lp2Var, kx4VarQ);
            o50 o50Var = pz2.o0;
            FillElement fillElement = b.a;
            ox1 ox1Var = hr.a;
            int i8 = i5;
            kx4 kx4VarW = os4.w(fillElement, ((gr) lp2Var.j(ox1Var)).a.b);
            wq6 wq6VarA = vq6.a(ht.a, o50Var, lp2Var, 48);
            int iHashCode2 = Long.hashCode(lp2Var.T);
            kl5 kl5VarL2 = lp2Var.l();
            kx4 kx4VarQ2 = Q(lp2Var, kx4VarW);
            lp2Var.Z();
            if (lp2Var.S) {
                lp2Var.k();
            } else {
                lp2Var.j0();
            }
            pn7.m(dx0Var, lp2Var, wq6VarA);
            pn7.m(dx0Var2, lp2Var, kl5VarL2);
            oi0.u(iHashCode2, lp2Var, dx0Var3, lp2Var);
            pn7.m(dx0Var4, lp2Var, kx4VarQ2);
            ox1 ox1Var2 = es.a;
            o88 o88Var = ((ds) lp2Var.j(ox1Var2)).b;
            ox1 ox1Var3 = ep.z;
            zc1.g(str, null, o88.a(o88Var, ((dp) lp2Var.j(ox1Var3)).c.a, 0L, null, null, 0L, 0L, null, 16777214), 0, 0, 0, 0, false, null, lp2Var, i8 & 14, 506);
            ch3.f(lp2Var, b.k(hx4.X, 16.0f));
            d44 d44Var = new d44(1.0f, true);
            qe4 qe4Var = qe4.x0;
            o88 o88VarA = o88.a(((ds) lp2Var.j(ox1Var2)).b, ((dp) lp2Var.j(ox1Var3)).c.a, 0L, null, null, 0L, 0L, null, 16744446);
            int i9 = i8 >> 3;
            z91.f(str2, gn2Var, d44Var, fillElement, 6, y68Var, null, o88VarA, null, null, false, z3, wx3Var, qe4Var, de3Var, null, 0L, 0L, 0L, 0L, lp2Var, (i9 & 112) | (i9 & 14) | 3072 | ((i8 << 3) & 458752), ((i8 >> 12) & 896) | 224256, 2035520);
            lp2Var2 = lp2Var;
            lp2Var2.p(true);
            if (str3 != null) {
                lp2Var2.W(1215982198);
                vj8.g(str3, os4.w(fillElement, ((gr) lp2Var2.j(ox1Var)).a.c), lp2Var2, (i8 >> 15) & 14);
                lp2Var2.p(false);
            } else {
                lp2Var2.W(1216221487);
                lp2Var2.p(false);
            }
            lp2Var2.p(true);
            z2 = z3;
        } else {
            lp2Var2 = lp2Var;
            lp2Var2.Q();
        }
        j86 j86VarR = lp2Var2.r();
        if (j86VarR != null) {
            final boolean z4 = z2;
            j86VarR.d = new rn2() { // from class: bx2
                @Override // defpackage.rn2
                public final Object K(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    w45.b(str, str2, gn2Var, kx4Var, y68Var, str3, z4, wx3Var, de3Var, (lp2) obj, w79.P(i2 | 1), i3);
                    return dn8.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0042  */
    /* JADX WARN: Code duplicated, block: B:27:0x0046  */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x005e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0063  */
    /* JADX WARN: Code duplicated, block: B:41:0x0067  */
    /* JADX WARN: Code duplicated, block: B:43:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0072  */
    /* JADX WARN: Code duplicated, block: B:48:0x007a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0082  */
    /* JADX WARN: Code duplicated, block: B:53:0x008a  */
    /* JADX WARN: Code duplicated, block: B:54:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0091  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x009f  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:79:0x0100  */
    /* JADX WARN: Code duplicated, block: B:82:0x010d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0114  */
    /* JADX WARN: Code duplicated, block: B:85:0x0128  */
    /* JADX WARN: Code duplicated, block: B:86:0x012b  */
    /* JADX WARN: Code duplicated, block: B:89:0x0131  */
    /* JADX WARN: Code duplicated, block: B:90:0x0134  */
    /* JADX WARN: Code duplicated, block: B:93:0x0145  */
    /* JADX WARN: Code duplicated, block: B:96:0x0178  */
    /* JADX WARN: Code duplicated, block: B:99:0x0188  */
    public static final void c(final dn2 dn2Var, kx4 kx4Var, boolean z, s43 s43Var, xz4 xz4Var, x67 x67Var, final zy0 zy0Var, lp2 lp2Var, final int i2, final int i3) {
        int i4;
        kx4 kx4Var2;
        int i5;
        boolean z2;
        int i6;
        int i7;
        xz4 xz4Var2;
        int i8;
        zy0 zy0Var2;
        boolean z3;
        final s43 s43Var2;
        final x67 x67Var2;
        final kx4 kx4Var3;
        final boolean z4;
        final xz4 xz4Var3;
        j86 j86VarR;
        kx4 kx4Var4;
        long j2;
        iw0 iw0Var;
        s43 s43Var3;
        long j3;
        long j4;
        long jB;
        long j5;
        long j6;
        int i9;
        x67 x67VarB;
        kx4 kx4Var5;
        boolean z5;
        int i10;
        float f2 = nr4.L;
        lp2Var.X(1413012038);
        if ((i2 & 6) == 0) {
            i4 = (lp2Var.h(dn2Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i11 = i3 & 2;
        if (i11 == 0) {
            if ((i2 & 48) == 0) {
                kx4Var2 = kx4Var;
                i4 |= lp2Var.f(kx4Var2) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 != 0) {
                if ((i2 & 384) == 0) {
                    z2 = z;
                    if (lp2Var.g(z2)) {
                        i6 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    } else {
                        i6 = 128;
                    }
                    i4 |= i6;
                }
                if ((i2 & 3072) == 0) {
                    i4 |= 1024;
                }
                i7 = i3 & 16;
                if (i7 != 0) {
                    if ((i2 & 24576) == 0) {
                        xz4Var2 = xz4Var;
                        if (lp2Var.f(xz4Var2)) {
                            i8 = Http2.INITIAL_MAX_FRAME_SIZE;
                        } else {
                            i8 = 8192;
                        }
                        i4 |= i8;
                    }
                    if ((196608 & i2) == 0) {
                        i4 |= DnsOverHttps.MAX_RESPONSE_SIZE;
                    }
                    if ((1572864 & i2) == 0) {
                        zy0Var2 = zy0Var;
                        if (lp2Var.h(zy0Var2)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i4 |= i10;
                    } else {
                        zy0Var2 = zy0Var;
                    }
                    if ((599187 & i4) != 599186) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (lp2Var.N(i4 & 1, z3)) {
                        lp2Var.S();
                        if ((i2 & 1) != 0 || lp2Var.x()) {
                            if (i11 != 0) {
                                kx4Var4 = hx4.X;
                            } else {
                                kx4Var4 = kx4Var2;
                            }
                            boolean z6 = i5 == 0 ? z2 : true;
                            j2 = ((dw0) lp2Var.j(j41.a)).a;
                            iw0Var = (iw0) lp2Var.j(kw0.a);
                            s43Var3 = iw0Var.X;
                            if (s43Var3 == null) {
                                long j7 = dw0.f;
                                s43Var3 = new s43(j7, j2, j7, dw0.b(0.38f, j2));
                                j3 = j2;
                                iw0Var.X = s43Var3;
                            } else {
                                j3 = j2;
                            }
                            j4 = s43Var3.b;
                            if (!tk8.a(j4, j3)) {
                                jB = dw0.b(0.38f, j3);
                                long j8 = s43Var3.a;
                                long j9 = s43Var3.c;
                                if (j3 != 16) {
                                    j5 = j3;
                                } else {
                                    j5 = j4;
                                }
                                if (jB != 16) {
                                    j6 = jB;
                                } else {
                                    j6 = s43Var3.d;
                                }
                                s43Var3 = new s43(j8, j5, j9, j6);
                            }
                            if (i7 != 0) {
                                xz4Var2 = null;
                            }
                            i9 = i4 & (-465921);
                            x67VarB = q77.b(k, lp2Var);
                            kx4Var5 = kx4Var4;
                            s43Var2 = s43Var3;
                            z5 = z6;
                        } else {
                            lp2Var.Q();
                            s43Var2 = s43Var;
                            i9 = i4 & (-465921);
                            kx4Var5 = kx4Var2;
                            z5 = z2;
                            x67VarB = x67Var;
                        }
                        xz4Var3 = xz4Var2;
                        lp2Var.q();
                        int i12 = i9 << 3;
                        d(kx4Var5, dn2Var, z5, x67VarB, s43Var2, xz4Var3, zy0Var2, lp2Var, ((i9 >> 3) & 14) | (i12 & 112) | (i9 & 896) | (i12 & 458752) | (i9 & 3670016));
                        x67Var2 = x67VarB;
                        z4 = z5;
                        kx4Var3 = kx4Var5;
                    } else {
                        lp2Var.Q();
                        s43Var2 = s43Var;
                        x67Var2 = x67Var;
                        kx4Var3 = kx4Var2;
                        z4 = z2;
                        xz4Var3 = xz4Var2;
                    }
                    j86VarR = lp2Var.r();
                    if (j86VarR != null) {
                        j86VarR.d = new rn2() { // from class: t43
                            @Override // defpackage.rn2
                            public final Object K(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                w45.c(dn2Var, kx4Var3, z4, s43Var2, xz4Var3, x67Var2, zy0Var, (lp2) obj, w79.P(i2 | 1), i3);
                                return dn8.a;
                            }
                        };
                    }
                }
                i4 |= 24576;
                xz4Var2 = xz4Var;
                if ((196608 & i2) == 0) {
                    i4 |= DnsOverHttps.MAX_RESPONSE_SIZE;
                }
                if ((1572864 & i2) == 0) {
                    zy0Var2 = zy0Var;
                    if (lp2Var.h(zy0Var2)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i4 |= i10;
                } else {
                    zy0Var2 = zy0Var;
                }
                if ((599187 & i4) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (lp2Var.N(i4 & 1, z3)) {
                    lp2Var.S();
                    if ((i2 & 1) != 0) {
                        if (i11 != 0) {
                            kx4Var4 = hx4.X;
                        } else {
                            kx4Var4 = kx4Var2;
                        }
                        if (i5 == 0) {
                        }
                        j2 = ((dw0) lp2Var.j(j41.a)).a;
                        iw0Var = (iw0) lp2Var.j(kw0.a);
                        s43Var3 = iw0Var.X;
                        if (s43Var3 == null) {
                            long j10 = dw0.f;
                            s43Var3 = new s43(j10, j2, j10, dw0.b(0.38f, j2));
                            j3 = j2;
                            iw0Var.X = s43Var3;
                        } else {
                            j3 = j2;
                        }
                        j4 = s43Var3.b;
                        if (!tk8.a(j4, j3)) {
                            jB = dw0.b(0.38f, j3);
                            long j11 = s43Var3.a;
                            long j12 = s43Var3.c;
                            if (j3 != 16) {
                                j5 = j3;
                            } else {
                                j5 = j4;
                            }
                            if (jB != 16) {
                                j6 = jB;
                            } else {
                                j6 = s43Var3.d;
                            }
                            s43Var3 = new s43(j11, j5, j12, j6);
                        }
                        if (i7 != 0) {
                            xz4Var2 = null;
                        }
                        i9 = i4 & (-465921);
                        x67VarB = q77.b(k, lp2Var);
                        kx4Var5 = kx4Var4;
                        s43Var2 = s43Var3;
                        z5 = z6;
                    } else {
                        if (i11 != 0) {
                            kx4Var4 = hx4.X;
                        } else {
                            kx4Var4 = kx4Var2;
                        }
                        if (i5 == 0) {
                        }
                        j2 = ((dw0) lp2Var.j(j41.a)).a;
                        iw0Var = (iw0) lp2Var.j(kw0.a);
                        s43Var3 = iw0Var.X;
                        if (s43Var3 == null) {
                            long j13 = dw0.f;
                            s43Var3 = new s43(j13, j2, j13, dw0.b(0.38f, j2));
                            j3 = j2;
                            iw0Var.X = s43Var3;
                        } else {
                            j3 = j2;
                        }
                        j4 = s43Var3.b;
                        if (!tk8.a(j4, j3)) {
                            jB = dw0.b(0.38f, j3);
                            long j14 = s43Var3.a;
                            long j15 = s43Var3.c;
                            if (j3 != 16) {
                                j5 = j3;
                            } else {
                                j5 = j4;
                            }
                            if (jB != 16) {
                                j6 = jB;
                            } else {
                                j6 = s43Var3.d;
                            }
                            s43Var3 = new s43(j14, j5, j15, j6);
                        }
                        if (i7 != 0) {
                            xz4Var2 = null;
                        }
                        i9 = i4 & (-465921);
                        x67VarB = q77.b(k, lp2Var);
                        kx4Var5 = kx4Var4;
                        s43Var2 = s43Var3;
                        z5 = z6;
                    }
                    xz4Var3 = xz4Var2;
                    lp2Var.q();
                    int i13 = i9 << 3;
                    d(kx4Var5, dn2Var, z5, x67VarB, s43Var2, xz4Var3, zy0Var2, lp2Var, ((i9 >> 3) & 14) | (i13 & 112) | (i9 & 896) | (i13 & 458752) | (i9 & 3670016));
                    x67Var2 = x67VarB;
                    z4 = z5;
                    kx4Var3 = kx4Var5;
                } else {
                    lp2Var.Q();
                    s43Var2 = s43Var;
                    x67Var2 = x67Var;
                    kx4Var3 = kx4Var2;
                    z4 = z2;
                    xz4Var3 = xz4Var2;
                }
                j86VarR = lp2Var.r();
                if (j86VarR != null) {
                    j86VarR.d = new rn2() { // from class: t43
                        @Override // defpackage.rn2
                        public final Object K(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            w45.c(dn2Var, kx4Var3, z4, s43Var2, xz4Var3, x67Var2, zy0Var, (lp2) obj, w79.P(i2 | 1), i3);
                            return dn8.a;
                        }
                    };
                }
            }
            i4 |= 384;
            z2 = z;
            if ((i2 & 3072) == 0) {
                i4 |= 1024;
            }
            i7 = i3 & 16;
            if (i7 != 0) {
                if ((i2 & 24576) == 0) {
                    xz4Var2 = xz4Var;
                    if (lp2Var.f(xz4Var2)) {
                        i8 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i8 = 8192;
                    }
                    i4 |= i8;
                }
                if ((196608 & i2) == 0) {
                    i4 |= DnsOverHttps.MAX_RESPONSE_SIZE;
                }
                if ((1572864 & i2) == 0) {
                    zy0Var2 = zy0Var;
                    if (lp2Var.h(zy0Var2)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i4 |= i10;
                } else {
                    zy0Var2 = zy0Var;
                }
                if ((599187 & i4) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (lp2Var.N(i4 & 1, z3)) {
                    lp2Var.S();
                    if ((i2 & 1) != 0) {
                        if (i11 != 0) {
                            kx4Var4 = hx4.X;
                        } else {
                            kx4Var4 = kx4Var2;
                        }
                        if (i5 == 0) {
                        }
                        j2 = ((dw0) lp2Var.j(j41.a)).a;
                        iw0Var = (iw0) lp2Var.j(kw0.a);
                        s43Var3 = iw0Var.X;
                        if (s43Var3 == null) {
                            long j16 = dw0.f;
                            s43Var3 = new s43(j16, j2, j16, dw0.b(0.38f, j2));
                            j3 = j2;
                            iw0Var.X = s43Var3;
                        } else {
                            j3 = j2;
                        }
                        j4 = s43Var3.b;
                        if (!tk8.a(j4, j3)) {
                            jB = dw0.b(0.38f, j3);
                            long j17 = s43Var3.a;
                            long j18 = s43Var3.c;
                            if (j3 != 16) {
                                j5 = j3;
                            } else {
                                j5 = j4;
                            }
                            if (jB != 16) {
                                j6 = jB;
                            } else {
                                j6 = s43Var3.d;
                            }
                            s43Var3 = new s43(j17, j5, j18, j6);
                        }
                        if (i7 != 0) {
                            xz4Var2 = null;
                        }
                        i9 = i4 & (-465921);
                        x67VarB = q77.b(k, lp2Var);
                        kx4Var5 = kx4Var4;
                        s43Var2 = s43Var3;
                        z5 = z6;
                    } else {
                        if (i11 != 0) {
                            kx4Var4 = hx4.X;
                        } else {
                            kx4Var4 = kx4Var2;
                        }
                        if (i5 == 0) {
                        }
                        j2 = ((dw0) lp2Var.j(j41.a)).a;
                        iw0Var = (iw0) lp2Var.j(kw0.a);
                        s43Var3 = iw0Var.X;
                        if (s43Var3 == null) {
                            long j19 = dw0.f;
                            s43Var3 = new s43(j19, j2, j19, dw0.b(0.38f, j2));
                            j3 = j2;
                            iw0Var.X = s43Var3;
                        } else {
                            j3 = j2;
                        }
                        j4 = s43Var3.b;
                        if (!tk8.a(j4, j3)) {
                            jB = dw0.b(0.38f, j3);
                            long j110 = s43Var3.a;
                            long j111 = s43Var3.c;
                            if (j3 != 16) {
                                j5 = j3;
                            } else {
                                j5 = j4;
                            }
                            if (jB != 16) {
                                j6 = jB;
                            } else {
                                j6 = s43Var3.d;
                            }
                            s43Var3 = new s43(j110, j5, j111, j6);
                        }
                        if (i7 != 0) {
                            xz4Var2 = null;
                        }
                        i9 = i4 & (-465921);
                        x67VarB = q77.b(k, lp2Var);
                        kx4Var5 = kx4Var4;
                        s43Var2 = s43Var3;
                        z5 = z6;
                    }
                    xz4Var3 = xz4Var2;
                    lp2Var.q();
                    int i14 = i9 << 3;
                    d(kx4Var5, dn2Var, z5, x67VarB, s43Var2, xz4Var3, zy0Var2, lp2Var, ((i9 >> 3) & 14) | (i14 & 112) | (i9 & 896) | (i14 & 458752) | (i9 & 3670016));
                    x67Var2 = x67VarB;
                    z4 = z5;
                    kx4Var3 = kx4Var5;
                } else {
                    lp2Var.Q();
                    s43Var2 = s43Var;
                    x67Var2 = x67Var;
                    kx4Var3 = kx4Var2;
                    z4 = z2;
                    xz4Var3 = xz4Var2;
                }
                j86VarR = lp2Var.r();
                if (j86VarR != null) {
                    j86VarR.d = new rn2() { // from class: t43
                        @Override // defpackage.rn2
                        public final Object K(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            w45.c(dn2Var, kx4Var3, z4, s43Var2, xz4Var3, x67Var2, zy0Var, (lp2) obj, w79.P(i2 | 1), i3);
                            return dn8.a;
                        }
                    };
                }
            }
            i4 |= 24576;
            xz4Var2 = xz4Var;
            if ((196608 & i2) == 0) {
                i4 |= DnsOverHttps.MAX_RESPONSE_SIZE;
            }
            if ((1572864 & i2) == 0) {
                zy0Var2 = zy0Var;
                if (lp2Var.h(zy0Var2)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i4 |= i10;
            } else {
                zy0Var2 = zy0Var;
            }
            if ((599187 & i4) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (lp2Var.N(i4 & 1, z3)) {
                lp2Var.S();
                if ((i2 & 1) != 0) {
                    if (i11 != 0) {
                        kx4Var4 = hx4.X;
                    } else {
                        kx4Var4 = kx4Var2;
                    }
                    if (i5 == 0) {
                    }
                    j2 = ((dw0) lp2Var.j(j41.a)).a;
                    iw0Var = (iw0) lp2Var.j(kw0.a);
                    s43Var3 = iw0Var.X;
                    if (s43Var3 == null) {
                        long j112 = dw0.f;
                        s43Var3 = new s43(j112, j2, j112, dw0.b(0.38f, j2));
                        j3 = j2;
                        iw0Var.X = s43Var3;
                    } else {
                        j3 = j2;
                    }
                    j4 = s43Var3.b;
                    if (!tk8.a(j4, j3)) {
                        jB = dw0.b(0.38f, j3);
                        long j113 = s43Var3.a;
                        long j114 = s43Var3.c;
                        if (j3 != 16) {
                            j5 = j3;
                        } else {
                            j5 = j4;
                        }
                        if (jB != 16) {
                            j6 = jB;
                        } else {
                            j6 = s43Var3.d;
                        }
                        s43Var3 = new s43(j113, j5, j114, j6);
                    }
                    if (i7 != 0) {
                        xz4Var2 = null;
                    }
                    i9 = i4 & (-465921);
                    x67VarB = q77.b(k, lp2Var);
                    kx4Var5 = kx4Var4;
                    s43Var2 = s43Var3;
                    z5 = z6;
                } else {
                    if (i11 != 0) {
                        kx4Var4 = hx4.X;
                    } else {
                        kx4Var4 = kx4Var2;
                    }
                    if (i5 == 0) {
                    }
                    j2 = ((dw0) lp2Var.j(j41.a)).a;
                    iw0Var = (iw0) lp2Var.j(kw0.a);
                    s43Var3 = iw0Var.X;
                    if (s43Var3 == null) {
                        long j115 = dw0.f;
                        s43Var3 = new s43(j115, j2, j115, dw0.b(0.38f, j2));
                        j3 = j2;
                        iw0Var.X = s43Var3;
                    } else {
                        j3 = j2;
                    }
                    j4 = s43Var3.b;
                    if (!tk8.a(j4, j3)) {
                        jB = dw0.b(0.38f, j3);
                        long j116 = s43Var3.a;
                        long j117 = s43Var3.c;
                        if (j3 != 16) {
                            j5 = j3;
                        } else {
                            j5 = j4;
                        }
                        if (jB != 16) {
                            j6 = jB;
                        } else {
                            j6 = s43Var3.d;
                        }
                        s43Var3 = new s43(j116, j5, j117, j6);
                    }
                    if (i7 != 0) {
                        xz4Var2 = null;
                    }
                    i9 = i4 & (-465921);
                    x67VarB = q77.b(k, lp2Var);
                    kx4Var5 = kx4Var4;
                    s43Var2 = s43Var3;
                    z5 = z6;
                }
                xz4Var3 = xz4Var2;
                lp2Var.q();
                int i15 = i9 << 3;
                d(kx4Var5, dn2Var, z5, x67VarB, s43Var2, xz4Var3, zy0Var2, lp2Var, ((i9 >> 3) & 14) | (i15 & 112) | (i9 & 896) | (i15 & 458752) | (i9 & 3670016));
                x67Var2 = x67VarB;
                z4 = z5;
                kx4Var3 = kx4Var5;
            } else {
                lp2Var.Q();
                s43Var2 = s43Var;
                x67Var2 = x67Var;
                kx4Var3 = kx4Var2;
                z4 = z2;
                xz4Var3 = xz4Var2;
            }
            j86VarR = lp2Var.r();
            if (j86VarR != null) {
                j86VarR.d = new rn2() { // from class: t43
                    @Override // defpackage.rn2
                    public final Object K(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        w45.c(dn2Var, kx4Var3, z4, s43Var2, xz4Var3, x67Var2, zy0Var, (lp2) obj, w79.P(i2 | 1), i3);
                        return dn8.a;
                    }
                };
            }
        }
        i4 |= 48;
        kx4Var2 = kx4Var;
        i5 = i3 & 4;
        if (i5 != 0) {
            if ((i2 & 384) == 0) {
                z2 = z;
                if (lp2Var.g(z2)) {
                    i6 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                } else {
                    i6 = 128;
                }
                i4 |= i6;
            }
            if ((i2 & 3072) == 0) {
                i4 |= 1024;
            }
            i7 = i3 & 16;
            if (i7 != 0) {
                if ((i2 & 24576) == 0) {
                    xz4Var2 = xz4Var;
                    if (lp2Var.f(xz4Var2)) {
                        i8 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i8 = 8192;
                    }
                    i4 |= i8;
                }
                if ((196608 & i2) == 0) {
                    i4 |= DnsOverHttps.MAX_RESPONSE_SIZE;
                }
                if ((1572864 & i2) == 0) {
                    zy0Var2 = zy0Var;
                    if (lp2Var.h(zy0Var2)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i4 |= i10;
                } else {
                    zy0Var2 = zy0Var;
                }
                if ((599187 & i4) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (lp2Var.N(i4 & 1, z3)) {
                    lp2Var.S();
                    if ((i2 & 1) != 0) {
                        if (i11 != 0) {
                            kx4Var4 = hx4.X;
                        } else {
                            kx4Var4 = kx4Var2;
                        }
                        if (i5 == 0) {
                        }
                        j2 = ((dw0) lp2Var.j(j41.a)).a;
                        iw0Var = (iw0) lp2Var.j(kw0.a);
                        s43Var3 = iw0Var.X;
                        if (s43Var3 == null) {
                            long j118 = dw0.f;
                            s43Var3 = new s43(j118, j2, j118, dw0.b(0.38f, j2));
                            j3 = j2;
                            iw0Var.X = s43Var3;
                        } else {
                            j3 = j2;
                        }
                        j4 = s43Var3.b;
                        if (!tk8.a(j4, j3)) {
                            jB = dw0.b(0.38f, j3);
                            long j119 = s43Var3.a;
                            long j1110 = s43Var3.c;
                            if (j3 != 16) {
                                j5 = j3;
                            } else {
                                j5 = j4;
                            }
                            if (jB != 16) {
                                j6 = jB;
                            } else {
                                j6 = s43Var3.d;
                            }
                            s43Var3 = new s43(j119, j5, j1110, j6);
                        }
                        if (i7 != 0) {
                            xz4Var2 = null;
                        }
                        i9 = i4 & (-465921);
                        x67VarB = q77.b(k, lp2Var);
                        kx4Var5 = kx4Var4;
                        s43Var2 = s43Var3;
                        z5 = z6;
                    } else {
                        if (i11 != 0) {
                            kx4Var4 = hx4.X;
                        } else {
                            kx4Var4 = kx4Var2;
                        }
                        if (i5 == 0) {
                        }
                        j2 = ((dw0) lp2Var.j(j41.a)).a;
                        iw0Var = (iw0) lp2Var.j(kw0.a);
                        s43Var3 = iw0Var.X;
                        if (s43Var3 == null) {
                            long j1111 = dw0.f;
                            s43Var3 = new s43(j1111, j2, j1111, dw0.b(0.38f, j2));
                            j3 = j2;
                            iw0Var.X = s43Var3;
                        } else {
                            j3 = j2;
                        }
                        j4 = s43Var3.b;
                        if (!tk8.a(j4, j3)) {
                            jB = dw0.b(0.38f, j3);
                            long j1112 = s43Var3.a;
                            long j1113 = s43Var3.c;
                            if (j3 != 16) {
                                j5 = j3;
                            } else {
                                j5 = j4;
                            }
                            if (jB != 16) {
                                j6 = jB;
                            } else {
                                j6 = s43Var3.d;
                            }
                            s43Var3 = new s43(j1112, j5, j1113, j6);
                        }
                        if (i7 != 0) {
                            xz4Var2 = null;
                        }
                        i9 = i4 & (-465921);
                        x67VarB = q77.b(k, lp2Var);
                        kx4Var5 = kx4Var4;
                        s43Var2 = s43Var3;
                        z5 = z6;
                    }
                    xz4Var3 = xz4Var2;
                    lp2Var.q();
                    int i16 = i9 << 3;
                    d(kx4Var5, dn2Var, z5, x67VarB, s43Var2, xz4Var3, zy0Var2, lp2Var, ((i9 >> 3) & 14) | (i16 & 112) | (i9 & 896) | (i16 & 458752) | (i9 & 3670016));
                    x67Var2 = x67VarB;
                    z4 = z5;
                    kx4Var3 = kx4Var5;
                } else {
                    lp2Var.Q();
                    s43Var2 = s43Var;
                    x67Var2 = x67Var;
                    kx4Var3 = kx4Var2;
                    z4 = z2;
                    xz4Var3 = xz4Var2;
                }
                j86VarR = lp2Var.r();
                if (j86VarR != null) {
                    j86VarR.d = new rn2() { // from class: t43
                        @Override // defpackage.rn2
                        public final Object K(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            w45.c(dn2Var, kx4Var3, z4, s43Var2, xz4Var3, x67Var2, zy0Var, (lp2) obj, w79.P(i2 | 1), i3);
                            return dn8.a;
                        }
                    };
                }
            }
            i4 |= 24576;
            xz4Var2 = xz4Var;
            if ((196608 & i2) == 0) {
                i4 |= DnsOverHttps.MAX_RESPONSE_SIZE;
            }
            if ((1572864 & i2) == 0) {
                zy0Var2 = zy0Var;
                if (lp2Var.h(zy0Var2)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i4 |= i10;
            } else {
                zy0Var2 = zy0Var;
            }
            if ((599187 & i4) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (lp2Var.N(i4 & 1, z3)) {
                lp2Var.S();
                if ((i2 & 1) != 0) {
                    if (i11 != 0) {
                        kx4Var4 = hx4.X;
                    } else {
                        kx4Var4 = kx4Var2;
                    }
                    if (i5 == 0) {
                    }
                    j2 = ((dw0) lp2Var.j(j41.a)).a;
                    iw0Var = (iw0) lp2Var.j(kw0.a);
                    s43Var3 = iw0Var.X;
                    if (s43Var3 == null) {
                        long j1114 = dw0.f;
                        s43Var3 = new s43(j1114, j2, j1114, dw0.b(0.38f, j2));
                        j3 = j2;
                        iw0Var.X = s43Var3;
                    } else {
                        j3 = j2;
                    }
                    j4 = s43Var3.b;
                    if (!tk8.a(j4, j3)) {
                        jB = dw0.b(0.38f, j3);
                        long j1115 = s43Var3.a;
                        long j1116 = s43Var3.c;
                        if (j3 != 16) {
                            j5 = j3;
                        } else {
                            j5 = j4;
                        }
                        if (jB != 16) {
                            j6 = jB;
                        } else {
                            j6 = s43Var3.d;
                        }
                        s43Var3 = new s43(j1115, j5, j1116, j6);
                    }
                    if (i7 != 0) {
                        xz4Var2 = null;
                    }
                    i9 = i4 & (-465921);
                    x67VarB = q77.b(k, lp2Var);
                    kx4Var5 = kx4Var4;
                    s43Var2 = s43Var3;
                    z5 = z6;
                } else {
                    if (i11 != 0) {
                        kx4Var4 = hx4.X;
                    } else {
                        kx4Var4 = kx4Var2;
                    }
                    if (i5 == 0) {
                    }
                    j2 = ((dw0) lp2Var.j(j41.a)).a;
                    iw0Var = (iw0) lp2Var.j(kw0.a);
                    s43Var3 = iw0Var.X;
                    if (s43Var3 == null) {
                        long j1117 = dw0.f;
                        s43Var3 = new s43(j1117, j2, j1117, dw0.b(0.38f, j2));
                        j3 = j2;
                        iw0Var.X = s43Var3;
                    } else {
                        j3 = j2;
                    }
                    j4 = s43Var3.b;
                    if (!tk8.a(j4, j3)) {
                        jB = dw0.b(0.38f, j3);
                        long j1118 = s43Var3.a;
                        long j1119 = s43Var3.c;
                        if (j3 != 16) {
                            j5 = j3;
                        } else {
                            j5 = j4;
                        }
                        if (jB != 16) {
                            j6 = jB;
                        } else {
                            j6 = s43Var3.d;
                        }
                        s43Var3 = new s43(j1118, j5, j1119, j6);
                    }
                    if (i7 != 0) {
                        xz4Var2 = null;
                    }
                    i9 = i4 & (-465921);
                    x67VarB = q77.b(k, lp2Var);
                    kx4Var5 = kx4Var4;
                    s43Var2 = s43Var3;
                    z5 = z6;
                }
                xz4Var3 = xz4Var2;
                lp2Var.q();
                int i17 = i9 << 3;
                d(kx4Var5, dn2Var, z5, x67VarB, s43Var2, xz4Var3, zy0Var2, lp2Var, ((i9 >> 3) & 14) | (i17 & 112) | (i9 & 896) | (i17 & 458752) | (i9 & 3670016));
                x67Var2 = x67VarB;
                z4 = z5;
                kx4Var3 = kx4Var5;
            } else {
                lp2Var.Q();
                s43Var2 = s43Var;
                x67Var2 = x67Var;
                kx4Var3 = kx4Var2;
                z4 = z2;
                xz4Var3 = xz4Var2;
            }
            j86VarR = lp2Var.r();
            if (j86VarR != null) {
                j86VarR.d = new rn2() { // from class: t43
                    @Override // defpackage.rn2
                    public final Object K(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        w45.c(dn2Var, kx4Var3, z4, s43Var2, xz4Var3, x67Var2, zy0Var, (lp2) obj, w79.P(i2 | 1), i3);
                        return dn8.a;
                    }
                };
            }
        }
        i4 |= 384;
        z2 = z;
        if ((i2 & 3072) == 0) {
            i4 |= 1024;
        }
        i7 = i3 & 16;
        if (i7 != 0) {
            if ((i2 & 24576) == 0) {
                xz4Var2 = xz4Var;
                if (lp2Var.f(xz4Var2)) {
                    i8 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i8 = 8192;
                }
                i4 |= i8;
            }
            if ((196608 & i2) == 0) {
                i4 |= DnsOverHttps.MAX_RESPONSE_SIZE;
            }
            if ((1572864 & i2) == 0) {
                zy0Var2 = zy0Var;
                if (lp2Var.h(zy0Var2)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i4 |= i10;
            } else {
                zy0Var2 = zy0Var;
            }
            if ((599187 & i4) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (lp2Var.N(i4 & 1, z3)) {
                lp2Var.S();
                if ((i2 & 1) != 0) {
                    if (i11 != 0) {
                        kx4Var4 = hx4.X;
                    } else {
                        kx4Var4 = kx4Var2;
                    }
                    if (i5 == 0) {
                    }
                    j2 = ((dw0) lp2Var.j(j41.a)).a;
                    iw0Var = (iw0) lp2Var.j(kw0.a);
                    s43Var3 = iw0Var.X;
                    if (s43Var3 == null) {
                        long j11110 = dw0.f;
                        s43Var3 = new s43(j11110, j2, j11110, dw0.b(0.38f, j2));
                        j3 = j2;
                        iw0Var.X = s43Var3;
                    } else {
                        j3 = j2;
                    }
                    j4 = s43Var3.b;
                    if (!tk8.a(j4, j3)) {
                        jB = dw0.b(0.38f, j3);
                        long j11111 = s43Var3.a;
                        long j11112 = s43Var3.c;
                        if (j3 != 16) {
                            j5 = j3;
                        } else {
                            j5 = j4;
                        }
                        if (jB != 16) {
                            j6 = jB;
                        } else {
                            j6 = s43Var3.d;
                        }
                        s43Var3 = new s43(j11111, j5, j11112, j6);
                    }
                    if (i7 != 0) {
                        xz4Var2 = null;
                    }
                    i9 = i4 & (-465921);
                    x67VarB = q77.b(k, lp2Var);
                    kx4Var5 = kx4Var4;
                    s43Var2 = s43Var3;
                    z5 = z6;
                } else {
                    if (i11 != 0) {
                        kx4Var4 = hx4.X;
                    } else {
                        kx4Var4 = kx4Var2;
                    }
                    if (i5 == 0) {
                    }
                    j2 = ((dw0) lp2Var.j(j41.a)).a;
                    iw0Var = (iw0) lp2Var.j(kw0.a);
                    s43Var3 = iw0Var.X;
                    if (s43Var3 == null) {
                        long j11113 = dw0.f;
                        s43Var3 = new s43(j11113, j2, j11113, dw0.b(0.38f, j2));
                        j3 = j2;
                        iw0Var.X = s43Var3;
                    } else {
                        j3 = j2;
                    }
                    j4 = s43Var3.b;
                    if (!tk8.a(j4, j3)) {
                        jB = dw0.b(0.38f, j3);
                        long j11114 = s43Var3.a;
                        long j11115 = s43Var3.c;
                        if (j3 != 16) {
                            j5 = j3;
                        } else {
                            j5 = j4;
                        }
                        if (jB != 16) {
                            j6 = jB;
                        } else {
                            j6 = s43Var3.d;
                        }
                        s43Var3 = new s43(j11114, j5, j11115, j6);
                    }
                    if (i7 != 0) {
                        xz4Var2 = null;
                    }
                    i9 = i4 & (-465921);
                    x67VarB = q77.b(k, lp2Var);
                    kx4Var5 = kx4Var4;
                    s43Var2 = s43Var3;
                    z5 = z6;
                }
                xz4Var3 = xz4Var2;
                lp2Var.q();
                int i18 = i9 << 3;
                d(kx4Var5, dn2Var, z5, x67VarB, s43Var2, xz4Var3, zy0Var2, lp2Var, ((i9 >> 3) & 14) | (i18 & 112) | (i9 & 896) | (i18 & 458752) | (i9 & 3670016));
                x67Var2 = x67VarB;
                z4 = z5;
                kx4Var3 = kx4Var5;
            } else {
                lp2Var.Q();
                s43Var2 = s43Var;
                x67Var2 = x67Var;
                kx4Var3 = kx4Var2;
                z4 = z2;
                xz4Var3 = xz4Var2;
            }
            j86VarR = lp2Var.r();
            if (j86VarR != null) {
                j86VarR.d = new rn2() { // from class: t43
                    @Override // defpackage.rn2
                    public final Object K(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        w45.c(dn2Var, kx4Var3, z4, s43Var2, xz4Var3, x67Var2, zy0Var, (lp2) obj, w79.P(i2 | 1), i3);
                        return dn8.a;
                    }
                };
            }
        }
        i4 |= 24576;
        xz4Var2 = xz4Var;
        if ((196608 & i2) == 0) {
            i4 |= DnsOverHttps.MAX_RESPONSE_SIZE;
        }
        if ((1572864 & i2) == 0) {
            zy0Var2 = zy0Var;
            if (lp2Var.h(zy0Var2)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i4 |= i10;
        } else {
            zy0Var2 = zy0Var;
        }
        if ((599187 & i4) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (lp2Var.N(i4 & 1, z3)) {
            lp2Var.S();
            if ((i2 & 1) != 0) {
                if (i11 != 0) {
                    kx4Var4 = hx4.X;
                } else {
                    kx4Var4 = kx4Var2;
                }
                if (i5 == 0) {
                }
                j2 = ((dw0) lp2Var.j(j41.a)).a;
                iw0Var = (iw0) lp2Var.j(kw0.a);
                s43Var3 = iw0Var.X;
                if (s43Var3 == null) {
                    long j11116 = dw0.f;
                    s43Var3 = new s43(j11116, j2, j11116, dw0.b(0.38f, j2));
                    j3 = j2;
                    iw0Var.X = s43Var3;
                } else {
                    j3 = j2;
                }
                j4 = s43Var3.b;
                if (!tk8.a(j4, j3)) {
                    jB = dw0.b(0.38f, j3);
                    long j11117 = s43Var3.a;
                    long j11118 = s43Var3.c;
                    if (j3 != 16) {
                        j5 = j3;
                    } else {
                        j5 = j4;
                    }
                    if (jB != 16) {
                        j6 = jB;
                    } else {
                        j6 = s43Var3.d;
                    }
                    s43Var3 = new s43(j11117, j5, j11118, j6);
                }
                if (i7 != 0) {
                    xz4Var2 = null;
                }
                i9 = i4 & (-465921);
                x67VarB = q77.b(k, lp2Var);
                kx4Var5 = kx4Var4;
                s43Var2 = s43Var3;
                z5 = z6;
            } else {
                if (i11 != 0) {
                    kx4Var4 = hx4.X;
                } else {
                    kx4Var4 = kx4Var2;
                }
                if (i5 == 0) {
                }
                j2 = ((dw0) lp2Var.j(j41.a)).a;
                iw0Var = (iw0) lp2Var.j(kw0.a);
                s43Var3 = iw0Var.X;
                if (s43Var3 == null) {
                    long j11119 = dw0.f;
                    s43Var3 = new s43(j11119, j2, j11119, dw0.b(0.38f, j2));
                    j3 = j2;
                    iw0Var.X = s43Var3;
                } else {
                    j3 = j2;
                }
                j4 = s43Var3.b;
                if (!tk8.a(j4, j3)) {
                    jB = dw0.b(0.38f, j3);
                    long j111110 = s43Var3.a;
                    long j111111 = s43Var3.c;
                    if (j3 != 16) {
                        j5 = j3;
                    } else {
                        j5 = j4;
                    }
                    if (jB != 16) {
                        j6 = jB;
                    } else {
                        j6 = s43Var3.d;
                    }
                    s43Var3 = new s43(j111110, j5, j111111, j6);
                }
                if (i7 != 0) {
                    xz4Var2 = null;
                }
                i9 = i4 & (-465921);
                x67VarB = q77.b(k, lp2Var);
                kx4Var5 = kx4Var4;
                s43Var2 = s43Var3;
                z5 = z6;
            }
            xz4Var3 = xz4Var2;
            lp2Var.q();
            int i19 = i9 << 3;
            d(kx4Var5, dn2Var, z5, x67VarB, s43Var2, xz4Var3, zy0Var2, lp2Var, ((i9 >> 3) & 14) | (i19 & 112) | (i9 & 896) | (i19 & 458752) | (i9 & 3670016));
            x67Var2 = x67VarB;
            z4 = z5;
            kx4Var3 = kx4Var5;
        } else {
            lp2Var.Q();
            s43Var2 = s43Var;
            x67Var2 = x67Var;
            kx4Var3 = kx4Var2;
            z4 = z2;
            xz4Var3 = xz4Var2;
        }
        j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2() { // from class: t43
                @Override // defpackage.rn2
                public final Object K(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    w45.c(dn2Var, kx4Var3, z4, s43Var2, xz4Var3, x67Var2, zy0Var, (lp2) obj, w79.P(i2 | 1), i3);
                    return dn8.a;
                }
            };
        }
    }

    public static final void d(kx4 kx4Var, dn2 dn2Var, boolean z, x67 x67Var, s43 s43Var, xz4 xz4Var, zy0 zy0Var, lp2 lp2Var, int i2) {
        int i3;
        xz4 xz4Var2;
        lp2Var.X(-1134296466);
        if ((i2 & 6) == 0) {
            i3 = (lp2Var.f(kx4Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= lp2Var.h(dn2Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= lp2Var.g(z) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= lp2Var.f(x67Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= lp2Var.f(s43Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= lp2Var.f(xz4Var) ? 131072 : DnsOverHttps.MAX_RESPONSE_SIZE;
        }
        if ((1572864 & i2) == 0) {
            i3 |= lp2Var.h(zy0Var) ? 1048576 : 524288;
        }
        int i4 = i3;
        if (lp2Var.N(i4 & 1, (599187 & i4) != 599186)) {
            if (xz4Var == null) {
                lp2Var.W(977045485);
                Object objK = lp2Var.K();
                if (objK == zz0.a) {
                    objK = new xz4();
                    lp2Var.g0(objK);
                }
                xz4Var2 = (xz4) objK;
                lp2Var.p(false);
            } else {
                lp2Var.W(862800938);
                lp2Var.p(false);
                xz4Var2 = xz4Var;
            }
            t03 t03Var = yf3.a;
            kx4 kx4VarY = kx4Var.y(xv4.X);
            float f2 = l;
            long jG = hi5.G(m + f2 + f2, 40.0f);
            FillElement fillElement = b.a;
            kx4 kx4VarY2 = x97.j(u15.f(w39.k(b.h(kx4VarY, nt1.b(jG), nt1.a(jG)), x67Var), z ? s43Var.a : s43Var.c, x67Var), xz4Var2, hl6.a(0.0f, 7, 0L, false), z, new kl6(0), dn2Var, 8).y(new or0(new h80((byte) 3)));
            xr4 xr4VarC = g80.c(pz2.i0, false);
            int I = km4.I(lp2Var);
            kl5 kl5VarL = lp2Var.l();
            kx4 kx4VarQ = Q(lp2Var, kx4VarY2);
            uz0.j.getClass();
            lp2Var.Z();
            if (lp2Var.S) {
                lp2Var.k();
            } else {
                lp2Var.j0();
            }
            pn7.m(pz2.B0, lp2Var, xr4VarC);
            pn7.m(pz2.A0, lp2Var, kl5VarL);
            dx0 dx0Var = pz2.C0;
            if (lp2Var.S || !dh3.f(lp2Var.K(), Integer.valueOf(I))) {
                p61.v(I, lp2Var, I, dx0Var);
            }
            pn7.m(pz2.z0, lp2Var, kx4VarQ);
            mb6.a(j41.a.a(new dw0(z ? s43Var.b : s43Var.d)), zy0Var, lp2Var, ((i4 >> 15) & 112) | 8);
            lp2Var.p(true);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new u43(kx4Var, dn2Var, z, x67Var, s43Var, xz4Var, zy0Var, i2);
        }
    }

    public static final void e(final lg4 lg4Var, final gn2 gn2Var, kx4 kx4Var, lp2 lp2Var, int i2) {
        int i3;
        float f2;
        be beVar;
        float f3;
        final oh2 oh2Var;
        char c2;
        byte b2;
        Object obj;
        boolean z;
        int i4;
        int i5;
        int i6;
        final boolean z2;
        oh2 oh2Var2;
        y05 y05Var;
        int i7;
        lp2 lp2Var2 = lp2Var;
        int i8 = lg4Var.c;
        gn2Var.getClass();
        lp2Var2.X(-315669071);
        if ((i2 & 6) == 0) {
            i3 = (lp2Var2.f(lg4Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= lp2Var2.h(gn2Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= lp2Var2.f(kx4Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (lp2Var2.N(i3 & 1, (i3 & 147) != 146)) {
            final boolean zT = oc.t(lp2Var2);
            Object objK = lp2Var2.K();
            be beVar2 = zz0.a;
            if (objK == beVar2) {
                objK = new oh2();
                lp2Var2.g0(objK);
            }
            final oh2 oh2Var3 = (oh2) objK;
            Object objK2 = lp2Var2.K();
            if (objK2 == beVar2) {
                objK2 = new oh2();
                lp2Var2.g0(objK2);
            }
            final oh2 oh2Var4 = (oh2) objK2;
            Object objK3 = lp2Var2.K();
            q51 q51Var = null;
            if (objK3 == beVar2) {
                objK3 = z51.H(null);
                lp2Var2.g0(objK3);
            }
            final y05 y05Var2 = (y05) objK3;
            Integer numValueOf = Integer.valueOf(i8);
            Object objK4 = lp2Var2.K();
            if (objK4 == beVar2) {
                objK4 = new jy2((Object) y05Var2, q51Var, (byte) 6);
                lp2Var2.g0(objK4);
            }
            u70.h((rn2) objK4, lp2Var2, numValueOf);
            wq6 wq6VarA = vq6.a(new ft(12.0f, new bt()), pz2.o0, lp2Var2, 54);
            int i9 = i3;
            int iHashCode = Long.hashCode(lp2Var2.T);
            kl5 kl5VarL = lp2Var2.l();
            kx4 kx4VarQ = Q(lp2Var2, kx4Var);
            uz0.j.getClass();
            lp2Var2.Z();
            if (lp2Var2.S) {
                lp2Var2.k();
            } else {
                lp2Var2.j0();
            }
            pn7.m(pz2.B0, lp2Var2, wq6VarA);
            pn7.m(pz2.A0, lp2Var2, kl5VarL);
            pn7.m(pz2.C0, lp2Var2, Integer.valueOf(iHashCode));
            pn7.l(lp2Var2);
            pn7.m(pz2.z0, lp2Var2, kx4VarQ);
            g73 g73VarB = yn0.i;
            if (g73VarB != null) {
                f2 = -1.41f;
            } else {
                f73 f73Var = new f73("Filled.KeyboardDoubleArrowLeft", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i10 = gu8.a;
                long j2 = dw0.b;
                fe7 fe7Var = new fe7(j2);
                ArrayList arrayList = new ArrayList(32);
                arrayList.add(new vi5(17.59f, 18.0f));
                arrayList.add(new cj5(1.41f, -1.41f));
                arrayList.add(new cj5(-4.58f, -4.59f));
                arrayList.add(new cj5(4.58f, -4.59f));
                arrayList.add(new cj5(-1.41f, -1.41f));
                arrayList.add(new cj5(-6.0f, 6.0f));
                ri5 ri5Var = ri5.c;
                arrayList.add(ri5Var);
                f73.a(f73Var, arrayList, fe7Var);
                fe7 fe7Var2 = new fe7(j2);
                ArrayList arrayList2 = new ArrayList(32);
                arrayList2.add(new vi5(11.0f, 18.0f));
                f2 = -1.41f;
                arrayList2.add(new cj5(1.41f, -1.41f));
                arrayList2.add(new cj5(-4.58f, -4.59f));
                arrayList2.add(new cj5(4.58f, -4.59f));
                arrayList2.add(new cj5(-1.41f, -1.41f));
                arrayList2.add(new cj5(-6.0f, 6.0f));
                arrayList2.add(ri5Var);
                f73.a(f73Var, arrayList2, fe7Var2);
                g73VarB = f73Var.b();
                yn0.i = g73VarB;
            }
            String strJ0 = vj8.j0(y46.logs_first_page, lp2Var);
            boolean z3 = lg4Var.h;
            int i11 = i9 & 112;
            boolean zG = lp2Var.g(zT) | (i11 == 32);
            Object objK5 = lp2Var.K();
            if (zG || objK5 == beVar2) {
                final byte b3 = 0;
                beVar = beVar2;
                f3 = 1.41f;
                dn2 dn2Var = new dn2() { // from class: ig4
                    @Override // defpackage.dn2
                    public final Object invoke() {
                        byte b4 = b3;
                        dn8 dn8Var = dn8.a;
                        y05 y05Var3 = y05Var2;
                        gn2 gn2Var2 = gn2Var;
                        boolean z4 = zT;
                        oh2 oh2Var5 = oh2Var4;
                        switch (b4) {
                            case 0:
                                if (z4) {
                                    y05Var3.setValue(oh2Var5);
                                }
                                gn2Var2.B(yg4.a);
                                break;
                            default:
                                if (z4) {
                                    y05Var3.setValue(oh2Var5);
                                }
                                gn2Var2.B(zg4.a);
                                break;
                        }
                        return dn8Var;
                    }
                };
                oh2Var = oh2Var4;
                lp2Var.g0(dn2Var);
                objK5 = dn2Var;
            } else {
                oh2Var = oh2Var4;
                beVar = beVar2;
                f3 = 1.41f;
            }
            float f4 = f2;
            f(g73VarB, strJ0, z3, (dn2) objK5, null, lp2Var, 0, 16);
            g73 g73VarB2 = u15.w;
            if (g73VarB2 != null) {
                b2 = -1061158912;
                c2 = 0;
            } else {
                f73 f73Var2 = new f73("Filled.ChevronLeft", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i12 = gu8.a;
                fe7 fe7Var3 = new fe7(dw0.b);
                ArrayList arrayList3 = new ArrayList(32);
                arrayList3.add(new vi5(15.41f, 7.41f));
                c2 = 0;
                arrayList3.add(new ui5(14.0f, 6.0f));
                b2 = -1061158912;
                arrayList3.add(new cj5(-6.0f, 6.0f));
                arrayList3.add(new cj5(6.0f, 6.0f));
                arrayList3.add(new cj5(f3, f4));
                arrayList3.add(new ui5(10.83f, 12.0f));
                arrayList3.add(ri5.c);
                f73.a(f73Var2, arrayList3, fe7Var3);
                g73VarB2 = f73Var2.b();
                u15.w = g73VarB2;
            }
            String strJ1 = vj8.j0(y46.logs_previous_page, lp2Var);
            boolean z4 = lg4Var.h;
            hx4 hx4Var = hx4.X;
            kx4 kx4VarI = zc1.I(hx4Var, oh2Var3);
            int i13 = i9 & 14;
            boolean zG2 = lp2Var.g(zT) | (i11 == 32) | (i13 == 4);
            Object objK6 = lp2Var.K();
            if (zG2) {
                final byte b4 = 0;
                z = true;
                i4 = 4;
                i5 = 32;
                i6 = i11;
                z2 = zT;
                obj = new dn2() { // from class: jg4
                    @Override // defpackage.dn2
                    public final Object invoke() {
                        byte b5 = b4;
                        dn8 dn8Var = dn8.a;
                        y05 y05Var3 = y05Var2;
                        gn2 gn2Var2 = gn2Var;
                        boolean z5 = z2;
                        oh2 oh2Var5 = oh2Var;
                        oh2 oh2Var6 = oh2Var3;
                        lg4 lg4Var2 = lg4Var;
                        switch (b5) {
                            case 0:
                                if (lg4Var2.c > 1) {
                                    oh2Var5 = oh2Var6;
                                }
                                if (z5) {
                                    y05Var3.setValue(oh2Var5);
                                }
                                gn2Var2.B(ch4.a);
                                break;
                            default:
                                if (lg4Var2.c < lg4Var2.f - 2) {
                                    oh2Var5 = oh2Var6;
                                }
                                if (z5) {
                                    y05Var3.setValue(oh2Var5);
                                }
                                gn2Var2.B(bh4.a);
                                break;
                        }
                        return dn8Var;
                    }
                };
                oh2Var2 = oh2Var3;
                y05Var = y05Var2;
                lp2Var.g0(obj);
            } else {
                be beVar3 = beVar;
                if (objK6 == beVar3) {
                    beVar = beVar3;
                    final byte b5 = 0;
                    z = true;
                    i4 = 4;
                    i5 = 32;
                    i6 = i11;
                    z2 = zT;
                    obj = new dn2() { // from class: jg4
                        @Override // defpackage.dn2
                        public final Object invoke() {
                            byte b6 = b5;
                            dn8 dn8Var = dn8.a;
                            y05 y05Var3 = y05Var2;
                            gn2 gn2Var2 = gn2Var;
                            boolean z5 = z2;
                            oh2 oh2Var5 = oh2Var;
                            oh2 oh2Var6 = oh2Var3;
                            lg4 lg4Var2 = lg4Var;
                            switch (b6) {
                                case 0:
                                    if (lg4Var2.c > 1) {
                                        oh2Var5 = oh2Var6;
                                    }
                                    if (z5) {
                                        y05Var3.setValue(oh2Var5);
                                    }
                                    gn2Var2.B(ch4.a);
                                    break;
                                default:
                                    if (lg4Var2.c < lg4Var2.f - 2) {
                                        oh2Var5 = oh2Var6;
                                    }
                                    if (z5) {
                                        y05Var3.setValue(oh2Var5);
                                    }
                                    gn2Var2.B(bh4.a);
                                    break;
                            }
                            return dn8Var;
                        }
                    };
                    oh2Var2 = oh2Var3;
                    y05Var = y05Var2;
                    lp2Var.g0(obj);
                } else {
                    beVar = beVar3;
                    obj = objK6;
                    oh2Var2 = oh2Var3;
                    y05Var = y05Var2;
                    z = true;
                    i4 = 4;
                    i5 = 32;
                    z2 = zT;
                    i6 = i11;
                }
            }
            final oh2 oh2Var5 = oh2Var;
            final boolean z5 = z2;
            f(g73VarB2, strJ1, z4, (dn2) obj, kx4VarI, lp2Var, 0, 0);
            int i14 = i5;
            int i15 = i6;
            int i16 = i4;
            be beVar4 = beVar;
            zc1.g((i8 + 1) + " / " + lg4Var.f, null, o88.a(((ds) lp2Var.j(es.a)).c, ((dp) lp2Var.j(ep.z)).c.a, 0L, null, null, 0L, 0L, null, 16777214), 0, 0, 0, 0, false, null, lp2Var, 0, 506);
            g73 g73VarJ = J();
            String strJ2 = vj8.j0(y46.logs_next_page, lp2Var);
            boolean z6 = lg4Var.i;
            kx4 kx4VarI2 = zc1.I(hx4Var, oh2Var5);
            boolean zG3 = lp2Var.g(z5) | (i15 == i14) | (i13 == i16);
            Object objK7 = lp2Var.K();
            if (zG3 || objK7 == beVar4) {
                final byte b6 = 1;
                i7 = i15;
                final oh2 oh2Var6 = oh2Var2;
                final y05 y05Var3 = y05Var;
                dn2 dn2Var2 = new dn2() { // from class: jg4
                    @Override // defpackage.dn2
                    public final Object invoke() {
                        byte b7 = b6;
                        dn8 dn8Var = dn8.a;
                        y05 y05Var4 = y05Var3;
                        gn2 gn2Var2 = gn2Var;
                        boolean z7 = z5;
                        oh2 oh2Var7 = oh2Var6;
                        oh2 oh2Var8 = oh2Var5;
                        lg4 lg4Var2 = lg4Var;
                        switch (b7) {
                            case 0:
                                if (lg4Var2.c > 1) {
                                    oh2Var7 = oh2Var8;
                                }
                                if (z7) {
                                    y05Var4.setValue(oh2Var7);
                                }
                                gn2Var2.B(ch4.a);
                                break;
                            default:
                                if (lg4Var2.c < lg4Var2.f - 2) {
                                    oh2Var7 = oh2Var8;
                                }
                                if (z7) {
                                    y05Var4.setValue(oh2Var7);
                                }
                                gn2Var2.B(bh4.a);
                                break;
                        }
                        return dn8Var;
                    }
                };
                lp2Var.g0(dn2Var2);
                objK7 = dn2Var2;
            } else {
                i7 = i15;
            }
            lp2Var2 = lp2Var;
            f(g73VarJ, strJ2, z6, (dn2) objK7, kx4VarI2, lp2Var2, 0, 0);
            g73 g73VarB3 = ys0.v0;
            if (g73VarB3 == null) {
                f73 f73Var3 = new f73("Filled.KeyboardDoubleArrowRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i17 = gu8.a;
                long j3 = dw0.b;
                fe7 fe7Var4 = new fe7(j3);
                ArrayList arrayList4 = new ArrayList(r5);
                arrayList4.add(new vi5(6.41f, c2));
                arrayList4.add(new cj5(-1.41f, 1.41f));
                arrayList4.add(new cj5(4.58f, 4.59f));
                arrayList4.add(new cj5(-4.58f, 4.59f));
                arrayList4.add(new cj5(1.41f, 1.41f));
                arrayList4.add(new cj5(c2, -6.0f));
                ri5 ri5Var2 = ri5.c;
                arrayList4.add(ri5Var2);
                f73.a(f73Var3, arrayList4, fe7Var4);
                fe7 fe7Var5 = new fe7(j3);
                ArrayList arrayList5 = new ArrayList(i14);
                arrayList5.add(new vi5(13.0f, c2));
                arrayList5.add(new cj5(-1.41f, 1.41f));
                arrayList5.add(new cj5(4.58f, 4.59f));
                arrayList5.add(new cj5(-4.58f, 4.59f));
                arrayList5.add(new cj5(1.41f, 1.41f));
                arrayList5.add(new cj5(c2, -6.0f));
                arrayList5.add(ri5Var2);
                f73.a(f73Var3, arrayList5, fe7Var5);
                g73VarB3 = f73Var3.b();
                ys0.v0 = g73VarB3;
            }
            String strJ3 = vj8.j0(y46.logs_last_page, lp2Var2);
            boolean z7 = lg4Var.i;
            boolean zG4 = lp2Var2.g(r4) | (i7 == r5);
            Object objK8 = lp2Var2.K();
            if (zG4 || objK8 == beVar4) {
                final byte b7 = 1;
                final oh2 oh2Var7 = oh2Var2;
                final y05 y05Var4 = y05Var;
                dn2 dn2Var3 = new dn2() { // from class: ig4
                    @Override // defpackage.dn2
                    public final Object invoke() {
                        byte b8 = b7;
                        dn8 dn8Var = dn8.a;
                        y05 y05Var5 = y05Var4;
                        gn2 gn2Var2 = gn2Var;
                        boolean z8 = z5;
                        oh2 oh2Var8 = oh2Var7;
                        switch (b8) {
                            case 0:
                                if (z8) {
                                    y05Var5.setValue(oh2Var8);
                                }
                                gn2Var2.B(yg4.a);
                                break;
                            default:
                                if (z8) {
                                    y05Var5.setValue(oh2Var8);
                                }
                                gn2Var2.B(zg4.a);
                                break;
                        }
                        return dn8Var;
                    }
                };
                lp2Var2.g0(dn2Var3);
                objK8 = dn2Var3;
            }
            f(g73VarB3, strJ3, z7, (dn2) objK8, null, lp2Var2, 0, 16);
            lp2Var2.p(true);
        } else {
            lp2Var2.Q();
        }
        j86 j86VarR = lp2Var2.r();
        if (j86VarR != null) {
            j86VarR.d = new g8((Object) lg4Var, (Object) gn2Var, (Object) kx4Var, i2, (byte) 13);
        }
    }

    public static final void f(final g73 g73Var, final String str, final boolean z, final dn2 dn2Var, kx4 kx4Var, lp2 lp2Var, final int i2, final int i3) {
        final kx4 kx4Var2;
        int i4;
        lp2Var.X(543087914);
        int i5 = i2 | (lp2Var.f(g73Var) ? 4 : 2) | (lp2Var.f(str) ? 32 : 16) | (lp2Var.g(z) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (lp2Var.h(dn2Var) ? 2048 : 1024);
        int i6 = i3 & 16;
        if (i6 != 0) {
            i4 = i5 | 24576;
            kx4Var2 = kx4Var;
        } else {
            kx4Var2 = kx4Var;
            i4 = i5 | (lp2Var.f(kx4Var2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        }
        byte b2 = 1;
        if (lp2Var.N(i4 & 1, (i4 & 9363) != 9362)) {
            kx4 kx4Var3 = i6 != 0 ? hx4.X : kx4Var2;
            Object objK = lp2Var.K();
            Object obj = zz0.a;
            if (objK == obj) {
                objK = new xz4();
                lp2Var.g0(objK);
            }
            xz4 xz4Var = (xz4) objK;
            boolean z2 = oc.t(lp2Var) && z && ((Boolean) km4.s(xz4Var, lp2Var, 6).getValue()).booleanValue();
            lh7 lh7VarB = ri.b(z2 ? 1.12f : 1.0f, null, "PageButtonFocusScale", lp2Var, 3072, 22);
            lp2Var.W(-2078500525);
            boolean zF = lp2Var.f(lh7VarB);
            Object objK2 = lp2Var.K();
            if (zF || objK2 == obj) {
                objK2 = new sf1(lh7VarB, b2);
                lp2Var.g0(objK2);
            }
            kx4 kx4VarI = jm4.I(kx4Var3, (gn2) objK2);
            if (z2) {
                jm6 jm6Var = km6.a;
                q06 q06Var = ep.z;
                kx4VarI = u15.f(kx4VarI.y(new o97(jm6Var, new s67(8.0f, 60, dw0.b(0.5f, ((dp) lp2Var.j(q06Var)).a)))), ((dp) lp2Var.j(q06Var)).b.a, jm6Var).y(new c70(1.0f, new fe7(((dp) lp2Var.j(q06Var)).a), jm6Var));
            }
            lp2Var.p(false);
            c(dn2Var, kx4VarI, z, null, xz4Var, null, jm4.U(304651080, new wx2(z, g73Var, str), lp2Var), lp2Var, (i4 & 896) | ((i4 >> 9) & 14) | 1597440, 40);
            kx4Var2 = kx4Var3;
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2(str, z, dn2Var, kx4Var2, i2, i3) { // from class: kg4
                public final /* synthetic */ String Y;
                public final /* synthetic */ boolean Z;
                public final /* synthetic */ dn2 f0;
                public final /* synthetic */ kx4 g0;
                public final /* synthetic */ byte h0;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.h0 = i3;
                }

                @Override // defpackage.rn2
                public final Object K(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iP = w79.P(1);
                    w45.f(this.X, this.Y, this.Z, this.f0, this.g0, (lp2) obj2, iP, this.h0);
                    return dn8.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0087  */
    /* JADX WARN: Code duplicated, block: B:44:0x0089  */
    public static final void g(final v30 v30Var, final boolean z, final lf6 lf6Var, final boolean z2, final long j2, final float f2, final kx4 kx4Var, lp2 lp2Var, final int i2) {
        boolean z3;
        lp2Var.X(-466280168);
        int i3 = i2 | (lp2Var.f(v30Var) ? 4 : 2) | (lp2Var.d(lf6Var.ordinal()) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (lp2Var.g(z2) ? 2048 : 1024) | (lp2Var.f(kx4Var) ? 1048576 : 524288);
        byte b2 = 0;
        if (lp2Var.N(i3 & 1, (533651 & i3) != 533650)) {
            lp2Var.S();
            if ((i2 & 1) != 0 && !lp2Var.x()) {
                lp2Var.Q();
            }
            lp2Var.q();
            lf6 lf6Var2 = lf6.Y;
            lf6 lf6Var3 = lf6.X;
            if (z) {
                e17 e17Var = n07.a;
                if ((lf6Var != lf6Var3 || z2) && !(lf6Var == lf6Var2 && z2)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
            } else {
                e17 e17Var2 = n07.a;
                if ((lf6Var != lf6Var3 || z2) && !(lf6Var == lf6Var2 && z2)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            m50 m50Var = z3 ? pu.b : pu.a;
            int i4 = i3 & 14;
            boolean zG = lp2Var.g(z3) | (i4 == 4);
            Object objK = lp2Var.K();
            if (zG || objK == zz0.a) {
                objK = new jg(v30Var, z, z3, b2);
                lp2Var.g0(objK);
            }
            final kx4 kx4VarA = v07.a(kx4Var, false, (gn2) objK);
            final fw8 fw8Var = (fw8) lp2Var.j(y01.t);
            final boolean z4 = z3;
            a(v30Var, m50Var, jm4.U(1365123137, new rn2() { // from class: lg
                @Override // defpackage.rn2
                public final Object K(Object obj, Object obj2) {
                    lp2 lp2Var2 = (lp2) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (lp2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                        t06 t06VarA = y01.t.a(fw8Var);
                        final long j3 = j2;
                        final boolean z5 = z4;
                        final kx4 kx4Var2 = kx4VarA;
                        final v30 v30Var2 = v30Var;
                        mb6.a(t06VarA, jm4.U(1260045569, new rn2() { // from class: ng
                            @Override // defpackage.rn2
                            public final Object K(Object obj3, Object obj4) {
                                lp2 lp2Var3 = (lp2) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                final byte b3 = 1;
                                final byte b4 = 0;
                                if (lp2Var3.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    long j4 = j3;
                                    boolean z6 = z5;
                                    kx4 kx4Var3 = kx4Var2;
                                    final v30 v30Var3 = v30Var2;
                                    be beVar = zz0.a;
                                    if (j4 != 9205357640488583168L) {
                                        lp2Var3.W(3458246);
                                        ct ctVar = z6 ? km4.c : km4.b;
                                        kx4 kx4VarF = b.f(kx4Var3, nt1.b(j4), nt1.a(j4), 0.0f, 0.0f, 12);
                                        wq6 wq6VarA = vq6.a(ctVar, pz2.n0, lp2Var3, 0);
                                        int iHashCode = Long.hashCode(lp2Var3.T);
                                        kl5 kl5VarL = lp2Var3.l();
                                        kx4 kx4VarQ = w45.Q(lp2Var3, kx4VarF);
                                        uz0.j.getClass();
                                        lp2Var3.Z();
                                        if (lp2Var3.S) {
                                            lp2Var3.k();
                                        } else {
                                            lp2Var3.j0();
                                        }
                                        pn7.m(pz2.B0, lp2Var3, wq6VarA);
                                        pn7.m(pz2.A0, lp2Var3, kl5VarL);
                                        pn7.m(pz2.C0, lp2Var3, Integer.valueOf(iHashCode));
                                        pn7.l(lp2Var3);
                                        pn7.m(pz2.z0, lp2Var3, kx4VarQ);
                                        boolean zH = lp2Var3.h(v30Var3);
                                        Object objK2 = lp2Var3.K();
                                        if (zH || objK2 == beVar) {
                                            objK2 = new dn2() { // from class: og
                                                @Override // defpackage.dn2
                                                public final Object invoke() {
                                                    byte b5 = b4;
                                                    v30 v30Var4 = v30Var3;
                                                    switch (b5) {
                                                        case 0:
                                                            return Boolean.valueOf((9223372034707292159L & v30Var4.a()) != 9205357640488583168L);
                                                        default:
                                                            return Boolean.valueOf((9223372034707292159L & v30Var4.a()) != 9205357640488583168L);
                                                    }
                                                }
                                            };
                                            lp2Var3.g0(objK2);
                                        }
                                        w45.h(6, (dn2) objK2, lp2Var3, hx4.X, z6);
                                        lp2Var3.p(true);
                                        lp2Var3.p(false);
                                    } else {
                                        lp2Var3.W(4389176);
                                        boolean zH2 = lp2Var3.h(v30Var3);
                                        Object objK3 = lp2Var3.K();
                                        if (zH2 || objK3 == beVar) {
                                            objK3 = new dn2() { // from class: og
                                                @Override // defpackage.dn2
                                                public final Object invoke() {
                                                    byte b5 = b3;
                                                    v30 v30Var4 = v30Var3;
                                                    switch (b5) {
                                                        case 0:
                                                            return Boolean.valueOf((9223372034707292159L & v30Var4.a()) != 9205357640488583168L);
                                                        default:
                                                            return Boolean.valueOf((9223372034707292159L & v30Var4.a()) != 9205357640488583168L);
                                                    }
                                                }
                                            };
                                            lp2Var3.g0(objK3);
                                        }
                                        w45.h(0, (dn2) objK3, lp2Var3, kx4Var3, z6);
                                        lp2Var3.p(false);
                                    }
                                } else {
                                    lp2Var3.Q();
                                }
                                return dn8.a;
                            }
                        }, lp2Var2), lp2Var2, 56);
                    } else {
                        lp2Var2.Q();
                    }
                    return dn8.a;
                }
            }, lp2Var), lp2Var, i4 | 384);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2(z, lf6Var, z2, j2, f2, kx4Var, i2) { // from class: mg
                public final /* synthetic */ boolean Y;
                public final /* synthetic */ lf6 Z;
                public final /* synthetic */ boolean f0;
                public final /* synthetic */ long g0;
                public final /* synthetic */ float h0;
                public final /* synthetic */ kx4 i0;

                @Override // defpackage.rn2
                public final Object K(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = w79.P(24625);
                    w45.g(this.X, this.Y, this.Z, this.f0, this.g0, this.h0, this.i0, (lp2) obj, iP);
                    return dn8.a;
                }
            };
        }
    }

    public static final void h(final int i2, final dn2 dn2Var, lp2 lp2Var, final kx4 kx4Var, final boolean z) {
        int i3;
        lp2Var.X(2111672474);
        if ((i2 & 6) == 0) {
            i3 = (lp2Var.f(kx4Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | (lp2Var.h(dn2Var) ? 32 : 16) | (lp2Var.g(z) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (lp2Var.N(i4 & 1, (i4 & 147) != 146)) {
            e17 e17Var = n07.a;
            ch3.f(lp2Var, x(b.h(kx4Var, 25.0f, 25.0f), new sn2() { // from class: qg
                @Override // defpackage.sn2
                public final Object x(Object obj, Object obj2, Object obj3) {
                    kx4 kx4Var2 = (kx4) obj;
                    lp2 lp2Var2 = (lp2) obj2;
                    ((Integer) obj3).getClass();
                    lp2Var2.W(-196777734);
                    final long j2 = ((h88) lp2Var2.j(i88.a)).a;
                    boolean zE = lp2Var2.e(j2);
                    final dn2 dn2Var2 = dn2Var;
                    boolean zF = zE | lp2Var2.f(dn2Var2);
                    final boolean z2 = z;
                    boolean zG = zF | lp2Var2.g(z2);
                    Object objK = lp2Var2.K();
                    if (zG || objK == zz0.a) {
                        objK = new gn2() { // from class: rg
                            @Override // defpackage.gn2
                            public final Object B(Object obj4) {
                                jc0 jc0Var = (jc0) obj4;
                                return jc0Var.a(new kg((byte) 0, dn2Var2, w45.D(jc0Var, Float.intBitsToFloat((int) (jc0Var.X.e() >> 32)) / 2.0f), new g60(j2, 5), z2));
                            }
                        };
                        lp2Var2.g0(objK);
                    }
                    kx4 kx4VarS = w79.s(kx4Var2, (gn2) objK);
                    lp2Var2.p(false);
                    return kx4VarS;
                }
            }));
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2() { // from class: pg
                @Override // defpackage.rn2
                public final Object K(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    w45.h(w79.P(i2 | 1), dn2Var, (lp2) obj, kx4Var, z);
                    return dn8.a;
                }
            };
        }
    }

    public static final int k(int i2, int i3, int[] iArr) {
        iArr.getClass();
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else {
                if (i7 <= i3) {
                    return i6;
                }
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }

    public static final int l(long[] jArr, int i2, long j2) {
        jArr.getClass();
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            long j3 = jArr[i5];
            if (j3 < j2) {
                i4 = i5 + 1;
            } else {
                if (j3 <= j2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static o57 m(o57 o57Var) {
        ip4 ip4Var = o57Var.X;
        ip4Var.b();
        return ip4Var.k0 > 0 ? o57Var : o57.Y;
    }

    public static void n(boolean z, String str) {
        if (z) {
            return;
        }
        bt.q(str);
    }

    public static final void o(int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        bt.q(pc6.k(i2, "Class declares ", i3, " type parameters, but ", " were provided."));
    }

    public static void p(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + String.valueOf(name2).length() + 35 + 1);
            oi0.y(sb, "Must be called on ", name2, " thread, but got ", name);
            c2.l(sb, ".");
        }
    }

    public static void q(String str) {
        if (TextUtils.isEmpty(str)) {
            bt.q("Given String is empty or null");
        }
    }

    public static void r(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            bt.q(str2);
        }
    }

    public static void s(Object obj) {
        if (obj != null) {
            return;
        }
        b61.i("null reference");
    }

    public static void t(Object obj, String str) {
        if (obj != null) {
            return;
        }
        b61.i(str);
    }

    public static final int u(xr6 xr6Var, String str) {
        xr6Var.getClass();
        int columnCount = xr6Var.getColumnCount();
        int i2 = 0;
        while (true) {
            if (i2 >= columnCount) {
                i2 = -1;
                break;
            }
            if (str.equals(xr6Var.getColumnName(i2))) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            return i2;
        }
        String strL = p61.l('`', "`", str);
        int columnCount2 = xr6Var.getColumnCount();
        int i3 = 0;
        while (true) {
            if (i3 >= columnCount2) {
                i3 = -1;
                break;
            }
            if (strL.equals(xr6Var.getColumnName(i3))) {
                break;
            }
            i3++;
        }
        if (i3 >= 0) {
            return i3;
        }
        if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
            int columnCount3 = xr6Var.getColumnCount();
            String strConcat = ".".concat(str);
            String strL2 = p61.l('`', ".", str);
            for (int i4 = 0; i4 < columnCount3; i4++) {
                String columnName = xr6Var.getColumnName(i4);
                if (columnName.length() >= str.length() + 2 && (mm7.R(columnName, false, strConcat) || (columnName.charAt(0) == '`' && mm7.R(columnName, false, strL2)))) {
                    return i4;
                }
            }
        }
        return -1;
    }

    public static final int v(long j2, long j3) {
        boolean zO = O(j2);
        if (zO != O(j3)) {
            return zO ? -1 : 1;
        }
        int iSignum = (int) Math.signum(K(j2) - K(j3));
        if (Math.min(K(j2), K(j3)) >= 0.0f && N(j2) != N(j3)) {
            return N(j2) ? -1 : 1;
        }
        return iSignum;
    }

    public static int w(int i2, int i3) {
        int i4 = i2 - Integer.MIN_VALUE;
        int i5 = i3 - Integer.MIN_VALUE;
        if (i4 < i5) {
            return -1;
        }
        return i4 == i5 ? 0 : 1;
    }

    public static kx4 x(kx4 kx4Var, sn2 sn2Var) {
        return kx4Var.y(new yz0(sn2Var));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a4  */
    /* JADX WARN: Multi-variable type inference failed */
    public static String y(ho2 ho2Var, int i2) {
        String strB;
        oe0 oe0Var = oe0.Z;
        boolean z = (i2 & 1) != 0;
        boolean z2 = (i2 & 2) != 0;
        ho2Var.getClass();
        StringBuilder sb = new StringBuilder();
        if (z2) {
            if (ho2Var instanceof a41) {
                strB = "<init>";
            } else {
                strB = ((fd1) ho2Var).getName().b();
                strB.getClass();
            }
            sb.append(strB);
        }
        sb.append("(");
        i44 i44VarS = ho2Var.S();
        if (i44VarS != null) {
            t14 t14VarC = i44VarS.c();
            t14VarC.getClass();
            sb.append((su3) z51.F(t14VarC, ei8.i, oe0Var));
        }
        Iterator it = ho2Var.L().iterator();
        while (it.hasNext()) {
            t14 t14VarC2 = ((ot8) it.next()).c();
            t14VarC2.getClass();
            sb.append((su3) z51.F(t14VarC2, ei8.i, oe0Var));
        }
        sb.append(")");
        if (z) {
            if (ho2Var instanceof a41) {
                sb.append("V");
            } else {
                t14 t14VarJ = ho2Var.j();
                t14VarJ.getClass();
                v15 v15Var = zz3.e;
                if (zz3.E(t14VarJ, tg7.d)) {
                    t14 t14VarJ2 = ho2Var.j();
                    t14VarJ2.getClass();
                    if (!cj8.e(t14VarJ2) && !(ho2Var instanceof hx5)) {
                        sb.append("V");
                    }
                }
                t14 t14VarJ3 = ho2Var.j();
                t14VarJ3.getClass();
                sb.append((su3) z51.F(t14VarJ3, ei8.i, oe0Var));
            }
        }
        return sb.toString();
    }

    public static final String z(jd0 jd0Var) {
        if (!bl1.m(jd0Var)) {
            ed1 ed1VarP = jd0Var.p();
            sx4 sx4Var = ed1VarP instanceof sx4 ? (sx4) ed1VarP : null;
            if (sx4Var != null && !sx4Var.getName().Y) {
                jd0 jd0VarA = jd0Var.a();
                q97 q97Var = jd0VarA instanceof q97 ? (q97) jd0VarA : null;
                if (q97Var != null) {
                    String strY = y(q97Var, 3);
                    String str = ll3.a;
                    qs0 qs0VarH = ll3.h(el1.g(sx4Var).a);
                    return (qs0VarH != null ? zs3.b(qs0VarH) : z51.t(sx4Var, qe4.A0)) + '.' + strY;
                }
            }
        }
        return null;
    }

    public Object R() {
        return dn8.a;
    }

    public abstract boolean j(Object obj);

    public void i(Object obj) {
    }
}
