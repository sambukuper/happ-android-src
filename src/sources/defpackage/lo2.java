package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lo2 {
    public final /* synthetic */ byte a = 1;
    public final String b;
    public final ArrayList c;

    public lo2(String str) {
        str.getClass();
        this.b = str;
        this.c = new ArrayList(0);
        bv4.a.getClass();
        List listA = av4.a();
        new ArrayList();
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ((bv4) it.next()).getClass();
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return this.b;
            default:
                return super.toString();
        }
    }

    public lo2(String str, ArrayList arrayList) {
        this.c = arrayList;
        this.b = str;
    }
}
