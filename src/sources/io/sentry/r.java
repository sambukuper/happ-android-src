package io.sentry;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r {
    public final s6 a;

    public r(s6 s6Var) {
        this.a = s6Var;
    }

    public final boolean a() {
        s6 s6Var = this.a;
        Boolean bool = s6Var.getDataCollection().a;
        boolean zIsSendDefaultPii = s6Var.isSendDefaultPii();
        if (bool != null) {
            return bool.booleanValue();
        }
        if (s6Var.getDataCollection().a()) {
            return true;
        }
        return zIsSendDefaultPii;
    }
}
