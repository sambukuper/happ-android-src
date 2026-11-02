package defpackage;

import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jy {
    public final String a;
    public final Integer b;
    public final s02 c;
    public final long d;
    public final long e;
    public final Map f;

    public jy(String str, Integer num, s02 s02Var, long j, long j2, HashMap map) {
        this.a = str;
        this.b = num;
        this.c = s02Var;
        this.d = j;
        this.e = j2;
        this.f = map;
    }

    public final String a(String str) {
        String str2 = (String) this.f.get(str);
        return str2 == null ? _UrlKt.FRAGMENT_ENCODE_SET : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final fu6 c() {
        fu6 fu6Var = new fu6((byte) 4);
        String str = this.a;
        if (str == null) {
            b61.i("Null transportName");
            return null;
        }
        fu6Var.Y = str;
        fu6Var.Z = this.b;
        s02 s02Var = this.c;
        if (s02Var == null) {
            b61.i("Null encodedPayload");
            return null;
        }
        fu6Var.f0 = s02Var;
        fu6Var.g0 = Long.valueOf(this.d);
        fu6Var.h0 = Long.valueOf(this.e);
        fu6Var.i0 = new HashMap(this.f);
        return fu6Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jy) {
            jy jyVar = (jy) obj;
            if (this.a.equals(jyVar.a)) {
                Integer num = jyVar.b;
                Integer num2 = this.b;
                if (num2 != null ? num2.equals(num) : num == null) {
                    if (this.c.equals(jyVar.c) && this.d == jyVar.d && this.e == jyVar.e && this.f.equals(jyVar.f)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        return this.f.hashCode() ^ ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + "}";
    }
}
