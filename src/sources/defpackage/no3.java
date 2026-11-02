package defpackage;

import java.io.Serializable;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class no3 implements Serializable {
    public static final no3 k0 = new no3();
    public final String X;
    public final mo3 Y;
    public final Locale Z;
    public final String f0;
    public final Boolean g0;
    public final lo3 h0;
    public final int i0;
    public transient TimeZone j0;

    public no3(String str, mo3 mo3Var, String str2, String str3, lo3 lo3Var, Boolean bool, int i) {
        Locale locale;
        Locale locale2;
        if (str2 == null || str2.length() == 0 || "##default".equals(str2)) {
            locale = null;
        } else {
            int length = str2.length();
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    locale2 = new Locale(str2);
                    break;
                }
                char cCharAt = str2.charAt(i2);
                if (cCharAt == '_' || cCharAt == '-') {
                    String strSubstring = str2.substring(0, i2);
                    String strSubstring2 = str2.substring(i2 + 1);
                    int length2 = strSubstring2.length();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length2) {
                            locale2 = new Locale(strSubstring, strSubstring2);
                            break;
                        }
                        char cCharAt2 = strSubstring2.charAt(i3);
                        if (cCharAt2 == '_' || cCharAt2 == '-') {
                            locale2 = new Locale(strSubstring, strSubstring2.substring(0, i3), strSubstring2.substring(i3 + 1));
                            break;
                        }
                        i3++;
                    }
                } else {
                    i2++;
                }
            }
            locale = locale2;
        }
        this(str, mo3Var, locale, (str3 == null || str3.length() == 0 || "##default".equals(str3)) ? null : str3, null, lo3Var, bool, i);
    }

    public final Boolean a(ko3 ko3Var) {
        lo3 lo3Var = this.h0;
        lo3Var.getClass();
        int iOrdinal = 1 << ko3Var.ordinal();
        if ((lo3Var.Y & iOrdinal) != 0) {
            return Boolean.FALSE;
        }
        if ((lo3Var.X & iOrdinal) != 0) {
            return Boolean.TRUE;
        }
        return null;
    }

    public final boolean b() {
        if (this.j0 != null) {
            return true;
        }
        String str = this.f0;
        return (str == null || str.isEmpty()) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0054 A[PHI: r1
  0x0054: PHI (r1v2 lo3) = (r1v1 lo3), (r1v3 lo3), (r1v1 lo3), (r1v1 lo3) binds: [B:26:0x0037, B:40:0x0056, B:38:0x0052, B:30:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    public final no3 c(no3 no3Var) {
        no3 no3Var2;
        if (no3Var == null || no3Var == (no3Var2 = k0) || no3Var == this) {
            return this;
        }
        if (this == no3Var2) {
            return no3Var;
        }
        String str = no3Var.X;
        if (str == null || str.isEmpty()) {
            str = this.X;
        }
        String str2 = str;
        mo3 mo3Var = no3Var.Y;
        if (mo3Var == mo3.k0) {
            mo3Var = this.Y;
        }
        mo3 mo3Var2 = mo3Var;
        Locale locale = no3Var.Z;
        if (locale == null) {
            locale = this.Z;
        }
        Locale locale2 = locale;
        lo3 lo3Var = no3Var.h0;
        lo3 lo3Var2 = this.h0;
        if (lo3Var2 != null) {
            int i = lo3Var2.Y;
            if (lo3Var == null) {
                lo3Var = lo3Var2;
            } else {
                int i2 = lo3Var.Y;
                int i3 = lo3Var.X;
                if (i2 == 0 && i3 == 0) {
                    lo3Var = lo3Var2;
                } else {
                    int i4 = lo3Var2.X;
                    if (i4 != 0 || i != 0) {
                        int i5 = ((~i2) & i4) | i3;
                        int i6 = i2 | ((~i3) & i);
                        if (i5 != i4 || i6 != i) {
                            lo3Var2 = new lo3(i5, i6);
                        }
                        lo3Var = lo3Var2;
                    }
                }
            }
        }
        lo3 lo3Var3 = lo3Var;
        Boolean bool = no3Var.g0;
        if (bool == null) {
            bool = this.g0;
        }
        Boolean bool2 = bool;
        int i7 = no3Var.i0;
        if (i7 == -1) {
            i7 = this.i0;
        }
        int i8 = i7;
        String str3 = no3Var.f0;
        if (str3 == null || str3.isEmpty()) {
            str3 = this.f0;
        } else {
            this = no3Var;
        }
        return new no3(str2, mo3Var2, locale2, str3, this.j0, lo3Var3, bool2, i8);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != no3.class) {
            return false;
        }
        no3 no3Var = (no3) obj;
        return this.Y == no3Var.Y && this.h0.equals(no3Var.h0) && Objects.equals(this.g0, no3Var.g0) && Objects.equals(this.f0, no3Var.f0) && Objects.equals(this.X, no3Var.X) && Objects.equals(this.Z, no3Var.Z) && this.i0 == no3Var.i0;
    }

    public final int hashCode() {
        String str = this.f0;
        int iHashCode = str == null ? 1 : str.hashCode();
        String str2 = this.X;
        if (str2 != null) {
            iHashCode ^= str2.hashCode();
        }
        int iHashCode2 = this.Y.hashCode() + iHashCode;
        Boolean bool = this.g0;
        if (bool != null) {
            iHashCode2 ^= bool.hashCode();
        }
        Locale locale = this.Z;
        if (locale != null) {
            iHashCode2 += locale.hashCode();
        }
        return (this.h0.hashCode() ^ iHashCode2) + this.i0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsonFormat.Value(pattern=");
        sb.append(this.X);
        sb.append(",shape=");
        sb.append(this.Y);
        sb.append(",lenient=");
        sb.append(this.g0);
        sb.append(",locale=");
        sb.append(this.Z);
        sb.append(",timezone=");
        sb.append(this.f0);
        sb.append(",features=");
        sb.append(this.h0);
        sb.append(",radix=");
        return oi0.n(sb, this.i0, ")");
    }

    public no3() {
        this(_UrlKt.FRAGMENT_ENCODE_SET, mo3.k0, _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, lo3.Z, null, -1);
    }

    public no3(String str, mo3 mo3Var, Locale locale, String str2, TimeZone timeZone, lo3 lo3Var, Boolean bool, int i) {
        this.X = str == null ? _UrlKt.FRAGMENT_ENCODE_SET : str;
        this.Y = mo3Var == null ? mo3.k0 : mo3Var;
        this.Z = locale;
        this.j0 = timeZone;
        this.f0 = str2;
        this.h0 = lo3Var == null ? lo3.Z : lo3Var;
        this.g0 = bool;
        this.i0 = i;
    }
}
