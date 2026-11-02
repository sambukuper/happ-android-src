package defpackage;

import j$.time.ZoneId;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class pa8 {
    public static final xc2 b;
    public final ZoneId a;

    static {
        vr8.Companion.getClass();
        vr8 vr8Var = vr8.Y;
        ZoneId zoneIdOf = ZoneId.of("UTC");
        zoneIdOf.getClass();
        vr8Var.getClass();
        b = new xc2(zoneIdOf);
    }

    public pa8(ZoneId zoneId) {
        this.a = zoneId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pa8) {
            return this.a.equals(((pa8) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String string = this.a.toString();
        string.getClass();
        return string;
    }
}
