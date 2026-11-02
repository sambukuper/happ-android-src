package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fz {
    public final wg1 a;
    public final List b;
    public final int c;
    public final int d;
    public final px1 e;

    public fz(wg1 wg1Var, List list, int i, int i2, px1 px1Var) {
        this.a = wg1Var;
        this.b = list;
        this.c = i;
        this.d = i2;
        this.e = px1Var;
    }

    public static y5 a(wg1 wg1Var) {
        y5 y5Var = new y5((byte) 3, false);
        if (wg1Var == null) {
            b61.i("Null surface");
            return null;
        }
        y5Var.Y = wg1Var;
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            b61.i("Null sharedSurfaces");
            return null;
        }
        y5Var.Z = list;
        y5Var.g0 = -1;
        y5Var.f0 = -1;
        y5Var.h0 = px1.d;
        return y5Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fz)) {
            return false;
        }
        fz fzVar = (fz) obj;
        return this.a.equals(fzVar.a) && this.b.equals(fzVar.b) && this.c == fzVar.c && this.d == fzVar.d && this.e.equals(fzVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() ^ ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * (-721379959)) ^ this.c) * 1000003) ^ this.d) * 1000003);
    }

    public final String toString() {
        return "OutputConfig{surface=" + this.a + ", sharedSurfaces=" + this.b + ", physicalCameraId=null, mirrorMode=" + this.c + ", surfaceGroupId=" + this.d + ", dynamicRange=" + this.e + "}";
    }
}
