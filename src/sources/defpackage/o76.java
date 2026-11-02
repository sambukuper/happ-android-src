package defpackage;

import io.sentry.android.replay.capture.c;
import io.sentry.android.replay.l;
import io.sentry.protocol.w;
import io.sentry.t6;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class o76 extends g24 implements dn2 {
    public final /* synthetic */ byte Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object f0;
    public final /* synthetic */ Object g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o76(Object obj, Object obj2, Object obj3, byte b) {
        super(0);
        this.Y = b;
        this.Z = obj;
        this.f0 = obj2;
        this.g0 = obj3;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.Y;
        dn8 dn8Var = dn8.a;
        Object obj = this.g0;
        Object obj2 = this.f0;
        switch (b) {
            case 0:
                g33 g33Var = ((to0) this.Z).b;
                g33Var.getClass();
                return g33Var.j(((ov2) obj2).a(), ((j7) obj).h.d);
            case 1:
                w wVar = (w) obj2;
                l lVar = ((c) obj).h;
                if (lVar != null) {
                    lVar.p("replay.id", String.valueOf(wVar));
                }
                return dn8Var;
            case 2:
                Integer num = (Integer) obj2;
                l lVar2 = ((c) obj).h;
                if (lVar2 != null) {
                    lVar2.p("segment.id", String.valueOf(num));
                }
                return dn8Var;
            case 3:
                t6 t6Var = (t6) obj2;
                l lVar3 = ((c) obj).h;
                if (lVar3 != null) {
                    lVar3.p("replay.type", String.valueOf(t6Var));
                }
                return dn8Var;
            default:
                Boolean bool = (Boolean) obj2;
                l lVar4 = ((c) obj).h;
                if (lVar4 != null) {
                    lVar4.p("replay.flushed", String.valueOf(bool));
                }
                return dn8Var;
        }
    }
}
