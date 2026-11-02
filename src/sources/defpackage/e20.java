package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class e20 {
    public static final c20 f;
    public static final e20 g;
    public String a;
    public String b;
    public String c;
    public String d;
    public volatile transient int e;

    static {
        c20 c20Var = new c20();
        c20Var.b = new ReferenceQueue();
        c20Var.a = new ConcurrentHashMap(16, 0.75f, 16);
        f = c20Var;
        g = a(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [e20, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public static e20 a(String str, String str2, String str3, String str4) {
        ConcurrentHashMap concurrentHashMap;
        ?? e20Var;
        Object obj;
        d20 d20Var = new d20(str, str2, str3, str4);
        c20 c20Var = f;
        while (true) {
            je4 je4Var = (je4) c20Var.b.poll();
            concurrentHashMap = c20Var.a;
            if (je4Var == null) {
                break;
            }
            concurrentHashMap.remove(je4Var.a);
        }
        je4 je4Var2 = (je4) concurrentHashMap.get(d20Var);
        if (je4Var2 != null) {
            obj = je4Var2.get();
        } else {
            e20Var = 0;
        }
        if (e20Var == 0) {
            d20 d20Var2 = new d20(gv3.Z(d20Var.X).intern(), gv3.a0(d20Var.Y).intern(), gv3.c0(d20Var.Z).intern(), gv3.c0(d20Var.f0).intern());
            je4 je4Var3 = (je4) c20Var.a.get(d20Var2);
            if (je4Var3 != null) {
                e20Var = obj;
                e20Var = e20Var;
                e20Var = je4Var3.get();
            }
            if (e20Var == 0) {
                String str5 = d20Var2.X;
                String str6 = d20Var2.Y;
                String str7 = d20Var2.Z;
                String str8 = d20Var2.f0;
                e20Var = new e20();
                e20Var.a = _UrlKt.FRAGMENT_ENCODE_SET;
                e20Var.b = _UrlKt.FRAGMENT_ENCODE_SET;
                e20Var.c = _UrlKt.FRAGMENT_ENCODE_SET;
                e20Var.d = _UrlKt.FRAGMENT_ENCODE_SET;
                e20Var.e = 0;
                if (str5 != null) {
                    e20Var.a = gv3.Z(str5).intern();
                }
                if (str6 != null) {
                    e20Var.b = gv3.a0(str6).intern();
                }
                if (str7 != null) {
                    e20Var.c = gv3.c0(str7).intern();
                }
                if (str8 != null) {
                    e20Var.d = gv3.c0(str8).intern();
                }
                je4 je4Var4 = new je4(e20Var, c20Var.b);
                je4Var4.a = d20Var2;
                c20Var.a.put(d20Var2, je4Var4);
                while (true) {
                    je4 je4Var5 = (je4) c20Var.b.poll();
                    if (je4Var5 == null) {
                        break;
                    }
                    c20Var.a.remove(je4Var5.a);
                }
            }
        }
        e20Var = obj;
        return (e20) e20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e20)) {
            return false;
        }
        e20 e20Var = (e20) obj;
        return hashCode() == e20Var.hashCode() && this.a.equals(e20Var.a) && this.b.equals(e20Var.b) && this.c.equals(e20Var.c) && this.d.equals(e20Var.d);
    }

    public final int hashCode() {
        int iCharAt = this.e;
        if (iCharAt == 0) {
            for (int i = 0; i < this.a.length(); i++) {
                iCharAt = (iCharAt * 31) + this.a.charAt(i);
            }
            for (int i2 = 0; i2 < this.b.length(); i2++) {
                iCharAt = (iCharAt * 31) + this.b.charAt(i2);
            }
            for (int i3 = 0; i3 < this.c.length(); i3++) {
                iCharAt = (iCharAt * 31) + this.c.charAt(i3);
            }
            for (int i4 = 0; i4 < this.d.length(); i4++) {
                iCharAt = (iCharAt * 31) + this.d.charAt(i4);
            }
            this.e = iCharAt;
        }
        return iCharAt;
    }

    public final String toString() {
        String str = this.d;
        String str2 = this.c;
        String str3 = this.b;
        StringBuilder sb = new StringBuilder();
        String str4 = this.a;
        if (str4.length() > 0) {
            sb.append("language=");
            sb.append(str4);
        }
        if (str3.length() > 0) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("script=");
            sb.append(str3);
        }
        if (str2.length() > 0) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("region=");
            sb.append(str2);
        }
        if (str.length() > 0) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("variant=");
            sb.append(str);
        }
        return sb.toString();
    }
}
