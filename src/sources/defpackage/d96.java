package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.l;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d96 {
    public w86 a;
    public ArrayList b;
    public byte c;
    public byte d;
    public short e;
    public short f;

    public static void b(l lVar) {
        int i = lVar.j;
        if (!lVar.g() && (i & 4) == 0) {
            lVar.b();
        }
    }

    public abstract boolean a(l lVar, l lVar2, rb0 rb0Var, rb0 rb0Var2);

    /* JADX WARN: Code duplicated, block: B:33:0x0068  */
    /* JADX WARN: Code duplicated, block: B:35:0x0076  */
    public final void c(l lVar) {
        w86 w86Var = this.a;
        if (w86Var != null) {
            RecyclerView recyclerView = w86Var.a;
            boolean z = true;
            lVar.o(true);
            View view = lVar.a;
            if (lVar.h != null && lVar.i == null) {
                lVar.h = null;
            }
            lVar.i = null;
            if ((lVar.j & 16) != 0) {
                return;
            }
            k kVar = recyclerView.h0;
            recyclerView.p0();
            lr0 lr0Var = recyclerView.k0;
            kr0 kr0Var = lr0Var.b;
            w86 w86Var2 = lr0Var.a;
            byte b = lr0Var.d;
            if (b != 1) {
                if (b == 2) {
                    bt.i("Cannot call removeViewIfHidden within removeViewIfHidden");
                    return;
                }
                try {
                    lr0Var.d = (byte) 2;
                    int iIndexOfChild = w86Var2.a.indexOfChild(view);
                    if (iIndexOfChild == -1) {
                        lr0Var.l(view);
                    } else if (kr0Var.d(iIndexOfChild)) {
                        kr0Var.i(iIndexOfChild);
                        lr0Var.l(view);
                        w86Var2.c(iIndexOfChild);
                    } else {
                        lr0Var.d = (byte) 0;
                    }
                    lr0Var.d = (byte) 0;
                    if (z) {
                        l lVarN = RecyclerView.N(view);
                        kVar.m(lVarN);
                        kVar.j(lVarN);
                        if (RecyclerView.G1) {
                            Objects.toString(view);
                            recyclerView.toString();
                        }
                    }
                    recyclerView.r0(!z);
                    if (z && lVar.k()) {
                        recyclerView.removeDetachedView(view, false);
                        return;
                    }
                } catch (Throwable th) {
                    lr0Var.d = (byte) 0;
                    throw th;
                }
            }
            if (lr0Var.e != view) {
                bt.i("Cannot call removeViewIfHidden within removeView(At) for a different view");
                return;
            }
            z = false;
            if (z) {
                l lVarN2 = RecyclerView.N(view);
                kVar.m(lVarN2);
                kVar.j(lVarN2);
                if (RecyclerView.G1) {
                    Objects.toString(view);
                    recyclerView.toString();
                }
            }
            recyclerView.r0(!z);
            if (z) {
            }
        }
    }

    public abstract void d(l lVar);

    public abstract void e();

    public abstract boolean f();
}
