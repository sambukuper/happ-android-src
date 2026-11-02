package defpackage;

import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class v97 extends rx4 implements Serializable {
    public static final AtomicInteger Z = new AtomicInteger(1);
    public y97 Y = null;
    public final String X = "SimpleModule-" + Z.getAndIncrement();

    public final void a(Class cls, kb8 kb8Var) {
        y97 y97Var = this.Y;
        if (y97Var == null) {
            y97Var = new y97();
            y97Var.X = null;
            y97Var.Y = null;
            y97Var.Z = false;
            this.Y = y97Var;
        }
        ss0 ss0Var = new ss0(cls);
        if (cls.isInterface()) {
            HashMap map = y97Var.Y;
            if (map == null) {
                map = new HashMap();
                y97Var.Y = map;
            }
            map.put(ss0Var, kb8Var);
            return;
        }
        HashMap map2 = y97Var.X;
        if (map2 == null) {
            map2 = new HashMap();
            y97Var.X = map2;
        }
        map2.put(ss0Var, kb8Var);
        if (cls == Enum.class) {
            y97Var.Z = true;
        }
    }
}
