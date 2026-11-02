package defpackage;

import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class uv4 extends at0 {
    public final String Z;

    public uv4(dh8 dh8Var, uh8 uh8Var, Collection collection) {
        super(dh8Var, uh8Var, collection);
        String name = dh8Var.j0.getName();
        int iLastIndexOf = name.lastIndexOf(46);
        if (iLastIndexOf < 0) {
            this.Z = ".";
        } else {
            this.Z = name.substring(0, iLastIndexOf + 1);
            name.substring(0, iLastIndexOf);
        }
    }

    @Override // defpackage.at0, defpackage.vh8
    public final String b(Object obj) {
        return c(obj.getClass(), obj);
    }

    @Override // defpackage.at0, defpackage.vh8
    public final String c(Class cls, Object obj) {
        String name = vh8.a(cls).getName();
        String str = this.Z;
        return name.startsWith(str) ? name.substring(str.length() - 1) : name;
    }
}
