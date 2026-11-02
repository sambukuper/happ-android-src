package defpackage;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class se1 implements ry0 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ e26 Y;

    public /* synthetic */ se1(e26 e26Var, byte b) {
        this.X = b;
        this.Y = e26Var;
    }

    @Override // defpackage.ry0
    public final Object d(y5 y5Var) {
        byte b = this.X;
        e26 e26Var = this.Y;
        switch (b) {
            case 0:
                return new ue1((Context) y5Var.a(Context.class), ((xa2) y5Var.a(xa2.class)).c(), y5Var.e(e26.a(pz2.class)), y5Var.f(rg1.class), (Executor) y5Var.k(e26Var));
            default:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(e26Var, y5Var);
        }
    }
}
