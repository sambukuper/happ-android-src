package defpackage;

import android.os.Bundle;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class xv6 {
    public final yv6 a;
    public final hr5 b;
    public boolean e;
    public Bundle f;
    public boolean g;
    public final we5 c = new we5(28);
    public final LinkedHashMap d = new LinkedHashMap();
    public boolean h = true;

    public xv6(yv6 yv6Var, hr5 hr5Var) {
        this.a = yv6Var;
        this.b = hr5Var;
    }

    public final void a() throws Throwable {
        yv6 yv6Var = this.a;
        if (yv6Var.getH0().i != o84.Y) {
            bt.i("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.e) {
                bt.i("SavedStateRegistry was already attached.");
                return;
            }
            this.b.invoke();
            yv6Var.getH0().a(new gy0(this, (byte) 2));
            this.e = true;
        }
    }
}
