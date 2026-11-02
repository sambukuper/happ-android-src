package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import defpackage.ac4;
import defpackage.bc4;
import defpackage.bt;
import defpackage.c71;
import defpackage.cc0;
import defpackage.dc4;
import defpackage.ec4;
import defpackage.g31;
import defpackage.gv3;
import defpackage.h31;
import defpackage.k39;
import defpackage.ki3;
import defpackage.l31;
import defpackage.l49;
import defpackage.lh4;
import defpackage.n49;
import defpackage.nr4;
import defpackage.pi;
import defpackage.pz2;
import defpackage.q51;
import defpackage.r5;
import defpackage.s51;
import defpackage.u61;
import defpackage.ut8;
import defpackage.w21;
import defpackage.w39;
import defpackage.w51;
import defpackage.wv0;
import defpackage.x39;
import defpackage.y5;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a", "work-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConstraintTrackingWorker extends CoroutineWorker {
    public final WorkerParameters g;

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker$a;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "work-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends CancellationException {
        public final int X;

        public a(int i) {
            this.X = i;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.g = workerParameters;
    }

    @Override // androidx.work.CoroutineWorker
    public final Object e(q51 q51Var) {
        return w51.W(nr4.x(this.b.f), new r5((Object) this, (q51) null, (byte) 6), q51Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(ec4 ec4Var, cc0 cc0Var, l49 l49Var, s51 s51Var) {
        g31 g31Var;
        if (s51Var instanceof g31) {
            g31Var = (g31) s51Var;
            int i = g31Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                g31Var.h0 = i - Integer.MIN_VALUE;
            } else {
                g31Var = new g31(this, s51Var);
            }
        } else {
            g31Var = new g31(this, s51Var);
        }
        Object objN = g31Var.f0;
        int i2 = g31Var.h0;
        if (i2 == 0) {
            w39.n0(objN);
            androidx.work.impl.workers.a aVar = new androidx.work.impl.workers.a(ec4Var, cc0Var, l49Var, null);
            g31Var.h0 = 1;
            objN = gv3.n(aVar, g31Var);
            c71 c71Var = c71.X;
            if (objN == c71Var) {
                return c71Var;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(objN);
        }
        objN.getClass();
        return objN;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v7, types: [pz2] */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.work.WorkerParameters] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2, types: [ec4] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object g(s51 s51Var) {
        h31 h31Var;
        int i;
        ?? r2 = this.g;
        if (s51Var instanceof h31) {
            h31Var = (h31) s51Var;
            int i2 = h31Var.i0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h31Var.i0 = i2 - Integer.MIN_VALUE;
            } else {
                h31Var = new h31(this, s51Var);
            }
        } else {
            h31Var = new h31(this, s51Var);
        }
        h31 h31Var2 = h31Var;
        Object objW = h31Var2.g0;
        int i3 = h31Var2.i0;
        try {
            if (i3 == 0) {
                w39.n0(objW);
                WorkerParameters workerParameters = this.b;
                String strA = workerParameters.b.a("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                if (strA == null || strA.length() == 0) {
                    int i4 = l31.a;
                    lh4.P0().getClass();
                    return new ac4();
                }
                Context context = this.a;
                x39 x39VarV0 = x39.v0(context);
                x39VarV0.getClass();
                n49 n49VarX = x39VarV0.k0.x();
                String string = workerParameters.a.toString();
                string.getClass();
                l49 l49VarC = n49VarX.c(string);
                if (l49VarC == null) {
                    return new ac4();
                }
                y5 y5Var = x39VarV0.s0;
                y5Var.getClass();
                cc0 cc0Var = new cc0(y5Var);
                ArrayList arrayList = cc0Var.b;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (((w21) obj).a(l49VarC)) {
                        arrayList2.add(obj);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    lh4 lh4VarP0 = lh4.P0();
                    int i5 = k39.a;
                    wv0.y0(arrayList2, null, null, null, new ut8((byte) 15), 31);
                    lh4VarP0.getClass();
                }
                if (!arrayList2.isEmpty()) {
                    int i6 = l31.a;
                    lh4.P0().getClass();
                    return new bc4();
                }
                int i7 = l31.a;
                lh4.P0().getClass();
                try {
                    ?? r10 = pz2.G0;
                    context.getClass();
                    ec4 ec4VarL = r10.l(context, strA, r2);
                    ki3 ki3Var = (ki3) r2.h.h0;
                    ki3Var.getClass();
                    try {
                        u61 u61VarX = nr4.x(ki3Var);
                        ec4 ec4Var = ec4VarL;
                        pi piVar = new pi(this, ec4Var, cc0Var, l49VarC, null, (byte) 3);
                        h31Var2.f0 = ec4Var;
                        h31Var2.i0 = 1;
                        objW = w51.W(u61VarX, piVar, h31Var2);
                        c71 c71Var = c71.X;
                        r2 = ec4Var;
                        if (objW == c71Var) {
                            return c71Var;
                        }
                    } catch (CancellationException e) {
                        e = e;
                        r2 = ec4VarL;
                        AtomicInteger atomicInteger = this.c;
                        if (atomicInteger.get() != -256 || (e instanceof a)) {
                            if (Build.VERSION.SDK_INT < 31) {
                                i = -512;
                            } else if (atomicInteger.get() != -256) {
                                i = atomicInteger.get();
                            } else {
                                if (!(e instanceof a)) {
                                    bt.i("Unreachable");
                                    return null;
                                }
                                i = ((a) e).X;
                            }
                            r2.d(i);
                        }
                        if (e instanceof a) {
                            return new bc4();
                        }
                        throw e;
                    }
                } catch (Throwable unused) {
                    int i8 = l31.a;
                    lh4.P0().getClass();
                    x39VarV0.j0.getClass();
                    return new ac4();
                }
            } else {
                if (i3 != 1) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ec4 ec4Var2 = h31Var2.f0;
                w39.n0(objW);
                r2 = ec4Var2;
            }
            return (dc4) objW;
        } catch (CancellationException e2) {
            e = e2;
        }
    }
}
