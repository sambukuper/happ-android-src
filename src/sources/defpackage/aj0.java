package defpackage;

import android.graphics.Rect;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public interface aj0 extends xi0 {
    Set a();

    boolean d();

    String e();

    Rect h();

    default void i(z47 z47Var) {
        z47Var.getClass();
        bs7.a = z47Var;
    }

    Object o();

    void r(Executor executor, pt5 pt5Var);

    i26 s();

    List t(int i);

    Set v();

    Set w();

    boolean x();

    void y(xg0 xg0Var);

    default aj0 getImplementation() {
        return this;
    }
}
