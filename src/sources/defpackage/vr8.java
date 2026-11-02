package defpackage;

import j$.time.ZoneOffset;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vr8 implements Serializable {
    public static final ur8 Companion = new ur8();
    public static final vr8 Y;
    public final ZoneOffset X;

    static {
        ZoneOffset zoneOffset = ZoneOffset.UTC;
        zoneOffset.getClass();
        Y = new vr8(zoneOffset);
    }

    public vr8(ZoneOffset zoneOffset) {
        zoneOffset.getClass();
        this.X = zoneOffset;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vr8) {
            return dh3.f(this.X, ((vr8) obj).X);
        }
        return false;
    }

    public final int hashCode() {
        return this.X.hashCode();
    }

    public final String toString() {
        String string = this.X.toString();
        string.getClass();
        return string;
    }
}
