package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f;
import androidx.recyclerview.widget.l;
import java.util.ArrayList;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lr0 {
    public final w86 a;
    public View e;
    public byte d = 0;
    public final kr0 b = new kr0();
    public final ArrayList c = new ArrayList();

    public lr0(w86 w86Var) {
        this.a = w86Var;
    }

    public final void a(View view, int i, boolean z) {
        RecyclerView recyclerView = this.a.a;
        int childCount = i < 0 ? recyclerView.getChildCount() : f(i);
        this.b.f(childCount, z);
        if (z) {
            i(view);
        }
        recyclerView.addView(view, childCount);
        l lVarN = RecyclerView.N(view);
        f fVar = recyclerView.r0;
        if (fVar != null && lVarN != null) {
            fVar.j(lVarN);
        }
        ArrayList arrayList = recyclerView.I0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((f96) recyclerView.I0.get(size)).d(view);
            }
        }
    }

    public final void b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = this.a.a;
        int childCount = i < 0 ? recyclerView.getChildCount() : f(i);
        this.b.f(childCount, z);
        if (z) {
            i(view);
        }
        l lVarN = RecyclerView.N(view);
        if (lVarN != null) {
            if (!lVarN.k() && !lVarN.p()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(lVarN);
                om0.j(sb, recyclerView.C());
                return;
            } else {
                if (RecyclerView.G1) {
                    lVarN.toString();
                }
                lVarN.j &= -257;
            }
        } else if (RecyclerView.F1) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            String strC = recyclerView.C();
            sb2.append(", index: ");
            sb2.append(childCount);
            sb2.append(strC);
            throw new IllegalArgumentException(sb2.toString());
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public final void c(int i) {
        int iF = f(i);
        this.b.i(iF);
        RecyclerView recyclerView = this.a.a;
        View childAt = recyclerView.getChildAt(iF);
        if (childAt != null) {
            l lVarN = RecyclerView.N(childAt);
            if (lVarN != null) {
                if (lVarN.k() && !lVarN.p()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(lVarN);
                    om0.j(sb, recyclerView.C());
                    return;
                } else {
                    if (RecyclerView.G1) {
                        lVarN.toString();
                    }
                    lVarN.a(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                }
            }
        } else if (RecyclerView.F1) {
            om0.c(iF, recyclerView.C(), "No view at offset ");
            return;
        }
        recyclerView.detachViewFromParent(iF);
    }

    public final View d(int i) {
        return this.a.a.getChildAt(f(i));
    }

    public final int e() {
        return this.a.a.getChildCount() - this.c.size();
    }

    public final int f(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = this.a.a.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            kr0 kr0Var = this.b;
            int iB = i - (i2 - kr0Var.b(i2));
            if (iB == 0) {
                while (kr0Var.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iB;
        }
        return -1;
    }

    public final View g(int i) {
        return this.a.a.getChildAt(i);
    }

    public final int h() {
        return this.a.a.getChildCount();
    }

    public final void i(View view) {
        this.c.add(view);
        l lVarN = RecyclerView.N(view);
        if (lVarN != null) {
            View view2 = lVarN.a;
            RecyclerView recyclerView = this.a.a;
            int i = lVarN.q;
            if (i != -1) {
                lVarN.p = i;
            } else {
                lVarN.p = view2.getImportantForAccessibility();
            }
            if (!recyclerView.R()) {
                view2.setImportantForAccessibility(4);
            } else {
                lVarN.q = 4;
                recyclerView.x1.add(lVarN);
            }
        }
    }

    public final int j(View view) {
        int iIndexOfChild = this.a.a.indexOfChild(view);
        if (iIndexOfChild != -1) {
            kr0 kr0Var = this.b;
            if (!kr0Var.d(iIndexOfChild)) {
                return iIndexOfChild - kr0Var.b(iIndexOfChild);
            }
        }
        return -1;
    }

    public final void k(int i) {
        w86 w86Var = this.a;
        byte b = this.d;
        if (b == 1) {
            bt.i("Cannot call removeView(At) within removeView(At)");
            return;
        }
        if (b == 2) {
            bt.i("Cannot call removeView(At) within removeViewIfHidden");
            return;
        }
        try {
            int iF = f(i);
            View childAt = w86Var.a.getChildAt(iF);
            if (childAt == null) {
                return;
            }
            this.d = (byte) 1;
            this.e = childAt;
            if (this.b.i(iF)) {
                l(childAt);
            }
            w86Var.c(iF);
        } finally {
            this.d = (byte) 0;
            this.e = null;
        }
    }

    public final void l(View view) {
        l lVarN;
        if (!this.c.remove(view) || (lVarN = RecyclerView.N(view)) == null) {
            return;
        }
        RecyclerView recyclerView = this.a.a;
        int i = lVarN.p;
        if (recyclerView.R()) {
            lVarN.q = i;
            recyclerView.x1.add(lVarN);
        } else {
            lVarN.a.setImportantForAccessibility(i);
        }
        lVarN.p = 0;
    }

    public final String toString() {
        return this.b.toString() + ", hidden list:" + this.c.size();
    }
}
