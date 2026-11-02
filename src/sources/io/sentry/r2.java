package io.sentry;

import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r2 implements i0 {
    public final s6 a;
    public final k5 b;
    public final k5 c;
    public volatile q0 d = null;

    public r2(s6 s6Var) {
        this.a = s6Var;
        z zVar = new z(s6Var);
        this.c = new k5(zVar);
        this.b = new k5(zVar);
    }

    @Override // io.sentry.i0
    public final u6 a(u6 u6Var, n0 n0Var) {
        if (u6Var.j0 == null) {
            u6Var.j0 = "java";
        }
        if (e(u6Var, n0Var)) {
            d(u6Var);
            io.sentry.protocol.u uVar = this.a.getSessionReplay().l;
            if (uVar != null) {
                u6Var.Z = uVar;
            }
        }
        return u6Var;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // io.sentry.i0
    public final j5 b(j5 j5Var, n0 n0Var) {
        ArrayList arrayList;
        if (j5Var.j0 == null) {
            j5Var.j0 = "java";
        }
        Exception exc = j5Var.l0;
        if (exc != null) {
            AtomicInteger atomicInteger = new AtomicInteger(-1);
            HashSet hashSet = new HashSet();
            ArrayDeque arrayDeque = new ArrayDeque();
            this.c.a(exc, atomicInteger, hashSet, arrayDeque, null);
            j5Var.h(new ArrayList(arrayDeque));
        }
        io.sentry.protocol.f fVar = j5Var.p0;
        s6 s6Var = this.a;
        io.sentry.protocol.f fVarA = io.sentry.protocol.f.a(fVar, s6Var);
        if (fVarA != null) {
            j5Var.p0 = fVarA;
        }
        Map mapA = s6Var.getModulesLoader().a();
        if (mapA != null) {
            AbstractMap abstractMap = j5Var.A0;
            if (abstractMap == null) {
                j5Var.A0 = new HashMap(mapA);
            } else {
                abstractMap.putAll(mapA);
            }
        }
        if (e(j5Var, n0Var)) {
            d(j5Var);
            if (j5Var.e() == null) {
                ArrayList<io.sentry.protocol.v> arrayListD = j5Var.d();
                if (arrayListD == null || arrayListD.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = null;
                    for (io.sentry.protocol.v vVar : arrayListD) {
                        if (vVar.h0 != null && vVar.f0 != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(vVar.f0);
                        }
                    }
                }
                boolean zIsAttachThreads = s6Var.isAttachThreads();
                boolean zC = false;
                k5 k5Var = this.b;
                if (zIsAttachThreads || io.sentry.hints.a.class.isInstance(n0Var.b("sentry:typeCheckHint"))) {
                    Object objB = n0Var.b("sentry:typeCheckHint");
                    boolean zIsAttachStacktrace = s6Var.isAttachStacktrace();
                    if (objB instanceof io.sentry.hints.a) {
                        zC = ((io.sentry.hints.a) objB).c();
                        zIsAttachStacktrace = true;
                    }
                    j5Var.u0 = new k2(k5Var.b(Thread.getAllStackTraces(), arrayList, zC, zIsAttachStacktrace));
                } else if (s6Var.isAttachStacktrace() && ((arrayListD == null || arrayListD.isEmpty()) && !io.sentry.hints.d.class.isInstance(n0Var.b("sentry:typeCheckHint")))) {
                    boolean zIsAttachStacktrace2 = s6Var.isAttachStacktrace();
                    HashMap map = new HashMap();
                    Thread threadCurrentThread = Thread.currentThread();
                    map.put(threadCurrentThread, threadCurrentThread.getStackTrace());
                    j5Var.u0 = new k2(k5Var.b(map, null, false, zIsAttachStacktrace2));
                    return j5Var;
                }
            }
        }
        return j5Var;
    }

    @Override // io.sentry.i0
    public final io.sentry.protocol.f0 c(io.sentry.protocol.f0 f0Var, n0 n0Var) {
        if (f0Var.j0 == null) {
            f0Var.j0 = "java";
        }
        io.sentry.protocol.f fVarA = io.sentry.protocol.f.a(f0Var.p0, this.a);
        if (fVarA != null) {
            f0Var.p0 = fVarA;
        }
        if (e(f0Var, n0Var)) {
            d(f0Var);
        }
        return f0Var;
    }

    public final void d(y4 y4Var) {
        if (y4Var.h0 == null) {
            y4Var.h0 = this.a.getRelease();
        }
        if (y4Var.i0 == null) {
            y4Var.i0 = this.a.getEnvironment();
        }
        if (y4Var.m0 == null) {
            y4Var.m0 = this.a.getServerName();
        }
        if (this.a.isAttachServerName() && y4Var.m0 == null) {
            if (this.d == null) {
                if (q0.g == null) {
                    io.sentry.util.a aVar = q0.h;
                    aVar.g();
                    try {
                        if (q0.g == null) {
                            q0.g = new q0();
                        }
                        aVar.close();
                    } catch (Throwable th) {
                        try {
                            aVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                this.d = q0.g;
            }
            if (this.d != null) {
                q0 q0Var = this.d;
                if (q0Var.c < System.currentTimeMillis() && q0Var.d.compareAndSet(false, true)) {
                    q0Var.a();
                }
                y4Var.m0 = q0Var.b;
            }
        }
        if (y4Var.n0 == null) {
            y4Var.n0 = this.a.getDist();
        }
        if (y4Var.Z == null) {
            y4Var.Z = this.a.getSdkVersion();
        }
        AbstractMap abstractMap = y4Var.g0;
        s6 s6Var = this.a;
        if (abstractMap == null) {
            y4Var.c(s6Var.getTags());
        } else {
            for (Map.Entry<String, String> entry : s6Var.getTags().entrySet()) {
                if (!y4Var.g0.containsKey(entry.getKey())) {
                    y4Var.b(entry.getKey(), entry.getValue());
                }
            }
        }
        io.sentry.protocol.i0 i0Var = y4Var.k0;
        if (i0Var == null) {
            i0Var = new io.sentry.protocol.i0();
            y4Var.k0 = i0Var;
        }
        if (i0Var.f0 == null && this.a.getDataCollectionResolver().a()) {
            i0Var.f0 = "{{auto}}";
        }
    }

    public final boolean e(y4 y4Var, n0 n0Var) {
        if (io.sentry.util.b.u(n0Var)) {
            return true;
        }
        this.a.getLogger().h(s5.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", y4Var.X);
        return false;
    }
}
