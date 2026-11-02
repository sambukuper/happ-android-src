.class public final Lox;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Llx5;

    .line 2
    .line 3
    sget-object v6, Lyb6;->a:Lzb6;

    .line 4
    .line 5
    const-class v1, Lox;

    .line 6
    .line 7
    invoke-virtual {v6, v1}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    move-object v2, v1

    .line 12
    sget-object v1, Lnd0;->NO_RECEIVER:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Lfs0;

    .line 15
    .line 16
    invoke-interface {v2}, Lfs0;->t()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const/4 v5, 0x0

    .line 21
    const-string v3, "myInstance"

    .line 22
    .line 23
    const-string v4, "getMyInstance()Lcom/judemanutd/autostarter/AutoStartPermissionHelper;"

    .line 24
    .line 25
    invoke-direct/range {v0 .. v5}, Lnx5;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v6, v0}, Lzb6;->g(Llx5;)Llw3;

    .line 29
    .line 30
    .line 31
    return-void
.end method
