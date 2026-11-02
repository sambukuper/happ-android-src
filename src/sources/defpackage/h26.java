package defpackage;

import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class h26 {
    public static final g26 b = new g26(true, null, null);
    public static final h26 c = new h26();
    public final z05 a;

    public h26() {
        z05 z05Var = new z05();
        z05Var.Z = new Object();
        z05Var.X = 0;
        z05Var.Y = false;
        z05Var.g0 = new HashMap();
        z05Var.h0 = new CopyOnWriteArraySet();
        z05Var.f0 = new AtomicReference(b);
        this.a = z05Var;
    }
}
