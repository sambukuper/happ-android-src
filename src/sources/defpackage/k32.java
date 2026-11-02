package defpackage;

import android.text.TextUtils;
import android.widget.TextView;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import io.sentry.c2;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import su.happ.proxyutility.HappApplication;
import su.happ.proxyutility.ui.foundation.component.HappTextView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class k32 implements l32, zw7, zn2, y23, mu0, es5 {
    public static volatile k32 X;
    public static k32 Y;

    public static String b(String str, int i, int i2, int i3, String str2) {
        int i4 = (i3 & 1) != 0 ? 0 : i;
        int length = (i3 & 2) != 0 ? str.length() : i2;
        boolean z = (i3 & 8) == 0;
        boolean z2 = (i3 & 16) == 0;
        boolean z3 = (i3 & 32) == 0;
        boolean z4 = (i3 & 64) == 0;
        str.getClass();
        int iCharCount = i4;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i5 = 128;
            int i6 = 32;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z4) || fm7.e0(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z || (z2 && !j(str, iCharCount, length)))) || (iCodePointAt == 43 && z3)))) {
                i90 i90Var = new i90();
                i90Var.c1(i4, iCharCount, str);
                i90 i90Var2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 43 && z3) {
                            i90Var.d1(z ? "+" : "%2B");
                        } else if (iCodePointAt2 < i6 || iCodePointAt2 == 127 || ((iCodePointAt2 >= i5 && !z4) || fm7.e0(str2, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z || (z2 && !j(str, iCharCount, length)))))) {
                            if (i90Var2 == null) {
                                i90Var2 = new i90();
                            }
                            i90Var2.e1(iCodePointAt2);
                            while (!i90Var2.F()) {
                                byte b = i90Var2.readByte();
                                i90Var.H0(37);
                                char[] cArr = u23.j;
                                i90Var.H0(cArr[((b & 255) >> 4) & 15]);
                                i90Var.H0(cArr[b & 15]);
                            }
                        } else {
                            i90Var.e1(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i5 = 128;
                    i6 = 32;
                }
                return i90Var.Y();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.substring(i4, length);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public static fc0 c(aa7 aa7Var, d3 d3Var, int i, kh8 kh8Var, boolean z, boolean z2) {
        sx4 sx4VarH;
        Boolean bool;
        lh8 lh8VarN0;
        Boolean bool2;
        b8 b8Var;
        wg7 wg7VarJ;
        ?? r3 = 0;
        kh8 kh8Var2 = kh8.Z;
        Object[] objArr = kh8Var != kh8Var2;
        Object[] objArr2 = (z2 && z) ? false : true;
        Object obj = null;
        if (objArr != true && aa7Var.l0().isEmpty()) {
            return new fc0(null, 1, false);
        }
        ot0 ot0VarX = aa7Var.n0().x();
        if (ot0VarX == null) {
            return new fc0(null, 1, false);
        }
        ql3 ql3Var = (ql3) d3Var.B(Integer.valueOf(i));
        vm vmVar = th8.a;
        if (kh8Var == kh8Var2 || !(ot0VarX instanceof sx4)) {
            sx4VarH = null;
        } else if (ql3Var.b == mz4.X && kh8Var == kh8.X) {
            sx4 sx4Var = (sx4) ot0VarX;
            String str = ll3.a;
            gk2 gk2VarF = bl1.f(sx4Var);
            HashMap map = ll3.j;
            if (map.containsKey(gk2VarF)) {
                fk2 fk2Var = (fk2) map.get(bl1.f(sx4Var));
                if (fk2Var == null) {
                    c2.j("Given class ", sx4Var, " is not a mutable collection");
                    return null;
                }
                sx4VarH = el1.e(sx4Var).j(fk2Var);
            } else if (ql3Var.b == mz4.Y) {
                sx4VarH = null;
            } else {
                sx4VarH = null;
            }
        } else if (ql3Var.b == mz4.Y || kh8Var != kh8.Y) {
            sx4VarH = null;
        } else {
            sx4 sx4Var2 = (sx4) ot0VarX;
            String str2 = ll3.a;
            if (ll3.k.containsKey(bl1.f(sx4Var2))) {
                sx4VarH = pz2.h(sx4Var2);
            } else {
                sx4VarH = null;
            }
        }
        if (kh8Var == kh8Var2) {
            bool = null;
        } else {
            h75 h75Var = ql3Var.a;
            int i2 = h75Var == null ? -1 : sh8.a[h75Var.ordinal()];
            if (i2 == 1) {
                bool = Boolean.TRUE;
            } else if (i2 != 2) {
                bool = null;
            } else {
                bool = Boolean.FALSE;
            }
        }
        if (sx4VarH == null || (lh8VarN0 = sx4VarH.l()) == null) {
            lh8VarN0 = aa7Var.n0();
        }
        int i3 = i + 1;
        List listL0 = aa7Var.l0();
        List listG = lh8VarN0.g();
        listG.getClass();
        Iterator it = listL0.iterator();
        Iterator it2 = listG.iterator();
        ArrayList arrayList = new ArrayList(Math.min(xv0.Z(listL0, 10), xv0.Z(listG, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            hi8 hi8Var = (hi8) it2.next();
            ni8 ni8Var = (ni8) next;
            byte b = 6;
            if (objArr2 == true) {
                bool2 = bool;
                if (!ni8Var.c()) {
                    b8Var = e(ni8Var.b().q0(), d3Var, i3, z2);
                } else if (((ql3) d3Var.B(Integer.valueOf(i3))).a == h75.X) {
                    mo8 mo8VarQ0 = ni8Var.b().q0();
                    b8Var = new b8(dh3.s(yn0.O(mo8VarQ0).r0(r3), yn0.h0(mo8VarQ0).r0(true)), 1, (byte) 6);
                } else {
                    b8Var = new b8(null, 1, b);
                }
            } else {
                bool2 = bool;
                b8Var = new b8(obj, r3, b);
            }
            i3 += b8Var.b;
            t14 t14Var = (t14) b8Var.c;
            if (t14Var != null) {
                rt8 rt8VarA = ni8Var.a();
                rt8VarA.getClass();
                wg7VarJ = y08.b(t14Var, rt8VarA, hi8Var);
            } else if (sx4VarH == null || ni8Var.c()) {
                wg7VarJ = sx4VarH != null ? cj8.j(hi8Var) : null;
            } else {
                t14 t14VarB = ni8Var.b();
                t14VarB.getClass();
                rt8 rt8VarA2 = ni8Var.a();
                rt8VarA2.getClass();
                wg7VarJ = y08.b(t14VarB, rt8VarA2, hi8Var);
            }
            arrayList.add(wg7VarJ);
            bool = bool2;
            r3 = 0;
            obj = null;
        }
        Boolean bool3 = bool;
        int i4 = i3 - i;
        if (sx4VarH == null && bool3 == null) {
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                do {
                    if (it3.hasNext()) {
                    }
                } while (((ni8) it3.next()) == null);
            }
            return new fc0(null, i4, false);
        }
        sm annotations = aa7Var.getAnnotations();
        vm vmVar2 = th8.b;
        if (sx4VarH == null) {
            vmVar2 = null;
        }
        vm vmVar3 = th8.a;
        if (bool3 == null) {
            vmVar3 = null;
        }
        char c = 1;
        ArrayList arrayListQ0 = eu.q0(new sm[]{annotations, vmVar2, vmVar3});
        int size = arrayListQ0.size();
        if (size == 0) {
            bt.i("At least one Annotations object expected");
            return null;
        }
        ch8 ch8VarJ = bt7.j(size != 1 ? new vm(wv0.Y0(arrayListQ0), c == true ? 1 : 0) : (sm) wv0.O0(arrayListQ0));
        List listL1 = aa7Var.l0();
        Iterator it4 = arrayList.iterator();
        Iterator it5 = listL1.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(xv0.Z(arrayList, 10), xv0.Z(listL1, 10)));
        while (it4.hasNext() && it5.hasNext()) {
            Object next2 = it4.next();
            ni8 ni8Var2 = (ni8) it5.next();
            ni8 ni8Var3 = (ni8) next2;
            if (ni8Var3 != null) {
                ni8Var2 = ni8Var3;
            }
            arrayList2.add(ni8Var2);
        }
        aa7 aa7VarN = dh3.N(ch8VarJ, lh8VarN0, arrayList2, bool3 != null ? bool3.booleanValue() : aa7Var.o0());
        if (ql3Var.c) {
            aa7VarN = new j65(aa7VarN);
        }
        return new fc0(aa7VarN, i4, bool3 != null && ql3Var.d);
    }

    public static b8 e(mo8 mo8Var, d3 d3Var, int i, boolean z) {
        mo8 mo8VarS;
        aa7 aa7Var;
        byte b = 6;
        Object objH = null;
        if (vr3.J(mo8Var)) {
            return new b8(objH, 1, b);
        }
        if (!(mo8Var instanceof ce2)) {
            if (!(mo8Var instanceof aa7)) {
                b61.c();
                return null;
            }
            fc0 fc0VarC = c((aa7) mo8Var, d3Var, i, kh8.Z, false, z);
            boolean z2 = fc0VarC.b;
            t14 t14VarH = (aa7) fc0VarC.c;
            if (z2) {
                t14VarH = c18.h(mo8Var, t14VarH);
            }
            return new b8(t14VarH, fc0VarC.a, b);
        }
        boolean z3 = mo8Var instanceof r66;
        ce2 ce2Var = (ce2) mo8Var;
        aa7 aa7Var2 = ce2Var.Z;
        aa7 aa7Var3 = ce2Var.Y;
        fc0 fc0VarC2 = c(aa7Var3, d3Var, i, kh8.X, z3, z);
        fc0 fc0VarC3 = c(ce2Var.Z, d3Var, i, kh8.Y, z3, z);
        aa7 aa7Var4 = (aa7) fc0VarC3.c;
        aa7 aa7Var5 = (aa7) fc0VarC2.c;
        if (aa7Var5 != null || aa7Var4 != null) {
            if (fc0VarC2.b || fc0VarC3.b) {
                if (aa7Var4 != null) {
                    if (aa7Var5 == null) {
                        aa7Var5 = aa7Var4;
                    }
                    mo8VarS = dh3.s(aa7Var5, aa7Var4);
                } else {
                    aa7Var5.getClass();
                    mo8VarS = aa7Var5;
                }
                objH = c18.h(mo8Var, mo8VarS);
            } else if (z3) {
                aa7 aa7Var6 = aa7Var5;
                if (aa7Var5 == null) {
                }
                if (aa7Var4 != null) {
                    aa7Var6 = aa7Var3;
                    aa7Var2 = aa7Var4;
                }
                aa7Var6 = aa7Var3;
                objH = new r66(aa7Var6, aa7Var2);
            } else {
                if (aa7Var5 == null) {
                }
                if (aa7Var4 != null) {
                    aa7Var = aa7Var3;
                    aa7Var2 = aa7Var4;
                }
                aa7Var = aa7Var3;
                objH = dh3.s(aa7Var, aa7Var2);
            }
        }
        return new b8(objH, fc0VarC2.a, b);
    }

    public static aj2 g(int i) {
        aj2 aj2Var = (aj2) wv0.u0(i, aj2.f0);
        return aj2Var == null ? aj2.Y : aj2Var;
    }

    public static HappApplication i() {
        HappApplication happApplication = HappApplication.M0;
        if (happApplication != null) {
            return happApplication;
        }
        dh3.T("application");
        throw null;
    }

    public static boolean j(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && ks8.p(str.charAt(i + 1)) != -1 && ks8.p(str.charAt(i3)) != -1;
    }

    public static String k(String str, int i, int i2, int i3) {
        int i4;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        boolean z = (i3 & 4) == 0;
        str.getClass();
        int iCharCount = i;
        while (iCharCount < i2) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                i90 i90Var = new i90();
                i90Var.c1(i, iCharCount, str);
                while (iCharCount < i2) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i4 = iCharCount + 2) < i2) {
                        int iP = ks8.p(str.charAt(iCharCount + 1));
                        int iP2 = ks8.p(str.charAt(i4));
                        if (iP == -1 || iP2 == -1) {
                            i90Var.e1(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            i90Var.H0((iP << 4) + iP2);
                            iCharCount = Character.charCount(iCodePointAt) + i4;
                        }
                    } else if (iCodePointAt == 43 && z) {
                        i90Var.H0(32);
                        iCharCount++;
                    } else {
                        i90Var.e1(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return i90Var.Y();
            }
            iCharCount++;
        }
        return str.substring(i, i2);
    }

    public static void l(TextView textView) {
        vz7 vz7Var = HappTextView.o0;
        while (textView.getPaint().measureText(textView.getText().toString()) > (textView.getWidth() - textView.getPaddingStart()) - textView.getPaddingEnd() && d28.f(textView.getTextSize(), textView.getResources().getDisplayMetrics()) > 8.0f) {
            textView.setTextSize(d28.f(textView.getTextSize(), textView.getResources().getDisplayMetrics()) - 1.0f);
        }
    }

    public static ArrayList m(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iL0 = fm7.l0(str, '&', i, 4);
            if (iL0 == -1) {
                iL0 = str.length();
            }
            int iL1 = fm7.l0(str, '=', i, 4);
            if (iL1 == -1 || iL1 > iL0) {
                arrayList.add(str.substring(i, iL0));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, iL1));
                arrayList.add(str.substring(iL1 + 1, iL0));
            }
            i = iL0 + 1;
        }
        return arrayList;
    }

    @Override // defpackage.mu0
    public te3 a() {
        Instant instantNow = Instant.now();
        instantNow.getClass();
        te3 te3Var = te3.Z;
        return km4.F(instantNow.getNano(), instantNow.getEpochSecond());
    }

    @Override // defpackage.es5
    public CharSequence d(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        return TextUtils.isEmpty(listPreference.d()) ? listPreference.X.getString(d56.not_set) : listPreference.d();
    }

    @Override // defpackage.zw7
    public ax7 f(yw7 yw7Var) {
        return new xm2(yw7Var.a, yw7Var.b, yw7Var.c, yw7Var.d, yw7Var.e);
    }

    @Override // defpackage.y23
    public boolean h(byte[] bArr) {
        byte b = bArr[0];
        return (b == 1 && (bArr[1] & 255) >= 1) || (2 <= b && b <= 3);
    }

    @Override // defpackage.zn2
    public Object apply(Object obj) {
        return obj;
    }

    @Override // defpackage.l32
    public void z(ld0 ld0Var) {
    }

    @Override // defpackage.l32
    public void t(sx4 sx4Var, ArrayList arrayList) {
    }
}
