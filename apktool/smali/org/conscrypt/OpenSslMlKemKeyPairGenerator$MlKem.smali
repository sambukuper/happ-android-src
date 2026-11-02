.class public Lorg/conscrypt/OpenSslMlKemKeyPairGenerator$MlKem;
.super Lorg/conscrypt/OpenSslMlKemKeyPairGenerator$MlKem768;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/conscrypt/OpenSslMlKemKeyPairGenerator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "MlKem"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const-string v0, "ML-KEM"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lorg/conscrypt/OpenSslMlKemKeyPairGenerator$MlKem768;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
