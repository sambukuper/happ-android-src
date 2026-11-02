package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.DefaultLifecycleObserver;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class zy1 implements DefaultLifecycleObserver {
    public final /* synthetic */ g94 X;

    public zy1(EmojiCompatInitializer emojiCompatInitializer, g94 g94Var) {
        this.X = g94Var;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(d94 d94Var) {
        (Build.VERSION.SDK_INT >= 28 ? e11.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new cz1(), 500L);
        this.X.f(this);
    }
}
