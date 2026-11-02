package defpackage;

import android.util.Size;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xx {
    public v73 a;
    public v73 b;
    public final v73 c = null;
    public final Size d;
    public final int e;
    public final ArrayList f;
    public final boolean g;
    public final ay1 h;
    public final ay1 i;

    public xx(Size size, int i, ArrayList arrayList, boolean z, ay1 ay1Var, ay1 ay1Var2) {
        if (size == null) {
            b61.i("Null size");
            throw null;
        }
        this.d = size;
        this.e = i;
        this.f = arrayList;
        this.g = z;
        this.h = ay1Var;
        this.i = ay1Var2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xx) {
            xx xxVar = (xx) obj;
            return this.d.equals(xxVar.d) && this.e == xxVar.e && this.f.equals(xxVar.f) && this.g == xxVar.g && this.h == xxVar.h && this.i == xxVar.i;
        }
        return false;
    }

    public final int hashCode() {
        return this.i.hashCode() ^ ((((((((((this.d.hashCode() ^ 1000003) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * 1000003) ^ (this.g ? 1231 : 1237)) * 583896283) ^ this.h.hashCode()) * 1000003);
    }

    public final String toString() {
        return "In{size=" + this.d + ", inputFormat=" + this.e + ", outputFormats=" + this.f + ", virtualCamera=" + this.g + ", imageReaderProxyProvider=null, postviewSettings=null, requestEdge=" + this.h + ", errorEdge=" + this.i + "}";
    }
}
