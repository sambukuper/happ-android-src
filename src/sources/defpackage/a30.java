package defpackage;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class a30 extends g33 {
    public final zf8 f;

    public a30(zf8 zf8Var) {
        zf8Var.getClass();
        this.f = zf8Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof a30) && dh3.f(((a30) obj).f, this.f);
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    @Override // defpackage.g33
    public final List j(List list, String str) throws SSLPeerUnverifiedException {
        list.getClass();
        str.getClass();
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object objRemoveFirst = arrayDeque.removeFirst();
        objRemoveFirst.getClass();
        arrayList.add(objRemoveFirst);
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            obj.getClass();
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate x509CertificateFindByIssuerAndSignature = this.f.findByIssuerAndSignature(x509Certificate);
            if (x509CertificateFindByIssuerAndSignature != null) {
                if (arrayList.size() > 1 || !x509Certificate.equals(x509CertificateFindByIssuerAndSignature)) {
                    arrayList.add(x509CertificateFindByIssuerAndSignature);
                }
                if (dh3.f(x509CertificateFindByIssuerAndSignature.getIssuerDN(), x509CertificateFindByIssuerAndSignature.getSubjectDN())) {
                    try {
                        x509CertificateFindByIssuerAndSignature.verify(x509CertificateFindByIssuerAndSignature.getPublicKey());
                        return arrayList;
                    } catch (GeneralSecurityException unused) {
                    }
                }
                z = true;
            } else {
                Iterator it = arrayDeque.iterator();
                it.getClass();
                while (true) {
                    if (!it.hasNext()) {
                        if (!z) {
                            bt.h(x509Certificate, "Failed to find a trusted cert that signed ");
                            return null;
                        }
                        return arrayList;
                    }
                    Object next = it.next();
                    next.getClass();
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (dh3.f(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
                        try {
                            x509Certificate.verify(x509Certificate2.getPublicKey());
                            it.remove();
                            arrayList.add(x509Certificate2);
                            break;
                        } catch (GeneralSecurityException unused2) {
                            continue;
                        }
                    }
                }
            }
        }
        bt.h(arrayList, "Certificate chain too long: ");
        return null;
    }
}
