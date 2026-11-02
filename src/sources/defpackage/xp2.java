package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xp2 extends up2 implements ou4 {
    public b92 Y = b92.c;
    public boolean Z;

    public final void f(yp2 yp2Var) {
        gc7 gc7Var;
        if (!this.Z) {
            this.Y = this.Y.clone();
            this.Z = true;
        }
        b92 b92Var = this.Y;
        b92 b92Var2 = yp2Var.X;
        b92Var.getClass();
        int i = 0;
        while (true) {
            int size = b92Var2.a.Y.size();
            gc7Var = b92Var2.a;
            if (i >= size) {
                break;
            }
            b92Var.g((Map.Entry) gc7Var.Y.get(i));
            i++;
        }
        Iterator it = gc7Var.c().iterator();
        while (it.hasNext()) {
            b92Var.g((Map.Entry) it.next());
        }
    }
}
