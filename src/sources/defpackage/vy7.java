package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lvy7;", "Lqx4;", "Lcz7;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class vy7 extends qx4 {
    public final Object X;
    public final Object Y;
    public final PointerInputEventHandler Z;

    public vy7(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler, int i) {
        obj2 = (i & 2) != 0 ? null : obj2;
        this.X = obj;
        this.Y = obj2;
        this.Z = pointerInputEventHandler;
    }

    @Override // defpackage.qx4
    public final jx4 a() {
        return new cz7(this.X, this.Y, this.Z);
    }

    @Override // defpackage.qx4
    public final void c(jx4 jx4Var) {
        cz7 cz7Var = (cz7) jx4Var;
        Object obj = cz7Var.q0;
        Object obj2 = this.X;
        boolean z = !dh3.f(obj, obj2);
        cz7Var.q0 = obj2;
        Object obj3 = cz7Var.r0;
        Object obj4 = this.Y;
        if (!dh3.f(obj3, obj4)) {
            z = true;
        }
        cz7Var.r0 = obj4;
        Class<?> cls = cz7Var.s0.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.Z;
        if (cls == pointerInputEventHandler.getClass() ? z : true) {
            cz7Var.a1();
        }
        cz7Var.s0 = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vy7)) {
            return false;
        }
        vy7 vy7Var = (vy7) obj;
        return dh3.f(this.X, vy7Var.X) && dh3.f(this.Y, vy7Var.Y) && this.Z == vy7Var.Z;
    }

    public final int hashCode() {
        Object obj = this.X;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.Y;
        return this.Z.hashCode() + ((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 961);
    }
}
