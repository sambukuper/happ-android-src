.class public final Lorg/conscrypt/OpenSSLSignature$SHA384RSA;
.super Lorg/conscrypt/OpenSSLSignature$RSAPKCS1Padding;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/conscrypt/OpenSSLSignature;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "SHA384RSA"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    sget-wide v0, Lorg/conscrypt/EvpMdRef$SHA384;->EVP_MD:J

    .line 2
    .line 3
    invoke-direct {p0, v0, v1}, Lorg/conscrypt/OpenSSLSignature$RSAPKCS1Padding;-><init>(J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
