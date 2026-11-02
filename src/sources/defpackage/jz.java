package defpackage;

import android.graphics.Rect;
import android.util.Size;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jz {
    public final Size a;
    public final Rect b;
    public final cj0 c;
    public final int d;
    public final boolean e;

    public jz(Size size, Rect rect, cj0 cj0Var, int i, boolean z) {
        if (size == null) {
            b61.i("Null inputSize");
            throw null;
        }
        this.a = size;
        this.b = rect;
        this.c = cj0Var;
        this.d = i;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jz)) {
            return false;
        }
        jz jzVar = (jz) obj;
        if (!this.a.equals(jzVar.a) || !this.b.equals(jzVar.b)) {
            return false;
        }
        cj0 cj0Var = jzVar.c;
        cj0 cj0Var2 = this.c;
        if (cj0Var2 == null) {
            if (cj0Var != null) {
                return false;
            }
        } else if (!cj0Var2.equals(cj0Var)) {
            return false;
        }
        return this.d == jzVar.d && this.e == jzVar.e;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        cj0 cj0Var = this.c;
        return (this.e ? 1231 : 1237) ^ ((((iHashCode ^ (cj0Var == null ? 0 : cj0Var.hashCode())) * 1000003) ^ this.d) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraInputInfo{inputSize=");
        sb.append(this.a);
        sb.append(", inputCropRect=");
        sb.append(this.b);
        sb.append(", cameraInternal=");
        sb.append(this.c);
        sb.append(", rotationDegrees=");
        sb.append(this.d);
        sb.append(", mirroring=");
        return p61.o(sb, this.e, "}");
    }
}
