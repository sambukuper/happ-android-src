package defpackage;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import su.happ.proxyutility.dto.XRayConfig;
import su.happ.proxyutility.receiver.WidgetProvider;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class j09 extends uy7 implements rn2 {
    public o15 g0;
    public WidgetProvider h0;
    public Context i0;
    public AppWidgetManager j0;
    public int[] k0;
    public boolean l0;
    public boolean m0;
    public boolean n0;
    public byte o0;
    public final /* synthetic */ WidgetProvider p0;
    public final /* synthetic */ Context q0;
    public final /* synthetic */ AppWidgetManager r0;
    public final /* synthetic */ int[] s0;
    public final /* synthetic */ boolean t0;
    public final /* synthetic */ boolean u0;
    public final /* synthetic */ boolean v0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j09(WidgetProvider widgetProvider, Context context, AppWidgetManager appWidgetManager, int[] iArr, boolean z, boolean z2, boolean z3, q51 q51Var) {
        super(2, q51Var);
        this.p0 = widgetProvider;
        this.q0 = context;
        this.r0 = appWidgetManager;
        this.s0 = iArr;
        this.t0 = z;
        this.u0 = z2;
        this.v0 = z3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        return n((q51) obj2, (b71) obj).q(dn8.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        return new j09(this.p0, this.q0, this.r0, this.s0, this.t0, this.u0, this.v0, q51Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) throws Throwable {
        o15 o15Var;
        boolean z;
        boolean z2;
        WidgetProvider widgetProvider;
        boolean z3;
        Context context;
        int[] iArr;
        AppWidgetManager appWidgetManager;
        Throwable th;
        o15 o15Var2;
        byte b = this.o0;
        c71 c71Var = c71.X;
        try {
            if (b == 0) {
                w39.n0(obj);
                o15Var = WidgetProvider.a;
                this.g0 = o15Var;
                WidgetProvider widgetProvider2 = this.p0;
                this.h0 = widgetProvider2;
                Context context2 = this.q0;
                this.i0 = context2;
                AppWidgetManager appWidgetManager2 = this.r0;
                this.j0 = appWidgetManager2;
                int[] iArr2 = this.s0;
                this.k0 = iArr2;
                boolean z4 = this.t0;
                this.l0 = z4;
                boolean z5 = this.u0;
                this.m0 = z5;
                z = this.v0;
                this.n0 = z;
                this.o0 = (byte) 1;
                if (o15Var.g(this) != c71Var) {
                    z2 = z5;
                    widgetProvider = widgetProvider2;
                    z3 = z4;
                    context = context2;
                    iArr = iArr2;
                    appWidgetManager = appWidgetManager2;
                }
                return c71Var;
            }
            if (b != 1) {
                if (b != 2) {
                    bt.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o15Var2 = this.g0;
                try {
                    w39.n0(obj);
                    o15Var = o15Var2;
                    o15Var.m((Object) null);
                    return dn8.a;
                } catch (Throwable th2) {
                    th = th2;
                    o15Var2.m((Object) null);
                    throw th;
                }
            }
            boolean z6 = this.n0;
            boolean z7 = this.m0;
            boolean z8 = this.l0;
            int[] iArr3 = this.k0;
            AppWidgetManager appWidgetManager3 = this.j0;
            Context context3 = this.i0;
            WidgetProvider widgetProvider3 = this.h0;
            o15 o15Var3 = this.g0;
            w39.n0(obj);
            z3 = z8;
            context = context3;
            iArr = iArr3;
            appWidgetManager = appWidgetManager3;
            o15Var = o15Var3;
            z = z6;
            widgetProvider = widgetProvider3;
            z2 = z7;
            q15 q15Var = WidgetProvider.a;
            widgetProvider.getClass();
            WidgetProvider.a(context, appWidgetManager, iArr, z3, z2, z);
            if (z) {
                be beVar = gx1.Y;
                long jL0 = vj8.l0(XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax, lx1.Z);
                this.g0 = o15Var;
                this.h0 = null;
                this.i0 = null;
                this.j0 = null;
                this.k0 = null;
                this.o0 = (byte) 2;
                if (u70.G(jL0, this) != c71Var) {
                    o15Var2 = o15Var;
                    o15Var = o15Var2;
                }
                return c71Var;
            }
            o15Var.m((Object) null);
            return dn8.a;
        } catch (Throwable th3) {
            o15 o15Var4 = o15Var;
            th = th3;
            o15Var2 = o15Var4;
            o15Var2.m((Object) null);
            throw th;
        }
    }
}
