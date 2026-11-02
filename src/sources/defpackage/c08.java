package defpackage;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c08 extends jv0 {
    public final HashMap Z;
    public final /* synthetic */ d08 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c08(d08 d08Var) {
        super(0);
        this.f0 = d08Var;
        this.Z = new HashMap();
    }

    @Override // defpackage.jv0
    public final void d(c19 c19Var) {
        ArrayList arrayList = this.f0.b;
        if ((c19Var.a.d() & 519) != 0) {
            this.Z.remove(c19Var);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                vx5 vx5Var = (vx5) arrayList.get(size);
                int i = vx5Var.e;
                boolean z = i > 0;
                int i2 = i - 1;
                vx5Var.e = i2;
                if (z && i2 == 0) {
                    vx5Var.c();
                }
            }
        }
    }

    @Override // defpackage.jv0
    public final void e(c19 c19Var) {
        ArrayList arrayList = this.f0.b;
        if ((c19Var.a.d() & 519) != 0) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((vx5) arrayList.get(size)).e++;
            }
        }
    }

    @Override // defpackage.jv0
    public final w19 f(w19 w19Var, List list) {
        ArrayList arrayList = this.f0.b;
        RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
        int i = 0;
        for (int size = list.size() - 1; size >= 0; size--) {
            c19 c19Var = (c19) list.get(size);
            Integer num = (Integer) this.Z.get(c19Var);
            if (num != null) {
                int iIntValue = num.intValue();
                float fA = c19Var.a.a();
                if ((iIntValue & 1) != 0) {
                    rectF.left = fA;
                }
                if ((iIntValue & 2) != 0) {
                    rectF.top = fA;
                }
                if ((iIntValue & 4) != 0) {
                    rectF.right = fA;
                }
                if ((iIntValue & 8) != 0) {
                    rectF.bottom = fA;
                }
                i |= iIntValue;
            }
        }
        fe3.b(w19Var.a.h(519), w19Var.a.h(64));
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            vx5 vx5Var = (vx5) arrayList.get(size2);
            fe3 fe3Var = vx5Var.d;
            ArrayList arrayList2 = vx5Var.a;
            for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
                ((gw0) arrayList2.get(size3)).getClass();
                if ((0 & i) != 0) {
                    throw null;
                }
            }
        }
        return w19Var;
    }

    @Override // defpackage.jv0
    public final xd6 g(c19 c19Var, xd6 xd6Var) {
        if ((c19Var.a.d() & 519) != 0) {
            fe3 fe3Var = (fe3) xd6Var.Z;
            fe3 fe3Var2 = (fe3) xd6Var.Y;
            int i = fe3Var.a != fe3Var2.a ? 1 : 0;
            if (fe3Var.b != fe3Var2.b) {
                i |= 2;
            }
            if (fe3Var.c != fe3Var2.c) {
                i |= 4;
            }
            if (fe3Var.d != fe3Var2.d) {
                i |= 8;
            }
            this.Z.put(c19Var, Integer.valueOf(i));
        }
        return xd6Var;
    }
}
