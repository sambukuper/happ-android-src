.class public abstract synthetic Lrd7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lf63;

.field public static final b:Lf63;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lf63;

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lf63;-><init>(B)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lrd7;->a:Lf63;

    .line 9
    .line 10
    new-instance v0, Lf63;

    .line 11
    .line 12
    invoke-direct {v0, v1}, Lf63;-><init>(B)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lrd7;->b:Lf63;

    .line 16
    .line 17
    return-void
.end method

.method public static final a()Lc15;
    .locals 4

    .line 1
    sget-object v0, Lrd7;->b:Lf63;

    .line 2
    .line 3
    invoke-virtual {v0}, Lf63;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lc15;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    new-instance v1, Lc15;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    new-array v3, v2, [Lkp2;

    .line 15
    .line 16
    invoke-direct {v1, v2, v3}, Lc15;-><init>(I[Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lf63;->A(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-object v1
.end method

.method public static final b(Ldn2;)Lzi1;
    .locals 2

    .line 1
    new-instance v0, Lzi1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lzi1;-><init>(Ldn2;Lqd7;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method
