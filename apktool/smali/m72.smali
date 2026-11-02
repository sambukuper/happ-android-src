.class public abstract Lm72;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lnd4;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, Lld4;->Companion:Ljd4;

    .line 2
    .line 3
    new-instance v1, Lh80;

    .line 4
    .line 5
    const/16 v2, 0x1a

    .line 6
    .line 7
    invoke-direct {v1, v2}, Lh80;-><init>(B)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance v0, Lmd4;

    .line 14
    .line 15
    new-instance v2, Lps;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v2, v3}, Lps;-><init>(B)V

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, v2}, Lmd4;-><init>(Lps;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v1, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    new-instance v1, Lnd4;

    .line 28
    .line 29
    invoke-interface {v0}, Lh1;->build()Lsc0;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-direct {v1, v0}, Lnd4;-><init>(Lsc0;)V

    .line 34
    .line 35
    .line 36
    sput-object v1, Lm72;->a:Lnd4;

    .line 37
    .line 38
    return-void
.end method
