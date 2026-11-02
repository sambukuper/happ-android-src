package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class up0 {
    public static final tp0 b = new tp0();
    public final Object a;

    public /* synthetic */ up0(Object obj) {
        this.a = obj;
    }

    public static final Object a(Object obj) {
        if (obj instanceof tp0) {
            return null;
        }
        return obj;
    }

    public static final void b(Object obj) {
        if (obj instanceof tp0) {
            if (!(obj instanceof sp0)) {
                bt.i("Trying to call 'getOrThrow' on a failed result of a non-closed channel");
                return;
            }
            Throwable th = ((sp0) obj).a;
            if (th != null) {
                throw th;
            }
            bt.i("Trying to call 'getOrThrow' on a channel closed without a cause");
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof up0) {
            return dh3.f(this.a, ((up0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof sp0) {
            return ((sp0) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
