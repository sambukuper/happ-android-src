package defpackage;

import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ym0 {
    public static final zx f;
    public final ArrayList a;
    public final qd5 b;
    public final int c;
    public final List d;
    public final d18 e;

    static {
        new zx("camerax.core.captureConfig.rotation", Integer.TYPE, null);
        new zx("camerax.core.captureConfig.jpegQuality", Integer.class, null);
        f = new zx("camerax.core.captureConfig.resolvedFrameRate", Range.class, null);
    }

    public ym0(ArrayList arrayList, qd5 qd5Var, int i, ArrayList arrayList2, d18 d18Var) {
        this.a = arrayList;
        this.b = qd5Var;
        this.c = i;
        this.d = Collections.unmodifiableList(arrayList2);
        this.e = d18Var;
    }

    public final Range a() {
        Range range = (Range) this.b.a(f, iz.h);
        Objects.requireNonNull(range);
        return range;
    }
}
