package defpackage;

import android.os.Looper;
import androidx.lifecycle.DefaultLifecycleObserver;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class g94 {
    public final boolean b;
    public final rb8 d;
    public int e;
    public boolean f;
    public boolean g;
    public o84 i;
    public final oh7 j;
    public wl6 a = new wl6((byte) 11);
    public lr c = new lr((byte) 26);
    public final ArrayList h = new ArrayList();

    public g94(d94 d94Var, boolean z) {
        this.b = z;
        this.d = new rb8(d94Var);
        o84 o84Var = o84.Y;
        this.i = o84Var;
        this.j = ph7.a(o84Var);
    }

    public final void a(c94 c94Var) {
        a94 jf1Var;
        f94 f94Var;
        d94 d94Var;
        n84 n84Var;
        c94Var.getClass();
        c("addObserver");
        o84 o84Var = this.i;
        o84 o84Var2 = o84.X;
        if (o84Var != o84Var2) {
            o84Var2 = o84.Y;
        }
        f94 f94Var2 = new f94();
        f94Var2.a = o84Var2;
        HashMap map = o94.a;
        boolean z = c94Var instanceof a94;
        boolean z2 = c94Var instanceof DefaultLifecycleObserver;
        byte b = 2;
        Object obj = null;
        byte b2 = 0;
        if (z && z2) {
            jf1Var = new jf1((DefaultLifecycleObserver) c94Var, (a94) c94Var, b2);
        } else if (z2) {
            jf1Var = new jf1((DefaultLifecycleObserver) c94Var, obj, b2);
        } else if (z) {
            jf1Var = (a94) c94Var;
        } else {
            Class<?> cls = c94Var.getClass();
            if (o94.b(cls) == 2) {
                Object obj2 = o94.b.get(cls);
                obj2.getClass();
                List list = (List) obj2;
                if (list.size() == 1) {
                    o94.a((Constructor) list.get(0), c94Var);
                    throw null;
                }
                int size = list.size();
                sp2[] sp2VarArr = new sp2[size];
                if (size > 0) {
                    o94.a((Constructor) list.get(0), c94Var);
                    throw null;
                }
                jf1Var = new r86(sp2VarArr, b);
            } else {
                jf1Var = new jf1(c94Var);
            }
        }
        f94Var2.b = jf1Var;
        lr lrVar = this.c;
        lrVar.getClass();
        s05 s05Var = (s05) lrVar.Y;
        d82 d82Var = (d82) s05Var.g(c94Var);
        if (d82Var != null) {
            f94Var = d82Var.Y;
        } else {
            d82 d82Var2 = new d82(c94Var, f94Var2);
            s05Var.l(c94Var, d82Var2);
            d82 d82Var3 = (d82) lrVar.f0;
            if (d82Var3 == null) {
                lrVar.Z = d82Var2;
                lrVar.f0 = d82Var2;
            } else {
                d82Var3.Z = d82Var2;
                d82Var2.f0 = d82Var3;
                lrVar.f0 = d82Var2;
            }
            f94Var = null;
        }
        if (f94Var == null && (d94Var = (d94) ((WeakReference) this.d.Y).get()) != null) {
            b2 = (this.e != 0 || this.f) ? (byte) 1 : (byte) 0;
            o84 o84VarB = b(c94Var);
            this.e++;
            while (f94Var2.a.compareTo(o84VarB) < 0) {
                lr lrVar2 = this.c;
                lrVar2.getClass();
                if (!((s05) lrVar2.Y).c(c94Var)) {
                    break;
                }
                o84 o84Var3 = f94Var2.a;
                ArrayList arrayList = this.h;
                arrayList.add(o84Var3);
                l84 l84Var = n84.Companion;
                o84 o84Var4 = f94Var2.a;
                l84Var.getClass();
                o84Var4.getClass();
                int iOrdinal = o84Var4.ordinal();
                if (iOrdinal == 1) {
                    n84Var = n84.ON_CREATE;
                } else if (iOrdinal != 2) {
                    n84Var = iOrdinal != 3 ? null : n84.ON_RESUME;
                } else {
                    n84Var = n84.ON_START;
                }
                if (n84Var == null) {
                    bt.p(f94Var2.a, "no event up from ");
                    return;
                } else {
                    f94Var2.a(d94Var, n84Var);
                    bw0.k0(arrayList);
                    o84VarB = b(c94Var);
                }
            }
            if (b2 == 0) {
                g();
            }
            this.e--;
        }
    }

    public final o84 b(c94 c94Var) {
        lr lrVar = this.c;
        lrVar.getClass();
        c94Var.getClass();
        d82 d82Var = (d82) ((s05) lrVar.Y).g(c94Var);
        d82 d82Var2 = d82Var != null ? d82Var.f0 : null;
        o84 o84Var = d82Var2 != null ? d82Var2.Y.a : null;
        ArrayList arrayList = this.h;
        o84 o84Var2 = arrayList.isEmpty() ? null : (o84) oi0.h(1, arrayList);
        o84 o84Var3 = this.i;
        if (o84Var == null || o84Var.compareTo(o84Var3) >= 0) {
            o84Var = o84Var3;
        }
        return (o84Var2 == null || o84Var2.compareTo(o84Var) >= 0) ? o84Var : o84Var2;
    }

    public final void c(String str) {
        if (this.b) {
            ys.y().getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            kp5.h(pc6.p("Method ", str, " must be called on the main thread"));
        }
    }

    public final void d(n84 n84Var) {
        n84Var.getClass();
        c("handleLifecycleEvent");
        e(n84Var.a());
    }

    public final void e(o84 o84Var) {
        if (this.i == o84Var) {
            return;
        }
        d94 d94Var = (d94) ((WeakReference) this.d.Y).get();
        o84 o84Var2 = this.i;
        o84 o84Var3 = o84.Y;
        o84 o84Var4 = o84.X;
        if (o84Var2 == o84Var3 && o84Var == o84Var4) {
            throw new IllegalStateException(("State must be at least '" + o84.Z + "' to be moved to '" + o84Var + "' in component " + d94Var).toString());
        }
        if (o84Var2 == o84Var4 && o84Var2 != o84Var) {
            throw new IllegalStateException(("State is '" + o84Var4 + "' and cannot be moved to `" + o84Var + "` in component " + d94Var).toString());
        }
        this.i = o84Var;
        if (this.f || this.e != 0) {
            this.g = true;
            return;
        }
        this.f = true;
        g();
        this.f = false;
        if (this.i == o84Var4) {
            this.c = new lr((byte) 26);
        }
    }

    public final void f(c94 c94Var) {
        c94Var.getClass();
        c("removeObserver");
        lr lrVar = this.c;
        lrVar.getClass();
        d82 d82Var = (d82) ((s05) lrVar.Y).j(c94Var);
        if (d82Var == null) {
            return;
        }
        d82 d82Var2 = d82Var.f0;
        d82 d82Var3 = d82Var.Z;
        if (d82Var2 == null) {
            lrVar.Z = d82Var3;
        } else {
            d82Var2.Z = d82Var3;
        }
        d82 d82Var4 = d82Var.Z;
        if (d82Var4 == null) {
            lrVar.f0 = d82Var2;
        } else {
            d82Var4.f0 = d82Var2;
        }
        d82Var.g0 = true;
    }

    public final void g() {
        Object obj = ((WeakReference) this.d.Y).get();
        if (obj == null) {
            bt.i("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        final d94 d94Var = (d94) obj;
        while (true) {
            lr lrVar = this.c;
            final byte b = 0;
            if (((s05) lrVar.Y).e == 0) {
                break;
            }
            d82 d82Var = (d82) lrVar.Z;
            if (d82Var == null) {
                em7.g("Collection is empty.");
                return;
            }
            o84 o84Var = d82Var.Y.a;
            d82 d82Var2 = (d82) lrVar.f0;
            if (d82Var2 == null) {
                em7.g("Collection is empty.");
                return;
            }
            o84 o84Var2 = d82Var2.Y.a;
            if (o84Var == o84Var2 && this.i == o84Var2) {
                break;
            }
            this.g = false;
            o84 o84Var3 = this.i;
            if (d82Var == null) {
                em7.g("Collection is empty.");
                return;
            }
            if (o84Var3.compareTo(o84Var) < 0) {
                lr lrVar2 = this.c;
                gn2 gn2Var = new gn2(this) { // from class: e94
                    public final /* synthetic */ g94 Y;

                    {
                        this.Y = this;
                    }

                    @Override // defpackage.gn2
                    public final Object B(Object obj2) {
                        n84 n84Var;
                        n84 n84Var2;
                        byte b2 = b;
                        dn8 dn8Var = dn8.a;
                        d94 d94Var2 = d94Var;
                        g94 g94Var = this.Y;
                        Map.Entry entry = (Map.Entry) obj2;
                        switch (b2) {
                            case 0:
                                entry.getClass();
                                c94 c94Var = (c94) entry.getKey();
                                f94 f94Var = (f94) entry.getValue();
                                while (true) {
                                    o84 o84Var4 = f94Var.a;
                                    o84 o84Var5 = g94Var.i;
                                    ArrayList arrayList = g94Var.h;
                                    if (o84Var4.compareTo(o84Var5) <= 0 || g94Var.g) {
                                        return dn8Var;
                                    }
                                    lr lrVar3 = g94Var.c;
                                    lrVar3.getClass();
                                    c94Var.getClass();
                                    if (!((s05) lrVar3.Y).c(c94Var)) {
                                        return dn8Var;
                                    }
                                    l84 l84Var = n84.Companion;
                                    o84 o84Var6 = f94Var.a;
                                    l84Var.getClass();
                                    o84Var6.getClass();
                                    int iOrdinal = o84Var6.ordinal();
                                    if (iOrdinal == 2) {
                                        n84Var = n84.ON_DESTROY;
                                    } else if (iOrdinal != 3) {
                                        n84Var = iOrdinal != 4 ? null : n84.ON_PAUSE;
                                    } else {
                                        n84Var = n84.ON_STOP;
                                    }
                                    if (n84Var == null) {
                                        xw3.s(f94Var.a, "no event down from ");
                                        return null;
                                    }
                                    arrayList.add(n84Var.a());
                                    f94Var.a(d94Var2, n84Var);
                                    bw0.k0(arrayList);
                                }
                                break;
                            default:
                                entry.getClass();
                                c94 c94Var2 = (c94) entry.getKey();
                                f94 f94Var2 = (f94) entry.getValue();
                                while (true) {
                                    o84 o84Var7 = f94Var2.a;
                                    o84 o84Var8 = g94Var.i;
                                    ArrayList arrayList2 = g94Var.h;
                                    if (o84Var7.compareTo(o84Var8) >= 0 || g94Var.g) {
                                        return dn8Var;
                                    }
                                    lr lrVar4 = g94Var.c;
                                    lrVar4.getClass();
                                    c94Var2.getClass();
                                    if (!((s05) lrVar4.Y).c(c94Var2)) {
                                        return dn8Var;
                                    }
                                    arrayList2.add(f94Var2.a);
                                    l84 l84Var2 = n84.Companion;
                                    o84 o84Var9 = f94Var2.a;
                                    l84Var2.getClass();
                                    o84Var9.getClass();
                                    int iOrdinal2 = o84Var9.ordinal();
                                    if (iOrdinal2 == 1) {
                                        n84Var2 = n84.ON_CREATE;
                                    } else if (iOrdinal2 != 2) {
                                        n84Var2 = iOrdinal2 != 3 ? null : n84.ON_RESUME;
                                    } else {
                                        n84Var2 = n84.ON_START;
                                    }
                                    if (n84Var2 == null) {
                                        xw3.s(f94Var2.a, "no event up from ");
                                        return null;
                                    }
                                    f94Var2.a(d94Var2, n84Var2);
                                    bw0.k0(arrayList2);
                                }
                                break;
                        }
                    }
                };
                lrVar2.getClass();
                for (d82 d82Var3 = (d82) lrVar2.f0; d82Var3 != null; d82Var3 = d82Var3.f0) {
                    if (!d82Var3.g0) {
                        gn2Var.B(d82Var3);
                    }
                }
            }
            d82 d82Var4 = (d82) this.c.f0;
            if (!this.g && d82Var4 != null && this.i.compareTo(d82Var4.Y.a) > 0) {
                lr lrVar3 = this.c;
                final byte b2 = 1;
                gn2 gn2Var2 = new gn2(this) { // from class: e94
                    public final /* synthetic */ g94 Y;

                    {
                        this.Y = this;
                    }

                    @Override // defpackage.gn2
                    public final Object B(Object obj2) {
                        n84 n84Var;
                        n84 n84Var2;
                        byte b3 = b2;
                        dn8 dn8Var = dn8.a;
                        d94 d94Var2 = d94Var;
                        g94 g94Var = this.Y;
                        Map.Entry entry = (Map.Entry) obj2;
                        switch (b3) {
                            case 0:
                                entry.getClass();
                                c94 c94Var = (c94) entry.getKey();
                                f94 f94Var = (f94) entry.getValue();
                                while (true) {
                                    o84 o84Var4 = f94Var.a;
                                    o84 o84Var5 = g94Var.i;
                                    ArrayList arrayList = g94Var.h;
                                    if (o84Var4.compareTo(o84Var5) <= 0 || g94Var.g) {
                                        return dn8Var;
                                    }
                                    lr lrVar4 = g94Var.c;
                                    lrVar4.getClass();
                                    c94Var.getClass();
                                    if (!((s05) lrVar4.Y).c(c94Var)) {
                                        return dn8Var;
                                    }
                                    l84 l84Var = n84.Companion;
                                    o84 o84Var6 = f94Var.a;
                                    l84Var.getClass();
                                    o84Var6.getClass();
                                    int iOrdinal = o84Var6.ordinal();
                                    if (iOrdinal == 2) {
                                        n84Var = n84.ON_DESTROY;
                                    } else if (iOrdinal != 3) {
                                        n84Var = iOrdinal != 4 ? null : n84.ON_PAUSE;
                                    } else {
                                        n84Var = n84.ON_STOP;
                                    }
                                    if (n84Var == null) {
                                        xw3.s(f94Var.a, "no event down from ");
                                        return null;
                                    }
                                    arrayList.add(n84Var.a());
                                    f94Var.a(d94Var2, n84Var);
                                    bw0.k0(arrayList);
                                }
                                break;
                            default:
                                entry.getClass();
                                c94 c94Var2 = (c94) entry.getKey();
                                f94 f94Var2 = (f94) entry.getValue();
                                while (true) {
                                    o84 o84Var7 = f94Var2.a;
                                    o84 o84Var8 = g94Var.i;
                                    ArrayList arrayList2 = g94Var.h;
                                    if (o84Var7.compareTo(o84Var8) >= 0 || g94Var.g) {
                                        return dn8Var;
                                    }
                                    lr lrVar5 = g94Var.c;
                                    lrVar5.getClass();
                                    c94Var2.getClass();
                                    if (!((s05) lrVar5.Y).c(c94Var2)) {
                                        return dn8Var;
                                    }
                                    arrayList2.add(f94Var2.a);
                                    l84 l84Var2 = n84.Companion;
                                    o84 o84Var9 = f94Var2.a;
                                    l84Var2.getClass();
                                    o84Var9.getClass();
                                    int iOrdinal2 = o84Var9.ordinal();
                                    if (iOrdinal2 == 1) {
                                        n84Var2 = n84.ON_CREATE;
                                    } else if (iOrdinal2 != 2) {
                                        n84Var2 = iOrdinal2 != 3 ? null : n84.ON_RESUME;
                                    } else {
                                        n84Var2 = n84.ON_START;
                                    }
                                    if (n84Var2 == null) {
                                        xw3.s(f94Var2.a, "no event up from ");
                                        return null;
                                    }
                                    f94Var2.a(d94Var2, n84Var2);
                                    bw0.k0(arrayList2);
                                }
                                break;
                        }
                    }
                };
                lrVar3.getClass();
                for (d82 d82Var5 = (d82) lrVar3.Z; d82Var5 != null; d82Var5 = d82Var5.Z) {
                    if (!d82Var5.g0) {
                        gn2Var2.B(d82Var5);
                    }
                }
            }
        }
        this.g = false;
        this.j.m(this.i);
    }
}
