package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ms2 {
    public final Context a;
    public final String b;
    public final yr2 c;
    public final dq d;
    public final bn e;
    public final qn f;
    public final int g;
    public final ra h;
    public final rs2 i;

    public ms2(Context context, dq dqVar, bn bnVar, ls2 ls2Var) {
        w45.t(context, "Null context is not permitted.");
        w45.t(dqVar, "Api must not be null.");
        w45.t(ls2Var, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        w45.t(applicationContext, "The provided context did not have an application context.");
        this.a = applicationContext;
        int i = Build.VERSION.SDK_INT;
        String attributionTag = (i < 30 || i < 30) ? null : context.getAttributionTag();
        this.b = attributionTag;
        this.c = i >= 31 ? new yr2((Object) context.getAttributionSource(), (byte) 8) : null;
        this.d = dqVar;
        this.e = bnVar;
        this.f = new qn(dqVar, bnVar, attributionTag);
        rs2 rs2VarC = rs2.c(applicationContext);
        this.i = rs2VarC;
        this.g = rs2VarC.h.getAndIncrement();
        this.h = ls2Var.a;
        f99 f99Var = rs2VarC.m;
        f99Var.sendMessage(f99Var.obtainMessage(7, this));
    }

    public final lr a() {
        lr lrVar = new lr((byte) 19, false);
        Set set = Collections.EMPTY_SET;
        bu buVar = (bu) lrVar.Y;
        if (buVar == null) {
            buVar = new bu(0);
            lrVar.Y = buVar;
        }
        buVar.addAll(set);
        Context context = this.a;
        lrVar.f0 = context.getClass().getName();
        lrVar.Z = context.getPackageName();
        return lrVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0059  */
    public final fb9 b(int i, y18 y18Var) {
        l89 l89Var;
        z18 z18Var = new z18();
        fb9 fb9Var = z18Var.a;
        ra raVar = this.h;
        rs2 rs2Var = this.i;
        f99 f99Var = rs2Var.m;
        char c = y18Var.c;
        if (c != 0) {
            qn qnVar = this.f;
            if (rs2Var.d()) {
                xl6 xl6Var = (xl6) wl6.P().Y;
                boolean z = true;
                if (xl6Var != null) {
                    if (xl6Var.Y) {
                        boolean z2 = xl6Var.Z;
                        i89 i89Var = (i89) rs2Var.j.get(qnVar);
                        if (i89Var != null) {
                            is2 is2Var = i89Var.h;
                            if (is2Var instanceof u10) {
                                is2 is2Var2 = is2Var;
                                if (is2Var2.v == null || is2Var2.m()) {
                                    z = z2;
                                } else {
                                    c21 c21VarA = l89.a(i89Var, is2Var2, c);
                                    if (c21VarA != null) {
                                        i89Var.r++;
                                        z = c21VarA.Z;
                                    }
                                }
                            }
                        } else {
                            z = z2;
                        }
                    }
                    l89Var = null;
                }
                l89Var = new l89(rs2Var, c, qnVar, z ? System.currentTimeMillis() : 0L, z ? SystemClock.elapsedRealtime() : 0L);
            } else {
                l89Var = null;
            }
            if (l89Var != null) {
                Objects.requireNonNull(f99Var);
                fb9Var.b(new hv(f99Var), l89Var);
            }
        }
        f99Var.sendMessage(f99Var.obtainMessage(4, new p89(new x89(i, y18Var, z18Var, raVar), rs2Var.i.get(), this)));
        return fb9Var;
    }
}
