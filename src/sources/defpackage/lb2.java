package defpackage;

import android.text.TextUtils;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lb2 implements Runnable {
    public final /* synthetic */ byte X;
    public final /* synthetic */ mb2 Y;

    public /* synthetic */ lb2(mb2 mb2Var, byte b) {
        this.X = b;
        this.Y = mb2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bz bzVarK0;
        bz bzVarG;
        byte b = this.X;
        mb2 mb2Var = this.Y;
        switch (b) {
            case 0:
                mb2Var.a();
                return;
            case 1:
                Object obj = mb2.l;
                synchronized (obj) {
                    try {
                        xa2 xa2Var = mb2Var.a;
                        xa2Var.a();
                        mj0 mj0VarT = mj0.t(xa2Var.a);
                        try {
                            bzVarK0 = mb2Var.c.K0();
                            if (mj0VarT != null) {
                                mj0VarT.V();
                            }
                        } catch (Throwable th) {
                            if (mj0VarT != null) {
                                mj0VarT.V();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                try {
                    int i = bzVarK0.b;
                    boolean z = false;
                    if (i == 5) {
                        bzVarG = mb2Var.g(bzVarK0);
                    } else if (i == 3) {
                        bzVarG = mb2Var.g(bzVarK0);
                    } else if (!mb2Var.d.a(bzVarK0)) {
                        return;
                    } else {
                        bzVarG = mb2Var.b(bzVarK0);
                    }
                    synchronized (obj) {
                        try {
                            xa2 xa2Var2 = mb2Var.a;
                            xa2Var2.a();
                            mj0 mj0VarT2 = mj0.t(xa2Var2.a);
                            try {
                                mb2Var.c.r0(bzVarG);
                                if (mj0VarT2 != null) {
                                    mj0VarT2.V();
                                }
                            } catch (Throwable th3) {
                                if (mj0VarT2 != null) {
                                    mj0VarT2.V();
                                }
                                throw th3;
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    synchronized (mb2Var) {
                        try {
                            boolean z2 = bzVarG.b == 4;
                            String str = bzVarG.a;
                            if (z2 && !TextUtils.isEmpty(str)) {
                                z = TextUtils.equals(bzVarK0.a, str) ? !(bzVarK0.b == 4) : true;
                            }
                            if (z) {
                                Iterator it = mb2Var.j.iterator();
                                while (it.hasNext()) {
                                    FirebaseMessaging firebaseMessaging = ((qb2) it.next()).a;
                                    if (firebaseMessaging.e() != null) {
                                        synchronized (firebaseMessaging) {
                                            try {
                                                if (!firebaseMessaging.k) {
                                                    firebaseMessaging.h(0L);
                                                }
                                            } catch (Throwable th5) {
                                                throw th5;
                                            }
                                            break;
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th6) {
                            throw th6;
                        }
                    }
                    if (bzVarG.b == 4) {
                        String str2 = bzVarG.a;
                        synchronized (mb2Var) {
                            mb2Var.i = str2;
                        }
                    }
                    int i2 = bzVarG.b;
                    if (i2 == 5) {
                        mb2Var.h(new ob2());
                        return;
                    } else if (i2 == 2 || i2 == 1) {
                        mb2Var.h(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        mb2Var.i(bzVarG);
                        return;
                    }
                } catch (ob2 e) {
                    mb2Var.h(e);
                    return;
                }
            default:
                mb2Var.a();
                return;
        }
    }
}
