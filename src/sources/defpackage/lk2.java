package defpackage;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lk2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qk2 b;

    public /* synthetic */ lk2(qk2 qk2Var, byte b) {
        this.a = b;
        this.b = qk2Var;
    }

    public final void a() {
        switch (this.a) {
            case 0:
                qk2 qk2Var = this.b;
                qk2Var.X0.w();
                sv6.b(qk2Var);
                Bundle bundle = qk2Var.Y;
                qk2Var.X0.x(bundle != null ? bundle.getBundle("registryState") : null);
                break;
            default:
                qk2 qk2Var2 = this.b;
                f51 f51Var = qk2Var2.T0;
                AppCompatActivity appCompatActivity = qk2Var2.w0.C0;
                f51Var.a = appCompatActivity;
                Iterator it = ((CopyOnWriteArraySet) f51Var.b).iterator();
                while (it.hasNext()) {
                    ((ia5) it.next()).a(appCompatActivity);
                }
                break;
        }
    }
}
