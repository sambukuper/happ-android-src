.class public abstract Lns5;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lnp4;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, Lb39;->Z:Lt29;

    .line 2
    .line 3
    sget-object v1, Lb39;->g0:Lx29;

    .line 4
    .line 5
    invoke-static {}, Lss5;->n()Lss5;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    new-instance v3, Lnp4;

    .line 10
    .line 11
    invoke-direct {v3, v0, v1, v2}, Lnp4;-><init>(Lb39;Lb39;Lss5;)V

    .line 12
    .line 13
    .line 14
    sput-object v3, Lns5;->a:Lnp4;

    .line 15
    .line 16
    return-void
.end method
