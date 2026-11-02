package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gm2 implements iz2, yv6, fx8 {
    public final qk2 X;
    public final ex8 Y;
    public final jk2 Z;
    public bx8 f0;
    public g94 g0 = null;
    public xd6 h0 = null;

    public gm2(qk2 qk2Var, ex8 ex8Var, jk2 jk2Var) {
        this.X = qk2Var;
        this.Y = ex8Var;
        this.Z = jk2Var;
    }

    public final void a(n84 n84Var) {
        this.g0.d(n84Var);
    }

    @Override // defpackage.iz2
    public final bx8 c() {
        Application application;
        qk2 qk2Var = this.X;
        bx8 bx8VarC = qk2Var.c();
        if (bx8VarC != qk2Var.W0) {
            this.f0 = bx8VarC;
            return bx8VarC;
        }
        bx8 bx8Var = this.f0;
        if (bx8Var != null) {
            return bx8Var;
        }
        for (Context applicationContext = qk2Var.N().getApplicationContext(); applicationContext instanceof ContextWrapper; applicationContext = ((ContextWrapper) applicationContext).getBaseContext()) {
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                zv6 zv6Var = new zv6(application, qk2Var, qk2Var.h0);
                this.f0 = zv6Var;
                return zv6Var;
            }
        }
        application = null;
        zv6 zv6Var2 = new zv6(application, qk2Var, qk2Var.h0);
        this.f0 = zv6Var2;
        return zv6Var2;
    }

    @Override // defpackage.iz2
    public final sz4 d() {
        Application application;
        qk2 qk2Var = this.X;
        Context applicationContext = qk2Var.N().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        sz4 sz4Var = new sz4(0);
        LinkedHashMap linkedHashMap = sz4Var.a;
        if (application != null) {
            linkedHashMap.put(ax8.d, application);
        }
        linkedHashMap.put(sv6.a, qk2Var);
        linkedHashMap.put(sv6.b, this);
        Bundle bundle = qk2Var.h0;
        if (bundle != null) {
            linkedHashMap.put(sv6.c, bundle);
        }
        return sz4Var;
    }

    @Override // defpackage.fx8
    public final ex8 e() {
        g();
        return this.Y;
    }

    @Override // defpackage.yv6
    public final xd6 f() {
        g();
        return (xd6) this.h0.Z;
    }

    public final void g() {
        if (this.g0 == null) {
            this.g0 = new g94(this, true);
            xd6 xd6Var = new xd6(new xv6(this, new hr5(this, (byte) 14)), (byte) 5);
            this.h0 = xd6Var;
            xd6Var.w();
            this.Z.run();
        }
    }

    @Override // defpackage.d94
    /* JADX INFO: renamed from: h */
    public final g94 getH0() {
        g();
        return this.g0;
    }
}
