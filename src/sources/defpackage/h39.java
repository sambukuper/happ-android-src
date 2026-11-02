package defpackage;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import com.google.firebase.messaging.EnhancedIntentService;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class h39 extends Binder {
    public final vk1 g;

    public h39(vk1 vk1Var) {
        this.g = vk1Var;
    }

    public final void a(i39 i39Var) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        Intent intent = i39Var.a;
        EnhancedIntentService enhancedIntentService = (EnhancedIntentService) this.g.Y;
        int i = EnhancedIntentService.h0;
        z18 z18Var = new z18();
        enhancedIntentService.X.execute(new j0((Object) enhancedIntentService, (Object) intent, (Object) z18Var, (byte) 12));
        z18Var.a.b(new nd((byte) 2), new j78(i39Var, (byte) 4));
    }
}
