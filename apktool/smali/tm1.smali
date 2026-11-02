.class public abstract Ltm1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static volatile a:Li26;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    sget-object v0, Lh26;->c:Lh26;

    .line 2
    .line 3
    invoke-static {}, Ldp1;->a()Ldp1;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    new-instance v2, Lbn0;

    .line 8
    .line 9
    const/4 v3, 0x4

    .line 10
    invoke-direct {v2, v3}, Lbn0;-><init>(B)V

    .line 11
    .line 12
    .line 13
    iget-object v0, v0, Lh26;->a:Lz05;

    .line 14
    .line 15
    new-instance v3, Ldk0;

    .line 16
    .line 17
    const/4 v4, 0x1

    .line 18
    invoke-direct {v3, v2, v4}, Ldk0;-><init>(Ljava/lang/Object;B)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1, v3}, Lz05;->c(Ljava/util/concurrent/Executor;Ln85;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method
