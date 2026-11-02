package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class rg1 {
    public final String a;
    public final yr2 b;

    public rg1(Set set, yr2 yr2Var) {
        this.a = b(set);
        this.b = yr2Var;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ry ryVar = (ry) it.next();
            sb.append(ryVar.a);
            sb.append('/');
            sb.append(ryVar.b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set setUnmodifiableSet;
        Set setUnmodifiableSet2;
        yr2 yr2Var = this.b;
        synchronized (((HashSet) yr2Var.Y)) {
            setUnmodifiableSet = Collections.unmodifiableSet((HashSet) yr2Var.Y);
        }
        boolean zIsEmpty = setUnmodifiableSet.isEmpty();
        String str = this.a;
        if (zIsEmpty) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append(' ');
        synchronized (((HashSet) yr2Var.Y)) {
            setUnmodifiableSet2 = Collections.unmodifiableSet((HashSet) yr2Var.Y);
        }
        sb.append(b(setUnmodifiableSet2));
        return sb.toString();
    }
}
