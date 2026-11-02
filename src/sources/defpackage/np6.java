package defpackage;

import androidx.appcompat.widget.AppCompatTextView;
import su.happ.proxyutility.domain.routing.entity.StateDownloadFileV2;
import su.happ.proxyutility.feature.routing.rules.RoutingRulesActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class np6 extends uy7 implements rn2 {
    public /* synthetic */ Object g0;
    public final /* synthetic */ RoutingRulesActivity h0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public np6(RoutingRulesActivity routingRulesActivity, q51 q51Var) {
        super(2, q51Var);
        this.h0 = routingRulesActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        np6 np6VarN = n((q51) obj2, (StateDownloadFileV2) obj);
        dn8 dn8Var = dn8.a;
        np6VarN.q(dn8Var);
        return dn8Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        np6 np6Var = new np6(this.h0, q51Var);
        np6Var.g0 = obj;
        return np6Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.content.Context, su.happ.proxyutility.feature.routing.rules.RoutingRulesActivity] */
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
    public final Object q(Object obj) {
        StateDownloadFileV2.Loading.Progress progress = (StateDownloadFileV2) this.g0;
        w39.n0(obj);
        boolean z = progress instanceof StateDownloadFileV2.Success;
        ?? r5 = this.h0;
        if (z || progress == null) {
            int i = RoutingRulesActivity.X0;
            r5.F(true);
        } else if ((progress instanceof StateDownloadFileV2.Error.Failure) || (progress instanceof StateDownloadFileV2.Error.LinkNotCorrect)) {
            int i2 = RoutingRulesActivity.X0;
            r5.F(false);
        } else {
            if (!(progress instanceof StateDownloadFileV2.Loading.Progress) && !(progress instanceof StateDownloadFileV2.Loading.Start)) {
                b61.c();
                return null;
            }
            StateDownloadFileV2.Loading.Progress progress2 = (StateDownloadFileV2.Loading) progress;
            int i3 = RoutingRulesActivity.X0;
            s6 s6Var = r5.Q0;
            if (s6Var == null) {
                dh3.T("binding");
                throw null;
            }
            if (s6Var.p0.getAnimation() == null) {
                s6 s6Var2 = r5.Q0;
                if (s6Var2 == null) {
                    dh3.T("binding");
                    throw null;
                }
                s6Var2.p0.setImageResource(q36.ic_progress_circle_24dp);
                s6 s6Var3 = r5.Q0;
                if (s6Var3 == null) {
                    dh3.T("binding");
                    throw null;
                }
                s6Var3.p0.startAnimation(z91.E());
                s6 s6Var4 = r5.Q0;
                if (s6Var4 == null) {
                    dh3.T("binding");
                    throw null;
                }
                s6Var4.p0.setClickable(false);
                s6 s6Var5 = r5.Q0;
                if (s6Var5 == null) {
                    dh3.T("binding");
                    throw null;
                }
                s6Var5.p0.setFocusable(false);
            }
            s6 s6Var6 = r5.Q0;
            if (s6Var6 == null) {
                dh3.T("binding");
                throw null;
            }
            AppCompatTextView appCompatTextView = s6Var6.F0;
            StateDownloadFileV2.Loading.Progress progress3 = progress2 instanceof StateDownloadFileV2.Loading.Progress ? progress2 : null;
            Integer numD = progress3 != null ? progress3.d() : null;
            appCompatTextView.setText(numD == null ? r5.getString(y46.downloading_status_unknown) : r5.getString(y46.downloading_status, numD));
        }
        return dn8.a;
    }
}
