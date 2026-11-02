package defpackage;

import android.graphics.Canvas;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class iz7 implements d53 {
    public final f63 a;
    public final xd6 b;
    public final int c;
    public final int d;

    public iz7(f63 f63Var, xd6 xd6Var, int i, int i2) {
        this.a = f63Var;
        this.b = xd6Var;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.d53
    public final int a() {
        return this.d;
    }

    @Override // defpackage.d53
    public final int b() {
        return this.c;
    }

    @Override // defpackage.d53
    public final boolean c() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.d53
    public final void d(Canvas canvas) {
        ArrayList arrayList;
        f63 f63Var = this.a;
        f63Var.getClass();
        cc0 cc0Var = (cc0) f63Var.Z;
        Object[] objArr = 0;
        xd6 xd6Var = this.b;
        if (xd6Var == null) {
            xd6Var = new xd6((byte) 0);
        }
        if (((r05) xd6Var.Z) == null) {
            xd6Var.Z = new r05(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        }
        fu6 fu6Var = new fu6((byte) (objArr == true ? 1 : 0));
        fu6Var.Y = canvas;
        fu6Var.Z = f63Var;
        zs6 zs6Var = (zs6) f63Var.Y;
        if (zs6Var == null) {
            return;
        }
        r05 r05Var = zs6Var.o;
        zs5 zs5Var = zs6Var.n;
        cc0 cc0Var2 = (cc0) xd6Var.Y;
        if (cc0Var2 != null) {
            ArrayList arrayList2 = cc0Var2.b;
            if ((arrayList2 != null ? arrayList2.size() : 0) > 0) {
                cc0Var.b((cc0) xd6Var.Y);
            }
        }
        fu6Var.f0 = new du6();
        fu6Var.g0 = new Stack();
        fu6Var.B0((du6) fu6Var.f0, ys6.a());
        du6 du6Var = (du6) fu6Var.f0;
        du6Var.f = null;
        du6Var.h = false;
        ((Stack) fu6Var.g0).push(new du6(du6Var));
        fu6Var.i0 = new Stack();
        fu6Var.h0 = new Stack();
        Boolean bool = zs6Var.d;
        if (bool != null) {
            ((du6) fu6Var.f0).h = bool.booleanValue();
        }
        fu6Var.y0();
        r05 r05Var2 = new r05((r05) xd6Var.Z);
        ks6 ks6Var = zs6Var.r;
        if (ks6Var != null) {
            r05Var2.d = ks6Var.c(fu6Var, r05Var2.d);
        }
        ks6 ks6Var2 = zs6Var.s;
        if (ks6Var2 != null) {
            r05Var2.e = ks6Var2.c(fu6Var, r05Var2.e);
        }
        fu6Var.n0(zs6Var, r05Var2, r05Var, zs5Var);
        fu6Var.x0();
        cc0 cc0Var3 = (cc0) xd6Var.Y;
        if (cc0Var3 != null) {
            ArrayList arrayList3 = cc0Var3.b;
            if ((arrayList3 != null ? arrayList3.size() : 0) <= 0 || (arrayList = cc0Var.b) == null) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((bc0) it.next()).c == 2) {
                    it.remove();
                }
            }
        }
    }

    @Override // defpackage.d53
    public final long e() {
        return 2048L;
    }
}
