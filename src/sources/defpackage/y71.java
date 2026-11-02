package defpackage;

import java.security.Permission;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class y71 extends Permission {
    public final HashSet X;

    public y71(String str) {
        super(str);
        HashSet hashSet = new HashSet();
        this.X = hashSet;
        hashSet.add(str);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof y71) && this.X.equals(((y71) obj).X);
    }

    @Override // java.security.Permission
    public final String getActions() {
        return this.X.toString();
    }

    public final int hashCode() {
        return this.X.hashCode();
    }

    @Override // java.security.Permission
    public final boolean implies(Permission permission) {
        if (!(permission instanceof y71)) {
            return false;
        }
        y71 y71Var = (y71) permission;
        return getName().equals(y71Var.getName()) || this.X.containsAll(y71Var.X);
    }
}
