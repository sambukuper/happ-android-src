package defpackage;

import android.util.Size;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ze5 {
    public final Size a;
    public final int b;
    public final String c;
    public final bf5 d;
    public final af5 e;
    public final cf5 f;
    public final df5 g;
    public final List h;

    public ze5(Size size, int i, String str, bf5 bf5Var, af5 af5Var, cf5 cf5Var, df5 df5Var, List list) {
        size.getClass();
        this.a = size;
        this.b = i;
        this.c = str;
        this.d = bf5Var;
        this.e = af5Var;
        this.f = cf5Var;
        this.g = df5Var;
        this.h = list;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Config(size=");
        sb.append(this.a);
        sb.append(", format=");
        sb.append((Object) yk7.b(this.b));
        sb.append(", camera=");
        String str = this.c;
        sb.append((Object) (str == null ? "null" : vi0.b(str)));
        sb.append(", mirrorMode=");
        sb.append(this.d);
        sb.append(", timestampBase=null, dynamicRangeProfile=");
        sb.append(this.e);
        sb.append(", streamUseCase=");
        sb.append(this.f);
        sb.append(", streamUseHint=");
        sb.append(this.g);
        sb.append(", sensorPixelModes=");
        sb.append(this.h);
        sb.append(')');
        return sb.toString();
    }
}
