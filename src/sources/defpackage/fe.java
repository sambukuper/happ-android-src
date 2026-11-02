package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fe implements ComponentCallbacks2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ fe(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }

    private final void c(int i) {
        if (i >= 40) {
            he heVar = (he) this.Y;
            dq dqVar = heVar.e;
            if (dqVar != null) {
                synchronized (dqVar) {
                    try {
                        s05 s05Var = (s05) dqVar.Y;
                        if (s05Var != null) {
                            s05Var.a();
                        }
                        dqVar.Z = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            heVar.e = null;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        switch (this.X) {
            case 0:
                return;
            default:
                wg wgVar = (wg) this.Y;
                synchronized (wgVar) {
                    if (((v76) ((WeakReference) wgVar.b).get()) == null) {
                        wgVar.z();
                        break;
                    }
                }
                return;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        switch (this.X) {
            case 0:
                break;
            default:
                onTrimMemory(80);
                break;
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        a86 a86VarC;
        long jC;
        switch (this.X) {
            case 0:
                c(i);
                return;
            default:
                wg wgVar = (wg) this.Y;
                synchronized (wgVar) {
                    try {
                        v76 v76Var = (v76) ((WeakReference) wgVar.b).get();
                        if (v76Var != null) {
                            s76 s76Var = v76Var.a;
                            if (i >= 40) {
                                a86 a86VarC2 = v76Var.c();
                                if (a86VarC2 != null) {
                                    synchronized (a86VarC2.c) {
                                        ((e86) a86VarC2.a.Z).h(-1L);
                                        b8 b8Var = a86VarC2.b;
                                        b8Var.b = 0;
                                        ((LinkedHashMap) b8Var.c).clear();
                                    }
                                }
                            } else if (i >= 20) {
                                ((vg) wgVar.c).a(s76Var.a);
                            } else if (i >= 10 && (a86VarC = v76Var.c()) != null) {
                                synchronized (a86VarC.c) {
                                    jC = ((e86) a86VarC.a.Z).c();
                                }
                                long j = jC / 2;
                                synchronized (a86VarC.c) {
                                    ((e86) a86VarC.a.Z).h(j);
                                }
                            }
                        } else {
                            wgVar.z();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    private final void b() {
    }

    private final void a(Configuration configuration) {
    }
}
