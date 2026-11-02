package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcm3;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", _UrlKt.FRAGMENT_ENCODE_SET, "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class cm3 extends CancellationException {
    public final transient rm3 X;

    public cm3(String str, Throwable th, rm3 rm3Var) {
        super(str);
        this.X = rm3Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cm3)) {
            return false;
        }
        cm3 cm3Var = (cm3) obj;
        if (!dh3.f(cm3Var.getMessage(), getMessage())) {
            return false;
        }
        Object obj2 = cm3Var.X;
        if (obj2 == null) {
            obj2 = r55.Y;
        }
        Object obj3 = this.X;
        if (obj3 == null) {
            obj3 = r55.Y;
        }
        return dh3.f(obj2, obj3) && dh3.f(cm3Var.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        message.getClass();
        int iHashCode = message.hashCode() * 31;
        Object obj = this.X;
        if (obj == null) {
            obj = r55.Y;
        }
        int iHashCode2 = (obj.hashCode() + iHashCode) * 31;
        Throwable cause = getCause();
        return iHashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        Object obj = this.X;
        if (obj == null) {
            obj = r55.Y;
        }
        sb.append(obj);
        return sb.toString();
    }
}
