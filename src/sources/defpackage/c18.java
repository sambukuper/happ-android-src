package defpackage;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c18 {
    public static long a(boolean z, int i, z00 z00Var, long j, long j2, int i2, boolean z2, long j3, long j4, long j5, long j6) {
        z00Var.getClass();
        if (j6 != Long.MAX_VALUE && z2) {
            if (i2 != 0) {
                long j7 = j2 + 900000;
                if (j6 < j7) {
                    return j7;
                }
            }
            return j6;
        }
        if (z) {
            long jScalb = z00Var == z00.Y ? j * ((long) i) : (long) Math.scalb(j, i - 1);
            if (jScalb > 18000000) {
                jScalb = 18000000;
            }
            return j2 + jScalb;
        }
        if (z2) {
            long j8 = i2 == 0 ? j2 + j3 : j2 + j5;
            return (j4 == j5 || i2 != 0) ? j8 : (j5 - j4) + j8;
        }
        if (j2 == -1) {
            return Long.MAX_VALUE;
        }
        return j2 + j3;
    }

    public static pa8 b() {
        boolean zIsFixedOffset;
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        zoneIdSystemDefault.getClass();
        if (zoneIdSystemDefault instanceof ZoneOffset) {
            ZoneOffset zoneOffset = (ZoneOffset) zoneIdSystemDefault;
            new vr8(zoneOffset);
            return new xc2(zoneOffset);
        }
        try {
            zIsFixedOffset = zoneIdSystemDefault.getRules().isFixedOffset();
        } catch (ArrayIndexOutOfBoundsException unused) {
            zIsFixedOffset = false;
        }
        if (!zIsFixedOffset) {
            return new pa8(zoneIdSystemDefault);
        }
        ZoneId zoneIdNormalized = zoneIdSystemDefault.normalized();
        zoneIdNormalized.getClass();
        new vr8((ZoneOffset) zoneIdNormalized);
        return new xc2(zoneIdSystemDefault);
    }

    public static final boolean c(String str, String str2) {
        str.getClass();
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                int i4 = i3 + 1;
                if (i3 != 0 || cCharAt == '(') {
                    if (cCharAt == '(') {
                        i2++;
                    } else if (cCharAt == ')' && (i2 = i2 - 1) == 0 && i3 != str.length() - 1) {
                    }
                    i++;
                    i3 = i4;
                }
            }
            if (i2 == 0) {
                return dh3.f(fm7.R0(str.substring(1, str.length() - 1)).toString(), str2);
            }
        }
        return false;
    }

    public static final String d(Collection collection) {
        return !collection.isEmpty() ? gm7.M(wv0.y0(collection, ",\n", "\n", "\n", null, 56)).concat("},") : " }";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final t14 e(t14 t14Var) {
        t14Var.getClass();
        if (t14Var instanceof ej8) {
            return ((ej8) t14Var).B();
        }
        return null;
    }

    public static final int f(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final mo8 g(mo8 mo8Var, t14 t14Var) {
        mo8Var.getClass();
        t14Var.getClass();
        return h(mo8Var, e(t14Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final mo8 h(mo8 mo8Var, t14 t14Var) {
        mo8Var.getClass();
        if (mo8Var instanceof ej8) {
            return h(((ej8) mo8Var).getOrigin(), t14Var);
        }
        if (t14Var == null || t14Var.equals(mo8Var)) {
            return mo8Var;
        }
        if (mo8Var instanceof aa7) {
            return new fa7((aa7) mo8Var, t14Var);
        }
        if (mo8Var instanceof ce2) {
            return new ge2((ce2) mo8Var, t14Var);
        }
        b61.c();
        return null;
    }
}
