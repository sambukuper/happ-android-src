package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import su.happ.proxyutility.feature.proxy.PerAppProxyActivity;
import su.happ.proxyutility.ui.SnackbarHostActivity;
import su.happ.proxyutility.ui.foundation.component.HappTextView;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class yj5 extends uy7 implements rn2 {
    public final /* synthetic */ byte g0;
    public /* synthetic */ Object h0;
    public final /* synthetic */ PerAppProxyActivity i0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yj5(PerAppProxyActivity perAppProxyActivity, q51 q51Var, byte b) {
        super(2, q51Var);
        this.g0 = b;
        this.i0 = perAppProxyActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 0:
                n((q51) obj2, (jk5) obj).q(dn8Var);
                break;
            default:
                n((q51) obj2, (pk5) obj).q(dn8Var);
                break;
        }
        return dn8Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        byte b = this.g0;
        PerAppProxyActivity perAppProxyActivity = this.i0;
        switch (b) {
            case 0:
                yj5 yj5Var = new yj5(perAppProxyActivity, q51Var, (byte) 0);
                yj5Var.h0 = obj;
                return yj5Var;
            default:
                yj5 yj5Var2 = new yj5(perAppProxyActivity, q51Var, (byte) 1);
                yj5Var2.h0 = obj;
                return yj5Var2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.content.Context, su.happ.proxyutility.feature.proxy.PerAppProxyActivity, su.happ.proxyutility.ui.SnackbarHostActivity] */
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
        CharSequence string;
        byte b = this.g0;
        dn8 dn8Var = dn8.a;
        ?? r2 = this.i0;
        Object obj2 = this.h0;
        switch (b) {
            case 0:
                jk5 jk5Var = (jk5) obj2;
                w39.n0(obj);
                int i = PerAppProxyActivity.V0;
                c6 c6Var = r2.Q0;
                if (c6Var == null) {
                    dh3.T("binding");
                    throw null;
                }
                ((View) c6Var.i0).setVisibility(8);
                c6 c6Var2 = r2.Q0;
                if (c6Var2 == null) {
                    dh3.T("binding");
                    throw null;
                }
                ((View) c6Var2.j0).setVisibility(8);
                c6 c6Var3 = r2.Q0;
                if (c6Var3 == null) {
                    dh3.T("binding");
                    throw null;
                }
                ((View) c6Var3.Y).setVisibility(8);
                int iOrdinal = jk5Var.ordinal();
                if (iOrdinal == 0) {
                    c6 c6Var4 = r2.Q0;
                    if (c6Var4 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    os4.N((HappTextView) c6Var4.h0, v26.settingsCategory);
                    c6 c6Var5 = r2.Q0;
                    if (c6Var5 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    ((View) c6Var5.i0).setVisibility(0);
                    c6 c6Var6 = r2.Q0;
                    if (c6Var6 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    os4.N((HappTextView) c6Var6.r0, v26.settingsTextDescription);
                    c6 c6Var7 = r2.Q0;
                    if (c6Var7 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    os4.N((HappTextView) c6Var7.Z, v26.settingsTextDescription);
                } else {
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            c6 c6Var8 = r2.Q0;
                            if (c6Var8 == null) {
                                dh3.T("binding");
                                throw null;
                            }
                            os4.N((HappTextView) c6Var8.Z, v26.settingsCategory);
                            c6 c6Var9 = r2.Q0;
                            if (c6Var9 == null) {
                                dh3.T("binding");
                                throw null;
                            }
                            ((View) c6Var9.Y).setVisibility(0);
                            c6 c6Var10 = r2.Q0;
                            if (c6Var10 == null) {
                                dh3.T("binding");
                                throw null;
                            }
                            os4.N((HappTextView) c6Var10.r0, v26.settingsTextDescription);
                            c6 c6Var11 = r2.Q0;
                            if (c6Var11 == null) {
                                dh3.T("binding");
                                throw null;
                            }
                            os4.N((HappTextView) c6Var11.h0, v26.settingsTextDescription);
                        } else {
                            b61.c();
                        }
                        return null;
                    }
                    c6 c6Var12 = r2.Q0;
                    if (c6Var12 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    os4.N((HappTextView) c6Var12.r0, v26.settingsCategory);
                    c6 c6Var13 = r2.Q0;
                    if (c6Var13 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    ((View) c6Var13.j0).setVisibility(0);
                    c6 c6Var14 = r2.Q0;
                    if (c6Var14 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    os4.N((HappTextView) c6Var14.h0, v26.settingsTextDescription);
                    c6 c6Var15 = r2.Q0;
                    if (c6Var15 == null) {
                        dh3.T("binding");
                        throw null;
                    }
                    os4.N((HappTextView) c6Var15.Z, v26.settingsTextDescription);
                }
                c6 c6Var16 = r2.Q0;
                if (c6Var16 == null) {
                    dh3.T("binding");
                    throw null;
                }
                AppCompatTextView appCompatTextView = (HappTextView) c6Var16.g0;
                int iOrdinal2 = jk5Var.ordinal();
                if (iOrdinal2 == 0) {
                    string = r2.getString(y46.per_app_proxy_description_off);
                } else if (iOrdinal2 == 1) {
                    string = r2.getString(y46.per_app_proxy_description_on);
                } else {
                    if (iOrdinal2 != 2) {
                        b61.c();
                        return null;
                    }
                    string = r2.getString(y46.per_app_proxy_description_bypass);
                }
                appCompatTextView.setText(string);
                return dn8Var;
            default:
                pk5 pk5Var = (pk5) obj2;
                w39.n0(obj);
                int i2 = PerAppProxyActivity.V0;
                if (pk5Var instanceof ok5) {
                    pu.O((SnackbarHostActivity) r2, y46.warning_settings_after_tunnel_restart);
                    return dn8Var;
                }
                if (pk5Var instanceof mk5) {
                    String string2 = r2.getString(y46.per_app_proxy_google_apps_total, Integer.valueOf(((mk5) pk5Var).a));
                    string2.getClass();
                    pu.R((SnackbarHostActivity) r2, string2);
                    return dn8Var;
                }
                if (!(pk5Var instanceof nk5)) {
                    b61.c();
                    return null;
                }
                String string3 = r2.getString(y46.per_app_proxy_spy_apps_total, Integer.valueOf(((nk5) pk5Var).a));
                string3.getClass();
                pu.R((SnackbarHostActivity) r2, string3);
                return dn8Var;
        }
    }
}
