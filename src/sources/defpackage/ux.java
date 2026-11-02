package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ux {
    public final int a;
    public final vx b;

    public ux(int i, vx vxVar) {
        if (i == 0) {
            b61.i("Null type");
            throw null;
        }
        this.a = i;
        this.b = vxVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ux)) {
            return false;
        }
        ux uxVar = (ux) obj;
        if (!p61.a(this.a, uxVar.a)) {
            return false;
        }
        vx vxVar = uxVar.b;
        vx vxVar2 = this.b;
        if (vxVar2 == null) {
            return vxVar == null;
        }
        return vxVar2.equals(vxVar);
    }

    public final int hashCode() {
        int iB = (p61.B(this.a) ^ 1000003) * 1000003;
        vx vxVar = this.b;
        return (vxVar == null ? 0 : vxVar.hashCode()) ^ iB;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("CameraState{type=");
        int i = this.a;
        if (i == 1) {
            str = "PENDING_OPEN";
        } else if (i == 2) {
            str = "OPENING";
        } else if (i == 3) {
            str = "OPEN";
        } else if (i != 4) {
            str = i != 5 ? "null" : "CLOSED";
        } else {
            str = "CLOSING";
        }
        sb.append(str);
        sb.append(", error=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
