package defpackage;

import j$.util.DesugarTimeZone;
import java.io.Serializable;
import java.lang.ref.SoftReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qa8 implements Serializable, Cloneable {
    public static final Logger Y = Logger.getLogger("com.ibm.icu.util.TimeZone");
    public static final oa8 Z;
    public static volatile qa8 f0;
    public static final boolean g0;
    public String X;

    static {
        oa8 oa8Var = new oa8();
        oa8Var.X = "Etc/Unknown";
        oa8Var.h0 = false;
        oa8Var.h0 = true;
        Z = oa8Var;
        f0 = null;
        g0 = false;
        if (e33.a("com.ibm.icu.util.TimeZone.DefaultTimeZoneType", "ICU").equalsIgnoreCase("JDK")) {
            g0 = true;
        }
    }

    public qa8(String str) {
        str.getClass();
        this.X = str;
    }

    public static g40 b(String str, boolean z) {
        o95 o95Var = z ? (o95) o79.c.v0(str, str) : null;
        if (o95Var != null) {
            return o95Var;
        }
        int[] iArr = new int[4];
        if (o79.e(str, iArr)) {
            return (z97) o79.d.v0(Integer.valueOf(iArr[0] * (iArr[1] | (iArr[2] << 5) | (iArr[3] << 11))), iArr);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x007b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0086  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d1  */
    public static qa8 c(String str) {
        g40 g40VarB;
        String strB;
        boolean z;
        String str2;
        Map map;
        if (g0) {
            TimeZone timeZone = jl3.k0.contains(str) ? DesugarTimeZone.getTimeZone(str) : null;
            if (timeZone == null) {
                if (str == null || str.length() == 0) {
                    strB = null;
                    z = false;
                } else {
                    strB = "Etc/Unknown";
                    if (str.equals("Etc/Unknown")) {
                        z = false;
                    } else {
                        n97 n97Var = o79.b;
                        SoftReference softReference = (SoftReference) n97Var.X;
                        String strA = (String) ((softReference == null || (map = (Map) softReference.get()) == null) ? null : map.get(str));
                        if (strA == null) {
                            strA = o79.a(str);
                            if (strA == null) {
                                try {
                                    int iD = o79.d(str);
                                    if (iD >= 0) {
                                        al8 al8VarB = al8.v("com/ibm/icu/impl/data/icudata", "zoneinfo64", r33.f).c("Zones").b(iD);
                                        if (al8VarB.p() == 7) {
                                            int iF = al8VarB.f();
                                            if (iF >= 0) {
                                                String[] strArrC = o79.c();
                                                if (iF < strArrC.length) {
                                                    str2 = strArrC[iF];
                                                } else {
                                                    str2 = null;
                                                }
                                            } else {
                                                str2 = null;
                                            }
                                            try {
                                                strA = o79.a(str2);
                                            } catch (MissingResourceException unused) {
                                            }
                                        } else {
                                            str2 = str;
                                        }
                                        if (strA == null) {
                                            strA = str2;
                                        }
                                    } else {
                                        str2 = str;
                                    }
                                } catch (MissingResourceException unused2) {
                                }
                            } else {
                                str2 = str;
                            }
                            if (strA != null) {
                                SoftReference softReference2 = (SoftReference) n97Var.X;
                                Map mapSynchronizedMap = softReference2 != null ? (Map) softReference2.get() : null;
                                if (mapSynchronizedMap == null) {
                                    mapSynchronizedMap = Collections.synchronizedMap(new HashMap(16));
                                    n97Var.X = new SoftReference(mapSynchronizedMap);
                                }
                                mapSynchronizedMap.put(str2, strA);
                            }
                        }
                        strB = strA;
                        if (strB != null) {
                            z = true;
                        } else {
                            int[] iArr = new int[4];
                            if (o79.e(str, iArr)) {
                                strB = o79.b(iArr[1], iArr[2], iArr[3], iArr[0] < 0);
                            } else {
                                strB = null;
                            }
                            z = false;
                        }
                    }
                }
                if (z && jl3.k0.contains(strB)) {
                    timeZone = DesugarTimeZone.getTimeZone(strB);
                }
            }
            jl3 jl3Var = timeZone != null ? new jl3(timeZone, str) : null;
            if (jl3Var != null) {
                jl3Var.j0 = true;
                return jl3Var;
            }
            g40VarB = b(str, false);
        } else {
            g40VarB = b(str, true);
        }
        if (g40VarB != null) {
            return g40VarB;
        }
        Y.fine("\"" + str + "\" is a bogus id so timezone is falling back to Etc/Unknown(GMT).");
        return Z;
    }

    public qa8 a() {
        try {
            return (qa8) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new c33(e);
        }
    }

    public Object clone() {
        return isFrozen() ? this : a();
    }

    public int d(int i, int i2, int i3, int i4, int i5) {
        return 0;
    }

    public void e(long j, boolean z, int[] iArr) {
        int iF = f();
        iArr[0] = iF;
        if (!z) {
            j += (long) iF;
        }
        int[] iArr2 = new int[6];
        int i = 0;
        while (true) {
            km4.o0(j, iArr2);
            qa8 qa8Var = this;
            int iD = qa8Var.d(iArr2[0], iArr2[1], iArr2[2], iArr2[3], iArr2[5]) - iArr[0];
            iArr[1] = iD;
            if (i != 0 || !z || iD == 0) {
                return;
            }
            j -= (long) iD;
            i++;
            this = qa8Var;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.X.equals(((qa8) obj).X);
    }

    public int f() {
        return 0;
    }

    public int hashCode() {
        return this.X.hashCode();
    }

    public abstract boolean isFrozen();
}
