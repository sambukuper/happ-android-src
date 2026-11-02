package defpackage;

import com.google.firebase.messaging.FirebaseMessaging;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sb2 implements ab5 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ FirebaseMessaging Y;

    public /* synthetic */ sb2(FirebaseMessaging firebaseMessaging, byte b) {
        this.X = b;
        this.Y = firebaseMessaging;
    }

    @Override // defpackage.ab5
    public final void b(Object obj) {
        boolean z;
        byte b = this.X;
        FirebaseMessaging firebaseMessaging = this.Y;
        switch (b) {
            case 0:
                qc8 qc8Var = (qc8) obj;
                if (!firebaseMessaging.f.h() || qc8Var.g.a() == null) {
                    return;
                }
                synchronized (qc8Var) {
                    z = qc8Var.f;
                }
                if (z) {
                    return;
                }
                qc8Var.c(0L);
                return;
            default:
                av0 av0Var = (av0) obj;
                if (av0Var != null) {
                    km4.b0(av0Var.X);
                    firebaseMessaging.f();
                    return;
                }
                return;
        }
    }
}
