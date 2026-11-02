package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ic4 implements ServiceConnection {
    public final r57 a = new r57();

    static {
        lh4.a1("ListenableWorkerImplSession");
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        lh4.P0().getClass();
        this.a.h(new RuntimeException("Binding died"));
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        lh4.P0().getClass();
        this.a.h(new RuntimeException("Cannot bind to service " + componentName));
    }

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
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        d43 d43Var;
        Object obj;
        lh4.P0().getClass();
        int i = c43.g;
        if (iBinder == null) {
            obj = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(d43.a);
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof d43)) {
                b43 b43Var = new b43();
                b43Var.g = iBinder;
                obj = b43Var;
            } else {
                d43Var = (d43) iInterfaceQueryLocalInterface;
            }
        }
        if (obj == null) {
            obj = d43Var;
            obj = r1.i0;
        }
        obj = d43Var;
        mb6 mb6Var = r1.h0;
        r57 r57Var = this.a;
        if (mb6Var.l(r57Var, null, obj)) {
            r1.c(r57Var);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        lh4.P0().getClass();
        this.a.h(new RuntimeException("Service disconnected"));
    }
}
