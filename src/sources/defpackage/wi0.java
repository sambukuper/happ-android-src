package defpackage;

import java.util.ArrayList;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wi0 {
    public final ArrayList a;
    public final ny b;

    public wi0(ArrayList arrayList, ny nyVar) {
        this.a = arrayList;
        this.b = nyVar;
        mb6.o(!arrayList.isEmpty(), "Camera ID set cannot be empty.");
    }

    public final String a() {
        ArrayList arrayList = this.a;
        mb6.s("getInternalId() is only available for single-camera identifiers.", arrayList.size() == 1);
        return (String) wv0.r0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wi0)) {
            return false;
        }
        wi0 wi0Var = (wi0) obj;
        return this.a.equals(wi0Var.a) && dh3.f(this.b, wi0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ny nyVar = this.b;
        return iHashCode + (nyVar != null ? nyVar.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("CameraIdentifier{cameraIds=");
        sb.append(wv0.y0(this.a, ",", null, null, null, 62));
        ny nyVar = this.b;
        if (nyVar != null) {
            str = ", compatId=" + nyVar;
        } else {
            str = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        return oi0.o(sb, str, '}');
    }
}
