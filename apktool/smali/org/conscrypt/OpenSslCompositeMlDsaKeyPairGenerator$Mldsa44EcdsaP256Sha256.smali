.class public Lorg/conscrypt/OpenSslCompositeMlDsaKeyPairGenerator$Mldsa44EcdsaP256Sha256;
.super Lorg/conscrypt/OpenSslCompositeMlDsaKeyPairGenerator;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/conscrypt/OpenSslCompositeMlDsaKeyPairGenerator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Mldsa44EcdsaP256Sha256"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    sget-object v0, Lorg/conscrypt/CompositeMlDsaAlgorithm;->MLDSA44_ECDSA_P256_SHA256:Lorg/conscrypt/CompositeMlDsaAlgorithm;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {p0, v0, v1}, Lorg/conscrypt/OpenSslCompositeMlDsaKeyPairGenerator;-><init>(Lorg/conscrypt/CompositeMlDsaAlgorithm;Lorg/conscrypt/OpenSslCompositeMlDsaKeyPairGenerator$1;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method
