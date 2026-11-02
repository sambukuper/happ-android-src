package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class s89 extends f99 {
    public final Context a;
    public final /* synthetic */ ns2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s89(ns2 ns2Var, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), (byte) 0);
        this.b = ns2Var;
        this.a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            new StringBuilder(String.valueOf(i).length() + 39);
            return;
        }
        int i2 = os2.a;
        ns2 ns2Var = this.b;
        Context context = this.a;
        int iB = ns2Var.b(context, i2);
        int i3 = ss2.c;
        if (iB == 1 || iB == 2 || iB == 3 || iB == 9) {
            Intent intentA = ns2Var.a(iB, context, "n");
            ns2Var.f(context, iB, intentA == null ? null : PendingIntent.getActivity(context, 0, intentA, 201326592));
        }
    }
}
