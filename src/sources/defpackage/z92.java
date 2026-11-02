package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class z92 implements u27 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public z92(File file) {
        this.a = (byte) 0;
        file.getClass();
        this.b = file;
        this.c = aa2.X;
    }

    @Override // defpackage.u27
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new x92(this);
            case 1:
                return new fq2(this, (byte) 0);
            case 2:
                la2 la2Var = (la2) this.b;
                ArrayList arrayList = new ArrayList();
                Iterator it = la2Var.iterator();
                while (true) {
                    ka2 ka2Var = (ka2) it;
                    if (!ka2Var.hasNext()) {
                        aw0.c0(arrayList, (Comparator) this.c);
                        return arrayList.iterator();
                    }
                    arrayList.add(ka2Var.next());
                }
                break;
            default:
                return new fq2(this);
        }
    }

    public /* synthetic */ z92(u27 u27Var, Object obj, byte b) {
        this.a = b;
        this.b = u27Var;
        this.c = obj;
    }

    public z92(dn2 dn2Var, gn2 gn2Var) {
        this.a = (byte) 1;
        gn2Var.getClass();
        this.b = dn2Var;
        this.c = gn2Var;
    }
}
