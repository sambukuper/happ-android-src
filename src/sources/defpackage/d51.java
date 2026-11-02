package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.io.FileNotFoundException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class d51 implements w82 {
    public final dq8 a;
    public final pd5 b;

    public d51(dq8 dq8Var, pd5 pd5Var) {
        this.a = dq8Var;
        this.b = pd5Var;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a2  */
    @Override // defpackage.w82
    public final Object a(l12 l12Var) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        List listJ;
        int size;
        Bundle bundle;
        dq8 dq8Var = this.a;
        Uri uri = Uri.parse(dq8Var.a);
        pd5 pd5Var = this.b;
        ContentResolver contentResolver = pd5Var.a.getContentResolver();
        String str = dq8Var.d;
        if (dh3.f(str, "com.android.contacts") && dh3.f(wv0.B0(rq7.j(dq8Var)), "display_photo")) {
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                om0.l("Unable to find a contact photo associated with '", uri, "'.");
                return null;
            }
        } else if (Build.VERSION.SDK_INT >= 29 && dh3.f(str, "media") && (size = (listJ = rq7.j(dq8Var)).size()) >= 3 && dh3.f(listJ.get(size - 3), "audio") && dh3.f(listJ.get(size - 2), "albums")) {
            ta7 ta7Var = pd5Var.b;
            yo1 yo1Var = ta7Var.a;
            wo1 wo1Var = yo1Var instanceof wo1 ? (wo1) yo1Var : null;
            if (wo1Var != null) {
                int i = wo1Var.a;
                yo1 yo1Var2 = ta7Var.b;
                wo1 wo1Var2 = yo1Var2 instanceof wo1 ? (wo1) yo1Var2 : null;
                if (wo1Var2 != null) {
                    int i2 = wo1Var2.a;
                    bundle = new Bundle(1);
                    bundle.putParcelable("android.content.extra.SIZE", new Point(i, i2));
                } else {
                    bundle = null;
                }
            } else {
                bundle = null;
            }
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFile(uri, "image/*", bundle, null);
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                om0.l("Unable to find a music thumbnail associated with '", uri, "'.");
                return null;
            }
        } else {
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                om0.l("Unable to open '", uri, "'.");
                return null;
            }
        }
        return new le7(new me7(new j76(dh3.Q(assetFileDescriptorOpenAssetFileDescriptor.createInputStream())), pd5Var.f, new u41(assetFileDescriptorOpenAssetFileDescriptor)), contentResolver.getType(uri), ma1.Z);
    }
}
