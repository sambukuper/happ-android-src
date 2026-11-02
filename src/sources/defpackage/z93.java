package defpackage;

import com.tencent.mmkv.MMKV;
import su.happ.proxyutility.dto.enums.InboundAuthMode;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class z93 extends xw8 {
    public final vz7 b = new vz7(new tv2((byte) 23));
    public final vz7 c = new vz7(new tv2((byte) 24));
    public final vz7 d = new vz7(new tv2((byte) 25));
    public final oh7 e;
    public final h76 f;
    public final u77 g;
    public final f76 h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public z93() {
        oh7 oh7VarA = ph7.a(new q93(new m93(), false, new m93()));
        this.e = oh7VarA;
        this.f = jm4.n(oh7VarA);
        u77 u77VarB = v77.b(0, 7, (l90) null);
        this.g = u77VarB;
        this.h = jm4.m(u77VarB);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MMKV e() {
        return (MMKV) this.c.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ig8 f() {
        return (ig8) this.b.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object g(uy7 uy7Var) {
        Object objB = f().b(uy7Var);
        return objB == c71.X ? objB : dn8.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(boolean z) {
        Object value;
        q93 q93Var;
        oh7 oh7Var = this.e;
        oh7Var.getClass();
        do {
            value = oh7Var.getValue();
            q93Var = (q93) value;
            q93Var.getClass();
        } while (!oh7Var.k(value, q93.a(q93Var, null, z, null, 5)));
        e().p("pref_http_auth_enabled", z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i(InboundAuthMode inboundAuthMode) {
        InboundAuthMode inboundAuthMode2;
        q51 q51Var;
        byte b;
        Object value;
        q93 q93Var;
        Object value2;
        q93 q93Var2;
        Object value3;
        q93 q93Var3;
        inboundAuthMode.getClass();
        oh7 oh7Var = this.e;
        oh7Var.getClass();
        while (true) {
            Object value4 = oh7Var.getValue();
            q93 q93Var4 = (q93) value4;
            q93Var4.getClass();
            inboundAuthMode2 = inboundAuthMode;
            q51Var = null;
            b = 3;
            if (oh7Var.k(value4, q93.a(q93Var4, null, false, m93.a(q93Var4.c, null, inboundAuthMode2, null, null, 13), 3))) {
                break;
            } else {
                inboundAuthMode = inboundAuthMode2;
            }
        }
        e().l(inboundAuthMode2.ordinal(), "pref_http_auth_mode");
        boolean zA = f().a();
        int i = r93.a[inboundAuthMode2.ordinal()];
        if (i == 1 || i == 2) {
            vz7 vz7Var = this.d;
            String user = ((c16) vz7Var.getValue()).d().getUser();
            if (dh3.f(user, "happ_user") || !zA) {
                user = null;
            }
            String str = user == null ? "" : user;
            String password = ((c16) vz7Var.getValue()).d().getPassword();
            if (password == null || !zA) {
                password = null;
            }
            String str2 = password == null ? "" : password;
            do {
                value = oh7Var.getValue();
                q93Var = (q93) value;
                q93Var.getClass();
            } while (!oh7Var.k(value, q93.a(q93Var, null, false, m93.a(q93Var.c, null, null, str, str2, 3), 3)));
        } else if (i == 3) {
            String strJ = e().j("pref_http_auth_manual_user", "");
            String str3 = strJ == null ? "" : strJ;
            String strJ2 = e().j("pref_http_auth_manual_pass", "");
            String str4 = strJ2 == null ? "" : strJ2;
            do {
                value2 = oh7Var.getValue();
                q93Var2 = (q93) value2;
                q93Var2.getClass();
            } while (!oh7Var.k(value2, q93.a(q93Var2, null, false, m93.a(q93Var2.c, null, null, str3, str4, 3), 3)));
        } else {
            if (i != 4) {
                b61.c();
                return;
            }
            do {
                value3 = oh7Var.getValue();
                q93Var3 = (q93) value3;
                q93Var3.getClass();
            } while (!oh7Var.k(value3, q93.a(q93Var3, null, false, m93.a(q93Var3.c, null, null, "", "", 3), 3)));
        }
        jm4.Q(zw8.a(this), (u61) null, new v93(this, q51Var, b), 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j(InboundAuthMode inboundAuthMode) {
        q51 q51Var;
        InboundAuthMode inboundAuthMode2;
        Object value;
        q93 q93Var;
        Object value2;
        q93 q93Var2;
        Object value3;
        q93 q93Var3;
        inboundAuthMode.getClass();
        oh7 oh7Var = this.e;
        oh7Var.getClass();
        while (true) {
            Object value4 = oh7Var.getValue();
            q93 q93Var4 = (q93) value4;
            q93Var4.getClass();
            q51Var = null;
            inboundAuthMode2 = inboundAuthMode;
            if (oh7Var.k(value4, q93.a(q93Var4, m93.a(q93Var4.a, null, inboundAuthMode2, null, null, 13), false, null, 6))) {
                break;
            } else {
                inboundAuthMode = inboundAuthMode2;
            }
        }
        e().l(inboundAuthMode2.ordinal(), "pref_socks_auth_mode");
        boolean zA = f().a();
        int i = r93.a[inboundAuthMode2.ordinal()];
        if (i == 1 || i == 2) {
            vz7 vz7Var = this.d;
            String user = ((c16) vz7Var.getValue()).f().getUser();
            if (dh3.f(user, "happ_user") || !zA) {
                user = null;
            }
            String str = user == null ? "" : user;
            String password = ((c16) vz7Var.getValue()).f().getPassword();
            if (password == null || !zA) {
                password = null;
            }
            String str2 = password == null ? "" : password;
            do {
                value = oh7Var.getValue();
                q93Var = (q93) value;
                q93Var.getClass();
            } while (!oh7Var.k(value, q93.a(q93Var, m93.a(q93Var.a, null, null, str, str2, 3), false, null, 6)));
        } else if (i == 3) {
            String strJ = e().j("pref_socks_auth_manual_user", "");
            String str3 = strJ == null ? "" : strJ;
            String strJ2 = e().j("pref_socks_auth_manual_pass", "");
            String str4 = strJ2 == null ? "" : strJ2;
            do {
                value2 = oh7Var.getValue();
                q93Var2 = (q93) value2;
                q93Var2.getClass();
            } while (!oh7Var.k(value2, q93.a(q93Var2, m93.a(q93Var2.a, null, null, str3, str4, 3), false, null, 6)));
        } else {
            if (i != 4) {
                b61.c();
                return;
            }
            do {
                value3 = oh7Var.getValue();
                q93Var3 = (q93) value3;
                q93Var3.getClass();
            } while (!oh7Var.k(value3, q93.a(q93Var3, m93.a(q93Var3.a, null, null, "", "", 3), false, null, 6)));
        }
        jm4.Q(zw8.a(this), (u61) null, new v93(this, q51Var, (byte) 7), 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void k(s51 s51Var) {
        y93 y93Var;
        if (s51Var instanceof y93) {
            y93Var = (y93) s51Var;
            int i = y93Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                y93Var.h0 = i - Integer.MIN_VALUE;
            } else {
                y93Var = new y93(this, s51Var);
            }
        } else {
            y93Var = new y93(this, s51Var);
        }
        Object obj = y93Var.f0;
        int i2 = y93Var.h0;
        if (i2 == 0) {
            w39.n0(obj);
            f76 f76Var = f().e;
            v93 v93Var = new v93(this, null, (byte) 11);
            y93Var.h0 = 1;
            if (z91.n(f76Var, v93Var, y93Var) == c71.X) {
                return;
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            w39.n0(obj);
        }
        bt.i("SharedFlow never completes, this call should never return.");
    }
}
