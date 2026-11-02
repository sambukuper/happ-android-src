package org.conscrypt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public interface CertBlocklistEntry {

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public enum Origin {
        SHA1_TEST,
        SHA1_BUILT_IN,
        SHA1_FILE,
        SHA256_TEST,
        SHA256_BUILT_IN,
        SHA256_FILE
    }

    int getIndex();

    Origin getOrigin();
}
